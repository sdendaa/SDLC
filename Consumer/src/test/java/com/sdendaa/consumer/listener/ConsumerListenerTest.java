package com.sdendaa.consumer.listener;

import static org.junit.Assert.*;

import javax.jms.TextMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sdendaa.consumer.ConsumerListener;

public class ConsumerListenerTest {
	
	private TextMessage message;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ConsumerListener listener = new ConsumerListener();
		listener.onMessage(message);
		assertNull(message);
	}

}
