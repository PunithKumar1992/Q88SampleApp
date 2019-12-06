package com.bsol.q88.util.dataconvertor;

import org.springframework.stereotype.Component;

import com.bsol.q88.mapper.CustomTcOutListDetailMapper;
import com.bsol.q88.model.Q88_TcOutDelivery;
import com.bsol.q88.model.Q88_TcOutDeliveryDetail;
import com.bsol.q88.model.Q88_TcOutDtlReview;
import com.bsol.q88.model.Q88_TcOutListDetails;
import com.bsol.q88.model.Q88_TcOutReDeliveryDetail;
import com.bsol.q88.model.Q88_TcOutResults;
import com.bsol.q88.model.Q88_TcoFixture;


@Component
public class TcOutListDetailDataTransferImpl implements TcOutListDetailDataTransfer {

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getTcOutListDetail(Q88_TcOutListDetails tcOutListDtl, Class<T> type) {
		CustomTcOutListDetailMapper custom = new CustomTcOutListDetailMapper(tcOutListDtl);
		
		 if(type == Q88_TcOutListDetails.class) {
			  return (T) custom.getTcOutListDetail();
		  }else if(type == Q88_TcoFixture.class) {
			  return (T) custom.getContract();
		  }else if(type == Q88_TcOutDtlReview.class) {
			  return (T) custom.getTcOutDtlReview();
		  }else if(type == Q88_TcOutResults.class) {
			  return (T) custom.getTcOutResults();
		  }else if(type == Q88_TcOutDelivery.class) {
			  return (T) custom.getDelivery();
		  }else if(type == Q88_TcOutDeliveryDetail.class) {
			  return (T) custom.getDeliveryDetail();
		  }else if(type == Q88_TcOutReDeliveryDetail.class) {
			  return (T) custom.getReDeliveryDetail();
		  }
		  else{
			  throw new IllegalArgumentException("Class type argument is not valid");
		  }
		
		
	}

}
