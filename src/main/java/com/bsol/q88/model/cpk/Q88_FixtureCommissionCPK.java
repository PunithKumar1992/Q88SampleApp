package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_FixtureCommissionCPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer fixturecommission_seqid;
	private String voyageid;
	private String vesselid;
	public Integer getFixturecommission_seqid() {
		return fixturecommission_seqid;
	}
	public void setFixturecommission_seqid(Integer fixturecommission_seqid) {
		this.fixturecommission_seqid = fixturecommission_seqid;
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
	public String toString() {
		return "Q88_FixtureCommissionCPK [fixturecommission_seqid=" + fixturecommission_seqid + ", voyageid=" + voyageid
				+ ", vesselid=" + vesselid + "]";
	}
	
	
	
	
}
