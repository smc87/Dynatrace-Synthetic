package com.dynatrace.synthetic.process;

import java.util.HashMap;
import java.util.logging.Logger;

import com.dynatrace.synthetic.monitor;
import com.dynatrace.synthetic.data.process.TestResultSummary;
import com.dynatrace.synthetic.data.results.TestData;
import com.dynatrace.synthetic.data.results.TestLevelDatum;
import com.dynatrace.synthetic.data.results.TestLevelDatum_;

public class Summary {
	
	private static final Logger log = Logger.getLogger(monitor.class.getName());
	private TestData testData;
	private HashMap<String, TestResultSummary> sortedData;

	public Summary(TestData testData) {
		this.testData = testData;
		sortedData = new HashMap<String, TestResultSummary>(); 
	}
	
	public HashMap<String, TestResultSummary> summarizeData(){
    	//This works with the assumption the test data is already filtered by a single monitor ID
		try {
			if (!testData.getBackboneData().getTestLevelData().isEmpty()){
				log.fine("Starting to summarize backbone data");
		    	for ( TestLevelDatum testLevelDatum : this.testData.getBackboneData().getTestLevelData()){
		    		if (!sortedData.containsKey(testLevelDatum.getTestData().getSname())){
		    			log.fine("This is a new location");
		    			TestResultSummary testResultSummary = new TestResultSummary();
		    			testResultSummary.addResponseTime(Integer.parseInt(testLevelDatum.getTestData().getRtime()));
		    			testResultSummary.addTotalSteps(Integer.parseInt(testLevelDatum.getTestData().getTpt()));
		    			testResultSummary.addSuccessfulSteps(Integer.parseInt(testLevelDatum.getTestData().getTps()));
		    			testResultSummary.addFailedSteps(Integer.parseInt(testLevelDatum.getTestData().getTpf()));
		    			testResultSummary.addTotalObjects(Integer.parseInt(testLevelDatum.getTestData().getTot()));
		    			testResultSummary.addSuccessfulObjects(Integer.parseInt(testLevelDatum.getTestData().getTos()));
		    			testResultSummary.addFailedObjects(Integer.parseInt(testLevelDatum.getTestData().getTof()));
		    			testResultSummary.addNumberOfBytes(Long.parseLong(testLevelDatum.getTestData().getNbyte()));
		    			sortedData.put(testLevelDatum.getTestData().getSname(), testResultSummary);
		    		} else {
		    			log.fine("Found: " + testLevelDatum.getTestData().getSname());
		    			TestResultSummary testResultSummary = sortedData.get(testLevelDatum.getTestData().getSname());
		    			testResultSummary.addResponseTime(Integer.parseInt(testLevelDatum.getTestData().getRtime()));
		    			testResultSummary.addTotalSteps(Integer.parseInt(testLevelDatum.getTestData().getTpt()));
		    			testResultSummary.addSuccessfulSteps(Integer.parseInt(testLevelDatum.getTestData().getTps()));
		    			testResultSummary.addFailedSteps(Integer.parseInt(testLevelDatum.getTestData().getTpf()));
		    			testResultSummary.addTotalObjects(Integer.parseInt(testLevelDatum.getTestData().getTot()));
		    			testResultSummary.addSuccessfulObjects(Integer.parseInt(testLevelDatum.getTestData().getTos()));
		    			testResultSummary.addFailedObjects(Integer.parseInt(testLevelDatum.getTestData().getTof()));
		    			testResultSummary.addNumberOfBytes(Long.parseLong(testLevelDatum.getTestData().getNbyte()));
		    		}
		    	}
			} else if (!this.testData.getOtherData().getTestLevelData().isEmpty()){
				log.fine("Starting to summarize last mile, private last mile or mobile data");
				for ( TestLevelDatum_ testLevelDatum : this.testData.getOtherData().getTestLevelData()){
					if (!sortedData.containsKey(testLevelDatum.getTestData().getPopname())){
						log.fine("This is a new location");
		    			TestResultSummary testResultSummary = new TestResultSummary();
		    			testResultSummary.addResponseTime(Integer.parseInt(testLevelDatum.getTestData().getRtime()));
		    			testResultSummary.addTotalSteps(Integer.parseInt(testLevelDatum.getTestData().getTpt()));
		    			testResultSummary.addSuccessfulSteps(Integer.parseInt(testLevelDatum.getTestData().getTps()));
		    			testResultSummary.addFailedSteps(Integer.parseInt(testLevelDatum.getTestData().getTpf()));
		    			testResultSummary.addTotalObjects(Integer.parseInt(testLevelDatum.getTestData().getTot()));
		    			testResultSummary.addSuccessfulObjects(Integer.parseInt(testLevelDatum.getTestData().getTos()));
		    			testResultSummary.addFailedObjects(Integer.parseInt(testLevelDatum.getTestData().getTof()));
		    			testResultSummary.addNumberOfBytes(Long.parseLong(testLevelDatum.getTestData().getNbyte()));
		    			sortedData.put(testLevelDatum.getTestData().getPopname(), testResultSummary);
					} else {
						log.fine("Found: " + testLevelDatum.getTestData().getPopname());
		    			TestResultSummary testResultSummary = sortedData.get(testLevelDatum.getTestData().getPopname());
		    			testResultSummary.addResponseTime(Integer.parseInt(testLevelDatum.getTestData().getRtime()));
		    			testResultSummary.addTotalSteps(Integer.parseInt(testLevelDatum.getTestData().getTpt()));
		    			testResultSummary.addSuccessfulSteps(Integer.parseInt(testLevelDatum.getTestData().getTps()));
		    			testResultSummary.addFailedSteps(Integer.parseInt(testLevelDatum.getTestData().getTpf()));
		    			testResultSummary.addTotalObjects(Integer.parseInt(testLevelDatum.getTestData().getTot()));
		    			testResultSummary.addSuccessfulObjects(Integer.parseInt(testLevelDatum.getTestData().getTos()));
		    			testResultSummary.addFailedObjects(Integer.parseInt(testLevelDatum.getTestData().getTof()));
		    			testResultSummary.addNumberOfBytes(Long.parseLong(testLevelDatum.getTestData().getNbyte()));
					}
				}
			} else {
				log.fine("No test data found!");
			}
		} catch(NullPointerException e){
			log.severe("A NPE occurred while attempting to summarize the data");
		}

    	return sortedData;
    }
	
}
