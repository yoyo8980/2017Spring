package com.hb.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.model.GuestDao;

public class Ex01 {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("/myBean.xml");
		// TODO Auto-generated method stub
		GuestDao guestDao=(GuestDao) ac.getBean("guestDao");
		guestDao.listDao();
		guestDao.addDao();
		guestDao.editDao();
	}

}
