package com.bsol.q88.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88VoyageObjectDao;
import com.bsol.q88.model.Q88_Voyage;

@Service
public class Q88VoyageObjectServiceImpl implements Q88VoyageObjectService {
	
	@Autowired
	private Q88VoyageObjectDao q88voyagedao;


	@Override
	public void saveVoyageObjList(Q88_Voyage voyageObj) {
		q88voyagedao.save(voyageObj);

	}
	
}
