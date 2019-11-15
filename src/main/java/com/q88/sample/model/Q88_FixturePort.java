package com.q88.sample.model;

import java.io.Serializable;

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
@Table(name = "Q88_FIXTURE_PORT",schema = "CHOPS_WEB")
public class Q88_FixturePort implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "FIXTUREPORT_SEQID")
	private Integer fixtureport_seqid;
	@Column(name = "PORTID")
	private Integer portId;
	@Column(name = "PORTNAME")
	private String portName;
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	@Column(name = "ACTIVITYTYPE")
	private String activityType;
	@Column(name = "FIXTUREPORTLINKTOKEN")
	private String fixturePortLinkToken;
	@Column(name = "FIXTURELISTSEQ_ID")
	private Integer fixturelistseq_id;
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="fixturelistseq_id",referencedColumnName = "FIXTURELISTSEQ_ID",insertable=false, updatable=false)
	private Q88_Fixture q88fixtureport;

	public Integer getFixtureport_seqid() {
		return fixtureport_seqid;
	}

	public void setFixtureport_seqid(Integer fixtureport_seqid) {
		this.fixtureport_seqid = fixtureport_seqid;
	}

	public Integer getPortId() {
		return portId;
	}

	public void setPortId(Integer portId) {
		this.portId = portId;
	}

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getFixturePortLinkToken() {
		return fixturePortLinkToken;
	}

	public void setFixturePortLinkToken(String fixturePortLinkToken) {
		this.fixturePortLinkToken = fixturePortLinkToken;
	}

	public Integer getFixturelistseq_id() {
		return fixturelistseq_id;
	}

	public void setFixturelistseq_id(Integer fixturelistseq_id) {
		this.fixturelistseq_id = fixturelistseq_id;
	}

	public Q88_Fixture getQ88fixtureport() {
		return q88fixtureport;
	}

	public void setQ88fixtureport(Q88_Fixture q88fixtureport) {
		this.q88fixtureport = q88fixtureport;
	}

	@Override
	public String toString() {
		return "Q88_FixturePort [fixtureport_seqid=" + fixtureport_seqid + ", portId=" + portId + ", portName="
				+ portName + ", displayOrder=" + displayOrder + ", activityType=" + activityType
				+ ", fixturePortLinkToken=" + fixturePortLinkToken + ", fixturelistseq_id=" + fixturelistseq_id
				+ ", q88fixtureport=" + q88fixtureport + "]";
	}

	
	
}
