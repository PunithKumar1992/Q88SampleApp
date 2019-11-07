package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_BUNKERROB")
public class Q88_BunkerRob {
	
	@Column(name = "BUNKERGRADENAME")
	private String bunkergradename;
	@Column(name = "ARRIVALROBQUANTITY")
	private int arrivalrobquantity;	
	@Column(name = "DEPARTUREROBQUANTITY")
	private int departurerobquantity;
	@Column(name = "LEGSEQ_ID")
	private int legseq_id;	
	
	@ManyToOne
	@JoinColumn(name="legseq_id",insertable=false, updatable=false)
	private Q88_Leg q88bunkerrobleg;


}
