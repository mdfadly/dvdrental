package com.project.dvdrental.exception;

import java.util.Date;

public class ErrorDetails {
	private Date timeStamp;
	private String message;
	private String status;
	public ErrorDetails() {
		super();
	}
	public ErrorDetails(Date timeStamp, String message, String status) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.status = status;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
