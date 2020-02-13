package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bsol.q88.mapper.CustomTcOutListMapper;
import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_TcOutList_Review;

@Component
public class Q88_TcOutListDataTransferImpl implements Q88_TcOutListDataTransfer{

	Logger logger = Logger.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getTcOutList(@NotNull Q88_TcOutList tcOutList, Class<T> type) {
		CustomTcOutListMapper custom = new CustomTcOutListMapper(tcOutList);
		logger.info("inside Q88 TcoutList Data transfer getTcOutList Method");
		 if(type == Q88_TcOutList.class) {
			  return (T) custom.getTcOutList();
		  }else if(type == Q88_TcOutList_Review.class) {
			  return (T) custom.getTcOutListReview();
		  }
		  else{
			  throw new IllegalArgumentException("Class type argument is not valid");
		  }
	}

}
