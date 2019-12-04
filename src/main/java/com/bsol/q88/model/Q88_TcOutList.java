package com.bsol.q88.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_TcOutListCPK;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.google.gson.annotations.Expose;

@Entity
@Table(name = "Q88_TC_OUTLIST")
@IdClass(Q88_TcOutListCPK.class)
public class Q88_TcOutList implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TCOUT_SEQID")
	@Expose private Integer tcout_SeqId;
	
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
	
	@JsonManagedReference
	@OneToOne(mappedBy = "q88TcoutListParent", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_TcoutListReview review;
	

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

	public Q88_TcoutListReview getReview() {
		return review;
	}
	
	public void setReview(Q88_TcoutListReview review) {
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
		return "Q88_TcOutList [tcout_SeqId=" + tcout_SeqId + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", vessel=" + vessel + ", charterer=" + charterer
				+ ", cpDate=" + cpDate + ", tcNumber=" + tcNumber + ", duration=" + duration + ", startDate="
				+ startDate + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + ", review=" + review
				+ "]";
	} 
	
	
	
	
	
	
	
}
