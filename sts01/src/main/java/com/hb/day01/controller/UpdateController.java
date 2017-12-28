package com.hb.day01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.day01.model.GuestDao;

@Controller
public class UpdateController {
	@Autowired
	GuestDao guestDao;

	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String update(int sabun, String name, int pay) throws Exception {
		guestDao.updateOne(sabun,name,pay);
		return "redirect:/detail.do?idx="+sabun;
	}
}
