package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_PortListCPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer portSeqId;
	private Integer portId;
	public Integer getPortSeqId() {
		return portSeqId;
	}
	public void setPortSeqId(Integer portSeqId) {
		this.portSeqId = portSeqId;
	}
	public Integer getPortId() {
		return portId;
	}
	public void setPortId(Integer portId) {
		this.portId = portId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((portId == null) ? 0 : portId.hashCode());
		result = prime * result + ((portSeqId == null) ? 0 : portSeqId.hashCode());
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
		Q88_PortListCPK other = (Q88_PortListCPK) obj;
		if (portId == null) {
			if (other.portId != null)
				return false;
		} else if (!portId.equals(other.portId))
			return false;
		if (portSeqId == null) {
			if (other.portSeqId != null)
				return false;
		} else if (!portSeqId.equals(other.portSeqId))
			return false;
		return true;
	}
	
	
}
