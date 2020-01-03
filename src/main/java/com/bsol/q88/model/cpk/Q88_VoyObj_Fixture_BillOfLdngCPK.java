package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VoyObj_Fixture_BillOfLdngCPK  implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String voyageId; 
	private Integer fixtureBillOfLdng_SeqId;
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
	public Integer getFixtureBillOfLdng_SeqId() {
		return fixtureBillOfLdng_SeqId;
	}
	public void setFixtureBillOfLdng_SeqId(Integer fixtureBillOfLdng_SeqId) {
		this.fixtureBillOfLdng_SeqId = fixtureBillOfLdng_SeqId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fixtureBillOfLdng_SeqId == null) ? 0 : fixtureBillOfLdng_SeqId.hashCode());
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
		Q88_VoyObj_Fixture_BillOfLdngCPK other = (Q88_VoyObj_Fixture_BillOfLdngCPK) obj;
		if (fixtureBillOfLdng_SeqId == null) {
			if (other.fixtureBillOfLdng_SeqId != null)
				return false;
		} else if (!fixtureBillOfLdng_SeqId.equals(other.fixtureBillOfLdng_SeqId))
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
