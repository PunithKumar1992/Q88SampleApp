package com.bsol.q88.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VoyLstChangedCPK;

@Entity
@Table(name = "Q88_VOYLSTCHANGED")
@IdClass(Q88_VoyLstChangedCPK.class)
public class Q88_VoyLstChanged {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	@Id
	@Column(name = "VOYAGEID")
	private String  voyageId;
	@Transient
	private String  modifiedDate;
	@Column(name = "MODIFIEDDATE")
	private LocalDateTime  modified_Date;
	@Column(name = "VESSELNAME")
	private String  vesselName;
	@Column(name = "VOYAGENUMBER")
	private String voyageNumber;
	@Column(name = "ISUNTRANSFERRED")
	private String  isUntransferred;
	
	@OneToOne(mappedBy = "voyLstChangeReview", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_VoyLstChanged_Review review;

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

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public LocalDateTime getModified_Date() {
		return modified_Date;
	}

	public void setModified_Date(String modified_Date) {
		this.modified_Date = LocalDateTime.parse(modified_Date);
	}

	public String getVesselName() {
		return vesselName;
	}

	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	public String getVoyageNumber() {
		return voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		this.voyageNumber = voyageNumber;
	}

	public String getIsUntransferred() {
		return isUntransferred;
	}

	public void setIsUntransferred(String isUntransferred) {
		this.isUntransferred = isUntransferred;
	}

	public Q88_VoyLstChanged_Review getReview() {
		return review;
	}

	public void setReview(Q88_VoyLstChanged_Review review) {
		if(review == null) {
			if(this.review !=null) {
				this.review.setVoyLstChangeReview(null);;
			}
		}
		else {
			review.setVoyLstChangeReview(this);
		}
		this.review = review;
	}

	@Override
	public String toString() {
		return "Q88_VoyLstChanged [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", modifiedDate=" + modifiedDate
				+ ", modified_Date=" + modified_Date + ", vesselName=" + vesselName + ", voyageNumber=" + voyageNumber
				+ ", isUntransferred=" + isUntransferred + ", review=" + review + "]";
	}
	
	
	
	

	
	
}
