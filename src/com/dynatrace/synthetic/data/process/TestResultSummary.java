package com.dynatrace.synthetic.data.process;

import java.util.ArrayList;
import java.util.List;

public class TestResultSummary {
	private List<Integer> responseTime = new ArrayList<Integer>();
	private List<Integer> totalSteps = new ArrayList<Integer>();
	private List<Integer> successfulSteps = new ArrayList<Integer>();
	private List<Integer> failedSteps = new ArrayList<Integer>();
	private List<Integer> totalObjects = new ArrayList<Integer>();
	private List<Integer> successfulObjects = new ArrayList<Integer>();
	private List<Integer> failedObjects = new ArrayList<Integer>();
	private List<Long> numberOfBytes = new ArrayList<Long>();

	
	public void addResponseTime(int responseTime){
		this.responseTime.add(responseTime);
	}
	
	public void addTotalSteps(int totalSteps){
		this.totalSteps.add(totalSteps);
	}
	
	public void addSuccessfulSteps(int successfulSteps){
		this.successfulSteps.add(successfulSteps);
	}
	
	public void addFailedSteps(int failedSteps){
		this.failedSteps.add(failedSteps);
	}
	
	public void addTotalObjects(int totalObjects){
		this.totalObjects.add(totalObjects);
	}
	
	public void addSuccessfulObjects(int successfulObjects){
		this.successfulObjects.add(successfulObjects);
	}
	
	public void addFailedObjects(int failedObjects){
		this.failedObjects.add(failedObjects);
	}
	
	public void addNumberOfBytes(long numberOfBytes){
		this.numberOfBytes.add(numberOfBytes);
	}
	
	public int getNumberOfTestExecutions(){
		//This works with the assumption each test has a response time...
		return this.responseTime.size();
	}
	
	public int getAverageResponseTime(){
		int totalResponseTime = 0;
		
		for (int responseTime : this.responseTime){
			totalResponseTime += responseTime;
		}
		
		return totalResponseTime / this.responseTime.size();
	}
	
	public int getAvailability(){
		int failedTestCount = 0;
		
		for (int failedCount : this.failedSteps){
			if (failedCount > 0){
				failedTestCount += 1;
			}
		}
		
		return (int)(100 - ((failedTestCount * 100f) / this.totalSteps.size()));
	}
	
	public int getNumberOfSuccessfulSteps(){
		int totalNumberOfSuccessfulSteps = 0;
		
		for (int successfulSteps : this.successfulSteps){
			totalNumberOfSuccessfulSteps += successfulSteps;
		}
		
		return totalNumberOfSuccessfulSteps;
	}
	
	public int getNumberOfFailedSteps(){
		int totalNumberOfFailedSteps = 0;
		
		for (int failedSteps : this.failedSteps){
			totalNumberOfFailedSteps += failedSteps;
		}
		
		return totalNumberOfFailedSteps;		
	}

	public int getNumberOfSuccessfulObjects(){
		int totalNumberOfSuccessfulObjects = 0;
		
		for (int successfulObjects : this.successfulObjects){
			totalNumberOfSuccessfulObjects += successfulObjects;
		}
		
		return totalNumberOfSuccessfulObjects;
	}
	
	public int getNumberOfFailedObjects(){
		int totalNumberOfFailedObjects = 0;
		
		for (int failedObjects : this.failedObjects){
			totalNumberOfFailedObjects += failedObjects;
		}
		
		return totalNumberOfFailedObjects;		
	}

	public long getAverageNumberOfBytes(){
		long totalNumberOfBytes = 0;
		
		for (long numberOfBytes : this.numberOfBytes){
			totalNumberOfBytes += numberOfBytes;
		}
		
		return (totalNumberOfBytes != 0) ? totalNumberOfBytes / this.numberOfBytes.size() : 0;
	}
}
