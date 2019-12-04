package com.bsol.q88.model.cpk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class Q88_VoyageResultCPK implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Integer voyageTrans_Id;
	private String voyageId;
	private String vesselId;
	public Integer getVoyageTrans_Id() {
		return voyageTrans_Id;
	}
	public void setVoyageTrans_Id(Integer voyageTrans_Id) {
		this.voyageTrans_Id = voyageTrans_Id;
	}
	public String getVoyageId() {
		return voyageId;
	}
	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}
	public String getVesselId() {
		return vesselId;
	}
	public void setVesselId(String vesselId) {
		this.vesselId = vesselId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vesselId == null) ? 0 : vesselId.hashCode());
		result = prime * result + ((voyageId == null) ? 0 : voyageId.hashCode());
		result = prime * result + ((voyageTrans_Id == null) ? 0 : voyageTrans_Id.hashCode());
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
		Q88_VoyageResultCPK other = (Q88_VoyageResultCPK) obj;
		if (vesselId == null) {
			if (other.vesselId != null)
				return false;
		} else if (!vesselId.equals(other.vesselId))
			return false;
		if (voyageId == null) {
			if (other.voyageId != null)
				return false;
		} else if (!voyageId.equals(other.voyageId))
			return false;
		if (voyageTrans_Id == null) {
			if (other.voyageTrans_Id != null)
				return false;
		} else if (!voyageTrans_Id.equals(other.voyageTrans_Id))
			return false;
		return true;
	}
	
	
	
	

}
