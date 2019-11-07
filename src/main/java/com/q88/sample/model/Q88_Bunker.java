package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_BUNKER")
public class Q88_Bunker {
	
	@Column(name = "AVERAGECONSUMPTIONCOST")
	private double averageconsumptioncost;
	@Column(name = "BUNKERGRADENAME")
	private String bunkergradename;
	@Column(name = "CONSCOST")
	private double conscost;	
	@Column(name = "CONSTOTAL")
	private double constotal;
	@Column(name = "DISPLAYORDER")
	private int displayorder;
	@Column(name = "REFILLPRICE")
	private double refillprice;			
	@Column(name = "REMAINDERCONSCOST")
	private double remainderconscost;	
	@Column(name = "TOTALCOST")
	private double totalcost;
	@Column(name = "VOYAGEID")
	private String voyageid;		
	@Column(name = "VOYAGENUMBER")
	private String voyagenumber;	
	@Column(name = "VESSELID")
	private String vesselid;		
	
	@ManyToOne
	@JoinColumn(name="voyageid",insertable=false, updatable=false)
	@JoinColumn(name="voyagenumber",insertable=false, updatable=false)
	@JoinColumn(name="vesselid",insertable=false, updatable=false)
	private Q88_Voyage q88voyagebunker;




}
