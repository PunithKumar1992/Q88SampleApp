package com.bsol.q88.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Locale;

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
import javax.persistence.Transient;
import com.bsol.q88.model.cpk.Q88_TcOutDtl_DurationCPK;

@Entity
@Table(name ="Q88_TCOUTDTL_DURATION")
@IdClass(Q88_TcOutDtl_DurationCPK.class)
public class Q88_TcOutDtl_Duration implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DURATION_SEQID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer duration_SeqId;
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	@Transient
	private String startDate;
	@Column(name = "STARTDATE")
	private LocalDateTime start_Date;
	@Column(name = "DURATIONLENGTH")
	private Double durationLength;
	@Column(name = "DURATIONTYPE")
	private String durationType;
	@Column(name = "OPTIONS")
	private String option;
	
	 @ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	private Q88_TcOutDtl q88TcOutPeriod;
	
	
	
	public Integer getDuration_SeqId() {
		return duration_SeqId;
	}
	public void setDuration_SeqId(Integer duration_SeqId) {
		this.duration_SeqId = duration_SeqId;
	}
	
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
	
	public Q88_TcOutDtl getQ88TcOutPeriod() {
		return q88TcOutPeriod;
	}
	public void setQ88TcOutPeriod(Q88_TcOutDtl q88TcOutPeriod) {
		this.q88TcOutPeriod = q88TcOutPeriod;
	}
	
	
	
	public LocalDateTime getStart_Date() {
		return start_Date;
	}
	public void setStart_Date(String start_Date) {
		 String dateFormat = "dd MMM uuuu HH:mm";
	        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
	            .ofPattern(dateFormat, Locale.US)
	            .withResolverStyle(ResolverStyle.STRICT);
	        try {
	            LocalDateTime date = LocalDateTime.parse(start_Date, dateTimeFormatter);
	            this.start_Date = date;
	        } catch (DateTimeParseException e) {
	            System.out.println("Exception was thrown ");
	        }
		
	}
	@Override
	public String toString() {
		return "Q88_TcOutDtl_Duration [duration_SeqId=" + duration_SeqId + ", trans_Id=" + trans_Id
				+ ", tcOutIdEncrypted=" + tcOutIdEncrypted + ", vesselIdEncrypted=" + vesselIdEncrypted + ", startDate="
				+ startDate + ", start_Date=" + start_Date + ", durationLength=" + durationLength + ", durationType="
				+ durationType + ", option=" + option + "]";
	}
	
	
	
	

}
