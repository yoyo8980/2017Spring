package com.hb.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.ex04.model.GuestDao;
import com.hb.ex04.model.entity.GuestVo;

public class GuestDaoImplTest {

	GuestDao guestDao;
	@Before
	public void setUp() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config-context.xml");
		guestDao=(GuestDao) ac.getBean("guestDao");
	}

	@Test
	public void testSelectAll() throws Exception {
		assertNotNull("dao�� null��",guestDao);
//		List<GuestVo> list = guestDao.selectAll();
		assertNotNull("db������ ������",guestDao.selectAll());
		assertTrue("���ϰ���� ListŸ���� �ƴ�", guestDao.selectAll() instanceof List);
	}
	
	@Test
	public void testSelectOne() throws Exception{
		assertNotNull(guestDao.selectOne(1111));
		assertEquals(new GuestVo(1111,"test1",null,1000), guestDao.selectOne(1111));
		
	}

}
