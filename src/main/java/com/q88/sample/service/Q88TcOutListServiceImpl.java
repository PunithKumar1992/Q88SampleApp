package com.q88.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q88.sample.dao.Q88TcOutListDao;
import com.q88.sample.model.Q88_TcOutList;

@Service
public class Q88TcOutListServiceImpl implements Q88TcOutListService {
	
	@Autowired
	private Q88TcOutListDao tcoutdao;

	@Override
	public void saveTcOutList(Q88_TcOutList tcout) {
		tcoutdao.save(tcout);

	}

	@Override
	public List<Q88_TcOutList> getallTcoutList() {
		return tcoutdao.findAll();
	}

}
