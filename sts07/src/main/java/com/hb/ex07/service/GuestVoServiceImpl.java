package com.hb.ex07.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.hb.ex07.model.GuestDao;

@Service
public class GuestVoServiceImpl implements GuestService {

	@Override
	public void list(SqlSession sqlsession, Model model) throws Exception {
		// TODO Auto-generated method stub
		GuestDao dao=sqlsession.getMapper(GuestDao.class);
		model.addAttribute("list", dao.selectAll());
	}

}
