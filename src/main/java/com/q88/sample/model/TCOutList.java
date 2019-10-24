package com.q88.sample.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;


public class TCOutList {

	private String tcOutIdEncrypted;
	private String vesselIdEncrypted;
	private String vessel;
	private String charterer;
	private Timestamp cpDate;
	private String tcNumber;
	private String duration;
	private Timestamp startDate;
	private Timestamp modifiedDate;
	private String modifiedBy;
	private Review review;
	
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
	public Timestamp getCpDate() {
		return cpDate;
	}
	public void setCpDate(Timestamp cpDate) {
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
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "TCOutList [tcOutIdEncrypted=" + tcOutIdEncrypted + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", vessel=" + vessel + ", charterer=" + charterer + ", cpDate=" + cpDate + ", tcNumber=" + tcNumber
				+ ", duration=" + duration + ", startDate=" + startDate + ", modifiedDate=" + modifiedDate
				+ ", modifiedBy=" + modifiedBy + ", review=" + review + "]";
	}
	
	
	
	
}
