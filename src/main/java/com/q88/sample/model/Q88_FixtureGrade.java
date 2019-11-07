package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_FIXTUREGRADE")
public class Q88_FixtureGrade {

	@Column(name = "DISPLAYORDER")
	private int displayorder;
	@Column(name = "GRADENAME")
	private String gradename;
	@Column(name = "FIXTURELISTSEQ_ID")
	private int fixturelistseq_id;
	
	
	private Q88_Fixture q88fixturegrades;
}
