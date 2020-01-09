package com.bsol.q88.util.dataconvertor;

import javax.validation.constraints.NotNull;

import com.bsol.q88.model.Q88_HdCntrtDTL;

public interface Q88_VslHeadContractDtlTransfer {

	public <T> T getVslHeadContractDtl(@NotNull Q88_HdCntrtDTL vslHdCntrct, Class<T> type);
}
