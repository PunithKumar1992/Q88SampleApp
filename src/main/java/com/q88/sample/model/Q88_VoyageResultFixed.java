package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_VOYAGERESULTFIXED")
public class Q88_VoyageResultFixed {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "VOYAGE_RESFIXED_SEQID")
	private int voyage_resfixed_seqid;
	@Column(name = "BUNKERS")
	private double bunkers;
	@Column(name = "COMMISSION")
	private double commission;
	@Column(name = "DAYS")
	private double days;
	@Column(name = "EFFICIENCY")
	private double efficiency;
	@Column(name = "EXPENSE")
	private double expense;
	@Column(name = "EXPENSES")
	private double expenses;
	@Column(name = "MODIFIEDBYFULL")
	private String modifiedbyfull;
	@Column(name = "MODIFIEDDATE")
	private String modifieddate;
	@Column(name = "PNL")
	private double pnl;
	@Column(name = "PORT")
	private double port;
	@Column(name = "REVENUE")
	private double revenue;
	@Column(name = "SAILEDIN")
	private double sailedin;
	@Column(name = "TCE")
	private double tce;
	@Column(name = "VOYAGEID")
	private String  voyageid;
	@Column(name = "VOYAGENUMBER")
	private String 	voyagenumber;
	@Column(name = "VESSELID")
	private String  vesselid;
	
	@OneToOne(mappedBy = "q88voyageresultfixed")
	private Q88_VoyageResultDetailFixed resultDetail;
	
	
	@OneToOne
	@JoinColumn(name="voyageid",insertable=false, updatable=false)
	@JoinColumn(name="voyagenumber",insertable=false, updatable=false)
	@JoinColumn(name="vesselid",insertable=false, updatable=false)
	private Q88_Voyage q88voyageresfix;

	
	
}
