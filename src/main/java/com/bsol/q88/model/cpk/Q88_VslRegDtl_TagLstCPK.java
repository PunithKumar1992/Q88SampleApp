package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VslRegDtl_TagLstCPK  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String vesselId;
	private Integer tag_SeqId;
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
	public Integer getTag_SeqId() {
		return tag_SeqId;
	}
	public void setTag_SeqId(Integer tag_SeqId) {
		this.tag_SeqId = tag_SeqId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tag_SeqId == null) ? 0 : tag_SeqId.hashCode());
		result = prime * result + ((trans_Id == null) ? 0 : trans_Id.hashCode());
		result = prime * result + ((vesselId == null) ? 0 : vesselId.hashCode());
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
		Q88_VslRegDtl_TagLstCPK other = (Q88_VslRegDtl_TagLstCPK) obj;
		if (tag_SeqId == null) {
			if (other.tag_SeqId != null)
				return false;
		} else if (!tag_SeqId.equals(other.tag_SeqId))
			return false;
		if (trans_Id == null) {
			if (other.trans_Id != null)
				return false;
		} else if (!trans_Id.equals(other.trans_Id))
			return false;
		if (vesselId == null) {
			if (other.vesselId != null)
				return false;
		} else if (!vesselId.equals(other.vesselId))
			return false;
		return true;
	}
	
	

}
