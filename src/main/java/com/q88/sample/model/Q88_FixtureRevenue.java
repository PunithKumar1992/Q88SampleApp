package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_FIXTUREREVENUE")
public class Q88_FixtureRevenue {
	
	@Column(name = "ACCRUAL")
	private int accrual	;	
	@Column(name = "DISPLAYORDER")
	private int displayorder;		
	@Column(name = "FIXTUREDISPLAYORDER")
	private int fixturedisplayorder;	
	@Column(name = "FLATRATE")
	private int flatrate;		
	@Column(name = "ISCOMMISSION")
	private String iscommission;		
	@Column(name = "NAME")
	private String name;
	@Column(name = "QUANTITY")
	private int quantity;			
	@Column(name = "REMARK")
	private String remark;	
	@Column(name = "TOTAL")
	private int total;	
	@Column(name = "TOTALACCRUED")
	private int totalaccrued;	
	@Column(name = "WS")
	private int ws;		
	@Column(name = "FIXTURELISTSEQ_ID")
	private int fixturelistseq_id;			
	
	@ManyToOne
	@JoinColumn(name="fixturelistseq_id",insertable=false, updatable=false)
	private Q88_Fixture q88fixturerevenue;

}
