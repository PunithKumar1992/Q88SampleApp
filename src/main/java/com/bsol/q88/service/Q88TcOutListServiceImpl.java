package com.bsol.q88.service;

import java.util.List;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bsol.q88.dao.Q88TcOutListDao;
import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_TcOutList_Review;
import com.bsol.q88.util.dataconvertor.Q88_TcOutListDataTransfer;


@Service
public class Q88TcOutListServiceImpl implements Q88TcOutListService {
	
	
	@Autowired
	private Q88TcOutListDao tcoutdao;
	
	@Autowired 
	private Q88_TcOutListDataTransfer tcOutListTransfer; 
	
	
	Logger logger = Logger.getLogger(this.getClass());

	@Override
	@Transactional
	public void saveTcOutList(Q88_TcOutList tcOutList) {
		logger.info("Q88TcoutList save tcout lists object ");
		
		Q88_TcOutList q88tcOutList = tcOutListTransfer.getTcOutList(tcOutList, Q88_TcOutList.class);
		Q88_TcOutList_Review  q88tcOutListReview = tcOutListTransfer.getTcOutList(tcOutList, Q88_TcOutList_Review.class);
		if(q88tcOutListReview !=null) {
		q88tcOutList.setReview(q88tcOutListReview);
		}
		tcoutdao.save(q88tcOutList);
	}

	@Override
	public List<Q88_TcOutList> getallTcoutList() {
		return tcoutdao.findAll();
	}


	

	@Override
	public Integer getNextTcOutLisId() {
		return tcoutdao.getNextTcOutLisId();
	}

	@Override
	public List<String> getTcOutEncryptedId() {
		return tcoutdao.getTcOutEncryptedId();
	}

}
