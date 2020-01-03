package com.bsol.q88.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88PortListDao;
import com.bsol.q88.model.Q88_PortList;

@Service
public class Q88PortListServiceImpl implements Q88PortListService {
	
	@Autowired
	private Q88PortListDao q88portdao;

	

	@Override
	public List<Q88_PortList> getAllPorList() {
		return q88portdao.findAll();
	}



	@Override
	public void savePortList(Q88_PortList portList) {
		q88portdao.save(portList);
		
	}

}
