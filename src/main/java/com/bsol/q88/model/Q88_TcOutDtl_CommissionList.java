package com.bsol.q88.model;

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

import com.bsol.q88.model.cpk.Q88_TcOutDtl_CommissionListCPK;

@Entity
@Table(name = "Q88_TCOUTDTL_COMMISSIONLIST")
@IdClass(Q88_TcOutDtl_CommissionListCPK.class)
public class Q88_TcOutDtl_CommissionList {
	
	  @Id
	  @Column(name = "COMMISSION_SEQID")
	  @GeneratedValue(strategy = GenerationType.SEQUENCE)
	  private Integer commission_SeqId;
	
	  @Id
	  @Column(name = "TRANS_ID")
	  private Integer trans_Id;
	  @Id
	  @Column(name = "TCOUTIDENCRYPTED")
	  private String tcOutIdEncrypted;
	  @Id
	  @Column(name = "VESSELIDENCRYPTED")
	  private String vesselIdEncrypted;
	  
	  @Column(name = "COMMISSIONTYPE")
	  private String  commissionType;
	  @Column(name = "ORGANIZATIONGROUPNAME")
	  private String  organizationGroupName;
	  @Column(name = "ORGANIZATIONNAME")
	  private String  organizationName; 
	  @Column(name = "ORGANIZATIONEXTERNALID")
	  private String  organizationExternalId;
	  @Column(name = "RATE")
	  private Double  rate;
	  
	  @ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	  private Q88_TcOutDtl tcOutFixtureCommission;
	  
	
	public Integer getCommission_SeqId() {
		return commission_SeqId;
	}
	public void setCommission_SeqId(Integer commission_SeqId) {
		this.commission_SeqId = commission_SeqId;
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
	public String getCommissionType() {
		return commissionType;
	}
	public void setCommissionType(String commissionType) {
		this.commissionType = commissionType;
	}
	public String getOrganizationGroupName() {
		return organizationGroupName;
	}
	public void setOrganizationGroupName(String organizationGroupName) {
		this.organizationGroupName = organizationGroupName;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getOrganizationExternalId() {
		return organizationExternalId;
	}
	public void setOrganizationExternalId(String organizationExternalId) {
		this.organizationExternalId = organizationExternalId;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	public Q88_TcOutDtl getTcOutFixtureCommission() {
		return tcOutFixtureCommission;
	}
	public void setTcOutFixtureCommission(Q88_TcOutDtl tcOutFixtureCommission) {
		this.tcOutFixtureCommission = tcOutFixtureCommission;
	}
	@Override
	public String toString() {
		return "Q88_TcOutFixtureCommission [commission_SeqId=" + commission_SeqId + ", trans_Id=" + trans_Id
				+ ", tcOutIdEncrypted=" + tcOutIdEncrypted + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", commissionType=" + commissionType + ", organizationGroupName=" + organizationGroupName
				+ ", organizationName=" + organizationName + ", organizationExternalId=" + organizationExternalId
				+ ", rate=" + rate + "]";
	}
	
	  
	  
}
