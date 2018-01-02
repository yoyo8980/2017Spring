package com.hb.ex04.model;

import java.util.List;

import com.hb.ex04.model.entity.GuestVo;
import com.ibatis.sqlmap.client.SqlMapClient;

public class GuestDaoImpl implements GuestDao {
	
	
	private SqlMapClient sqlMapClient;
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}
	
	@Override
	public List<GuestVo> selectAll() throws Exception {
		
		return sqlMapClient.queryForList("selectAll");
	}

	@Override
	public void insertOne(GuestVo bean) throws Exception {
		sqlMapClient.insert("insertOne",bean);
	}

	@Override
	public GuestVo selectOne(int sabun) throws Exception {
		// TODO Auto-generated method stub
		return (GuestVo) sqlMapClient.queryForObject("selectOne", sabun);
	}

	@Override
	public int updateOne(GuestVo bean) throws Exception {
		// TODO Auto-generated method stub
		return sqlMapClient.update("updateOne", bean);
	}

	@Override
	public int deleteOne(int sabun) throws Exception {
		// TODO Auto-generated method stub
		return sqlMapClient.delete("deleteOne",sabun);
	}

}
