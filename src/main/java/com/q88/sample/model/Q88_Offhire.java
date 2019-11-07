package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_OFFHIRE")
public class Q88_Offhire {

	 @Column(name = "OFFHIRESEQ_ID")
	 private int offhireseq_id;
	 @Column(name = "DATESTARTUTC")
	 private String datestartutc;
	 @Column(name = "DATEENDUTC")
	 private String dateendutc;
	 @Column(name = "DAYS")
	 private double days;
	 @Column(name = "DISPLAYORDER")
	 private int displayorder;
	 @Column(name = "OFFHIREREASON")
	 private String  offhirereason;	
	 @Column(name = "REMARK")
	 private String  remark;	
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
	 private Q88_Voyage q88voyageoffhire;
	 


	  
	
	
}
