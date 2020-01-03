package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import com.bsol.q88.model.Q88_VoyObj;

public interface Q88_VoyObjDataTransfer {
	
	public <T> T getVoyObj(@NotNull Q88_VoyObj voyObj, Class<T> type);
	
	 


}
