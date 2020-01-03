package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VoyLstChangedCPK implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String  voyageId;
	public Integer getTrans_Id() {
		return trans_Id;
	}
	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}
	public String getVoyageId() {
		return voyageId;
	}
	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}
	@Override
	public String toString() {
		return "Q88_VoyLstChangedCPK [trans_Id=" + trans_Id + ", voyageId=" + voyageId + "]";
	}

	
}
