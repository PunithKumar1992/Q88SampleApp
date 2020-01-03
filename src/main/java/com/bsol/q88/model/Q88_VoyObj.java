package com.bsol.q88.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VoyObjCPK;

@Entity
@Table(name = "Q88_VOYOBJ")
@IdClass(Q88_VoyObjCPK.class)
public class Q88_VoyObj implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Column(name = "VERSION")
	private Double version;
	
	@Column(name = "VOYAGENUMBER")
	private String voyageNumber; 
	
	@Column(name = "VESSELNAME")
	private String vesselName;
	
	@Column(name = "VESSELIMO")
	private String vesselImo;
	
	@Column(name = "VESSELID")
	private String vesselId; 

	@Transient
	private String startDateUtc;
	
	@Column(name = "STARTDATEUTC")
	private LocalDateTime start_DateUtc;
	
	@Transient
	private String endDateUtc; 
	
	@Column(name = "ENDDATEUTC")
	private LocalDateTime end_DateUtc;
	
	@Column(name = "MODULETYPE")
	private String moduleType; 
	
	@Column(name = "OFFHIREDAYS")
	private Double offhireDays;
	
	@Column(name = "TAGS")
	private String tags;
	
	@Column(name = "URL")
	private String url; 
	
	@Column(name = "ISESTIMATE")
	private String isEstimate;
	
	@Column(name = "TCNUMBER")
	private String tcNumber;
	
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	
	@OneToOne(mappedBy = "voyObjResult", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_VoyObj_Rslt results;
	
	@OneToOne(mappedBy = "voyObjResultFixed", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_VoyObj_RsltFixed resultsWhenFixed;
	
	@OneToMany(mappedBy = "voyObj_FixtureList",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_FixtureLst.class)
	private List<Q88_VoyObj_FixtureLst> fixtureList = new ArrayList<Q88_VoyObj_FixtureLst>();
	
	@OneToMany(mappedBy = "voyObjLegLst",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_LegLst.class)
	private List<Q88_VoyObj_LegLst> legList  = new ArrayList<Q88_VoyObj_LegLst>();

	@OneToMany(mappedBy = "voyObjRevenue",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Revenue.class)
	private List<Q88_VoyObj_Revenue> revenueList   = new ArrayList<Q88_VoyObj_Revenue>();
	
	@OneToMany(mappedBy = "voyObjExpense",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Expense.class)
	private List<Q88_VoyObj_Expense> expenseList   = new ArrayList<Q88_VoyObj_Expense>();
	
	@OneToMany(mappedBy = "voyObjBunker",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Bunker.class)
	private List<Q88_VoyObj_Bunker> bunkerList    = new ArrayList<Q88_VoyObj_Bunker>();

	@OneToMany(mappedBy = "voyObjRemark",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Remark.class)
	private List<Q88_VoyObj_Remark> remarkList     = new ArrayList<Q88_VoyObj_Remark>();
	
	@OneToMany(mappedBy = "voyObjOffhire",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Offhire.class)
	private List<Q88_VoyObj_Offhire> offhireList      = new ArrayList<Q88_VoyObj_Offhire>();

	@OneToOne(mappedBy = "voyObjTcRelet", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_VoyObj_Tcrelet tcReletDetail ;
	
	@OneToOne(mappedBy = "voyObjReview", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_VoyObj_Review review  ;

	

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

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
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

	public String getVesselImo() {
		return vesselImo;
	}

	public void setVesselImo(String vesselImo) {
		this.vesselImo = vesselImo;
	}

	public String getVesselId() {
		return vesselId;
	}

	public void setVesselId(String vesselId) {
		this.vesselId = vesselId;
	}

	public String getStartDateUtc() {
		return startDateUtc;
	}

	public void setStartDateUtc(String startDateUtc) {
		this.startDateUtc = startDateUtc;
	}

	public LocalDateTime getStart_DateUtc() {
		return start_DateUtc;
	}

	public void setStart_DateUtc(String start_DateUtc) {
		if(start_DateUtc !=null)
		this.start_DateUtc = LocalDateTime.parse(start_DateUtc);
	}

	public String getEndDateUtc() {
		return endDateUtc;
	}

	public void setEndDateUtc(String endDateUtc) {
		this.endDateUtc = endDateUtc;
	}

	public LocalDateTime getEnd_DateUtc() {
		return end_DateUtc;
	}

	public void setEnd_DateUtc(String end_DateUtc) {
		this.end_DateUtc = LocalDateTime.parse(end_DateUtc);
	}

	public String getModuleType() {
		return moduleType;
	}

	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	public Double getOffhireDays() {
		return offhireDays;
	}

	public void setOffhireDays(Double offhireDays) {
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

	public String getTcNumber() {
		return tcNumber;
	}

	public void setTcNumber(String tcNumber) {
		this.tcNumber = tcNumber;
	}

	public String getTcOutIdEncrypted() {
		return tcOutIdEncrypted;
	}

	public void setTcOutIdEncrypted(String tcOutIdEncrypted) {
		this.tcOutIdEncrypted = tcOutIdEncrypted;
	}

	public Q88_VoyObj_Rslt getResults() {
		return results;
	}

	public void setResults(Q88_VoyObj_Rslt results) {
		if(results == null) {
			if(this.results !=null) {
				this.results.setVoyObjResult(null);
			}
		}
		else {
			results.setVoyObjResult(this);
		}
		this.results = results;
	}
	
	

	public Q88_VoyObj_RsltFixed getResultsWhenFixed() {
		return resultsWhenFixed;
	}

	public void setResultsWhenFixed(Q88_VoyObj_RsltFixed resultsWhenFixed) {
		if(resultsWhenFixed ==null) {
			this.resultsWhenFixed.setVoyObjResultFixed(null);
		}
		else {
			resultsWhenFixed.setVoyObjResultFixed(this);
		}
		this.resultsWhenFixed = resultsWhenFixed;
	}

	
	public List<Q88_VoyObj_FixtureLst> getFixtureList() {
		return fixtureList;
	}

	public void addFixtureList(List<Q88_VoyObj_FixtureLst> fixtureList) {
		this.fixtureList = fixtureList;
	}

	
	public List<Q88_VoyObj_LegLst> getLegList() {
		return legList;
	}

	public void addLegList(List<Q88_VoyObj_LegLst> legList) {
		this.legList = legList;
	}
	

	public List<Q88_VoyObj_Revenue> getRevenueList() {
		return revenueList;
	}

	public void addRevenueList(List<Q88_VoyObj_Revenue> revenueList) {
		this.revenueList = revenueList;
	}

	public List<Q88_VoyObj_Expense> getExpenseList() {
		return expenseList;
	}

	public void addExpenseList(List<Q88_VoyObj_Expense> expenseList) {
		this.expenseList = expenseList;
	}

	public List<Q88_VoyObj_Bunker> getBunkerList() {
		return bunkerList;
	}

	public void addBunkerList(List<Q88_VoyObj_Bunker> bunkerList) {
		this.bunkerList = bunkerList;
	}

	public List<Q88_VoyObj_Remark> getRemarkList() {
		return remarkList;
	}

	public void addRemarkList(List<Q88_VoyObj_Remark> remarkList) {
		this.remarkList = remarkList;
	}

	public List<Q88_VoyObj_Offhire> getOffhireList() {
		return offhireList;
	}

	public void addOffhireList(List<Q88_VoyObj_Offhire> offhireList) {
		this.offhireList = offhireList;
	}

	public Q88_VoyObj_Tcrelet getTcReletDetail() {
		return tcReletDetail;
	}

	public void setTcReletDetail(Q88_VoyObj_Tcrelet tcReletDetail) {
		if(tcReletDetail ==null) {
			this.tcReletDetail.setVoyObjTcRelet(null);
		}
		else {
			tcReletDetail.setVoyObjTcRelet(this);
		}
		this.tcReletDetail = tcReletDetail;
	}

	public Q88_VoyObj_Review getReview() {
		return review;
	}

	public void setReview(Q88_VoyObj_Review review) {
		
		this.review = review;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", version=" + version
				+ ", voyageNumber=" + voyageNumber + ", vesselName=" + vesselName + ", vesselImo=" + vesselImo
				+ ", vesselId=" + vesselId + ", startDateUtc=" + startDateUtc + ", start_DateUtc=" + start_DateUtc
				+ ", endDateUtc=" + endDateUtc + ", end_DateUtc=" + end_DateUtc + ", moduleType=" + moduleType
				+ ", offhireDays=" + offhireDays + ", tags=" + tags + ", url=" + url + ", isEstimate=" + isEstimate
				+ ", tcNumber=" + tcNumber + ", tcOutIdEncrypted=" + tcOutIdEncrypted + ", results=" + results
				+ ", resultsWhenFixed=" + resultsWhenFixed + ", fixtureList=" + fixtureList + ", legList=" + legList
				+ ", revenueList=" + revenueList + ", expenseList=" + expenseList + ", bunkerList=" + bunkerList
				+ ", remarkList=" + remarkList + ", offhireList=" + offhireList + ", tcReletDetail=" + tcReletDetail
				+ ", review=" + review + "]";
	}

	

	
	



	

	
	
	
}
