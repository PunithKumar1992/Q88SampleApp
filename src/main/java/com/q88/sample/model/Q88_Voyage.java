package com.q88.sample.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_VOYAGE")
public class Q88_Voyage {
	
	@Column(name = "VOYAGEID")
	@Id
	@GeneratedValue
	private String voyageid;
	@Column(name = "VOYAGENUMBER")
	@Id
	@GeneratedValue
	private String voyagenumber;
	@Column(name = "VESSELID")
	@Id
	@GeneratedValue
	private String vesselid;
	@Column(name = "VERSION")
	private double version;
	@Column(name = "VESSELNAME")
	private String vesselname;
	@Column(name = "VESSELIMO")
	private String vesselimo;
	@Column(name = "STARTDATEUTC")
	private String startdateutc;
	@Column(name = "ENDDATEUTC")
	private String enddateutc;
	@Column(name = "MODULETYPE")
	private String moduletype;
	@Column(name = "OFFHIREDAYS")
	private double offhiredays;
	@Column(name = "TAGS")
	private String tags;
	@Column(name = "URL")
	private String url;
	@Column(name = "ISESTIMATE")
	private String isestimate;
	@Column(name = "TCNUMBER")
	private String tcnumber;
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcoutidencrypted;

	@OneToOne(mappedBy = "q88voyageres")
	private Q88_VoyageResult  results;
	
	@OneToOne(mappedBy = "q88voyageresfix")
	private Q88_VoyageResult  resultsWhenFixed;
	
	
	@OneToMany(mappedBy = "q88voyagefixture")
	private List<Q88_Fixture> fixtureList = new ArrayList<Q88_Fixture>();
	
	@OneToMany(mappedBy = "q88voyageleg")
	private List<Q88_Leg> legList = new ArrayList<Q88_Leg>();
	
	@OneToMany(mappedBy = "q88voyagerevenue")
	private List<Q88_Revenue> revenueList = new ArrayList<Q88_Revenue>();
	
	@OneToMany(mappedBy = "q88voyageexpense")
	private List<Q88_Expense> expenseList = new ArrayList<Q88_Expense>();
	
	@OneToMany(mappedBy = "q88voyageremark")
	private List<Q88_Remark> remarkList = new ArrayList<Q88_Remark>();
	
	@OneToMany(mappedBy = "q88voyageoffhire")
	private List<Q88_Offhire> offhireList = new ArrayList<Q88_Offhire>();
	
	@OneToOne(mappedBy = "q88tcreletdetail")
	private Q88_TcReletDetail  tcReletDetail;
	
	@OneToOne(mappedBy = "q88voyagereview")
	private Q88_VoyageReview  review;
	
}
