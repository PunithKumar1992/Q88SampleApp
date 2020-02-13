package com.bsol.q88.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88PortListDao;
import com.bsol.q88.model.Q88_PortList;

@Service
public class Q88PortListServiceImpl implements Q88PortListService {
	
	@Autowired
	private Q88PortListDao q88portdao;

	Logger logger = Logger.getLogger(this.getClass());

	@Override
	public List<Q88_PortList> getAllPorList() {
		return q88portdao.findAll();
	}


	@Override
	public void savePortList(Q88_PortList portList) {
		logger.info("inside Q88 Port List Service  Save PortList Method");
		q88portdao.save(portList);
		
	}

}
