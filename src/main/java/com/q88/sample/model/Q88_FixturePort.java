package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_FIXTUREPORT")
public class Q88_FixturePort {
	
	@Column(name = "PORTID")
	private int portid;
	@Column(name = "PORTNAME")
	private String portname;
	@Column(name = "DISPLAYORDER")
	private int displayorder;
	@Column(name = "ACTIVITYTYPE")
	private String activitytype;
	@Column(name = "FIXTUREPORTLINKTOKEN")
	private String fixtureportlinktoken;
	@Column(name = "FIXTURELISTSEQ_ID")
	private int fixturelistseq_id;
	
	@ManyToOne
	@JoinColumn(name="fixturelistseq_id",insertable=false, updatable=false)
	private Q88_Fixture q88fixtureport;

}
