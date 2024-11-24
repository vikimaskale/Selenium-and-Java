package com.hexaware.assignment2;

import java.util.Arrays;

public class Batch {
	private String batchCode;
	private String startdate;
	private String enddate;
	private Trainee[] trainees;
	public Batch(String batchCode, String startdate, String enddate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startdate = startdate;
		this.enddate = enddate;
		this.trainees = trainees;
	}
	
	public String getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Trainee[] getTrainees() {
		return trainees;
	}
	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
	
	public Trainee getTrainee(int traineeId) {
		Trainee traineeObj=null;
		for(Trainee currTrainee: this.trainees) {
			if(currTrainee.getTraineeId()==traineeId) {
				traineeObj= currTrainee;
				break;
			}
		}
		return traineeObj;
	}
	
	public Trainee[] getTrainee(String gender) {
		Trainee[] traineeArray= new Trainee[this.trainees.length];
		int index=0;
		for(Trainee currTrainee: this.trainees) {
			
			if(currTrainee.getGender().equals(gender)) {
				traineeArray[index++]= currTrainee;
			}
		}
		return traineeArray;
	}
	
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startdate=" + startdate + ", enddate=" + enddate + ", trainees="
				+ Arrays.toString(trainees) + "]";
	}
	
	
}
