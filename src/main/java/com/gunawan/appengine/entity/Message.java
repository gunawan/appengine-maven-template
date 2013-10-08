/**
 * 8 Oct, 2013 10:48:32 am
 */
package com.gunawan.appengine.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * @author gunawan
 * 
 */
@Entity
public class Message {
	@Id
	private Long id;
	private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
