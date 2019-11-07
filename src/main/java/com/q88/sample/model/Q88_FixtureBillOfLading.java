package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_FIXTUREBILLOFLADING")
public class Q88_FixtureBillOfLading {

	@Column(name = "BILLOFLADINGDATE")
	private String billofladingdate;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "DISPLAYORDER")
	private int displayorder;
	@Column(name = "FIXTUREGRADENAME")
	private String fixturegradename;
	@Column(name = "PORTNAME")
	private String portname;
	@Column(name = "PORTID")
	private int portid;
	@Column(name = "FIXTUREPORTLINKTOKEN")
	private String fixtureportlinktoken;
	@Column(name = "QUANTITYBBLS")
	private int quantitybbls;
	@Column(name = "QUANTITYMT")
	private int quantitymt;
	@Column(name = "SHIPPER")
	private String shipper;
	@Column(name = "VOYAGEFIXTUREGRADEDISPLAYORDER")
	private int voyagefixturegradedisplayorder;
	@Column(name = "FIXTURELISTSEQ_ID")
	private int fixturelistseq_id;
	
	@ManyToOne
	@JoinColumn(name="fixturelistseq_id",insertable=false, updatable=false)
	private Q88_Fixture q88fixturebill;
}
