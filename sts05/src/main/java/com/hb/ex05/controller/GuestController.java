package com.hb.ex05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hb.ex05.model.entity.GuestVo;
import com.hb.ex05.service.GuestService;

@Controller
@RequestMapping("/guest")
public class GuestController {
	
	@Autowired
	GuestService guestService;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String list(Model model) throws Exception {
		guestService.listAll(model);
		return "list";
	}
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add() {
		return "add";
	}
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute GuestVo bean) {
		guestService.addOne(bean);
		return "redirect:/guest/";
		
	}
	@RequestMapping(value="/detail/{idx}", method=RequestMethod.GET)
	public String detail(@PathVariable("idx") int sabun,Model model) {
		guestService.detailOne(sabun, model);
		return "detail";
		
	}
	@RequestMapping(value="/edit/{idx}", method=RequestMethod.GET)
	public String edit(@PathVariable("idx") int sabun, Model model) {
		guestService.editOne(sabun, model);
		return "detail";
		
	}
	@RequestMapping(value="/edit/{idx}", method=RequestMethod.POST)
	public String update(@PathVariable("idx") int sabun,@ModelAttribute GuestVo bean) {
		bean.setSabun(sabun);
		guestService.updateOne(bean);
		return "redirect:/guest/detail/"+sabun;
		
	}
	@RequestMapping(value="/delete/{idx}", method=RequestMethod.GET)
	public String delete(@PathVariable("idx") int sabun) {
		guestService.deleteOne(sabun);
		return "redirect:/guest/";
		
	}
}
