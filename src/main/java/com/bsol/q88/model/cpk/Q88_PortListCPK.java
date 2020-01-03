package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_PortListCPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private Integer portId;
	
	public Integer getTrans_Id() {
		return trans_Id;
	}
	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
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
		result = prime * result + ((trans_Id == null) ? 0 : trans_Id.hashCode());
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
		if (trans_Id == null) {
			if (other.trans_Id != null)
				return false;
		} else if (!trans_Id.equals(other.trans_Id))
			return false;
		return true;
	}
	
	
	
	
	
	
}
