package com.bsol.q88.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VoyageCPK;

@Entity
@IdClass(Q88_VoyageCPK.class)
@Table(name = "Q88_VOYAGE")
public class Q88_Voyage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "VOYAGE_TRANS_ID")
	private Integer voyageTrans_Id;

	@Id
	@Column(name = "VOYAGE_ID")
	private String voyageId;
	
	@Id
	@Column(name = "VESSEL_ID")
	private String vesselId;
	
	@Column(name = "VERSION")
	private String version;
	
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
	private Double offhireDays;
	
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
		
			
	
	public Integer getVoyageTrans_Id() {
		return voyageTrans_Id;
	}
	public void setVoyageTrans_Id(Integer voyageTrans_Id) {
		this.voyageTrans_Id = voyageTrans_Id;
	}
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
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
		if(results == null) {
			if(this.results !=null) {
				this.results.setQ88voyageres(null);
			}
		}
		else {
			results.setQ88voyageres(this);
		}
		this.results = results;
	}

	@Override
	public String toString() {
		return "Q88_Voyage [voyageTrans_Id=" + voyageTrans_Id + ", voyageId=" + voyageId + ", vesselId=" + vesselId
				+ ", version=" + version + ", voyageNumber=" + voyageNumber + ", vesselName=" + vesselName
				+ ", vesselimo=" + vesselimo + ", startDateUtc=" + startDateUtc + ", endDateUtc=" + endDateUtc
				+ ", moduleType=" + moduleType + ", offhireDays=" + offhireDays + ", tags=" + tags + ", url=" + url
				+ ", isEstimate=" + isEstimate + ", tcnumber=" + tcnumber + ", tcoutidencrypted=" + tcoutidencrypted
				+ ", results=" + results + "]";
	}
	
	
	
	
	

 	/*
 	 @OneToOne(targetEntity =Q88_VoyageResultFixed.class,fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "q88voyageresfix",orphanRemoval = false)
	private Q88_VoyageResultFixed  resultsWhenFixed;
	
	@OneToMany(targetEntity = Q88_Fixture.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "q88voyagefixture",orphanRemoval = false)
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
	private Q88_VoyageReview  review;*/

	
	
}
