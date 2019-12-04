package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.bsol.q88.mapper.CustomTcOutListMapper;
import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_TcoutListReview;

@Component
public class TcOutListDataTransferImpl implements TcOutListDataTransfer{

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getTcOutList(@NotNull Q88_TcOutList tcOutList, Class<T> type) {
		CustomTcOutListMapper custom = new CustomTcOutListMapper(tcOutList);
		
		 if(type == Q88_TcOutList.class) {
			  return (T) custom.getTcOutList();
		  }else if(type == Q88_TcoutListReview.class) {
			  return (T) custom.getTcOutListReview();
		  }
		  else{
			  throw new IllegalArgumentException("Class type argument is not valid");
		  }
	}

}
