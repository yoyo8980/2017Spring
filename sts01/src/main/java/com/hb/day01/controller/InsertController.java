package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.day01.model.GuestDao;

@Controller
public class InsertController {

	@Autowired
	GuestDao guestDao;
	
	@RequestMapping( value="/insert.do", method=RequestMethod.POST)
	public String execute(HttpServletRequest req) throws Exception {
		req.setCharacterEncoding("UTF-8");
		int sabun=Integer.parseInt(req.getParameter("sabun"));
		String name=req.getParameter("name");
		int pay=Integer.parseInt(req.getParameter("pay"));
		
		guestDao.insertOne(sabun, name, pay);
		return "redirect:/list.do";
	}
}
