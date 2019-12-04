package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VoyageResultFixedCPK implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer voyage_resfixed_seqid;
	private String  voyageid;
	private String  vesselid;
	public Integer getVoyage_resfixed_seqid() {
		return voyage_resfixed_seqid;
	}
	public void setVoyage_resfixed_seqid(Integer voyage_resfixed_seqid) {
		this.voyage_resfixed_seqid = voyage_resfixed_seqid;
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
		result = prime * result + ((voyage_resfixed_seqid == null) ? 0 : voyage_resfixed_seqid.hashCode());
		result = prime * result + ((voyageid == null) ? 0 : voyageid.hashCode());
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
		Q88_VoyageResultFixedCPK other = (Q88_VoyageResultFixedCPK) obj;
		if (vesselid == null) {
			if (other.vesselid != null)
				return false;
		} else if (!vesselid.equals(other.vesselid))
			return false;
		if (voyage_resfixed_seqid == null) {
			if (other.voyage_resfixed_seqid != null)
				return false;
		} else if (!voyage_resfixed_seqid.equals(other.voyage_resfixed_seqid))
			return false;
		if (voyageid == null) {
			if (other.voyageid != null)
				return false;
		} else if (!voyageid.equals(other.voyageid))
			return false;
		return true;
	}
	
	

}
