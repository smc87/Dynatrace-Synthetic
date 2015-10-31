package com.dynatrace.synthetic.process;

import com.dynatrace.synthetic.rest.RestManager;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Authenticate {
	 private String accessToken;

    public Authenticate(String user, String password, String proxyUser, String proxyPassword, String proxyHost, String proxyPort, boolean proxyAuth, boolean proxyOn) throws UnirestException{
        this.accessToken = RestManager.Authenticate(user, password, proxyUser, proxyPassword, proxyHost, proxyPort, proxyAuth, proxyOn);
    }

    @Override
    public String toString() {
        return this.accessToken;
    }

    public String getAccessToken(){
        return this.accessToken;
    }
}
