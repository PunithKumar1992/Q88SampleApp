package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_VOYAGERESULTDETAIL")
public class Q88_VoyageResultDetail {
	
	@Column(name = "CLASSIFICATIONNAME")
	private String classificationName;
	@Column(name = "CLASSIFICATIONTOTAL")
	private double classificationTotal;
	@Column(name = "VOYAGE_RES_SEQID")
	private int voyage_res_seqId;
	
	@OneToOne
	@JoinColumn(name="voyage_res_seqId",insertable=false, updatable=false)
	private Q88_VoyageResult q88voyageresult;

	
	
}
