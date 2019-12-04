package com.bsol.q88.model.cpk;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Q88_TcOutListCPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private Integer tcout_SeqId;
	private String tcOutIdEncrypted ;
	private String vesselIdEncrypted ;
	public Integer getTcout_SeqId() {
		return tcout_SeqId;
	}
	public void setTcout_SeqId(Integer tcout_SeqId) {
		this.tcout_SeqId = tcout_SeqId;
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
		result = prime * result + ((tcOutIdEncrypted == null) ? 0 : tcOutIdEncrypted.hashCode());
		result = prime * result + ((tcout_SeqId == null) ? 0 : tcout_SeqId.hashCode());
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
		Q88_TcOutListCPK other = (Q88_TcOutListCPK) obj;
		if (tcOutIdEncrypted == null) {
			if (other.tcOutIdEncrypted != null)
				return false;
		} else if (!tcOutIdEncrypted.equals(other.tcOutIdEncrypted))
			return false;
		if (tcout_SeqId == null) {
			if (other.tcout_SeqId != null)
				return false;
		} else if (!tcout_SeqId.equals(other.tcout_SeqId))
			return false;
		if (vesselIdEncrypted == null) {
			if (other.vesselIdEncrypted != null)
				return false;
		} else if (!vesselIdEncrypted.equals(other.vesselIdEncrypted))
			return false;
		return true;
	}
	
	

	
	
}
