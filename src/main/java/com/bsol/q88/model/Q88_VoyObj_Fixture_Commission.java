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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VoyObj_Fixture_CommissionCPK;

@Entity
@Table(name = "Q88_VOYOBJ_FIXTURE_COMMISSION")
@IdClass(Q88_VoyObj_Fixture_CommissionCPK.class)
public class Q88_VoyObj_Fixture_Commission {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "FIXTURELST_SEQID")
	private Integer fixtureLst_SeqId;
	
	@Id
	@Column(name = "COMMISSION_SEQID")
	@SequenceGenerator(name = "FixComm_SeqId", sequenceName = "Q88_VOY_FIXTURE_COMM_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "FixComm_SeqId")
	private Integer commission_SeqId;
	
	@Column(name = "COMMISSIONTYPE")
	private String commissionType;
	
	@Column(name = "ORGANIZATIONGROUPNAME")
	private String organizationGroupName;
	
	@Column(name = "ORGANIZATIONNAME")
	private String organizationName;
	
	@Column(name = "ORGANIZATIONEXTERNALID")
	private String organizationExternalId;
	
	@Column(name = "RATE")
	private Double rate;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
		  @JoinColumn(name = "FIXTURELST_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "FIXTURELST_SEQID"),
	  })
	private Q88_VoyObj_FixtureLst voyFixtureCommission;
	

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getVoyageId() {
		return voyageId;
	}

	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}

	public Integer getFixtureLst_SeqId() {
		return fixtureLst_SeqId;
	}

	public void setFixtureLst_SeqId(Integer fixtureLst_SeqId) {
		this.fixtureLst_SeqId = fixtureLst_SeqId;
	}

	public Integer getCommission_SeqId() {
		return commission_SeqId;
	}

	public void setCommission_SeqId(Integer commission_SeqId) {
		this.commission_SeqId = commission_SeqId;
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

	public Q88_VoyObj_FixtureLst getVoyFixtureCommission() {
		return voyFixtureCommission;
	}

	public void setVoyFixtureCommission(Q88_VoyObj_FixtureLst voyFixtureCommission) {
		this.voyFixtureCommission = voyFixtureCommission;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Fixture_Commission [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", fixtureLst_SeqId="
				+ fixtureLst_SeqId + ", commission_SeqId=" + commission_SeqId + ", commissionType=" + commissionType
				+ ", organizationGroupName=" + organizationGroupName + ", organizationName=" + organizationName
				+ ", organizationExternalId=" + organizationExternalId + ", rate=" + rate + "]";
	}
	
	
	
	

}
