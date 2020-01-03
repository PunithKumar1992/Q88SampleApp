package com.bsol.q88.service;

import java.sql.Timestamp;
import java.util.List;

import com.bsol.q88.model.Q88_TcOutList;

public interface Q88TcOutListService {

	public void saveTcOutList(Q88_TcOutList tcOutList);
	public List<Q88_TcOutList> getallTcoutList();
	public String getLastRuntime(String api);
	public void updateLastRuntime(String updateTime,String api);
	public Integer getNextTcOutLisId();
	public List<String> getTcOutEncryptedId();

}
