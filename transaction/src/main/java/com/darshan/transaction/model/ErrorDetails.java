package com.darshan.transaction.model;

import java.util.Date;

public class ErrorDetails {
	private String errorMessage;
    private Date timeStamp;
    private String details;
    
	public ErrorDetails(String errorMessage,Date timeStamp , String errorDetails) {
		super();
		this.errorMessage = errorMessage;
		this.timeStamp = timeStamp;
		this.details = errorDetails;
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
	public String getErrorDetails() {
		return details;
	}
	public void setErrorDetails(String errorDetails) {
		this.details = errorDetails;
	}
	@Override
	public String toString() {
		return "Error [errorMessage=" + errorMessage + ", timeStamp=" + timeStamp + ", errorDetails=" + details
				+ "]";
	}

}
