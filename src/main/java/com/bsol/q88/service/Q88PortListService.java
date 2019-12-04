package com.bsol.q88.service;

import java.util.List;

import com.bsol.q88.model.Q88_PortList;

public interface Q88PortListService {
	
	public List<Q88_PortList> getAllPorList();
	public void savePortList(Q88_PortList portlist);

}
