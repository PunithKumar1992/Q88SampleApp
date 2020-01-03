package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import com.bsol.q88.model.Q88_VoyLstChanged;

public interface Q88_VoyLstChangedDataTransfer {
	
	public <T> T getVoyLstChanged(Q88_VoyLstChanged voyLst,@NotNull Class<T> type);

}
