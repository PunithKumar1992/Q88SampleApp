package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_FixtureGradeCPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer fixturegrade_seqid;
	private String voyageid;
	private String vesselid;
	public Integer getFixturegrade_seqid() {
		return fixturegrade_seqid;
	}
	public void setFixturegrade_seqid(Integer fixturegrade_seqid) {
		this.fixturegrade_seqid = fixturegrade_seqid;
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
		result = prime * result + ((fixturegrade_seqid == null) ? 0 : fixturegrade_seqid.hashCode());
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
		Q88_FixtureGradeCPK other = (Q88_FixtureGradeCPK) obj;
		if (fixturegrade_seqid == null) {
			if (other.fixturegrade_seqid != null)
				return false;
		} else if (!fixturegrade_seqid.equals(other.fixturegrade_seqid))
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
