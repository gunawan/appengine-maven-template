/**
 * 11 Oct, 2013 11:06:34 am
 */
package com.gunawan.appengine.api.model;

import java.util.List;

/**
 * @author gunawan
 * 
 */
public class Response {
	private Status status;
	private String message;
	private List<Error> errors;

	public Response() {

	}

	public Response(Status status, String message) {
		this.status = status;
		this.message = message;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}
}
