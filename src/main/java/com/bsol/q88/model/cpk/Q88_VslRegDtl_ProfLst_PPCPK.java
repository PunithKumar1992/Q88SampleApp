package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VslRegDtl_ProfLst_PPCPK  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String vesselId;
	private Integer vslProf_SeqId;
	private Integer pp_SeqId;
	
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
	public Integer getVslProf_SeqId() {
		return vslProf_SeqId;
	}
	public void setVslProf_SeqId(Integer vslProf_SeqId) {
		this.vslProf_SeqId = vslProf_SeqId;
	}
	public Integer getPp_SeqId() {
		return pp_SeqId;
	}
	public void setPp_SeqId(Integer pp_SeqId) {
		this.pp_SeqId = pp_SeqId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pp_SeqId == null) ? 0 : pp_SeqId.hashCode());
		result = prime * result + ((trans_Id == null) ? 0 : trans_Id.hashCode());
		result = prime * result + ((vesselId == null) ? 0 : vesselId.hashCode());
		result = prime * result + ((vslProf_SeqId == null) ? 0 : vslProf_SeqId.hashCode());
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
		Q88_VslRegDtl_ProfLst_PPCPK other = (Q88_VslRegDtl_ProfLst_PPCPK) obj;
		if (pp_SeqId == null) {
			if (other.pp_SeqId != null)
				return false;
		} else if (!pp_SeqId.equals(other.pp_SeqId))
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
		if (vslProf_SeqId == null) {
			if (other.vslProf_SeqId != null)
				return false;
		} else if (!vslProf_SeqId.equals(other.vslProf_SeqId))
			return false;
		return true;
	}
	
	

}
