package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VoyObj_RevenueCPK implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String voyageId;
	private Integer revenue_SeqId;
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
	public Integer getRevenue_SeqId() {
		return revenue_SeqId;
	}
	public void setRevenue_SeqId(Integer revenue_SeqId) {
		this.revenue_SeqId = revenue_SeqId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((revenue_SeqId == null) ? 0 : revenue_SeqId.hashCode());
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
		Q88_VoyObj_RevenueCPK other = (Q88_VoyObj_RevenueCPK) obj;
		if (revenue_SeqId == null) {
			if (other.revenue_SeqId != null)
				return false;
		} else if (!revenue_SeqId.equals(other.revenue_SeqId))
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
