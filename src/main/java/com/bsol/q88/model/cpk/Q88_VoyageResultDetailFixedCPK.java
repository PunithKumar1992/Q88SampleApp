package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VoyageResultDetailFixedCPK implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer voyageresfixed_seqid;
	private String  voyageid;
	private String  vesselid;
	public Integer getVoyageresfixed_seqid() {
		return voyageresfixed_seqid;
	}
	public void setVoyageresfixed_seqid(Integer voyageresfixed_seqid) {
		this.voyageresfixed_seqid = voyageresfixed_seqid;
	}
	public String getVoyageid() {
		return voyageid;
	}
	public void setVoyageid(String voyageid) {
		this.voyageid = voyageid;
	}
	public String getVesselid() {
		return vesselid;
	}
	public void setVesselid(String vesselid) {
		this.vesselid = vesselid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vesselid == null) ? 0 : vesselid.hashCode());
		result = prime * result + ((voyageid == null) ? 0 : voyageid.hashCode());
		result = prime * result + ((voyageresfixed_seqid == null) ? 0 : voyageresfixed_seqid.hashCode());
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
		Q88_VoyageResultDetailFixedCPK other = (Q88_VoyageResultDetailFixedCPK) obj;
		if (vesselid == null) {
			if (other.vesselid != null)
				return false;
		} else if (!vesselid.equals(other.vesselid))
			return false;
		if (voyageid == null) {
			if (other.voyageid != null)
				return false;
		} else if (!voyageid.equals(other.voyageid))
			return false;
		if (voyageresfixed_seqid == null) {
			if (other.voyageresfixed_seqid != null)
				return false;
		} else if (!voyageresfixed_seqid.equals(other.voyageresfixed_seqid))
			return false;
		return true;
	}
	
	
	

}
