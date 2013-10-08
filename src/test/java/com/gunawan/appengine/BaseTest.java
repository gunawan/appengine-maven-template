/**
 * 8 Oct, 2013 11:11:16 am
 */
package com.gunawan.appengine;

import org.junit.After;
import org.junit.Before;

import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.google.appengine.tools.development.testing.LocalUserServiceTestConfig;
import com.googlecode.objectify.ObjectifyService;
import com.gunawan.appengine.entity.Message;

/**
 * @author gunawan
 * 
 */
public abstract class BaseTest {
	private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalUserServiceTestConfig()).setEnvIsAdmin(true).setEnvIsLoggedIn(true);


	@Before
	public void setUp() {
		helper.setUp();

		ObjectifyService.register(Message.class);
	}

	@After
	public void tearDown() {
		helper.tearDown();
	}
}
