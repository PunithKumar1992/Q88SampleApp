package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_FixtureCPK implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer fixturelistseq_id;
	private String voyageid;
	private String vesselid;
	public Integer getFixturelistseq_id() {
		return fixturelistseq_id;
	}
	public void setFixturelistseq_id(Integer fixturelistseq_id) {
		this.fixturelistseq_id = fixturelistseq_id;
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
		result = prime * result + ((fixturelistseq_id == null) ? 0 : fixturelistseq_id.hashCode());
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
		Q88_FixtureCPK other = (Q88_FixtureCPK) obj;
		if (fixturelistseq_id == null) {
			if (other.fixturelistseq_id != null)
				return false;
		} else if (!fixturelistseq_id.equals(other.fixturelistseq_id))
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
