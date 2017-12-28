package com.hb.ex02.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hb.ex02.model.entity.GuestVo;

public class GuestDaoImpl implements GuestDao {

	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<GuestVo> selectAll() throws Exception {
		String sql="SELECT * FROM GUEST03";
		
		return jdbcTemplate.query(sql, new RowMapper<GuestVo>() {

			@Override
			public GuestVo mapRow(ResultSet rs, int arg1) throws SQLException {
				return new GuestVo(
						rs.getInt("sabun"),rs.getString("name")
						,rs.getTimestamp("nalja"),rs.getInt("pay")
						);
			}});
	}

}
