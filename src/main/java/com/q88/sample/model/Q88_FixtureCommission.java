package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_FIXTURECOMMISSION")
public class Q88_FixtureCommission {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "FIXTURECOMMISSION_SEQID")
	private Integer fixturecommission_seqid;
	@Column(name = "COMMISSIONTYPE")
	private String commissionType;
	@Column(name = "ORGANIZATIONGROUPNAME")
	private String organizationGroupName;
	@Column(name = "ORGANIZATIONNAME")
	private String organizationName;
	@Column(name = "ORGANIZATIONEXTERNALID")
	private String organizationExternalId;
	@Column(name = "RATE")
	private Number rate;
	@Column(name = "FIXTURELISTSEQ_ID")
	private Integer fixturelistseq_id;
	
	@ManyToOne(optional =false, fetch = FetchType.LAZY)
	@JoinColumn(name="fixturelistseq_id", referencedColumnName ="FIXTURELISTSEQ_ID",insertable=false, updatable=false)
	private Q88_Fixture q88fixturecommision;

	public Integer getFixturecommission_seqid() {
		return fixturecommission_seqid;
	}

	public void setFixturecommission_seqid(Integer fixturecommission_seqid) {
		this.fixturecommission_seqid = fixturecommission_seqid;
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

	public Number getRate() {
		return rate;
	}

	public void setRate(Number rate) {
		this.rate = rate;
	}

	public Integer getFixturelistseq_id() {
		return fixturelistseq_id;
	}

	public void setFixturelistseq_id(Integer fixturelistseq_id) {
		this.fixturelistseq_id = fixturelistseq_id;
	}

	public Q88_Fixture getQ88fixturecommision() {
		return q88fixturecommision;
	}

	public void setQ88fixturecommision(Q88_Fixture q88fixturecommision) {
		this.q88fixturecommision = q88fixturecommision;
	}

	@Override
	public String toString() {
		return "Q88_FixtureCommission [fixturecommission_seqid=" + fixturecommission_seqid + ", commissionType="
				+ commissionType + ", organizationGroupName=" + organizationGroupName + ", organizationName="
				+ organizationName + ", organizationExternalId=" + organizationExternalId + ", rate=" + rate
				+ ", fixturelistseq_id=" + fixturelistseq_id + ", q88fixturecommision=" + q88fixturecommision + "]";
	}

	
	
}
