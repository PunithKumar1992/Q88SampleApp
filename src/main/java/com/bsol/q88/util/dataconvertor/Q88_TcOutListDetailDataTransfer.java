package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import com.bsol.q88.model.Q88_TcOutDtl;


public interface Q88_TcOutListDetailDataTransfer {
	
	public <T> T getTcOutListDetail(Q88_TcOutDtl tcOutListDtl,@NotNull Class<T> type);

}
