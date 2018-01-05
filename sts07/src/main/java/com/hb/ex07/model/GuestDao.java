package com.hb.ex07.model;

import java.util.List;

public interface GuestDao {
	List<GuestVo> selectAll() throws Exception;
}
