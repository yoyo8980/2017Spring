package com.hb.ex04.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.ex04.model.entity.GuestVo;
import com.hb.ex04.service.GuestService;

@Controller
public class GuestUpdateController {
	@Autowired
	GuestService guestService;

	@RequestMapping(value="/guest/bbs", method=RequestMethod.POST)
	public String insert(@ModelAttribute GuestVo bean) throws Exception {
		guestService.insertOne(bean);
		return "redirect:/guest/bbs";
	}
	@RequestMapping(value="/guest/{idx}", method=RequestMethod.PUT)
	public String update(@ModelAttribute GuestVo bean, Model model) throws Exception {
		System.out.println("update method¹ÞÀ¸");
		System.out.println(guestService.updateOne(bean));
		System.out.println(bean);
		model.addAttribute("bean", bean);
		
		return "json/json";
	}
	@RequestMapping(value="/guest/{idx}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("idx") int sabun) throws Exception {
		guestService.deleteOne(sabun);
		return "json/json";
	}
}
