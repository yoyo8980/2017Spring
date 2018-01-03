package com.hb.ex05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.hb.ex05.model.GuestDao;
import com.hb.ex05.model.entity.GuestVo;

@Component
public class GuestServiceImpl implements GuestService {

	@Autowired
	GuestDao guestDao;
	
	@Override
	public void listAll(Model model) throws Exception {
		model.addAttribute("list", guestDao.selectAll());
	}

	@Override
	public void addOne(GuestVo bean) {
		// TODO Auto-generated method stub
		guestDao.insertOne(bean);
	}

	@Override
	public void detailOne(int sabun, Model model) {
		// TODO Auto-generated method stub
		//dao
		model.addAttribute("bean",guestDao.selectOne(sabun));
		model.addAttribute("title", "상세");
		model.addAttribute("readonly", "readonly");
	}

	@Override
	public void editOne(int sabun, Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("bean",guestDao.selectOne(sabun));
		model.addAttribute("title", "수정");
		model.addAttribute("readonly", "null");
		
	}

	@Override
	public void updateOne(GuestVo bean) {
		// TODO Auto-generated method stub
		guestDao.updateOne(bean);
	}

	@Override
	public void deleteOne(int sabun) {
		// TODO Auto-generated method stub
		guestDao.deleteOne(sabun);
	}

}
