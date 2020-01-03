package com.bsol.q88.model;

import java.io.Serializable;
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

import com.bsol.q88.model.cpk.Q88_TcOutListCPK;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Q88_TCOUTLIST")
@IdClass(Q88_TcOutListCPK.class)
public class Q88_TcOutList implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted ;
	
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted ;
	
	@Column(name = "VESSEL")
	private String vessel;
	@Column(name = "CHARTERER")
	private String charterer; 
	@Transient
	private String cpDate; 
	@Column(name = "CPDATE")
	private LocalDateTime cp_Date;
	@Column(name = "TCNUMBER")
	private String tcNumber; 
	@Column(name = "DURATION")
	private String duration; 
	
	@Transient
	private String startDate; 
	@Column(name = "STARTDATE")
	private LocalDateTime start_Date;
	@Transient
	private String modifiedDate; 
	@Column(name = "MODIFIEDDATE")
	private LocalDateTime modified_date;
	@Column(name = "MODIFIEDBY")
	private String modifiedBy; 
	
	@JsonManagedReference
	@OneToOne(mappedBy = "q88TcoutListParent", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_TcOutList_Review review;
	

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

	public LocalDateTime getCp_Date() {
		return cp_Date;
	}

	public void setCp_Date(String cp_Date) {
		this.cp_Date = LocalDateTime.parse(cp_Date);
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

	public LocalDateTime getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(String start_Date) {
		this.start_Date = LocalDateTime.parse(start_Date);
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public LocalDateTime getModified_date() {
		return modified_date;
	}

	public void setModified_date(String modified_date) {
		this.modified_date = LocalDateTime.parse(modified_date);
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Q88_TcOutList_Review getReview() {
		return review;
	}
	
	public void setReview(Q88_TcOutList_Review review) {
		if(review == null) {
			if(this.review !=null) {
				this.review.setQ88TcoutListParent(null);
			}
		}
		else {
			review.setQ88TcoutListParent(this);
		}
		this.review = review;
	
	}

	@Override
	public String toString() {
		return "Q88_TcOut_TcOutList [trans_Id=" + trans_Id + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", vessel=" + vessel + ", charterer=" + charterer
				+ ", cpDate=" + cpDate + ", cp_Date=" + cp_Date + ", tcNumber=" + tcNumber + ", duration=" + duration
				+ ", startDate=" + startDate + ", start_Date=" + start_Date + ", modifiedDate=" + modifiedDate
				+ ", modified_date=" + modified_date + ", modifiedBy=" + modifiedBy + ", review=" + review + "]";
	}

	

	
	
	
	
	
	
	
	
}
