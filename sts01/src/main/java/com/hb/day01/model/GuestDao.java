package com.hb.day01.model;

import java.util.List;

import com.hb.day01.model.entity.GuestVo;

public interface GuestDao {

	List<GuestVo> selectAll() throws Exception;
}
