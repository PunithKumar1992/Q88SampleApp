package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.bsol.q88.mapper.CustomVoyLstChangedMapper;
import com.bsol.q88.model.Q88_VoyLstChanged;
import com.bsol.q88.model.Q88_VoyLstChanged_Review;

@Component
public class Q88_VoyLstChangedDataTransferImpl implements  Q88_VoyLstChangedDataTransfer{
	
	Logger logger = Logger.getLogger(this.getClass());

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getVoyLstChanged(@NotNull Q88_VoyLstChanged voyLst, Class<T> type) {
		logger.info("Q88 VoyLstChanged data transfer getVoyLstChanged ");
		CustomVoyLstChangedMapper  custom = new CustomVoyLstChangedMapper(voyLst);
		 if(type == Q88_VoyLstChanged.class) {
			 return (T) custom.getVoyLstChanged();
		 }else if(type == Q88_VoyLstChanged_Review.class) {
			 return (T) custom.getVoyLstChangedReview();
		 }
		 else{
			  throw new IllegalArgumentException("Class type argument is not valid");
		  }
	}

}
