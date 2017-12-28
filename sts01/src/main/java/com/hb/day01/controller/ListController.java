package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hb.day01.model.GuestDao;

//POJO

@Controller
public class ListController {
	
	@Autowired
	GuestDao guestDao;
	
	
	@RequestMapping("/list.do")
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mav=new ModelAndView();
		mav.addObject("list", guestDao.selectAll());
		mav.setViewName("list");
		
		return mav;
		
	}
}
