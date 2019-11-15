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
@Table(name = "Q88_FIXTURE_BILLOFLADING",schema = "CHOPS_WEB")
public class Q88_FixtureBillOfLading implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "FIXTUREBILL_SEQID")
	private Integer fixturebill_seqid;
	@Column(name = "BILLOFLADINGDATE")
	private String billOfLadingDate ;
	@Column(name = "DESCRIPTION")
	private String description ;
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder ;
	@Column(name = "FIXTUREGRADENAME")
	private String fixtureGradeName ;
	@Column(name = "PORTNAME")
	private String portName ;
	@Column(name = "PORTID")
	private Integer portId ;
	@Column(name = "FIXTUREPORTLINKTOKEN")
	private String fixturePortLinkToken ;
	@Column(name = "QUANTITYBBLS")
	private Number quantityBBLS ;
	@Column(name = "QUANTITYMT")
	private Number quantityMT ;
	@Column(name = "SHIPPER")
	private String shipper;
	@Column(name = "VOYAGEFIXTUREGRADEDISPLAYORDER")
	private Integer voyageFixtureGradeDisplayOrder ;
	@Column(name = "FIXTURELISTSEQ_ID")
	private Integer fixturelistseq_id;
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="fixturelistseq_id", referencedColumnName ="FIXTURELISTSEQ_ID" ,insertable=false, updatable=false)
	private Q88_Fixture q88fixturebill;

	public Integer getFixturebill_seqid() {
		return fixturebill_seqid;
	}

	public void setFixturebill_seqid(Integer fixturebill_seqid) {
		this.fixturebill_seqid = fixturebill_seqid;
	}

	public String getBillOfLadingDate() {
		return billOfLadingDate;
	}

	public void setBillOfLadingDate(String billOfLadingDate) {
		this.billOfLadingDate = billOfLadingDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getFixtureGradeName() {
		return fixtureGradeName;
	}

	public void setFixtureGradeName(String fixtureGradeName) {
		this.fixtureGradeName = fixtureGradeName;
	}

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}

	public Integer getPortId() {
		return portId;
	}

	public void setPortId(Integer portId) {
		this.portId = portId;
	}

	public String getFixturePortLinkToken() {
		return fixturePortLinkToken;
	}

	public void setFixturePortLinkToken(String fixturePortLinkToken) {
		this.fixturePortLinkToken = fixturePortLinkToken;
	}

	public Number getQuantityBBLS() {
		return quantityBBLS;
	}

	public void setQuantityBBLS(Number quantityBBLS) {
		this.quantityBBLS = quantityBBLS;
	}

	public Number getQuantityMT() {
		return quantityMT;
	}

	public void setQuantityMT(Number quantityMT) {
		this.quantityMT = quantityMT;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public Integer getVoyageFixtureGradeDisplayOrder() {
		return voyageFixtureGradeDisplayOrder;
	}

	public void setVoyageFixtureGradeDisplayOrder(Integer voyageFixtureGradeDisplayOrder) {
		this.voyageFixtureGradeDisplayOrder = voyageFixtureGradeDisplayOrder;
	}

	public Integer getFixturelistseq_id() {
		return fixturelistseq_id;
	}

	public void setFixturelistseq_id(Integer fixturelistseq_id) {
		this.fixturelistseq_id = fixturelistseq_id;
	}

	public Q88_Fixture getQ88fixturebill() {
		return q88fixturebill;
	}

	public void setQ88fixturebill(Q88_Fixture q88fixturebill) {
		this.q88fixturebill = q88fixturebill;
	}

	@Override
	public String toString() {
		return "Q88_FixtureBillOfLading [fixturebill_seqid=" + fixturebill_seqid + ", billOfLadingDate="
				+ billOfLadingDate + ", description=" + description + ", displayOrder=" + displayOrder
				+ ", fixtureGradeName=" + fixtureGradeName + ", portName=" + portName + ", portId=" + portId
				+ ", fixturePortLinkToken=" + fixturePortLinkToken + ", quantityBBLS=" + quantityBBLS + ", quantityMT="
				+ quantityMT + ", shipper=" + shipper + ", voyageFixtureGradeDisplayOrder="
				+ voyageFixtureGradeDisplayOrder + ", fixturelistseq_id=" + fixturelistseq_id + ", q88fixturebill="
				+ q88fixturebill + "]";
	}

	
	
	
}
