package com.bsol.q88.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.Expose;
import com.fasterxml.jackson.annotation.JsonUnwrapped;


@Entity
@Table(name = "Q88_TC_REVIEW")
public class Q88_TcReview implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "TC_REVIEW_SEQID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer tc_Review_SeqId;
	@Column(name = "REVIEWSTATUS")
	private String  reviewStatus;
	@Column(name = "REVIEWEDBY")
	private String  reviewedBy;
	@Column(name = "REVIEWDATE")
	private String  reviewDate;
	
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	
	/**  Deserialization to fetch dependent object                   **/
	@OneToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "tcoutidencrypted",nullable = false,referencedColumnName = "TCOUTIDENCRYPTED",insertable = false,updatable = false),
		@JoinColumn(name = "vesselidencrypted",nullable = false,referencedColumnName = "VESSELIDENCRYPTED",insertable = false,updatable = false)
	})
	private Q88_TcOutList tcoutreview;


	public Integer getTc_Review_SeqId() {
		return tc_Review_SeqId;
	}


	public void setTc_Review_SeqId(Integer tc_Review_SeqId) {
		this.tc_Review_SeqId = tc_Review_SeqId;
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


	public String getTcOutIdEncrypted() {
		return tcOutIdEncrypted;
	}


	public void setTcOutIdEncrypted(String tcOutIdEncrypted) {
		this.tcOutIdEncrypted = tcOutIdEncrypted;
	}


	public String getVesselIdEncrypted() {
		return vesselIdEncrypted;
	}


	public void setVesselIdEncrypted(String vesselIdEncrypted) {
		this.vesselIdEncrypted = vesselIdEncrypted;
	}


	public Q88_TcOutList getTcoutreview() {
		return tcoutreview;
	}


	public void setTcoutreview(Q88_TcOutList tcoutreview) {
		this.tcoutreview = tcoutreview;
	}


	@Override
	public String toString() {
		return "Q88_TcReview [tc_Review_SeqId=" + tc_Review_SeqId + ", reviewStatus=" + reviewStatus + ", reviewedBy="
				+ reviewedBy + ", reviewDate=" + reviewDate + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", tcoutreview=" + tcoutreview + "]";
	}



	
	

	

}
