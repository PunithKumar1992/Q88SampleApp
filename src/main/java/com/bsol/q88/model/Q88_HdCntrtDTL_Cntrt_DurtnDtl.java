package com.bsol.q88.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_Cntrt_DurtnDtlCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_CNTRT_DURTN_DTL")
@IdClass(Q88_HdCntrtDTL_Cntrt_DurtnDtlCPK.class)
public class Q88_HdCntrtDTL_Cntrt_DurtnDtl {
	
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	@Id
	@Column(name = "TCINIDENCRYPTED")
	private String tcInIdEncrypted;
	
	
	@Id
	@Column(name = "DURTN_SEQID")
	@SequenceGenerator(name = "durtnSeqId", sequenceName = "Q88_HDCNTRTDTL_DURTN_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "durtnSeqId")
	private Integer durtn_SeqId;
	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	
	@Transient
	private String startDate;
	
	@Column(name = "STARTDATE")
	private LocalDateTime start_Date;
	
	@Column(name = "DURATION")
	private Integer duration;
	
	@Column(name = "DURATIONTYPE")
	private String durationType;
	
	@Column(name = "OPTIONS")
	private String option;
	
	@Column(name = "REMARK")
	private String remark;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
		  @JoinColumn(name = "TCINIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCINIDENCRYPTED"),
	  })
	 
	 private Q88_HdCntrtDTL_Cntrt_Durtn vslHdCntrctDurtn;

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getVesselIdEncrypted() {
		return vesselIdEncrypted;
	}

	public void setVesselIdEncrypted(String vesselIdEncrypted) {
		this.vesselIdEncrypted = vesselIdEncrypted;
	}

	public String getTcInIdEncrypted() {
		return tcInIdEncrypted;
	}

	public void setTcInIdEncrypted(String tcInIdEncrypted) {
		this.tcInIdEncrypted = tcInIdEncrypted;
	}

	public Integer getDurtn_SeqId() {
		return durtn_SeqId;
	}

	public void setDurtn_SeqId(Integer durtn_SeqId) {
		this.durtn_SeqId = durtn_SeqId;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
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

	public void setStart_Date(String  start_Date) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(start_Date !=null) {
			 try {
					LocalDateTime date = LocalDateTime.parse(start_Date, dateTimeFormatter);
		            this.start_Date = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }
		 }
		 else {
				this.start_Date = null;
			}
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Q88_HdCntrtDTL_Cntrt_Durtn getVslHdCntrctDurtn() {
		return vslHdCntrctDurtn;
	}

	public void setVslHdCntrctDurtn(Q88_HdCntrtDTL_Cntrt_Durtn vslHdCntrctDurtn) {
		this.vslHdCntrctDurtn = vslHdCntrctDurtn;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_Cntrt_DurtnDtl [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", durtn_SeqId=" + durtn_SeqId + ", displayOrder="
				+ displayOrder + ", startDate=" + startDate + ", start_Date=" + start_Date + ", duration=" + duration
				+ ", durationType=" + durationType + ", option=" + option + ", remark=" + remark + "]";
	}
	
	

}
