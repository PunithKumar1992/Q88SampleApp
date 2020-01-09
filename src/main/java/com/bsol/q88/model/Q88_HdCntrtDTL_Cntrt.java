package com.bsol.q88.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Locale;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_CntrtCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_CNTRT")
@IdClass(Q88_HdCntrtDTL_CntrtCPK.class)
public class Q88_HdCntrtDTL_Cntrt {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	@Id
	@Column(name = "TCINIDENCRYPTED")
	private String tcInIdEncrypted;
	
	@Transient
	private String cpDate;
	
	
	@Column(name = "CPDATE")
	private LocalDateTime cp_Date;
	
	@Column(name = "CONTRACTNUMBER")
	private String contractNumber;
	
	@Column(name = "TYPE")
	private String type;
	
	
	@Column(name = "OWNER")
	private String owner;
	
	
	@Column(name = "OWNEREXTERNALID")
	private String ownerExternalId;
	
	@Column(name = "BROKER")
	private String broker;
	
	@Column(name = "BROKEREXTERNALID")
	private String brokerExternalId;
	
	@Column(name = "CHARTERER")
	private String charterer;

	@Column(name = "CHARTEREREXTERNALID")
	private String chartererExternalId;
	
	@Column(name = "TECHNICAL")
	private String technical;
	
	@Column(name = "PARTNER")
	private String partner;
	
	@Column(name = "OTHER")
	private String other;
	
	@Column(name = "REMARK")
	private String remark;
	
	@Column(name = "ISCURRENT")
	private String isCurrent;
	
	@OneToOne(mappedBy = "vslHdCntrct", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_HdCntrtDTL_Cntrt_Durtn contractDuration ;
	
	@OneToOne(mappedBy = "vslHdCntrctTerms", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_HdCntrtDTL_Cntrt_Terms terms;
	
	@OneToOne(mappedBy = "vslHdCntrctDlvr", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_HdCntrtDTL_Cntrt_Dlvr delivery;
	
	@OneToOne(mappedBy = "vslHdCntrctReDlvr", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_HdCntrtDTL_Cntrt_RDlvr redelivery ;
	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
		  @JoinColumn(name = "TCINIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCINIDENCRYPTED"),
	  })
	
	private Q88_HdCntrtDTL HeadContractDtl;

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
					LocalDateTime date = LocalDateTime.parse(cp_Date,dateTimeFormatter);
					this.cp_Date = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }
		 }
		 else {
			 this.cp_Date = null;
		 }
		
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwnerExternalId() {
		return ownerExternalId;
	}

	public void setOwnerExternalId(String ownerExternalId) {
		this.ownerExternalId = ownerExternalId;
	}

	public String getBroker() {
		return broker;
	}

	public void setBroker(String broker) {
		this.broker = broker;
	}

	public String getBrokerExternalId() {
		return brokerExternalId;
	}

	public void setBrokerExternalId(String brokerExternalId) {
		this.brokerExternalId = brokerExternalId;
	}

	public String getCharterer() {
		return charterer;
	}

	public void setCharterer(String charterer) {
		this.charterer = charterer;
	}

	public String getChartererExternalId() {
		return chartererExternalId;
	}

	public void setChartererExternalId(String chartererExternalId) {
		this.chartererExternalId = chartererExternalId;
	}

	public String getTechnical() {
		return technical;
	}

	public void setTechnical(String technical) {
		this.technical = technical;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIsCurrent() {
		return isCurrent;
	}

	public void setIsCurrent(String isCurrent) {
		this.isCurrent = isCurrent;
	}

	
	public Q88_HdCntrtDTL getHeadContractDtl() {
		return HeadContractDtl;
	}

	public void setHeadContractDtl(Q88_HdCntrtDTL headContractDtl) {
		HeadContractDtl = headContractDtl;
	}

	public void setCp_Date(LocalDateTime cp_Date) {
		this.cp_Date = cp_Date;
	}

	public Q88_HdCntrtDTL_Cntrt_Durtn getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(Q88_HdCntrtDTL_Cntrt_Durtn contractDuration) {
		this.contractDuration = contractDuration;
	}

	public Q88_HdCntrtDTL_Cntrt_Terms getTerms() {
		return terms;
	}

	public void setTerms(Q88_HdCntrtDTL_Cntrt_Terms terms) {
		this.terms = terms;
	}

	public Q88_HdCntrtDTL_Cntrt_Dlvr getDelivery() {
		return delivery;
	}

	public void setDelivery(Q88_HdCntrtDTL_Cntrt_Dlvr delivery) {
		this.delivery = delivery;
	}

	public Q88_HdCntrtDTL_Cntrt_RDlvr getRedelivery() {
		return redelivery;
	}

	public void setRedelivery(Q88_HdCntrtDTL_Cntrt_RDlvr redelivery) {
		this.redelivery = redelivery;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_Cntrt [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", cpDate=" + cpDate + ", cp_Date=" + cp_Date
				+ ", contractNumber=" + contractNumber + ", type=" + type + ", owner=" + owner + ", ownerExternalId="
				+ ownerExternalId + ", broker=" + broker + ", brokerExternalId=" + brokerExternalId + ", charterer="
				+ charterer + ", chartererExternalId=" + chartererExternalId + ", technical=" + technical + ", partner="
				+ partner + ", other=" + other + ", remark=" + remark + ", isCurrent=" + isCurrent
				+ ", contractDuration=" + contractDuration + ", terms=" + terms + ", delivery=" + delivery
				+ ", redelivery=" + redelivery + "]";
	}

	
	
	
	
	
}
