package com.hb.ex04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hb.ex04.model.GuestDao;
import com.hb.ex04.model.entity.GuestVo;

@Component(value="guestService")
public class GuestServiceImpl implements GuestService {

	@Autowired
	GuestDao guestDao;
	
	
//	public void setGuestDao(GuestDao guestDao) {
//		this.guestDao = guestDao;
//	}

	@Override
	public List<GuestVo> selectAll() throws Exception {
		return guestDao.selectAll();
	}

	@Override
	public void insertOne(GuestVo bean) throws Exception {
		// TODO Auto-generated method stub
		guestDao.insertOne(bean);
	}

	@Override
	public GuestVo selectOne(int sabun) throws Exception {
		// TODO Auto-generated method stub
		return guestDao.selectOne(sabun);
	}

	@Override
	public int updateOne(GuestVo bean) throws Exception {
		return guestDao.updateOne(bean);
	}

	@Override
	public int deleteOne(int sabun) throws Exception {
		// TODO Auto-generated method stub
		return guestDao.deleteOne(sabun);
	}


}
