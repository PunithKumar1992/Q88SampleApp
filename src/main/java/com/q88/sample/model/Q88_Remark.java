package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_REMARK")
public class Q88_Remark {
	
	@Column(name = "MODIFIEDDATE")
	private String modifieddate;
	@Column(name = "MODIFIEDBYFULL")
	private String modifiedbyfull;	
	@Column(name = "REMARK")
	private String remark;		
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
	private Q88_Voyage q88voyageremark;
	
	

}
