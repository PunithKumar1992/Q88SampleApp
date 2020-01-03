package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VoyObj_RsltDtlCPK implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String voyageId;
	private Integer voyObj_ResDtl_SeqId;
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
	public Integer getVoyObj_ResDtl_SeqId() {
		return voyObj_ResDtl_SeqId;
	}
	public void setVoyObj_ResDtl_SeqId(Integer voyObj_ResDtl_SeqId) {
		this.voyObj_ResDtl_SeqId = voyObj_ResDtl_SeqId;
	}
	@Override
	public String toString() {
		return "Q88_VoyObj_RsltDtlCPK [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", voyObj_ResDtl_SeqId="
				+ voyObj_ResDtl_SeqId + "]";
	}
	
	

	
}
