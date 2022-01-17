package com.darshan.employee.model;

import java.util.Date;

public class ErrorDetails {

    private String errorMessage;
    private Date timeStamp;
    private String details;
    
	public ErrorDetails() {
	}

	public ErrorDetails(String errorMessage, Date timeStamp, String details) {
		super();
		this.errorMessage = errorMessage;
		this.timeStamp = timeStamp;
		this.details = details;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ErrorDetails [errorMessage=" + errorMessage + ", timeStamp=" + timeStamp + ", details=" + details + "]";
	}
	
    
}
