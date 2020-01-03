package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VoyObj_RsltCPK implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer trans_Id;
	private String voyageId;
	
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Q88_VoyObj_RsltCPK other = (Q88_VoyObj_RsltCPK) obj;
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
