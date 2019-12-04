package com.bsol.q88.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_TC_FIXTUREDTL")
public class Q88_TcoFixture implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	  @Id
	  @Column(name = "TCOUTDETAIL_SEQID")
	  private String tcOutDetail_SeqId;
	  @Id
	  @Column(name = "TCOUTIDENCRYPTED")
	  private String tcOutIdEncrypted;
	  @Id
	  @Column(name = "VESSELIDENCRYPTED")
	  private String vesselIdEncrypted;
	  @Column(name = "VESSEL")
	  private String vessel;
	  @Column(name = "CHARTERER")
	  private String charterer; 
	  @Column(name = "CPDATE")
	  private String cpDate;
	  @Column(name = "TCNUMBER")
	  private String tcNumber;
	  @Column(name = "DURATION")
	  private String duration;
	  @Column(name = "STARTDATE")
	  private String startDate;
	  @Column(name = "MODIFIEDDATE")
	  private String modifiedDate; 
	  @Column(name = "MODIFIEDBY")
	  private String modifiedBy;
	  
	  @OneToOne(mappedBy = "q88TcFixturereview",fetch = FetchType.EAGER,cascade = CascadeType.ALL,optional = true)
	  private Q88_TcOutDtlReview  review;
	  
	  @OneToOne(optional = true,fetch = FetchType.EAGER)
	  @JoinColumns({
		  @JoinColumn(name = "TCOUTDETAIL_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTDETAIL_SEQID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	  private Q88_TcOutListDetails q88TcOutListFixture;

	public String getTcOutDetail_SeqId() {
		return tcOutDetail_SeqId;
	}

	public void setTcOutDetail_SeqId(String tcOutDetail_SeqId) {
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

	public String getVessel() {
		return vessel;
	}

	public void setVessel(String vessel) {
		this.vessel = vessel;
	}

	public String getCharterer() {
		return charterer;
	}

	public void setCharterer(String charterer) {
		this.charterer = charterer;
	}

	public String getCpDate() {
		return cpDate;
	}

	public void setCpDate(String cpDate) {
		this.cpDate = cpDate;
	}

	public String getTcNumber() {
		return tcNumber;
	}

	public void setTcNumber(String tcNumber) {
		this.tcNumber = tcNumber;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Q88_TcOutDtlReview getReview() {
		return review;
	}

	public void setReview(Q88_TcOutDtlReview review) {
		this.review = review;
	}

	public Q88_TcOutListDetails getQ88TcOutListFixture() {
		return q88TcOutListFixture;
	}

	public void setQ88TcOutListFixture(Q88_TcOutListDetails q88TcOutListFixture) {
		this.q88TcOutListFixture = q88TcOutListFixture;
	}

	@Override
	public String toString() {
		return "Q88_TcoFixture [tcOutDetail_SeqId=" + tcOutDetail_SeqId + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", vessel=" + vessel + ", charterer=" + charterer
				+ ", cpDate=" + cpDate + ", tcNumber=" + tcNumber + ", duration=" + duration + ", startDate="
				+ startDate + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + ", review=" + review
				+ "]";
	}
	  
	  
	

}
