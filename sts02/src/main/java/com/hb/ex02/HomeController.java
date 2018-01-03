package com.hb.ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hb.ex02.model.GuestDao;
import com.hb.ex02.model.entity.GuestVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	GuestDao guestDao;
	
	@RequestMapping("/")
	public String list(Model model) throws Exception {
		model.addAttribute("list",guestDao.selectAll());
		
		return "home";
	}
	
	@RequestMapping("/add")
	public void add() {
		
	}
	@RequestMapping( value="/insert" , method=RequestMethod.POST)
	public String insert(@ModelAttribute GuestVo bean) throws Exception {
		
		guestDao.insertOne(bean);
		return "redirect://";
	}
	
	@RequestMapping("/detail")
	public void detail(@RequestParam("idx") int sabun, Model model) throws Exception {
		model.addAttribute("bean",guestDao.selectOne(sabun));
	}
	/*@RequestMapping("/delete")
	public String delete(@RequestParam("idx") int sabun) throws Exception {
		
		guestDao.deleteOne(sabun);
		return "redirect://";
		
	}*/
	
	
}
