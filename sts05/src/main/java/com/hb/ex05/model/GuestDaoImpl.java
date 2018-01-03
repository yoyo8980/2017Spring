package com.hb.ex05.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hb.ex05.model.entity.GuestVo;

public class GuestDaoImpl implements GuestDao {

	SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	@Override
	public List<GuestVo> selectAll() {
		
		return session.selectList("com.hb.ex05.model.GuestDao.selectAll");
	}

	@Override
	public void insertOne(GuestVo bean) {
		// TODO Auto-generated method stub
		session.insert("com.hb.ex05.model.GuestDao.insertOne", bean);
	}

	@Override
	public GuestVo selectOne(int sabun) {
		// TODO Auto-generated method stub
		return session.selectOne("selectOne", sabun);
	}

	@Override
	public int updateOne(GuestVo bean) {
		return session.update("updateOne",bean);
	}

	@Override
	public int deleteOne(int sabun) {
		// TODO Auto-generated method stub
		return session.delete("deleteOne", sabun);
	}

}
