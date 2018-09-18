package com.zhaols.SSMdome.utils;
public class MyException extends Exception{
	private String message;
	@Override
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MyException(String message) {
		super();
		this.message = message;
	}
}
