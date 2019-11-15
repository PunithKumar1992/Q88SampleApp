package com.q88.sample.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@IdClass(Q88_TcOutListCPK.class)
@Table(name = "Q88_TC_OUTLIST")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Q88_TcOutList implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted ;
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
	
	@OneToOne(targetEntity =Q88_TcReview.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy ="tcoutreview",orphanRemoval = false)
	private Q88_TcReview review;

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

	public Q88_TcReview getReview() {
		return review;
	}

	public void setReview(Q88_TcReview review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Q88_TcOutList [tcOutIdEncrypted=" + tcOutIdEncrypted + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", vessel=" + vessel + ", charterer=" + charterer + ", cpDate=" + cpDate + ", tcNumber=" + tcNumber
				+ ", duration=" + duration + ", startDate=" + startDate + ", modifiedDate=" + modifiedDate
				+ ", modifiedBy=" + modifiedBy + ", review=" + review + "]";
	}
	
	
}
