package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.bsol.q88.mapper.CustomTcOutMapper;
import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_TcReview;

@Component(value ="TcOutListDataTransferImpl")
public class TcOutListDataTransferImpl implements TcOutListDataTransfer{

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getTcOutList(Q88_TcOutList q88tcOutlist, @NotNull Class<T> type) {
		CustomTcOutMapper custom = new CustomTcOutMapper(q88tcOutlist);
		 if(type == Q88_TcOutList.class) {
			  return (T) custom.getTcoutList();
		  }else if(type == Q88_TcReview.class) {
			  return (T) custom.getTcoutReview();
		  }
		  else{
			  throw new IllegalArgumentException("Class type argument is not valid");
		  }
	}

}
