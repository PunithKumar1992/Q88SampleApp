package com.q88.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.q88.sample.dao.Q88VoyageObjectDao;
import com.q88.sample.model.Q88_Voyage;

@Service
public class Q88VoyageObjectServiceImpl implements Q88VoyageObjectService {
	
	@Autowired
	private Q88VoyageObjectDao q88voyagedao;


	@Override
	public void saveVoyageObjList(Q88_Voyage voyageObj) {
		q88voyagedao.save(voyageObj);

	}


	@Override
	public List<Q88_Voyage> getAllVoyageObj() {
		return q88voyagedao.findAll();
	}


	
}
