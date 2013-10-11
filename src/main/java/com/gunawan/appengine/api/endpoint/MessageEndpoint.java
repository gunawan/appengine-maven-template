/**
 * 8 Oct, 2013 1:48:44 pm
 */
package com.gunawan.appengine.api.endpoint;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.appengine.repackaged.com.google.api.client.http.HttpStatusCodes;
import com.gunawan.appengine.Ids;
import com.gunawan.appengine.api.model.Response;
import com.gunawan.appengine.api.model.ResponseBuilder;
import com.gunawan.appengine.api.model.Status;
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

	@ApiMethod(path = "/ok", httpMethod = HttpMethod.GET)
	public Response ok() {
		Response response = new Response(Status.OK, "Successful");
		return response;
	}

	@ApiMethod(path = "/error", httpMethod = HttpMethod.GET)
	public Response error() {
		Response response = ResponseBuilder.builder().error(HttpStatusCodes.STATUS_CODE_NOT_FOUND, "Not Found").build();
		return response;
	}
}
