package com.hb.ex07.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

public interface GuestService {

	void list(SqlSession sqlsession, Model model) throws Exception;
	
}