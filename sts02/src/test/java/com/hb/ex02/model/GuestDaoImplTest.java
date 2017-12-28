package com.hb.ex02.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.ex02.model.entity.GuestVo;

public class GuestDaoImplTest {
	GuestDao guestDao;
	private GuestVo testBean;
	@Before
	public void setUp() throws Exception {
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("/root-context.xml");
		guestDao=(GuestDao) cntxt.getBean("guestDao");
		testBean=new GuestVo(9999,"test9",null,90000);
	}

	@Test
	public void testSelectAll() throws Exception {
		assertNotNull(guestDao);
		assertTrue(guestDao.selectAll() instanceof List);
		assertTrue(guestDao.selectAll().size()>0);
		
		
		
		
//		fail("Not yet implemented");
	}
	@Test
	public void testInsertOne() throws Exception {
		int before=guestDao.selectAll().size();
		guestDao.insertOne(testBean);
		int after=guestDao.selectAll().size();
		assertTrue(before<after);
		assertEquals(before, after-1);
	}
	@Test
	public void testSelectOne() throws Exception {
		GuestVo resultBean = guestDao.selectOne(testBean.getSabun());
		assertEquals(testBean, resultBean);
	}
}
