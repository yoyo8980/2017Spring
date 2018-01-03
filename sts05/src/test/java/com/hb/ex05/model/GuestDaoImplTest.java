package com.hb.ex05.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GuestDaoImplTest {
	GuestDao guestDao;
	

	@Before
	public void setUp() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/config-context.xml");
		guestDao=(GuestDao) ac.getBean("guestDao");
	}

	@Test
	public void testSelectAll() throws Exception {
		assertNotNull(guestDao);
		assertTrue(guestDao.selectAll() instanceof List);
		//assertTrue(guestDao.selectAll().size()>0);
		//fail("Not yet implemented");
	}

}
