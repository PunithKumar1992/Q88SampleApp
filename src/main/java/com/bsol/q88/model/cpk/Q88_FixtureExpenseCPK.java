package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_FixtureExpenseCPK  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer fixtureExpense_seqid;
	private String voyageid;
	private String vesselid;
	public Integer getFixtureExpense_seqid() {
		return fixtureExpense_seqid;
	}
	public void setFixtureExpense_seqid(Integer fixtureExpense_seqid) {
		this.fixtureExpense_seqid = fixtureExpense_seqid;
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
		result = prime * result + ((fixtureExpense_seqid == null) ? 0 : fixtureExpense_seqid.hashCode());
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
		Q88_FixtureExpenseCPK other = (Q88_FixtureExpenseCPK) obj;
		if (fixtureExpense_seqid == null) {
			if (other.fixtureExpense_seqid != null)
				return false;
		} else if (!fixtureExpense_seqid.equals(other.fixtureExpense_seqid))
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
