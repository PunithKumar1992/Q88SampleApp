package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_TCRELETDETAIL")
public class Q88_TcReletDetail {
	
	@Column(name = "FIXTUREREMARKS")
	private String  fixtureremarks;	
	@Column(name = "DELIVERYDATETIMEZ")
	private String  deliverydatetimez;	
	@Column(name = "DELIVERYLEGNAME")
	private String  deliverylegname;
	@Column(name = "REDELIVERYDATETIMEZ")
	private String  redeliverydatetimez;	
	@Column(name = "REDELIVERYLEGNAME")
	private String  redeliverylegname;	
	@Column(name = "TCRELETDURATION")
	private int tcreletduration;
	@Column(name = "TCRELETDURATIONUNIT")
	private String tcreletdurationunit;	
	@Column(name = "VOYAGEID")
	private String voyageid;
	@Column(name = "VOYAGENUMBER")
	private String voyagenumber;	
	@Column(name = "VESSELID")
	private String vesselid;		
	
	@OneToOne
	@JoinColumn(name="voyageid",insertable=false, updatable=false)
	@JoinColumn(name="voyagenumber",insertable=false, updatable=false)
	@JoinColumn(name="vesselid",insertable=false, updatable=false)
	private Q88_Voyage q88tcreletdetail;



}
