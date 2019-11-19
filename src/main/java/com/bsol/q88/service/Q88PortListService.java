package com.bsol.q88.service;

import java.util.List;

import com.bsol.q88.model.PortList;

public interface Q88PortListService {
	
	public List<PortList> getAllPorList();
	public void savePortList(PortList portlist);

}
