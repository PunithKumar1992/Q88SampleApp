package com.bsol.q88.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_TcOutDtlReviewCPK;

@Entity
@Table(name = "Q88_TC_TCOUTDTL_REVIEW")
@IdClass(Q88_TcOutDtlReviewCPK.class)
public class Q88_TcOutDtlReview implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	 @Id
	  @Column(name = "TCOUTDETAIL_SEQID")
	  private Integer tcOutDetail_SeqId;
	  @Id
	  @Column(name = "TCOUTIDENCRYPTED")
	  private String tcOutIdEncrypted;
	  @Id
	  @Column(name = "VESSELIDENCRYPTED")
	  private String vesselIdEncrypted;
	  
	  @Column(name = "REVIEWSTATUS")
	  private String reviewStatus;
	  @Column(name = "REVIEWEDBY")
	  private String reviewedBy;
	  @Column(name = "REVIEWDATE")
	  private String reviewDate;
	  
	  @OneToOne(optional = true,fetch = FetchType.EAGER)
	  @JoinColumns({
		  @JoinColumn(name = "TCOUTDETAIL_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTDETAIL_SEQID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	  private Q88_TcoFixture q88TcFixturereview;

	public Integer getTcOutDetail_SeqId() {
		return tcOutDetail_SeqId;
	}

	public void setTcOutDetail_SeqId(Integer tcOutDetail_SeqId) {
		this.tcOutDetail_SeqId = tcOutDetail_SeqId;
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

	public Q88_TcoFixture getQ88TcFixturereview() {
		return q88TcFixturereview;
	}

	public void setQ88TcFixturereview(Q88_TcoFixture q88TcFixturereview) {
		this.q88TcFixturereview = q88TcFixturereview;
	}

	@Override
	public String toString() {
		return "Q88_TcOutDtlReview [tcOutDetail_SeqId=" + tcOutDetail_SeqId + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", reviewStatus=" + reviewStatus + ", reviewedBy="
				+ reviewedBy + ", reviewDate=" + reviewDate + "]";
	}

	
	  

}
