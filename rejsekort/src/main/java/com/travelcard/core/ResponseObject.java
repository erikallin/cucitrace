package com.travelcard.core;

public class ResponseObject {

	private int Code;
	private String message;

	private String issueMessage;

	public ResponseObject(int Code, String message) {
		super();
		this.Code = Code;
		this.message = message;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int Code) {
		this.Code = Code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getIssueMessage() {
		return issueMessage;
	}

}
