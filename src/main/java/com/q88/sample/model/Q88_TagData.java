package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TAGDATA")
public class Q88_TagData {
	
	@Column(name = "CATEGORY")
	private String category;
	@Column(name = "VALUE")
	private String value;
	@Column(name = "FIXTURELISTSEQ_ID")
	private int fixturelistseq_id;
	
	
	@ManyToOne
	@JoinColumn(name="fixturelistseq_id",insertable=false, updatable=false)
	private Q88_Fixture q88fixturetagdata;
	

}
