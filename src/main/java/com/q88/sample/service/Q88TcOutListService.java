package com.q88.sample.service;

import java.util.List;

import com.q88.sample.model.Q88_TcOutList;

public interface Q88TcOutListService {

	public void saveTcOutList(Q88_TcOutList tcout);
	public List<Q88_TcOutList> getallTcoutList();
}
