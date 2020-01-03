package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VoyObj_Fixture_CommissionCPK  implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String voyageId; 
	private Integer fixtureLst_SeqId;
	private Integer commission_SeqId;
	
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
	public Integer getFixtureLst_SeqId() {
		return fixtureLst_SeqId;
	}
	public void setFixtureLst_SeqId(Integer fixtureLst_SeqId) {
		this.fixtureLst_SeqId = fixtureLst_SeqId;
	}
	public Integer getCommission_SeqId() {
		return commission_SeqId;
	}
	public void setCommission_SeqId(Integer commission_SeqId) {
		this.commission_SeqId = commission_SeqId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commission_SeqId == null) ? 0 : commission_SeqId.hashCode());
		result = prime * result + ((fixtureLst_SeqId == null) ? 0 : fixtureLst_SeqId.hashCode());
		result = prime * result + ((trans_Id == null) ? 0 : trans_Id.hashCode());
		result = prime * result + ((voyageId == null) ? 0 : voyageId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q88_VoyObj_Fixture_CommissionCPK other = (Q88_VoyObj_Fixture_CommissionCPK) obj;
		if (commission_SeqId == null) {
			if (other.commission_SeqId != null)
				return false;
		} else if (!commission_SeqId.equals(other.commission_SeqId))
			return false;
		if (fixtureLst_SeqId == null) {
			if (other.fixtureLst_SeqId != null)
				return false;
		} else if (!fixtureLst_SeqId.equals(other.fixtureLst_SeqId))
			return false;
		if (trans_Id == null) {
			if (other.trans_Id != null)
				return false;
		} else if (!trans_Id.equals(other.trans_Id))
			return false;
		if (voyageId == null) {
			if (other.voyageId != null)
				return false;
		} else if (!voyageId.equals(other.voyageId))
			return false;
		return true;
	}

	
	
}
