package com.bsol.q88.service;

import java.util.List;

import com.bsol.q88.model.Q88_TcOutList;

public interface Q88TcOutListService {

	public void saveTcOutList(Q88_TcOutList tcOutList);
	public List<Q88_TcOutList> getallTcoutList();
	public Integer getNextTcOutLisId();
	public List<String> getTcOutEncryptedId();

}
