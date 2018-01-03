package com.hb.ex03.service;

import com.hb.ex03.model.GuestDao;
import com.hb.ex03.model.entity.GuestVo;

public class GuestServiceImpl implements GuestService {
	GuestDao guestDao;
	public GuestServiceImpl(GuestDao guestDao) {
		this.guestDao=guestDao;
	}
	@Override
	public void add(GuestVo bean) throws Exception {
		// TODO Auto-generated method stub
		bean.setSabun(guestDao.nextVal()+1);
		guestDao.insertOne(bean);
	}
	@Override
	public GuestVo detail(int sabun) throws Exception {
		
		return guestDao.selectOne(sabun);
	}
	@Override
	public int edit(GuestVo bean) throws Exception {
		
		return guestDao.updateOne(bean);
	}
	@Override
	public int delete(int sabun) throws Exception {
		// TODO Auto-generated method stub
		return guestDao.deleteOne(sabun);
	}
	
	
}
