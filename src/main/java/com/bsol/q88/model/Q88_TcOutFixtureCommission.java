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

import com.bsol.q88.model.cpk.Q88_TcOutFixtureCommissionCPK;

@Entity
@Table(name = "Q88_TC_TCOUTFIXTURE_COMMISSION")
@IdClass(Q88_TcOutFixtureCommissionCPK.class)
public class Q88_TcOutFixtureCommission {
	
	  @Id
	  @Column(name = "TCOUTFIXTURE_SEQID")
	  @GeneratedValue(strategy = GenerationType.SEQUENCE)
	  private Integer tcOutFixture_SeqId;
	
	  @Id
	  @Column(name = "TCOUTDETAIL_SEQID")
	  private Integer tcOutDetail_SeqId;
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
		  @JoinColumn(name = "TCOUTDETAIL_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTDETAIL_SEQID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	  private Q88_TcOutListDetails tcOutFixtureCommission;
	  
	public Integer getTcOutFixture_SeqId() {
		return tcOutFixture_SeqId;
	}
	public void setTcOutFixture_SeqId(Integer tcOutFixture_SeqId) {
		this.tcOutFixture_SeqId = tcOutFixture_SeqId;
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
	
	public Q88_TcOutListDetails getTcOutFixtureCommission() {
		return tcOutFixtureCommission;
	}
	public void setTcOutFixtureCommission(Q88_TcOutListDetails tcOutFixtureCommission) {
		this.tcOutFixtureCommission = tcOutFixtureCommission;
	}
	@Override
	public String toString() {
		return "Q88_TcOutFixtureCommission [tcOutFixture_SeqId=" + tcOutFixture_SeqId + ", tcOutDetail_SeqId="
				+ tcOutDetail_SeqId + ", tcOutIdEncrypted=" + tcOutIdEncrypted + ", vesselIdEncrypted="
				+ vesselIdEncrypted + ", commissionType=" + commissionType + ", organizationGroupName="
				+ organizationGroupName + ", organizationName=" + organizationName + ", organizationExternalId="
				+ organizationExternalId + ", rate=" + rate + "]";
	}
	  
	  
}
