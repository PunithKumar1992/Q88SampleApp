package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_FixtureRevenueCPK  implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Integer fixturerevenue_seqid;
	private String voyageid;
	private String vesselid;
	public Integer getFixturerevenue_seqid() {
		return fixturerevenue_seqid;
	}
	public void setFixturerevenue_seqid(Integer fixturerevenue_seqid) {
		this.fixturerevenue_seqid = fixturerevenue_seqid;
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
		result = prime * result + ((fixturerevenue_seqid == null) ? 0 : fixturerevenue_seqid.hashCode());
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
		Q88_FixtureRevenueCPK other = (Q88_FixtureRevenueCPK) obj;
		if (fixturerevenue_seqid == null) {
			if (other.fixturerevenue_seqid != null)
				return false;
		} else if (!fixturerevenue_seqid.equals(other.fixturerevenue_seqid))
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
