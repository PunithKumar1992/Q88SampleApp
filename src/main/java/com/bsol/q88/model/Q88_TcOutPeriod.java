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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.bsol.q88.model.cpk.Q88_TcOutPeriodCPK;

@Entity
@Table(name ="Q88_TC_TCOUTPERIOD")
@IdClass(Q88_TcOutPeriodCPK.class)
public class Q88_TcOutPeriod implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TCOUTPERIOD_SEQID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer tcOutPeriod_SeqId;
	
	@Id
	@Column(name = "TCOUTDETAIL_SEQID")
	private Integer tcOutDetail_SeqId;
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	@Column(name = "STARTDATE")
	private String startDate;
	@Column(name = "DURATIONLENGTH")
	private Double durationLength;
	@Column(name = "DURATIONTYPE")
	private String durationType;
	@Column(name = "OPTIONS")
	private String option;
	
	 @ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TCOUTDETAIL_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTDETAIL_SEQID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	private Q88_TcOutListDetails q88TcOutPeriod;
	
	public Integer getTcOutPeriod_SeqId() {
		return tcOutPeriod_SeqId;
	}
	public void setTcOutPeriod_SeqId(Integer tcOutPeriod_SeqId) {
		this.tcOutPeriod_SeqId = tcOutPeriod_SeqId;
	}
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
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public Double getDurationLength() {
		return durationLength;
	}
	public void setDurationLength(Double durationLength) {
		this.durationLength = durationLength;
	}
	public String getDurationType() {
		return durationType;
	}
	public void setDurationType(String durationType) {
		this.durationType = durationType;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	
	public Q88_TcOutListDetails getQ88TcOutPeriod() {
		return q88TcOutPeriod;
	}
	public void setQ88TcOutPeriod(Q88_TcOutListDetails q88TcOutPeriod) {
		this.q88TcOutPeriod = q88TcOutPeriod;
	}
	@Override
	public String toString() {
		return "Q88_TcOutPeriod [tcOutPeriod_SeqId=" + tcOutPeriod_SeqId + ", tcOutDetail_SeqId=" + tcOutDetail_SeqId
				+ ", tcOutIdEncrypted=" + tcOutIdEncrypted + ", vesselIdEncrypted=" + vesselIdEncrypted + ", startDate="
				+ startDate + ", durationLength=" + durationLength + ", durationType=" + durationType + ", option="
				+ option + "]";
	}
	
	

}
