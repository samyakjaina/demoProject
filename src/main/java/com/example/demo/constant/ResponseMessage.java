package com.example.demo.constant;

public enum ResponseMessage {

	Null("No Data Found last changes ");
	private String message;
	private ResponseMessage( String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
