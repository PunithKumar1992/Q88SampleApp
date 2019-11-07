package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_FIXTURECOMMISSION")
public class Q88_FixtureCommission {
	
	@Column(name = "COMMISSIONTYPE")
	private String commissiontype;
	@Column(name = "ORGANIZATIONGROUPNAME")
	private String organizationgroupname;
	@Column(name = "ORGANIZATIONNAME")
	private String organizationname;
	@Column(name = "ORGANIZATIONEXTERNALID")
	private String organizationexternalid;
	@Column(name = "RATE")
	private float rate;
	@Column(name = "FIXTURELISTSEQ_ID")
	private int fixturelistseq_id;
	
	@ManyToOne
	@JoinColumn(name="fixturelistseq_id",insertable=false, updatable=false)
	private Q88_Fixture q88fixturecommision;
	

}
