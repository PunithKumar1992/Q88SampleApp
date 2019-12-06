package com.bsol.q88.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88TcOutListDao;
import com.bsol.q88.mapper.CustomTcOutListMapper;
import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_TcoutListReview;
import com.bsol.q88.util.dataconvertor.TcOutListDataTransfer;


@Service
public class Q88TcOutListServiceImpl implements Q88TcOutListService {
	
	
	@Autowired
	private Q88TcOutListDao tcoutdao;
	
	@Autowired 
	private TcOutListDataTransfer tcOutListTransfer; 

	@Override
	@Transactional
	public void saveTcOutList(Q88_TcOutList tcOutList) {
		
		Integer tcoutListId = tcoutdao.getNextTcOutLisId();
		tcOutList.setTcout_SeqId(tcoutListId);
		Q88_TcOutList q88tcOutList = tcOutListTransfer.getTcOutList(tcOutList, Q88_TcOutList.class);
		Q88_TcoutListReview  q88tcOutListReview = tcOutListTransfer.getTcOutList(tcOutList, Q88_TcoutListReview.class);
		q88tcOutList.setReview(q88tcOutListReview);
		tcoutdao.save(q88tcOutList);
	}

	@Override
	public List<Q88_TcOutList> getallTcoutList() {
		return tcoutdao.findAll();
	}

	@Override
	public Q88_TcOutList getVoyageobject( String voyageId , String vesselId) {
		return tcoutdao.getVoyageobject(voyageId, vesselId);
	}

	@Override
	public String getLastRuntime(String api) {
		return tcoutdao.getLastRuntime(api);
	}

	@Override
	@Transactional
	public void updateLastRuntime(String updateTime, String api) {
		tcoutdao.updateLastRuntime(updateTime, api);
		
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
