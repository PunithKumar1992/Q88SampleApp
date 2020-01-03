package com.bsol.q88.model;

import java.time.LocalDateTime;

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

import com.bsol.q88.model.cpk.Q88_VoyObj_Fixture_BillOfLdngCPK;

@Entity
@Table(name = "Q88_VOYOBJ_FIXTURE_BILLOFLDNG")
@IdClass(Q88_VoyObj_Fixture_BillOfLdngCPK.class)

public class Q88_VoyObj_Fixture_BillOfLdng {
	
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
	@Column(name = "FIXTUREBILLOFLDNG_SEQID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer fixtureBillOfLdng_SeqId;
	
	@Transient
	private String billOfLadingDate;
	
	@Column(name = "BILLOFLADINGDATE")
	private LocalDateTime billOfLading_Date;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	
	@Column(name = "FIXTUREGRADENAME")
	private String fixtureGradeName;
	
	@Column(name = "PORTNAME")
	private String portName;
	
	@Column(name = "PORTID")
	private Integer portId;
	
	@Column(name = "FIXTUREPORTLINKTOKEN")
	private String fixturePortLinkToken;
	
	@Column(name = "QUANTITYBBLS" )
	private Double quantityBBLS;
	
	@Column(name = "QUANTITYMT")
	private Double quantityMT;
	
	@Column(name = "shipper ")
	private String shipper;
	
	@Column(name = "VOYAGEFIXTUREGRADEDISPLAYORDER")
	private Integer voyageFixtureGradeDisplayOrder;
	
	 @ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
		  @JoinColumn(name = "FIXTURELST_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "FIXTURELST_SEQID"),
	  })
	private Q88_VoyObj_FixtureLst voyObjFixtureBill;

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

	public Integer getFixtureBillOfLdng_SeqId() {
		return fixtureBillOfLdng_SeqId;
	}

	public void setFixtureBillOfLdng_SeqId(Integer fixtureBillOfLdng_SeqId) {
		this.fixtureBillOfLdng_SeqId = fixtureBillOfLdng_SeqId;
	}

	public String getBillOfLadingDate() {
		return billOfLadingDate;
	}

	public void setBillOfLadingDate(String billOfLadingDate) {
		this.billOfLadingDate = billOfLadingDate;
	}

	public LocalDateTime getBillOfLading_Date() {
		return billOfLading_Date;
	}

	public void setBillOfLading_Date(String  billOfLading_Date) {
		if(billOfLading_Date !=null) {
			this.billOfLading_Date = LocalDateTime.parse(billOfLading_Date);
		}else {
			this.billOfLading_Date = null;
		}
		
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

	public Double getQuantityBBLS() {
		return quantityBBLS;
	}

	public void setQuantityBBLS(Double quantityBBLS) {
		this.quantityBBLS = quantityBBLS;
	}

	public Double getQuantityMT() {
		return quantityMT;
	}

	public void setQuantityMT(Double quantityMT) {
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

	public Q88_VoyObj_FixtureLst getVoyObjFixtureBill() {
		return voyObjFixtureBill;
	}

	public void setVoyObjFixtureBill(Q88_VoyObj_FixtureLst voyObjFixtureBill) {
		this.voyObjFixtureBill = voyObjFixtureBill;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Fixture_BillOfLdng [trans_Id=" + trans_Id + ", voyageId=" + voyageId
				+ ", fixtureBillOfLdng_SeqId=" + fixtureBillOfLdng_SeqId + ", billOfLadingDate=" + billOfLadingDate
				+ ", billOfLading_Date=" + billOfLading_Date + ", description=" + description + ", displayOrder="
				+ displayOrder + ", fixtureGradeName=" + fixtureGradeName + ", portName=" + portName + ", portId="
				+ portId + ", fixturePortLinkToken=" + fixturePortLinkToken + ", quantityBBLS=" + quantityBBLS
				+ ", quantityMT=" + quantityMT + ", shipper=" + shipper + ", voyageFixtureGradeDisplayOrder="
				+ voyageFixtureGradeDisplayOrder + "]";
	}
	 
	 

}
