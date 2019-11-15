package com.q88.sample.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Q88_FIXTURE",schema = "CHOPS_WEB")
public class Q88_Fixture implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "FIXTURELISTSEQ_ID")
	private Integer fixturelistseq_id;
	@Column(name = "CPDATE")
	private String cpDate;
	@Column(name = "CPQUANTITY")
	private Number cpQuantity;
	@Column(name = "DEMURRAGE")
	private Number  demurrage;
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	@Column(name = "FIXTURENUMBER")
	private String fixtureNumber;
	@Column(name = "FIXTUREREMARK")
	private String  fixtureRemark;
	@Column(name = "GRADES")
	private String  grades;
	@Column(name = "LAYCANDATEEND")
	private String	layCanDateEnd;
	@Column(name = "LAYCANDATESTART")
	private String	layCanDateStart;
	@Column(name = "LAYTIME")
	private Integer laytime;
	@Column(name = "OTHERTIMEBAR")
	private Integer otherTimeBar;
	@Column(name = "OVERAGE")
	private Number overage;
	@Column(name = "TIMEBAR")
	private Integer timeBar;
	
	@OneToMany(targetEntity =Q88_FixtureBillOfLading.class,fetch =FetchType.LAZY,cascade =CascadeType.ALL,mappedBy ="q88fixturebill",orphanRemoval = false)
	private List<Q88_FixtureBillOfLading> fixtureBillsOfLadings = new ArrayList<Q88_FixtureBillOfLading>();
	
	@OneToMany(targetEntity =Q88_FixtureCommission.class ,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy ="q88fixturecommision",orphanRemoval = false )
	private List<Q88_FixtureCommission> fixtureCommissions = new ArrayList<Q88_FixtureCommission>();

	@OneToMany(targetEntity =Q88_FixtureGrade.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy ="q88fixturegrades",orphanRemoval = false )
	private List<Q88_FixtureGrade> fixtureGrades = new ArrayList<Q88_FixtureGrade>();

	@OneToMany(targetEntity =Q88_FixturePort.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL ,mappedBy = "q88fixtureport",orphanRemoval = false)
	private List<Q88_FixturePort> fixturePorts = new ArrayList<Q88_FixturePort>();

	@OneToMany(targetEntity =Q88_FixtureRevenue.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "q88fixturerevenue",orphanRemoval = false)
	private List<Q88_FixtureRevenue> fixtureRevenueList = new ArrayList<Q88_FixtureRevenue>();

	@OneToMany(targetEntity =Q88_FixtureExpense.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL ,mappedBy = "q88fixtureexpense",orphanRemoval = false)
	private List<Q88_FixtureExpense> fixtureExpenseList = new ArrayList<Q88_FixtureExpense>();
	

	@Column(name = "TAGS")
	private String tags;
	
	@OneToMany(targetEntity = Q88_TagData.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "q88fixturetagdata",orphanRemoval = false)
	private List<Q88_TagData> tagList;

	@Column(name = "VOYAGEID")
	private String voyageid;
	@Column(name = "VESSELID")
	private String vesselid;
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="voyageid",referencedColumnName = "VOYAGEID",insertable=false, updatable=false),
		@JoinColumn(name="vesselid",referencedColumnName = "VESSELID",insertable=false, updatable=false)
	})
	private Q88_Voyage q88voyagefixture;

	public Integer getFixturelistseq_id() {
		return fixturelistseq_id;
	}

	public void setFixturelistseq_id(Integer fixturelistseq_id) {
		this.fixturelistseq_id = fixturelistseq_id;
	}

	public String getCpDate() {
		return cpDate;
	}

	public void setCpDate(String cpDate) {
		this.cpDate = cpDate;
	}

	public Number getCpQuantity() {
		return cpQuantity;
	}

	public void setCpQuantity(Number cpQuantity) {
		this.cpQuantity = cpQuantity;
	}

	public Number getDemurrage() {
		return demurrage;
	}

	public void setDemurrage(Number demurrage) {
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

	public String getLayCanDateStart() {
		return layCanDateStart;
	}

	public void setLayCanDateStart(String layCanDateStart) {
		this.layCanDateStart = layCanDateStart;
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

	public Number getOverage() {
		return overage;
	}

	public void setOverage(Number overage) {
		this.overage = overage;
	}

	public Integer getTimeBar() {
		return timeBar;
	}

	public void setTimeBar(Integer timeBar) {
		this.timeBar = timeBar;
	}

	public List<Q88_FixtureBillOfLading> getFixtureBillsOfLadings() {
		return fixtureBillsOfLadings;
	}

	public void setFixtureBillsOfLadings(List<Q88_FixtureBillOfLading> fixtureBillsOfLadings) {
		this.fixtureBillsOfLadings = fixtureBillsOfLadings;
	}

	public List<Q88_FixtureCommission> getFixtureCommissions() {
		return fixtureCommissions;
	}

	public void setFixtureCommissions(List<Q88_FixtureCommission> fixtureCommissions) {
		this.fixtureCommissions = fixtureCommissions;
	}

	public List<Q88_FixtureGrade> getFixtureGrades() {
		return fixtureGrades;
	}

	public void setFixtureGrades(List<Q88_FixtureGrade> fixtureGrades) {
		this.fixtureGrades = fixtureGrades;
	}

	public List<Q88_FixturePort> getFixturePorts() {
		return fixturePorts;
	}

	public void setFixturePorts(List<Q88_FixturePort> fixturePorts) {
		this.fixturePorts = fixturePorts;
	}

	public List<Q88_FixtureRevenue> getFixtureRevenueList() {
		return fixtureRevenueList;
	}

	public void setFixtureRevenueList(List<Q88_FixtureRevenue> fixtureRevenueList) {
		this.fixtureRevenueList = fixtureRevenueList;
	}

	public List<Q88_FixtureExpense> getFixtureExpenseList() {
		return fixtureExpenseList;
	}

	public void setFixtureExpenseList(List<Q88_FixtureExpense> fixtureExpenseList) {
		this.fixtureExpenseList = fixtureExpenseList;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public List<Q88_TagData> getTagList() {
		return tagList;
	}

	public void setTagList(List<Q88_TagData> tagList) {
		this.tagList = tagList;
	}

	public String getVoyageid() {
		return voyageid;
	}

	public void setVoyageid(String voyageid) {
		this.voyageid = voyageid;
	}

	public String getVesselid() {
		return vesselid;
	}

	public void setVesselid(String vesselid) {
		this.vesselid = vesselid;
	}

	public Q88_Voyage getQ88voyagefixture() {
		return q88voyagefixture;
	}

	public void setQ88voyagefixture(Q88_Voyage q88voyagefixture) {
		this.q88voyagefixture = q88voyagefixture;
	}

	@Override
	public String toString() {
		return "Q88_Fixture [fixturelistseq_id=" + fixturelistseq_id + ", cpDate=" + cpDate + ", cpQuantity="
				+ cpQuantity + ", demurrage=" + demurrage + ", displayOrder=" + displayOrder + ", fixtureNumber="
				+ fixtureNumber + ", fixtureRemark=" + fixtureRemark + ", grades=" + grades + ", layCanDateEnd="
				+ layCanDateEnd + ", layCanDateStart=" + layCanDateStart + ", laytime=" + laytime + ", otherTimeBar="
				+ otherTimeBar + ", overage=" + overage + ", timeBar=" + timeBar + ", fixtureBillsOfLadings="
				+ fixtureBillsOfLadings + ", fixtureCommissions=" + fixtureCommissions + ", fixtureGrades="
				+ fixtureGrades + ", fixturePorts=" + fixturePorts + ", fixtureRevenueList=" + fixtureRevenueList
				+ ", fixtureExpenseList=" + fixtureExpenseList + ", tags=" + tags + ", tagList=" + tagList
				+ ", voyageid=" + voyageid + ", vesselid=" + vesselid
				+ ", q88voyagefixture=" + q88voyagefixture + "]";
	}

	
	
}

