package com.bsol.q88.util.dataconvertor;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bsol.q88.mapper.CustomTcOutListDetailMapper;
import com.bsol.q88.model.Q88_TcOutDtl_Delivery;
import com.bsol.q88.model.Q88_TcOutDtl_DeliveryDtl;
import com.bsol.q88.model.Q88_TcOutDtl_Review;
import com.bsol.q88.model.Q88_TcOutDtl;
import com.bsol.q88.model.Q88_TcOutDtl_ReDeliveryDtl;
import com.bsol.q88.model.Q88_TcOutDtl_Results;
import com.bsol.q88.model.Q88_TCOutDtl_Contract;


@Component
public class Q88_TcOutListDetailDataTransferImpl implements Q88_TcOutListDetailDataTransfer {
	
	Logger logger = Logger.getLogger(this.getClass());

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getTcOutListDetail(Q88_TcOutDtl tcOutListDtl, Class<T> type) {
		CustomTcOutListDetailMapper custom = new CustomTcOutListDetailMapper(tcOutListDtl);
		logger.info("Q88TcOutListDetail getTcOutListDetails method inside ");
		 if(type == Q88_TcOutDtl.class) {
			  return (T) custom.getTcOutListDetail();
		  }else if(type == Q88_TCOutDtl_Contract.class) {
			  return (T) custom.getContract();
		  }else if(type == Q88_TcOutDtl_Review.class) {
			  return (T) custom.getTcOutDtlReview();
		  }else if(type == Q88_TcOutDtl_Results.class) {
			  return (T) custom.getTcOutResults();
		  }else if(type == Q88_TcOutDtl_Delivery.class) {
			  return (T) custom.getDelivery();
		  }else if(type == Q88_TcOutDtl_DeliveryDtl.class) {
			  return (T) custom.getDeliveryDetail();
		  }else if(type == Q88_TcOutDtl_ReDeliveryDtl.class) {
			  return (T) custom.getReDeliveryDetail();
		  }
		  else{
			  throw new IllegalArgumentException("Class type argument is not valid");
		  }
		
		
	}

}
