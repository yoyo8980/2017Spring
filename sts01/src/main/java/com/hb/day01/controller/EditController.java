package com.hb.day01.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hb.day01.model.GuestDao;
import com.hb.day01.model.entity.GuestVo;

@Controller
public class EditController {

	@Autowired
	GuestDao guestDao;
	
	@RequestMapping("/edit.do")
	public String edit(@RequestParam("idx") int sabun
			, Model model) throws Exception {
		
		GuestVo bean=guestDao.selectOne(sabun);
		model.addAttribute("bean", bean);
		
		return "edit";
	}
}
