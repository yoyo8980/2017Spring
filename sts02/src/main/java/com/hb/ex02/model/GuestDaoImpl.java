package com.hb.ex02.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hb.ex02.model.entity.GuestVo;

public class GuestDaoImpl implements GuestDao {

	JdbcTemplate jdbcTemplate;
	RowMapper<GuestVo> rowMapper=new RowMapper<GuestVo>() {

		@Override
		public GuestVo mapRow(ResultSet rs, int arg1) throws SQLException {
			return new GuestVo(
					rs.getInt("sabun"),rs.getString("name")
					,rs.getTimestamp("nalja"),rs.getInt("pay")
					);
		}};
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public List<GuestVo> selectAll() throws Exception {
		String sql="SELECT * FROM GUEST03";
		
		return jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void insertOne(GuestVo bean) throws Exception {
		String sql="INSERT INTO GUEST03 VALUES (?,?,now(),?)";
		
		Object[] objs= new Object[] { bean.getSabun(),bean.getName(),bean.getPay()};
		jdbcTemplate.update(sql, objs);
	}

	@Override
	public GuestVo selectOne(int sabun) throws Exception {
		String sql="SELECT * FROM GUEST03 WHERE SABUN=?";
		return jdbcTemplate.queryForObject(sql, rowMapper, sabun);
	}

}
