/**
 * 11 Oct, 2013 11:17:16 am
 */
package com.gunawan.appengine.api.model;

/**
 * @author gunawan
 * 
 */
public class Error {
	private String message;
	private int code;

	public Error(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
