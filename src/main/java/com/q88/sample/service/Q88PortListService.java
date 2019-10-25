package com.q88.sample.service;

import java.util.List;

import com.q88.sample.model.Employee;
import com.q88.sample.model.PortList;

public interface Q88PortListService {
	
	public List<PortList> getAllPorList();
	public void savePortList(PortList portlist);

}
