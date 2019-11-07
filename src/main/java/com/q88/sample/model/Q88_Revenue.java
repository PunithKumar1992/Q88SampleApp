package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_REVENUE")
public class Q88_Revenue {
	
	@Column(name = "ACCRUAL")
	private int accrual;
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
	@Column(name = "VOYAGEID")
	private String  voyageid;	
	@Column(name = "VOYAGENUMBER")
	private String  voyagenumber;
	@Column(name = "VESSELID")
	private String  vesselid;	
	
	@ManyToOne
	@JoinColumn(name="voyageid",insertable=false, updatable=false)
	@JoinColumn(name="voyagenumber",insertable=false, updatable=false)
	@JoinColumn(name="vesselid",insertable=false, updatable=false)
	private Q88_Voyage q88voyagerevenue;





}
