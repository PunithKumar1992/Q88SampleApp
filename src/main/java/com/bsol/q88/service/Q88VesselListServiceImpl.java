package com.bsol.q88.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88VesselListDao;
import com.bsol.q88.model.Q88_VesselList;

@Service
public class Q88VesselListServiceImpl implements Q88VesselListService {
	
	
	
	@Autowired
	private Q88VesselListDao vesseldao;

	Logger logger = Logger.getLogger(this.getClass());
	@Override
	public void saveVesselList(Q88_VesselList vesselList) {
	logger.info("inside Q88GetVesselList Service saveVesselList Method" );
		vesseldao.save(vesselList);
		

	}

}
