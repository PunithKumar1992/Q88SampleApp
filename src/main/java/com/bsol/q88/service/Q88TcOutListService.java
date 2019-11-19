package com.bsol.q88.service;

import java.util.List;

import com.bsol.q88.model.Q88_TcOutList;

public interface Q88TcOutListService {

	public void saveTcOutList(Q88_TcOutList tcoutList);
	public List<Q88_TcOutList> getallTcoutList();
	public Q88_TcOutList getVoyageobject(String voyageId , String vesselId);

}
