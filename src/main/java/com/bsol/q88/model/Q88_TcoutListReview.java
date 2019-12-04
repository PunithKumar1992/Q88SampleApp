package com.bsol.q88.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Q88_TC_OUTLISTREVIEW")
public class Q88_TcoutListReview implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TCOUT_SEQID")
	private Integer tcout_SeqId;
	
	
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted ;

	
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted ;
	
	@Column(name = "REVIEWSTATUS")
	private String reviewStatus;
	@Column(name = "REVIEWEDBY")
	private String reviewedBy;
	@Column(name = "REVIEWDATE")
	private String reviewDate;
	
	@JsonIgnore
	@OneToOne(optional = true,fetch = FetchType.EAGER)
	@JoinColumns({
		@JoinColumn(name = "TCOUT_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUT_SEQID"),
		@JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		@JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
	})
	 private Q88_TcOutList q88TcoutListParent;


	public Integer getTcout_SeqId() {
		return tcout_SeqId;
	}


	public void setTcout_SeqId(Integer tcout_SeqId) {
		this.tcout_SeqId = tcout_SeqId;
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


	public Q88_TcOutList getQ88TcoutListParent() {
		return q88TcoutListParent;
	}


	public void setQ88TcoutListParent(Q88_TcOutList q88TcoutListParent) {
		this.q88TcoutListParent = q88TcoutListParent;
	}


	@Override
	public String toString() {
		return "Q88_TcoutListReview [tcout_SeqId=" + tcout_SeqId + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", reviewStatus=" + reviewStatus + ", reviewedBy="
				+ reviewedBy + ", reviewDate=" + reviewDate + "]";
	}

	
	
}
