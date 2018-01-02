package com.hb.ex04.service;

import java.util.List;

import com.hb.ex04.model.entity.GuestVo;

public interface GuestService {
	List<GuestVo> selectAll() throws Exception;
	void insertOne(GuestVo bean) throws Exception;
	GuestVo selectOne(int sabun) throws Exception;
	int updateOne(GuestVo bean) throws Exception;
	int deleteOne(int sabun) throws Exception;
	
}
