package com.bsol.q88.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88_VoyLstChangedDao;
import com.bsol.q88.model.Q88_VoyLstChanged;
import com.bsol.q88.model.Q88_VoyLstChanged_Review;
import com.bsol.q88.util.dataconvertor.Q88_VoyLstChangedDataTransfer;

@Service
public class Q88_VoyLstChangedServiceImpl implements Q88_VoyLstChangedService {
	
	@Autowired
	private Q88_VoyLstChangedDao voyLstChangedao;
	
	@Autowired
	private Q88_VoyLstChangedDataTransfer voyLstTransfer;

	@Override
	public void saveVoyLstChanged(Q88_VoyLstChanged voyLst) {
		Q88_VoyLstChanged voyLstChanged = voyLstTransfer.getVoyLstChanged(voyLst, Q88_VoyLstChanged.class);
		Q88_VoyLstChanged_Review voyLstReview = voyLstTransfer.getVoyLstChanged(voyLst, Q88_VoyLstChanged_Review.class);
		if(voyLstReview !=null) {
			voyLstChanged.setReview(voyLstReview);
		}
		voyLstChangedao.save(voyLstChanged);

	}

}
