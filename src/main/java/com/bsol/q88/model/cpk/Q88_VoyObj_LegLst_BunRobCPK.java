package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_VoyObj_LegLst_BunRobCPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String voyageId; 
	private Integer leg_SeqId;
	private Integer bunkerRob_SeqId;
	public Integer getTrans_Id() {
		return trans_Id;
	}
	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}
	public String getVoyageId() {
		return voyageId;
	}
	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}
	public Integer getLeg_SeqId() {
		return leg_SeqId;
	}
	public void setLeg_SeqId(Integer leg_SeqId) {
		this.leg_SeqId = leg_SeqId;
	}
	public Integer getBunkerRob_SeqId() {
		return bunkerRob_SeqId;
	}
	public void setBunkerRob_SeqId(Integer bunkerRob_SeqId) {
		this.bunkerRob_SeqId = bunkerRob_SeqId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bunkerRob_SeqId == null) ? 0 : bunkerRob_SeqId.hashCode());
		result = prime * result + ((leg_SeqId == null) ? 0 : leg_SeqId.hashCode());
		result = prime * result + ((trans_Id == null) ? 0 : trans_Id.hashCode());
		result = prime * result + ((voyageId == null) ? 0 : voyageId.hashCode());
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
		Q88_VoyObj_LegLst_BunRobCPK other = (Q88_VoyObj_LegLst_BunRobCPK) obj;
		if (bunkerRob_SeqId == null) {
			if (other.bunkerRob_SeqId != null)
				return false;
		} else if (!bunkerRob_SeqId.equals(other.bunkerRob_SeqId))
			return false;
		if (leg_SeqId == null) {
			if (other.leg_SeqId != null)
				return false;
		} else if (!leg_SeqId.equals(other.leg_SeqId))
			return false;
		if (trans_Id == null) {
			if (other.trans_Id != null)
				return false;
		} else if (!trans_Id.equals(other.trans_Id))
			return false;
		if (voyageId == null) {
			if (other.voyageId != null)
				return false;
		} else if (!voyageId.equals(other.voyageId))
			return false;
		return true;
	}
	
	

}
