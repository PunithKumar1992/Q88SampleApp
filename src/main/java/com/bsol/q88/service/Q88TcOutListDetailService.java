package com.bsol.q88.service;

import com.bsol.q88.model.Q88_TcOutListDetails;

public interface Q88TcOutListDetailService {

	public void saveTcOutListDetails(Q88_TcOutListDetails tcOutListDtl);
	public Integer getNextTcOutLisDtlId();
}
