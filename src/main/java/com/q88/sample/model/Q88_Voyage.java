package com.q88.sample.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_VOYAGE")
public class Q88_Voyage implements Serializable{
	
	@Column(name = "VOYAGEID")
	@Id
	private String voyageId;
	@Column(name = "VOYAGENUMBER")
	@Id
	private String voyageNumber;
	@Column(name = "VESSELID")
	@Id
	private String vesselId;
	@Column(name = "VERSION")
	private Number version;
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

	
	
}
