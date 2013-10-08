/**
 * 8 Oct, 2013 11:15:33 am
 */
package com.gunawan.appengine.entity;

import static com.googlecode.objectify.ObjectifyService.ofy;

import org.junit.Assert;
import org.junit.Test;

import com.gunawan.appengine.BaseTest;
import com.gunawan.appengine.entity.Message;

/**
 * @author gunawan
 * 
 */
public class MessageTest extends BaseTest {
	@Test
	public void save() {
		Message message = new Message();
		message.setMessage("Hello World");
		ofy().save().entity(message).now();
		Message fetched = ofy().load().entity(message).now();
		Assert.assertTrue("Hello World".equals(fetched.getMessage()));
	}
}
