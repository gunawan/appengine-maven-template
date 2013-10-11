/**
 * 11 Oct, 2013 11:33:54 am
 */
package com.gunawan.appengine.api.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gunawan
 * 
 */
public class ResponseBuilder {

	private Response response = new Response();
	private List<Error> errors = null;

	private ResponseBuilder() {

	}

	public ResponseBuilder ok(int code, String message) {
		response.setStatus(Status.OK);
		response.setMessage(message);
		return this;
	}

	public ResponseBuilder error(int code, String message) {
		response.setStatus(Status.ERROR);
		Error error = new Error(code, message);

		if (errors == null) {
			errors = new ArrayList<Error>();
		}
		errors.add(error);
		return this;
	}

	public Response build() {
		response.setErrors(errors);
		return response;
	}

	public static ResponseBuilder builder() {
		return new ResponseBuilder();
	}
}
