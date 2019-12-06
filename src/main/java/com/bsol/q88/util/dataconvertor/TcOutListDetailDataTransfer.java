package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import com.bsol.q88.model.Q88_TcOutListDetails;


public interface TcOutListDetailDataTransfer {
	
	public <T> T getTcOutListDetail(Q88_TcOutListDetails tcOutListDtl,@NotNull Class<T> type);

}
