package com.bsol.q88.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VoyObj_FixtureLstCPK;

@Entity
@Table(name = "Q88_VOYOBJ_FIXTURELST")
@IdClass(Q88_VoyObj_FixtureLstCPK.class)
public class Q88_VoyObj_FixtureLst {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "FIXTURELST_SEQID")
	private Integer fixtureLst_SeqId;
	
	@Transient
	private String cpDate;
	
	@Column(name = "CPDATE")
	private LocalDateTime cp_Date;
	
	@Column(name = "CPQUANTITY")
	private Double cpQuantity;
	
	@Column(name = "DEMURRAGE")
	private Double demurrage;

	@Column(name = "DISPLAYORDER")
	private Integer  displayOrder;
	
	@Column(name = "FIXTURENUMBER")
	private String fixtureNumber;
	
	@Column(name = "FIXTUREREMARK")
	private String fixtureRemark;
	
	@Column(name = "GRADES")
	private String grades;
	
	@Transient
	private String layCanDateEnd;
	
	@Column(name = "LAYCANDATEEND")
	private LocalDateTime layCan_DateEnd;
	
	@Transient
	private String layCanDateStart;
	
	@Column(name = "LAYCANDATESTART")
	private LocalDateTime layCan_DateStart;
	
	@Column(name = "LAYTIME")
	private Integer laytime;
	
	@Column(name = "OTHERTIMEBAR")
	private Integer otherTimeBar;
	
	@Column(name = "OVERAGE")
	private Double overage;
	
	@Column(name = "TIMEBAR")
	private Integer timeBar;
	
	@Column(name = "TAGS")
	private String tags;
	
	@OneToMany(mappedBy = "voyObjFixtureBill",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Fixture_BillOfLdng.class)
	private List<Q88_VoyObj_Fixture_BillOfLdng> fixtureBillsOfLading  = new ArrayList<Q88_VoyObj_Fixture_BillOfLdng>();
	
	@OneToMany(mappedBy = "voyFixtureCommission",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Fixture_Commission.class)
	private List<Q88_VoyObj_Fixture_Commission> fixtureCommissions  = new ArrayList<Q88_VoyObj_Fixture_Commission>();
	
	@OneToMany(mappedBy = "voyFixtureGrade",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Fixture_Grade.class)
	private List<Q88_VoyObj_Fixture_Grade> fixtureGrades  = new  ArrayList<Q88_VoyObj_Fixture_Grade>();
	
	@OneToMany(mappedBy = "voyFixtureProt",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Fixture_Port.class)
	private List<Q88_VoyObj_Fixture_Port> fixturePorts   = new  ArrayList<Q88_VoyObj_Fixture_Port>();
	
	@OneToMany(mappedBy = "voyFixtureRevenue",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Fixture_Revenue.class)
	private List<Q88_VoyObj_Fixture_Revenue> fixtureRevenueList  = new  ArrayList<Q88_VoyObj_Fixture_Revenue>();
	
	@OneToMany(mappedBy = "voyFixtureExpense",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Fixture_Expense.class)
	private List<Q88_VoyObj_Fixture_Expense> fixtureExpenseList   = new  ArrayList<Q88_VoyObj_Fixture_Expense>();

	@OneToMany(mappedBy = "voyFixtureTagLst",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Fixture_TagLst.class)
	private List<Q88_VoyObj_Fixture_TagLst> tagList    = new  ArrayList<Q88_VoyObj_Fixture_TagLst>();

	
	 @ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	  })
	 
	 private Q88_VoyObj voyObj_FixtureList;

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
		if(cp_Date !=null) {
		this.cp_Date = LocalDateTime.parse(cp_Date);
		}
		else {
			this.cp_Date =null;
		}
	}

	public Double getCpQuantity() {
		return cpQuantity;
	}

	public void setCpQuantity(Double cpQuantity) {
		this.cpQuantity = cpQuantity;
	}

	public Double getDemurrage() {
		return demurrage;
	}

	public void setDemurrage(Double demurrage) {
		this.demurrage = demurrage;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getFixtureNumber() {
		return fixtureNumber;
	}

	public void setFixtureNumber(String fixtureNumber) {
		this.fixtureNumber = fixtureNumber;
	}

	public String getFixtureRemark() {
		return fixtureRemark;
	}

	public void setFixtureRemark(String fixtureRemark) {
		this.fixtureRemark = fixtureRemark;
	}

	public String getGrades() {
		return grades;
	}

	public void setGrades(String grades) {
		this.grades = grades;
	}

	public String getLayCanDateEnd() {
		return layCanDateEnd;
	}

	public void setLayCanDateEnd(String layCanDateEnd) {
		this.layCanDateEnd = layCanDateEnd;
	}

	public LocalDateTime getLayCan_DateEnd() {
		return layCan_DateEnd;
	}

	public void setLayCan_DateEnd(String layCan_DateEnd) {
		if(layCan_DateEnd !=null) {
		this.layCan_DateEnd = LocalDateTime.parse(layCan_DateEnd);
		}else {
			this.layCan_DateEnd = null;
		}
	}

	public String getLayCanDateStart() {
		return layCanDateStart;
	}

	public void setLayCanDateStart(String layCanDateStart) {
		this.layCanDateStart = layCanDateStart;
	}

	
	public LocalDateTime getLayCan_DateStart() {
		return layCan_DateStart;
	}

	public void setLayCan_DateStart(String layCan_DateStart) {
		if(layCan_DateStart !=null) {
		this.layCan_DateStart = LocalDateTime.parse(layCan_DateStart);
		}
		else {
			this.layCan_DateStart = null;
		}
	}

	public Integer getLaytime() {
		return laytime;
	}

	public void setLaytime(Integer laytime) {
		this.laytime = laytime;
	}

	public Integer getOtherTimeBar() {
		return otherTimeBar;
	}

	public void setOtherTimeBar(Integer otherTimeBar) {
		this.otherTimeBar = otherTimeBar;
	}

	public Double getOverage() {
		return overage;
	}

	public void setOverage(Double overage) {
		this.overage = overage;
	}

	public Integer getTimeBar() {
		return timeBar;
	}

	public void setTimeBar(Integer timeBar) {
		this.timeBar = timeBar;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	

	public List<Q88_VoyObj_Fixture_BillOfLdng> getFixtureBillsOfLading() {
		return fixtureBillsOfLading;
	}

	public void addFixtureBillsOfLading(List<Q88_VoyObj_Fixture_BillOfLdng> fixtureBillsOfLading) {
		this.fixtureBillsOfLading = fixtureBillsOfLading;
	}

	public Q88_VoyObj getVoyObj_FixtureList() {
		return voyObj_FixtureList;
	}

	public void setVoyObj_FixtureList(Q88_VoyObj voyObj_FixtureList) {
		this.voyObj_FixtureList = voyObj_FixtureList;
	}
	
	

	public List<Q88_VoyObj_Fixture_Commission> getFixtureCommissions() {
		return fixtureCommissions;
	}

	public void addFixtureCommissions(List<Q88_VoyObj_Fixture_Commission> fixtureCommissions) {
		this.fixtureCommissions = fixtureCommissions;
	}
	
	

	public List<Q88_VoyObj_Fixture_Grade> getFixtureGrades() {
		return fixtureGrades;
	}

	public void addFixtureGrades(List<Q88_VoyObj_Fixture_Grade> fixtureGrades) {
		this.fixtureGrades = fixtureGrades;
	}

	
	public List<Q88_VoyObj_Fixture_Port> getFixturePorts() {
		return fixturePorts;
	}

	public void addFixturePorts(List<Q88_VoyObj_Fixture_Port> fixturePorts) {
		this.fixturePorts = fixturePorts;
	}
	
	

	public List<Q88_VoyObj_Fixture_Revenue> getFixtureRevenueList() {
		return fixtureRevenueList;
	}

	public void addFixtureRevenueList(List<Q88_VoyObj_Fixture_Revenue> fixtureRevenueList) {
		this.fixtureRevenueList = fixtureRevenueList;
	}
	
	

	public List<Q88_VoyObj_Fixture_Expense> getFixtureExpenseList() {
		return fixtureExpenseList;
	}

	public void addFixtureExpenseList(List<Q88_VoyObj_Fixture_Expense> fixtureExpenseList) {
		this.fixtureExpenseList = fixtureExpenseList;
	}
	
	

	public List<Q88_VoyObj_Fixture_TagLst> getTagList() {
		return tagList;
	}

	public void addTagList(List<Q88_VoyObj_Fixture_TagLst> tagList) {
		this.tagList = tagList;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_FixtureLst [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", fixtureLst_SeqId="
				+ fixtureLst_SeqId + ", cpDate=" + cpDate + ", cp_Date=" + cp_Date + ", cpQuantity=" + cpQuantity
				+ ", demurrage=" + demurrage + ", displayOrder=" + displayOrder + ", fixtureNumber=" + fixtureNumber
				+ ", fixtureRemark=" + fixtureRemark + ", grades=" + grades + ", layCanDateEnd=" + layCanDateEnd
				+ ", layCan_DateEnd=" + layCan_DateEnd + ", layCanDateStart=" + layCanDateStart + ", laytime=" + laytime
				+ ", otherTimeBar=" + otherTimeBar + ", overage=" + overage + ", timeBar=" + timeBar + ", tags=" + tags
				+ "]";
	}
	
	
	
	
	
}
