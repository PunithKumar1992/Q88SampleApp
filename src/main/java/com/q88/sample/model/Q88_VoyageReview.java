package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_VOYAGEREVIEW")
public class Q88_VoyageReview {
	
			@Column(name = "REVIEWSTATUS")
			private String reviewstatus;
			@Column(name = "REVIEWEDBY")
		    private String reviewedby;
			@Column(name = "REVIEWDATE")
		    private String reviewdate;
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
			private Q88_Voyage q88voyagereview;
			
			

}
