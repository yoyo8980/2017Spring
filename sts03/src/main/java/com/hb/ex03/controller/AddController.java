package com.hb.ex03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.ex03.model.entity.GuestVo;
import com.hb.ex03.service.GuestService;

@Controller
public class AddController {
	@Autowired
	GuestService guestService;

	@RequestMapping(value="/guest/add", method=RequestMethod.GET)
	public void form() {
		
	}
	@RequestMapping(value="/guest/add", method=RequestMethod.POST)
	public String add(@ModelAttribute GuestVo bean) throws Exception {
		guestService.add(bean);
		return " redirect:/guest";
	}
	
}
