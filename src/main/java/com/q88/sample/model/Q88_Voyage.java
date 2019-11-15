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
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Entity
@IdClass(Q88_VoyageCPK.class)
@Table(name = "Q88_VOYAGE")
public class Q88_Voyage implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "VOYAGEID")
	private String voyageId;
	@Id
	@Column(name = "VESSELID")
	private String vesselId;
	@Column(name = "VERSION")
	private Number version;
	@Column(name = "VOYAGENUMBER")
	private String voyageNumber;
	@Column(name = "VESSELNAME")
	private String vesselName;
	@Column(name = "VESSELIMO")
	private String vesselimo;
	@Column(name = "STARTDATEUTC")
	private String startDateUtc;
	@Column(name = "ENDDATEUTC")
	private String endDateUtc;
	@Column(name = "MODULETYPE")
	private String moduleType;
	@Column(name = "OFFHIREDAYS")
	private Number offhireDays;
	@Column(name = "TAGS")
	private String tags;
	@Column(name = "URL")
	private String url;
	@Column(name = "ISESTIMATE")
	private String isEstimate;
	@Column(name = "TCNUMBER")
	private String tcnumber;
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcoutidencrypted;

 	
 	@OneToOne(targetEntity =Q88_VoyageResult.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "q88voyageres",orphanRemoval = false )
	private Q88_VoyageResult  results;
 	 
 	@OneToOne(targetEntity =Q88_VoyageResultFixed.class,fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "q88voyageresfix",orphanRemoval = false)
	private Q88_VoyageResultFixed  resultsWhenFixed;
	
	@OneToMany(targetEntity = Q88_Fixture.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "q88voyagefixture",orphanRemoval = false)
	private List<Q88_Fixture> fixtureList = new ArrayList<Q88_Fixture>();
	
	@OneToMany(targetEntity =Q88_Leg.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL ,mappedBy = "q88voyageleg",orphanRemoval = false)
	private List<Q88_Leg> legList = new ArrayList<Q88_Leg>();
	
	@OneToMany(targetEntity =Q88_Revenue.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL ,mappedBy = "q88voyagerevenue",orphanRemoval = false)
	private List<Q88_Revenue> revenueList = new ArrayList<Q88_Revenue>();
	
	@OneToMany(targetEntity =Q88_Expense.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL ,mappedBy = "q88voyageexpense",orphanRemoval = false)
	private List<Q88_Expense> expenseList = new ArrayList<Q88_Expense>();
	
	@OneToMany(targetEntity = Q88_Bunker.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "q88voyagebunker",orphanRemoval = false)
	private List<Q88_Bunker> bunkerList = new ArrayList<Q88_Bunker>();
	
	@OneToMany(targetEntity =Q88_Remark.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "q88voyageremark",orphanRemoval = false)
	private List<Q88_Remark> remarkList = new ArrayList<Q88_Remark>();
	
	@OneToMany(targetEntity =Q88_Offhire.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL ,mappedBy = "q88voyageoffhire",orphanRemoval = false)
	private List<Q88_Offhire> offhireList = new ArrayList<Q88_Offhire>();
	
	@OneToOne(targetEntity =Q88_TcReletDetail.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL ,mappedBy = "q88tcreletdetail",orphanRemoval = false)
	private Q88_TcReletDetail  tcReletDetail;
	
	@OneToOne(targetEntity =Q88_VoyageReview.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL ,mappedBy = "q88voyagereview",orphanRemoval = false)
	private Q88_VoyageReview  review;

	public String getVoyageId() {
		return voyageId;
	}

	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}

	public String getVesselId() {
		return vesselId;
	}

	public void setVesselId(String vesselId) {
		this.vesselId = vesselId;
	}

	public Number getVersion() {
		return version;
	}

	public void setVersion(Number version) {
		this.version = version;
	}

	public String getVoyageNumber() {
		return voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		this.voyageNumber = voyageNumber;
	}

	public String getVesselName() {
		return vesselName;
	}

	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}

	public String getVesselimo() {
		return vesselimo;
	}

	public void setVesselimo(String vesselimo) {
		this.vesselimo = vesselimo;
	}

	public String getStartDateUtc() {
		return startDateUtc;
	}

	public void setStartDateUtc(String startDateUtc) {
		this.startDateUtc = startDateUtc;
	}

	public String getEndDateUtc() {
		return endDateUtc;
	}

	public void setEndDateUtc(String endDateUtc) {
		this.endDateUtc = endDateUtc;
	}

	public String getModuleType() {
		return moduleType;
	}

	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	public Number getOffhireDays() {
		return offhireDays;
	}

	public void setOffhireDays(Number offhireDays) {
		this.offhireDays = offhireDays;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIsEstimate() {
		return isEstimate;
	}

	public void setIsEstimate(String isEstimate) {
		this.isEstimate = isEstimate;
	}

	public String getTcnumber() {
		return tcnumber;
	}

	public void setTcnumber(String tcnumber) {
		this.tcnumber = tcnumber;
	}

	public String getTcoutidencrypted() {
		return tcoutidencrypted;
	}

	public void setTcoutidencrypted(String tcoutidencrypted) {
		this.tcoutidencrypted = tcoutidencrypted;
	}

	public Q88_VoyageResult getResults() {
		return results;
	}

	public void setResults(Q88_VoyageResult results) {
		this.results = results;
	}

	public Q88_VoyageResultFixed getResultsWhenFixed() {
		return resultsWhenFixed;
	}

	public void setResultsWhenFixed(Q88_VoyageResultFixed resultsWhenFixed) {
		this.resultsWhenFixed = resultsWhenFixed;
	}

	public List<Q88_Fixture> getFixtureList() {
		return fixtureList;
	}

	public void setFixtureList(List<Q88_Fixture> fixtureList) {
		this.fixtureList = fixtureList;
	}

	public List<Q88_Leg> getLegList() {
		return legList;
	}

	public void setLegList(List<Q88_Leg> legList) {
		this.legList = legList;
	}

	public List<Q88_Revenue> getRevenueList() {
		return revenueList;
	}

	public void setRevenueList(List<Q88_Revenue> revenueList) {
		this.revenueList = revenueList;
	}

	public List<Q88_Expense> getExpenseList() {
		return expenseList;
	}

	public void setExpenseList(List<Q88_Expense> expenseList) {
		this.expenseList = expenseList;
	}

	public List<Q88_Bunker> getBunkerList() {
		return bunkerList;
	}

	public void setBunkerList(List<Q88_Bunker> bunkerList) {
		this.bunkerList = bunkerList;
	}

	public List<Q88_Remark> getRemarkList() {
		return remarkList;
	}

	public void setRemarkList(List<Q88_Remark> remarkList) {
		this.remarkList = remarkList;
	}

	public List<Q88_Offhire> getOffhireList() {
		return offhireList;
	}

	public void setOffhireList(List<Q88_Offhire> offhireList) {
		this.offhireList = offhireList;
	}

	public Q88_TcReletDetail getTcReletDetail() {
		return tcReletDetail;
	}

	public void setTcReletDetail(Q88_TcReletDetail tcReletDetail) {
		this.tcReletDetail = tcReletDetail;
	}

	public Q88_VoyageReview getReview() {
		return review;
	}

	public void setReview(Q88_VoyageReview review) {
		this.review = review;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Q88_Voyage [voyageId=" + voyageId + ", vesselId=" + vesselId + ", version=" + version
				+ ", voyageNumber=" + voyageNumber + ", vesselName=" + vesselName + ", vesselimo=" + vesselimo
				+ ", startDateUtc=" + startDateUtc + ", endDateUtc=" + endDateUtc + ", moduleType=" + moduleType
				+ ", offhireDays=" + offhireDays + ", tags=" + tags + ", url=" + url + ", isEstimate=" + isEstimate
				+ ", tcnumber=" + tcnumber + ", tcoutidencrypted=" + tcoutidencrypted + ", results=" + results
				+ ", resultsWhenFixed=" + resultsWhenFixed + ", fixtureList=" + fixtureList + ", legList=" + legList
				+ ", revenueList=" + revenueList + ", expenseList=" + expenseList + ", bunkerList=" + bunkerList
				+ ", remarkList=" + remarkList + ", offhireList=" + offhireList + ", tcReletDetail=" + tcReletDetail
				+ ", review=" + review + "]";
	}
	
	


	
	
}
