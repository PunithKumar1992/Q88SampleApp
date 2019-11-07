package com.q88.sample.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_FIXTURE")
public class Q88_Fixture {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "FIXTURELISTSEQ_ID")
	private int fixturelistseq_id;
	@Column(name = "CPDATE")
	private String cpdate;
	@Column(name = "CPQUANTITY")
	private double cpquantity;
	@Column(name = "DEMURRAGE")
	private double  demurrage;
	@Column(name = "DISPLAYORDER")
	private int displayorder;
	@Column(name = "FIXTURENUMBER")
	private String fixturenumber;
	@Column(name = "FIXTUREREMARK")
	private String  fixtureremark;
	@Column(name = "GRADES")
	private String  grades;
	@Column(name = "LAYCANDATEEND")
	private String	laycandateend;
	@Column(name = "LAYCANDATESTART")
	private String	laycandatestart;
	@Column(name = "LAYTIME")
	private int laytime;
	@Column(name = "OTHERTIMEBAR")
	private int othertimebar;
	@Column(name = "OVERAGE")
	private int overage;
	@Column(name = "TIMEBAR")
	private String timebar;
	@Column(name = "TAGS")
	private String tags;
	@Column(name = "VOYAGEID")
	private String voyageid;
	@Column(name = "VOYAGENUMBER")
	private String voyagenumber;
	@Column(name = "VESSELID")
	private String vesselid;
	
	@OneToMany(mappedBy ="q88fixturebill" )
	private List<Q88_FixtureBillOfLading> fixtureList = new ArrayList<Q88_FixtureBillOfLading>();
	
	@OneToMany(mappedBy ="q88fixturecommision" )
	private List<Q88_FixtureCommission> fixtureCommissions = new ArrayList<Q88_FixtureCommission>();
	
	@OneToMany(mappedBy ="q88fixturegrades" )
	private List<Q88_FixtureGrade> fixtureGrades = new ArrayList<Q88_FixtureGrade>();
	
	@OneToMany(mappedBy = "q88fixtureport")
	private List<Q88_FixturePort> fixturePorts = new ArrayList<Q88_FixturePort>();
	
	@OneToMany(mappedBy = "q88fixturerevenue")
	private List<Q88_FixtureRevenue> fixtureRevenueList = new ArrayList<Q88_FixtureRevenue>();
	
	@OneToMany(mappedBy = "q88fixtureexpense")
	private List<Q88_FixtureExpense> fixtureExpenseList = new ArrayList<Q88_FixtureExpense>();
	
	
	@OneToMany(mappedBy = "q88fixturetagdata")
	private List<Q88_TagData> tagList;
	
	@ManyToOne
	@JoinColumn(name="voyageid",insertable=false, updatable=false)
	@JoinColumn(name="voyagenumber",insertable=false, updatable=false)
	@JoinColumn(name="vesselid",insertable=false, updatable=false)
	private Q88_Voyage q88voyagefixture;
	
	
}

