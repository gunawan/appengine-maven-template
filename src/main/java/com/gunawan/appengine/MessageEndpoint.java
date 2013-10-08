/**
 * 8 Oct, 2013 1:48:44 pm
 */
package com.gunawan.appengine;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.gunawan.appengine.entity.Message;

/**
 * @author gunawan
 * 
 */
@Api(
		name = "messages",
		version = "v1",
		clientIds = { Ids.WEB_CLIENT_ID, Ids.ANDROID_CLIENT_ID, Ids.IOS_CLIENT_ID },
		audiences = { Ids.ANDROID_AUDIENCE })
public class MessageEndpoint {

	@ApiMethod(name = "list", path = "/list", httpMethod = HttpMethod.GET)
	public Message list() {
		Message message = new Message();
		message.setMessage("Hello World");
		return message;
	}
}
