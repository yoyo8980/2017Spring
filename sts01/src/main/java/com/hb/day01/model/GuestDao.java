package com.hb.day01.model;

import java.util.List;

import com.hb.day01.model.entity.GuestVo;

public interface GuestDao {

	List<GuestVo> selectAll() throws Exception;
	GuestVo selectOne(int sabun) throws Exception;
	void insertOne(int sabun, String name, int pay) throws Exception;
	int updateOne(int sabun, String name, int pay) throws Exception;
	
}
