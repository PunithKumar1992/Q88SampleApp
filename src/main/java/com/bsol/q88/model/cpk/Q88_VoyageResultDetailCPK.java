package com.bsol.q88.model.cpk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder.In;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class Q88_VoyageResultDetailCPK implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	public Q88_VoyageResultDetailCPK() {
		
		super();
	}
	
	
	private Integer voyage_ResDtl_SeqId;
	private Integer voyageTrans_Id;
	private String voyageId;
	private String vesselId;

	public Integer getVoyage_ResDtl_SeqId() {
		return voyage_ResDtl_SeqId;
	}
	public void setVoyage_ResDtl_SeqId(Integer voyage_ResDtl_SeqId) {
		this.voyage_ResDtl_SeqId = voyage_ResDtl_SeqId;
	}
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
		result = prime * result + ((voyage_ResDtl_SeqId == null) ? 0 : voyage_ResDtl_SeqId.hashCode());
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
		Q88_VoyageResultDetailCPK other = (Q88_VoyageResultDetailCPK) obj;
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
		if (voyage_ResDtl_SeqId == null) {
			if (other.voyage_ResDtl_SeqId != null)
				return false;
		} else if (!voyage_ResDtl_SeqId.equals(other.voyage_ResDtl_SeqId))
			return false;
		return true;
	}

	
	
}
