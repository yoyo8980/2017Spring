package com.hb.ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hb.ex02.model.GuestDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	GuestDao guestDao;
	
	@RequestMapping(value = "/")
	public String list(Model model) throws Exception {
		model.addAttribute("list",guestDao.selectAll());
		
		return "home";
	}
}
