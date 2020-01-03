package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_TcOutDtl_DurationCPK implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer duration_SeqId;
	private Integer trans_Id;
	private String tcOutIdEncrypted;
	private String vesselIdEncrypted;
	
	
	public Integer getDuration_SeqId() {
		return duration_SeqId;
	}
	public void setDuration_SeqId(Integer duration_SeqId) {
		this.duration_SeqId = duration_SeqId;
	}
	public Integer getTrans_Id() {
		return trans_Id;
	}
	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}
	public String getTcOutIdEncrypted() {
		return tcOutIdEncrypted;
	}
	public void setTcOutIdEncrypted(String tcOutIdEncrypted) {
		this.tcOutIdEncrypted = tcOutIdEncrypted;
	}
	public String getVesselIdEncrypted() {
		return vesselIdEncrypted;
	}
	public void setVesselIdEncrypted(String vesselIdEncrypted) {
		this.vesselIdEncrypted = vesselIdEncrypted;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration_SeqId == null) ? 0 : duration_SeqId.hashCode());
		result = prime * result + ((tcOutIdEncrypted == null) ? 0 : tcOutIdEncrypted.hashCode());
		result = prime * result + ((trans_Id == null) ? 0 : trans_Id.hashCode());
		result = prime * result + ((vesselIdEncrypted == null) ? 0 : vesselIdEncrypted.hashCode());
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
		Q88_TcOutDtl_DurationCPK other = (Q88_TcOutDtl_DurationCPK) obj;
		if (duration_SeqId == null) {
			if (other.duration_SeqId != null)
				return false;
		} else if (!duration_SeqId.equals(other.duration_SeqId))
			return false;
		if (tcOutIdEncrypted == null) {
			if (other.tcOutIdEncrypted != null)
				return false;
		} else if (!tcOutIdEncrypted.equals(other.tcOutIdEncrypted))
			return false;
		if (trans_Id == null) {
			if (other.trans_Id != null)
				return false;
		} else if (!trans_Id.equals(other.trans_Id))
			return false;
		if (vesselIdEncrypted == null) {
			if (other.vesselIdEncrypted != null)
				return false;
		} else if (!vesselIdEncrypted.equals(other.vesselIdEncrypted))
			return false;
		return true;
	}
	
	
	
}
