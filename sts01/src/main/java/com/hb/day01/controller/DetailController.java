package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hb.day01.model.GuestDao;
import com.hb.day01.model.entity.GuestVo;

@Controller
public class DetailController {

	@Autowired
	GuestDao guestDao;
	
	@RequestMapping("/detail.do")
	public String detail(@RequestParam("idx") int sabun, HttpServletRequest req) throws Exception {
		
		GuestVo bean=guestDao.selectOne(sabun);
		req.setAttribute("bean", bean);
		
		return "detail";
	}
}
