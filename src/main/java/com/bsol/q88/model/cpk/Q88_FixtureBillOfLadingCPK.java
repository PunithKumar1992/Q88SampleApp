package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_FixtureBillOfLadingCPK implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private Integer fixturebill_seqid;
	private String voyageid;
	private String vesselid;
	public Integer getFixturebill_seqid() {
		return fixturebill_seqid;
	}
	public void setFixturebill_seqid(Integer fixturebill_seqid) {
		this.fixturebill_seqid = fixturebill_seqid;
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
		result = prime * result + ((fixturebill_seqid == null) ? 0 : fixturebill_seqid.hashCode());
		result = prime * result + ((vesselid == null) ? 0 : vesselid.hashCode());
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
		Q88_FixtureBillOfLadingCPK other = (Q88_FixtureBillOfLadingCPK) obj;
		if (fixturebill_seqid == null) {
			if (other.fixturebill_seqid != null)
				return false;
		} else if (!fixturebill_seqid.equals(other.fixturebill_seqid))
			return false;
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
		return true;
	}
	
	

}
