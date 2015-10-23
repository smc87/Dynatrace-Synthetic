package com.dynatrace.synthetic.process;

import java.util.HashMap;
import java.util.logging.Logger;

import com.dynatrace.synthetic.monitor;
import com.dynatrace.synthetic.cache.Cache;
import com.dynatrace.synthetic.common.Vars;
import com.dynatrace.synthetic.data.process.TestResultSummary;
import com.dynatrace.synthetic.data.results.TestData;
import com.dynatrace.synthetic.rest.RestManager;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ProcessTestData {
	private static final Logger log = Logger.getLogger(monitor.class.getName());
	
    private String accessToken;
    private String monitorId;
    private String scriptName;
    

    public ProcessTestData(String scriptName, String accessToken, String monitorId) {
        this.accessToken = accessToken;
        this.monitorId = monitorId;
        this.scriptName = scriptName;
    }
    
    public HashMap<String, TestResultSummary> getTestData() throws UnirestException{
    	Cache cache = new Cache(this.monitorId);
    	cache.deleteStaleCache();
    	TestData testData;
    	if (cache.doesCacheExist()){
    		log.fine("Found existing cache file");
    		cache.loadCacheData();
    		testData = RestManager.getTestData(this.accessToken, this.monitorId, getValidLastRunTime(cache.getLastRunTime()));
    	} else {
    		log.fine("Unable to find cache");
    		testData = RestManager.getTestData(this.accessToken, this.monitorId, getDefaultStartTime());
    	}
    	
    	Summary summary = new Summary(testData);
    	HashMap<String, TestResultSummary> processedSummaryData = summary.summarizeData();
    	
    	if (!processedSummaryData.isEmpty()) {
    		log.fine("Successfully created the summary object - saving time stamp");
    		cache.saveCacheData(this.scriptName, Long.valueOf(testData.getQueryTime().getEnd()));
    	} else {
    		log.severe("Unable to summarize the data");
    	}
    	
    	return processedSummaryData;
    }
    
    private long getDefaultStartTime(){
    	return System.currentTimeMillis() - (Vars.DEFAULT_START_TIME_MINUTE * 60 * 1000);
    }
    
    private long getValidLastRunTime(long lastRunTime){
    	//Dynatrace Synthetic API only allows you to query 48 hours of data.  We'll allow 24 hours just to be safe
    	long newLastRunTime = lastRunTime;
    	if ((System.currentTimeMillis() - lastRunTime) > (Vars.DEFAULT_START_TIME_WINDOW_HOUR * 60 * 60 * 1000)){
    		log.fine("You're attempting to gather data older than " + Vars.DEFAULT_START_TIME_WINDOW_HOUR + " hours.");
    		newLastRunTime = System.currentTimeMillis() - (Vars.DEFAULT_START_TIME_WINDOW_HOUR * 60 * 60 * 1000);
    	}
    	return newLastRunTime;
    }
    
    
}
