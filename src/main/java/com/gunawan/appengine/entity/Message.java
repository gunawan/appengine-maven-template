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
	Long id;
	String message;
}
