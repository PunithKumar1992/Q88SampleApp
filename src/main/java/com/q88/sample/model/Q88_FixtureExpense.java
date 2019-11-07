package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_FIXTUREREVENUE")
public class Q88_FixtureExpense {
	
	@Column(name = "AMOUNT")
	private int amount;
	@Column(name = "DAILY")
	private String daily;
	@Column(name = "DISPLAYORDER")
	private int displayorder;
	@Column(name = "FIXTUREDISPLAYORDER")
	private int fixturedisplayorder;
	@Column(name = "NAME")
	private  String name;
	@Column(name = "REMARK")
	private String remark;
	@Column(name = "TOTAL")
	private int total;
	@Column(name = "FIXTURELISTSEQ_ID")
	private int fixturelistseq_id;
	
	@ManyToOne
	@JoinColumn(name="fixturelistseq_id",insertable=false, updatable=false)
	private Q88_Fixture q88fixtureexpense;
	

}
