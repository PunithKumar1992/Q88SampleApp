package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VslRegDtl_HeadContractDtlCPK implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String vesselId;
	private Integer headContract_SeqId;
	private Integer HsContractDtl_SeqId;
	public Integer getTrans_Id() {
		return trans_Id;
	}
	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}
	public String getVesselId() {
		return vesselId;
	}
	public void setVesselId(String vesselId) {
		this.vesselId = vesselId;
	}
	public Integer getHeadContract_SeqId() {
		return headContract_SeqId;
	}
	public void setHeadContract_SeqId(Integer headContract_SeqId) {
		this.headContract_SeqId = headContract_SeqId;
	}
	public Integer getHsContractDtl_SeqId() {
		return HsContractDtl_SeqId;
	}
	public void setHsContractDtl_SeqId(Integer hsContractDtl_SeqId) {
		HsContractDtl_SeqId = hsContractDtl_SeqId;
	}
	@Override
	public String toString() {
		return "Q88_VslRegDtl_HeadContractDtlCPK [trans_Id=" + trans_Id + ", vesselId=" + vesselId
				+ ", headContract_SeqId=" + headContract_SeqId + ", HsContractDtl_SeqId=" + HsContractDtl_SeqId + "]";
	}
	
	

}
