package com.bsol.q88.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88TcOutListDao;
import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_TcReview;
import com.bsol.q88.util.dataconvertor.TcOutListDataTransfer;

@Service
public class Q88TcOutListServiceImpl implements Q88TcOutListService {
	
	@Autowired
	private TcOutListDataTransfer tcouTransfer;
	
	@Autowired
	private Q88TcOutListDao tcoutdao;

	@Override
	public void saveTcOutList(Q88_TcOutList tcoutList) {
		
		Q88_TcOutList q88TcoutList = tcouTransfer.getTcOutList(tcoutList, Q88_TcOutList.class);
		Q88_TcReview  q88TcoutReview = tcouTransfer.getTcOutList(tcoutList, Q88_TcReview.class);
		q88TcoutList.setReview(q88TcoutReview);
		tcoutdao.save(q88TcoutList);

	}

	@Override
	public List<Q88_TcOutList> getallTcoutList() {
		return tcoutdao.findAll();
	}

	@Override
	public Q88_TcOutList getVoyageobject(String voyageId, String vesselId) {
		return tcoutdao.getVoyageobject(voyageId, vesselId);
	}

}
