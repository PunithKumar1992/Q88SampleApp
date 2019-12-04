package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_FixturePortCPK  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer fixtureport_seqid;
	private String voyageid;
	private String vesselid;
	public Integer getFixtureport_seqid() {
		return fixtureport_seqid;
	}
	public void setFixtureport_seqid(Integer fixtureport_seqid) {
		this.fixtureport_seqid = fixtureport_seqid;
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
		result = prime * result + ((fixtureport_seqid == null) ? 0 : fixtureport_seqid.hashCode());
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
		Q88_FixturePortCPK other = (Q88_FixturePortCPK) obj;
		if (fixtureport_seqid == null) {
			if (other.fixtureport_seqid != null)
				return false;
		} else if (!fixtureport_seqid.equals(other.fixtureport_seqid))
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
