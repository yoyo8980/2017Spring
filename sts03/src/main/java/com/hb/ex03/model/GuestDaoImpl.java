package com.hb.ex03.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.hb.ex03.model.entity.GuestVo;

public class GuestDaoImpl extends JdbcDaoSupport implements GuestDao {
	Logger log= Logger.getLogger(this.getClass());
	
	private RowMapper<GuestVo> rowMapper;
	
	public GuestDaoImpl() {
		rowMapper=new RowMapper<GuestVo>() {

			@Override
			public GuestVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				log.debug(rowNum);
				return new GuestVo(
							rs.getInt("sabun")
							,rs.getString("name")
							,rs.getDate("nalja")
							,rs.getInt("pay")
						);
			}
		};
	}
	
	@Override
	public List<GuestVo> selectAll() throws Exception {
		String sql="SELECT * FROM GUEST03";
		return getJdbcTemplate().query(sql, rowMapper);
	}
	
	@Override
	public int nextVal() throws Exception{
		String sql="SELECT MAX(SABUN) AS MX FROM GUEST03";
		return getJdbcTemplate().queryForInt(sql);
	}
	
	@Override
	public void insertOne(GuestVo bean) throws Exception {
		String sql = "INSERT INTO GUEST03 VALUES (?,?,now(),?)";
		getJdbcTemplate().update(sql,bean.getSabun(),bean.getName(),bean.getPay());
	}

	@Override
	public GuestVo selectOne(int sabun) throws Exception {
		String sql="SELECT * FROM GUEST03 WHERE SABUN=?";
		return getJdbcTemplate().queryForObject(sql, rowMapper, sabun);
	}

	@Override
	public int updateOne(GuestVo bean) throws Exception {
		String sql="UPDATE GUEST03 SET NAME=?, PAY=? WHERE SABUN=?";
		return getJdbcTemplate().update(sql, bean.getName(),bean.getPay(),bean.getSabun());
	}

	@Override
	public int deleteOne(int sabun) throws Exception {
		String sql="delete from guest03 where sabun=?";
		return getJdbcTemplate().update(sql, sabun);
	}

}
