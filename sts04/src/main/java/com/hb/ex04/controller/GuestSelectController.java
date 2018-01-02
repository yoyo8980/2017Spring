package com.hb.ex04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.ex04.service.GuestService;

@Controller
public class GuestSelectController {

	@Autowired
	GuestService guestService;
	
//	public void setGuestService(GuestService guestService) {
//		this.guestService = guestService;
//	}
	
	@RequestMapping(value="/guest/bbs", method=RequestMethod.GET)
	public String list(Model model) throws Exception {
		model.addAttribute("list", guestService.selectAll());
		
		return "list";
	}
	
	@RequestMapping(value="/guest/{idx}", method=RequestMethod.GET)
	public String detail( Model model ,@PathVariable("idx") int sabun) throws Exception{
		//json
		model.addAttribute("bean", guestService.selectOne(sabun));
		return "json/json";
	}

}
