package com.bsol.q88.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88_TcOutListDetailDao;
import com.bsol.q88.mapper.CustomTcOutListDetailMapper;
import com.bsol.q88.model.Q88_TcOutDtl_Delivery;
import com.bsol.q88.model.Q88_TcOutDtl_DeliveryDtl;
import com.bsol.q88.model.Q88_TcOutDtl_Review;
import com.bsol.q88.model.Q88_TcOutDtl_CommissionList;
import com.bsol.q88.model.Q88_TcOutDtl;
import com.bsol.q88.model.Q88_TcOutDtl_Duration;
import com.bsol.q88.model.Q88_TcOutDtl_ReDeliveryDtl;
import com.bsol.q88.model.Q88_TcOutDtl_Results;
import com.bsol.q88.model.Q88_TcOutDtl_VoyageList;
import com.bsol.q88.model.Q88_TCOutDtl_Contract;
import com.bsol.q88.util.dataconvertor.Q88_TcOutListDetailDataTransfer;


@Service
public class Q88TcOutListDetailServiceImpl  implements Q88TcOutListDetailService {
	
	@Autowired
	private Q88_TcOutListDetailDao tcOutDtldao;
	
	@Autowired
	private Q88_TcOutListDetailDataTransfer tcOutListDtltransfer;
	
	Logger logger = Logger.getLogger(this.getClass());

	@Override
	@Transactional
	public void saveTcOutListDetails(Q88_TcOutDtl tcOutListDtl) {
		
		logger.info("Q88TcOutDetail saveTcOutListDetails Method inside ");
		
		CustomTcOutListDetailMapper custom = new CustomTcOutListDetailMapper(tcOutListDtl);
		Q88_TcOutDtl tcOutLsDtl = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutDtl.class);
		Q88_TCOutDtl_Contract contract = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TCOutDtl_Contract.class);
		Q88_TcOutDtl_Review review = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutDtl_Review.class);
		List<Q88_TcOutDtl_CommissionList> commissionList = custom.getTcOutFixtureCommission();
		Q88_TcOutDtl_Results results = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutDtl_Results.class);
		List<Q88_TcOutDtl_Duration> duration = custom.getPeriods();
		List<Q88_TcOutDtl_VoyageList> voyageList = custom.getTcOutVoyageList();
		
		if(contract !=null) {
			if(review !=null) {
				contract.setReview(review);
			}
			tcOutLsDtl.setContract(contract);
		}
		if(commissionList !=null) {
			tcOutLsDtl.addCommissionList(commissionList);
		}
		if(results !=null) {
			tcOutLsDtl.setResults(results);
		}
		if(duration !=null) {
			tcOutLsDtl.addDuration(duration);
		}
		
		if(voyageList !=null) {
			tcOutLsDtl.addVoyageList(voyageList);
		}
		Q88_TcOutDtl_Delivery  deliveryDtl = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutDtl_Delivery.class);
		if(deliveryDtl !=null ) {
		Q88_TcOutDtl_ReDeliveryDtl  redelivery  = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutDtl_ReDeliveryDtl.class);
		Q88_TcOutDtl_DeliveryDtl delivery = tcOutListDtltransfer.getTcOutListDetail(tcOutListDtl, Q88_TcOutDtl_DeliveryDtl.class);
		deliveryDtl.setDelivery(delivery);
		deliveryDtl.setRedelivery(redelivery);
		}
		if(deliveryDtl !=null) {
		tcOutLsDtl.setTcOutDeliveryRedelivery(deliveryDtl);
		}
		tcOutDtldao.save(tcOutLsDtl);
		
		logger.info("Q88TcOutDetail saveTcOutListDetails Method inside save successfull ");
		
	}

	@Override
	public Integer getNextTcOutLisDtlId() {
		return null;
	}

}
