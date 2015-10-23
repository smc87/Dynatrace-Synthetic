package com.dynatrace.synthetic.process;

import java.util.logging.Logger;

import com.dynatrace.synthetic.monitor;
import com.dynatrace.synthetic.data.monitor.Monitors;
import com.dynatrace.synthetic.rest.RestManager;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Tests {
	private static final Logger log = Logger.getLogger(monitor.class.getName());
    private String accessToken;

    public Tests(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getMonitorId(String testName, String testType) throws UnirestException{

        String monitorId = null;
        Monitors monitors = RestManager.getMonitors(this.accessToken, testName, testType);
        switch (monitors.getMonitors().size()) {
            case 0:
                log.warning("Unable to find a script name: " + testName);
                break;
            case 1:
                monitorId = monitors.getMonitors().get(0).getMonitor().getMonitorID();
                log.fine("Found a monitor: " + monitorId);
                break;
            default:
                log.warning("Found too many scripts!");
                break;
        }

        return monitorId;
    }
}
