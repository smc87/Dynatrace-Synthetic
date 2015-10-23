package com.dynatrace.synthetic.process;

import com.dynatrace.synthetic.rest.RestManager;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Authenticate {
	 private String accessToken;

    public Authenticate(String user, String password) throws UnirestException{
        this.accessToken = RestManager.Authenticate(user, password);
    }

    @Override
    public String toString() {
        return this.accessToken;
    }

    public String getAccessToken(){
        return this.accessToken;
    }
}
