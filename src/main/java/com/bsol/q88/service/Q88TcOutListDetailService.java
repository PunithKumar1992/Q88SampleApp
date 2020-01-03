package com.bsol.q88.service;

import com.bsol.q88.model.Q88_TcOutDtl;

public interface Q88TcOutListDetailService {

	public void saveTcOutListDetails(Q88_TcOutDtl tcOutListDtl);
	public Integer getNextTcOutLisDtlId();
}
