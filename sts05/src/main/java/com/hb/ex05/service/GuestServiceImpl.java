package com.hb.ex05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
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
	@Transactional(propagation=Propagation.REQUIRES_NEW,rollbackFor=Exception.class)
	public void detailOne(int sabun, Model model) {
		// requires:기존에 트랜젝션이있으면 기존거사용, 새로운게있으면 새로운거사용
		//전파 설정이 
		//PROPAGATION_REQUIRED인 경우 설정이 적용된 각 메서드마다 논리적인 트랜잭션의 범위가 생성
		//ROPAGATION_REQUIRES_NEW는 영향받은 각각의 트랜잭션 범위에 완전히 독릭적인 트랜잭션
		//rollbackFor = 어떠한 예외가 발생했을때 롤백할 것인지...
		//dao
		guestDao.payPlus(sabun);
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
