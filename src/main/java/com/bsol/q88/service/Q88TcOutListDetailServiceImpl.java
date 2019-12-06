package com.bsol.q88.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88_TcOutListDetailDao;
import com.bsol.q88.mapper.CustomTcOutListDetailMapper;
import com.bsol.q88.model.Q88_TcOutDelivery;
import com.bsol.q88.model.Q88_TcOutDeliveryDetail;
import com.bsol.q88.model.Q88_TcOutDtlReview;
import com.bsol.q88.model.Q88_TcOutFixtureCommission;
import com.bsol.q88.model.Q88_TcOutListDetails;
import com.bsol.q88.model.Q88_TcOutPeriod;
import com.bsol.q88.model.Q88_TcOutReDeliveryDetail;
import com.bsol.q88.model.Q88_TcOutResults;
import com.bsol.q88.model.Q88_TcOutVoyage;
import com.bsol.q88.model.Q88_TcoFixture;
import com.bsol.q88.util.dataconvertor.TcOutListDetailDataTransfer;


@Service
public class Q88TcOutListDetailServiceImpl  implements Q88TcOutListDetailService {
	
	@Autowired
	private Q88_TcOutListDetailDao tcOutDtldao;
	
	@Autowired
	private TcOutListDetailDataTransfer tcOutListDtltransfer;

	@Override
	@Transactional
	public void saveTcOutListDetails(Q88_TcOutListDetails tcOutListDtl) {
		
		CustomTcOutListDetailMapper custom = new CustomTcOutListDetailMapper(tcOutListDtl);
		Integer tcOutDtlSeqId = tcOutDtldao.getNextTcOutLisDtlId();
		tcOutListDtl.setTcOutDetail_SeqId(tcOutDtlSeqId);
		Q88_TcOutListDetails tcOutLsDtl = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutListDetails.class);
		Q88_TcoFixture tcOutFixture = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcoFixture.class);
		Q88_TcOutDtlReview tcOutLsDtlReview = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutDtlReview.class);
		List<Q88_TcOutFixtureCommission> commissionList = custom.getTcOutFixtureCommission();
		Q88_TcOutResults results = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutResults.class);
		List<Q88_TcOutPeriod> duration = custom.getPeriods();
		List<Q88_TcOutVoyage> voyageList = custom.getTcOutVoyageList();
		Q88_TcOutDelivery  deliveryDtl = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutDelivery.class);
		if(deliveryDtl !=null ) {
		Q88_TcOutReDeliveryDetail  redelivery  = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutReDeliveryDetail.class);
		Q88_TcOutDeliveryDetail delivery = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutDeliveryDetail.class);
		deliveryDtl.setDelivery(delivery);
		deliveryDtl.setRedelivery(redelivery);
		}
		tcOutFixture.setReview(tcOutLsDtlReview);
		tcOutLsDtl.setContract(tcOutFixture);
		tcOutLsDtl.addCommissionList(commissionList);
		tcOutLsDtl.setResults(results);
		tcOutLsDtl.addDuration(duration);
		tcOutLsDtl.addVoyageList(voyageList);
		if(deliveryDtl !=null) {
		tcOutLsDtl.setTcOutDeliveryRedelivery(deliveryDtl);
		}
		tcOutDtldao.save(tcOutLsDtl);
		
	}

	@Override
	public Integer getNextTcOutLisDtlId() {
		return null;
	}

}
