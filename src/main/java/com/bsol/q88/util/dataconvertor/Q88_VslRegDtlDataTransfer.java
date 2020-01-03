package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import com.bsol.q88.model.Q88_VslRegDtl;

public interface Q88_VslRegDtlDataTransfer {
			
	public <T> T getVslRegDtl(@NotNull Q88_VslRegDtl vslregdtl, Class<T> type);
}
