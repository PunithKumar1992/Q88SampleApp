package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VoyObj_Offhire_BunkerCPK implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String voyageId; 
	private Integer offhire_SeqId;
	private Integer offBunker_SeqId;
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
	public Integer getOffhire_SeqId() {
		return offhire_SeqId;
	}
	public void setOffhire_SeqId(Integer offhire_SeqId) {
		this.offhire_SeqId = offhire_SeqId;
	}
	public Integer getOffBunker_SeqId() {
		return offBunker_SeqId;
	}
	public void setOffBunker_SeqId(Integer offBunker_SeqId) {
		this.offBunker_SeqId = offBunker_SeqId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((offBunker_SeqId == null) ? 0 : offBunker_SeqId.hashCode());
		result = prime * result + ((offhire_SeqId == null) ? 0 : offhire_SeqId.hashCode());
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
		Q88_VoyObj_Offhire_BunkerCPK other = (Q88_VoyObj_Offhire_BunkerCPK) obj;
		if (offBunker_SeqId == null) {
			if (other.offBunker_SeqId != null)
				return false;
		} else if (!offBunker_SeqId.equals(other.offBunker_SeqId))
			return false;
		if (offhire_SeqId == null) {
			if (other.offhire_SeqId != null)
				return false;
		} else if (!offhire_SeqId.equals(other.offhire_SeqId))
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
