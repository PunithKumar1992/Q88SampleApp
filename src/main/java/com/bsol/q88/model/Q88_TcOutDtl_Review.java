package com.bsol.q88.model;

import java.io.Serializable;
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

import com.bsol.q88.model.cpk.Q88_TcOutDtl_ReviewCPK;

@Entity
@Table(name = "Q88_TCOUTDTL_REVIEW")
@IdClass(Q88_TcOutDtl_ReviewCPK.class)
public class Q88_TcOutDtl_Review implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
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
	@Transient
	private String reviewDate;
	@Column(name = "REVIEWDATE")
	private LocalDateTime review_Date;

	@OneToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumns({
			@JoinColumn(name = "TRANS_ID", nullable = false, insertable = false, updatable = false, referencedColumnName = "TRANS_ID"),
			@JoinColumn(name = "TCOUTIDENCRYPTED", nullable = false, insertable = false, updatable = false, referencedColumnName = "TCOUTIDENCRYPTED"),
			@JoinColumn(name = "VESSELIDENCRYPTED", nullable = false, insertable = false, updatable = false, referencedColumnName = "VESSELIDENCRYPTED"),

	})
	private Q88_TCOutDtl_Contract q88TcFixturereview;

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
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

	public Q88_TCOutDtl_Contract getQ88TcFixturereview() {
		return q88TcFixturereview;
	}

	public void setQ88TcFixturereview(Q88_TCOutDtl_Contract q88TcFixturereview) {
		this.q88TcFixturereview = q88TcFixturereview;
	}
	
	

	public LocalDateTime getReview_Date() {
		return review_Date;
	}

	public void setReview_Date(String review_Date) {
		this.review_Date = LocalDateTime.parse(review_Date);
	}

	@Override
	public String toString() {
		return "Q88_TcOutDtl_Review [trans_Id=" + trans_Id + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", reviewStatus=" + reviewStatus + ", reviewedBy="
				+ reviewedBy + ", reviewDate=" + reviewDate + "]";
	}

	

}
