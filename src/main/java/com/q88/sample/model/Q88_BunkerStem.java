package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_BUNKERSTEM")
public class Q88_BunkerStem {
	
	@Column(name = "STEMSTATUS")
	private String stemstatus;	
	@Column(name = "BUNKERGRADENAME")
	private String bunkergradename;	
	@Column(name = "QTYPLANNED")
	private int qtyplanned;
	@Column(name = "STEMMEDDATE")
	private String stemmeddate;
	@Column(name = "STEMNUMBER")
	private String stemnumber;	
	@Column(name = "STEMTERMS")
	private String stemterms;		
	@Column(name = "STEMSUPPLIERNAME")
	private String stemsuppliername;
	@Column(name = "STEMBROKERNAME")
	private String stembrokername;	
	@Column(name = "PERTONPRICE")
	private int pertonprice;
	@Column(name = "DELIVERYCOST")
	private int deliverycost;
	@Column(name = "QTYSTEMMED")
	private int qtystemmed;	
	@Column(name = "QTYRECEIVED")
	private int qtyreceived;
	@Column(name = "DELIVERYDATE")
	private String deliverydate;
	@Column(name = "STEMDUEDATE")
	private String stemduedate;	
	@Column(name = "STEMTOTALCOST")
	private int stemtotalcost;
	@Column(name = "TOTALPERTONCOST")
	private int totalpertoncost;
	@Column(name = "LEGSEQ_ID")
	private int legseq_id;	
	
	@ManyToOne
	@JoinColumn(name="legseq_id",insertable=false, updatable=false)
	private Q88_Leg q88bunkerleg;





}
