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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VslRegDtl_HeadContractDtlCPK;

@Entity
@Table(name = "Q88_VSLREGDTL_HEADCONTRACTDTL")
@IdClass(Q88_VslRegDtl_HeadContractDtlCPK.class)
public class Q88_VslRegDtl_HeadContractDtl {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;

	@Id
	@Column(name = "VESSELID")
	private String vesselId;

	@Column(name = "HEADCONTRACT_SEQID")
	private Integer headContract_SeqId;
	
	@Id
	@Column(name = "HDCONTRACTDTL_SEQID")
	@SequenceGenerator(name = "HdcntrctDtl_SeqId", sequenceName = "Q88_VSLREG_HDCONTRACTDTL_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "HdcntrctDtl_SeqId")
	private Integer HsContractDtl_SeqId;
	
	@Column(name = "TCINIDENCRYPTED")
	private String tcInIdEncrypted;
	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	
	@Column(name = "CONTRACTNUMBER")
	private String contractNumber;
	
	@Column(name = "OWNER")
	private String owner;
	
	@Transient
	private String cpDate;
	
	@Column(name = "CPDATE")
	private LocalDateTime cp_Date;
	
	@Transient
	private String deliveryDatetime;
	
	@Column(name = "DELIVERYDATETIME")
	private LocalDateTime delivery_Datetime;
	
	@Column(name = "duration")
	private Integer duration;
	
	@Column(name = "DURATIONTYPE")
	private String durationType;
	
	@Column(name = "OPTIONS")
	private String option;
	
	@Column(name = "ISCURRENT")
	private String isCurrent;
	
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELID"),
		  @JoinColumn(name = "HEADCONTRACT_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "HEADCONTRACT_SEQID"),
	  })
	 
	 private Q88_VslRegDtl_HeadContract vslHeadContract;


	public Integer getTrans_Id() {
		return trans_Id;
	}


	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}


	public String getVesselId() {
		return vesselId;
	}


	public void setVesselId(String vesselId) {
		this.vesselId = vesselId;
	}


	public Integer getHeadContract_SeqId() {
		return headContract_SeqId;
	}


	public void setHeadContract_SeqId(Integer headContract_SeqId) {
		this.headContract_SeqId = headContract_SeqId;
	}


	public Integer getHsContractDtl_SeqId() {
		return HsContractDtl_SeqId;
	}


	public void setHsContractDtl_SeqId(Integer hsContractDtl_SeqId) {
		HsContractDtl_SeqId = hsContractDtl_SeqId;
	}


	public String getTcInIdEncrypted() {
		return tcInIdEncrypted;
	}


	public void setTcInIdEncrypted(String tcInIdEncrypted) {
		this.tcInIdEncrypted = tcInIdEncrypted;
	}


	public Integer getDisplayOrder() {
		return displayOrder;
	}


	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}


	public String getContractNumber() {
		return contractNumber;
	}


	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
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
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		if(cp_Date !=null) {
			try {
				LocalDateTime date = LocalDateTime.parse(cp_Date, dateTimeFormatter);
	            this.cp_Date = date;
			}catch (DateTimeParseException e) {
	            System.out.println("Exception was thrown ");
	        }
			
		}
		else {
			this.cp_Date = null;
		}
		
	}


	public String getDeliveryDatetime() {
		return deliveryDatetime;
	}


	public void setDeliveryDatetime(String deliveryDatetime) {
		this.deliveryDatetime = deliveryDatetime;
	}


	public LocalDateTime getDelivery_Datetime() {
		return delivery_Datetime;
	}


	public void setDelivery_Datetime(String delivery_Datetime) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		if(delivery_Datetime !=null) {
			try {
				LocalDateTime date = LocalDateTime.parse(delivery_Datetime, dateTimeFormatter);
				this.delivery_Datetime  = date;
			}catch (DateTimeParseException e) {
	            System.out.println("Exception was thrown ");
	        }
		}
		else {
			this.delivery_Datetime = null;
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


	public String getIsCurrent() {
		return isCurrent;
	}


	public void setIsCurrent(String isCurrent) {
		this.isCurrent = isCurrent;
	}


	public Q88_VslRegDtl_HeadContract getVslHeadContract() {
		return vslHeadContract;
	}


	public void setVslHeadContract(Q88_VslRegDtl_HeadContract vslHeadContract) {
		this.vslHeadContract = vslHeadContract;
	}


	@Override
	public String toString() {
		return "Q88_VslRegDtl_HeadContractDtl [trans_Id=" + trans_Id + ", vesselId=" + vesselId
				+ ", headContract_SeqId=" + headContract_SeqId + ", HsContractDtl_SeqId=" + HsContractDtl_SeqId
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", displayOrder=" + displayOrder + ", contractNumber="
				+ contractNumber + ", owner=" + owner + ", cpDate=" + cpDate + ", cp_Date=" + cp_Date
				+ ", deliveryDatetime=" + deliveryDatetime + ", delivery_Datetime=" + delivery_Datetime + ", duration="
				+ duration + ", durationType=" + durationType + ", option=" + option + ", isCurrent=" + isCurrent + "]";
	}
	
	

	
}
