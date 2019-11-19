package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import com.bsol.q88.model.Q88_TcOutList;

public interface TcOutListDataTransfer {
	
	public <T> T getTcOutList(Q88_TcOutList q88tcOutlist,@NotNull Class<T> type);

}
