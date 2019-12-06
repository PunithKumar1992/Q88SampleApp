package com.bsol.q88.model.cpk;

import java.io.Serializable;


public class Q88_TcOutDeliveryDetailCPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer tcOutDetail_SeqId;
	private String tcOutIdEncrypted;
	private String vesselIdEncrypted;
	public Integer getTcOutDetail_SeqId() {
		return tcOutDetail_SeqId;
	}
	public void setTcOutDetail_SeqId(Integer tcOutDetail_SeqId) {
		this.tcOutDetail_SeqId = tcOutDetail_SeqId;
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
		result = prime * result + ((tcOutDetail_SeqId == null) ? 0 : tcOutDetail_SeqId.hashCode());
		result = prime * result + ((tcOutIdEncrypted == null) ? 0 : tcOutIdEncrypted.hashCode());
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
		Q88_TcOutDeliveryDetailCPK other = (Q88_TcOutDeliveryDetailCPK) obj;
		if (tcOutDetail_SeqId == null) {
			if (other.tcOutDetail_SeqId != null)
				return false;
		} else if (!tcOutDetail_SeqId.equals(other.tcOutDetail_SeqId))
			return false;
		if (tcOutIdEncrypted == null) {
			if (other.tcOutIdEncrypted != null)
				return false;
		} else if (!tcOutIdEncrypted.equals(other.tcOutIdEncrypted))
			return false;
		if (vesselIdEncrypted == null) {
			if (other.vesselIdEncrypted != null)
				return false;
		} else if (!vesselIdEncrypted.equals(other.vesselIdEncrypted))
			return false;
		return true;
	}
	
	
	
	

}
