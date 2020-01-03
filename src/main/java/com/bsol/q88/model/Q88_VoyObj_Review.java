package com.bsol.q88.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VoyObj_ReviewCPK;

@Entity
@Table(name = "Q88_VOYOBJ_REVIEW")
@IdClass(Q88_VoyObj_ReviewCPK.class)
public class Q88_VoyObj_Review {

	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Column(name = "REVIEWSTATUS")
	private String reviewStatus;
	
	@Column(name = "REVIEWEDBY")
	private String reviewedBy;
	
	@Transient
	private String reviewDate;
	
	@Column(name = "REVIEWDATE")
	private LocalDateTime review_Date;
	
	@OneToOne(optional = true,fetch = FetchType.EAGER)
	@JoinColumns({
		@JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		@JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	})
	private Q88_VoyObj voyObjReview;

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

	public String getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public String getReviewedBy() {
		return reviewedBy;
	}

	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public Q88_VoyObj getVoyObjReview() {
		return voyObjReview;
	}

	public void setVoyObjReview(Q88_VoyObj voyObjReview) {
		this.voyObjReview = voyObjReview;
	}

	public LocalDateTime getReview_Date() {
		return review_Date;
	}

	public void setReview_Date(String review_Date) {
		if(review_Date!=null) {
			this.review_Date = LocalDateTime.parse(review_Date);
		}
		else {
			this.review_Date = null;
		}
		
	}

	
	
}
