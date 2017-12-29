package com.hb.ex03.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.ex03.model.entity.GuestVo;

public class GuestDaoImplTest {
	GuestDao guestDao;

	@Before
	public void setUp() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/config-context.xml");
		guestDao=(GuestDao) ac.getBean("guestDao");
	}

	@Test
	public void testSelectAll() throws Exception {
		List<GuestVo> list = guestDao.selectAll();
		assertNull("list가 null임",list);
		assertTrue("List타입이 아님",list instanceof List);
		assertTrue("List가 비었음",list.size()>0);
	}
	
	@Test
	public void testNextVal() throws Exception {
		assertTrue(guestDao.nextVal()>0);
	}

}
