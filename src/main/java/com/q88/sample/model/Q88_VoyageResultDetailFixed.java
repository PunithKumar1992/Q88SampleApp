package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Q88_VOYAGERESULTDETAILFIXED")
public class Q88_VoyageResultDetailFixed {
	
	@Column(name = "CLASSIFICATIONNAME")
	private String classificationname;
	@Column(name = "CLASSIFICATIONTOTAL")
	private double classificationtotal;
	@Column(name = "VOYAGE_RESFIXED_SEQID")
	private int voyage_resfixed_seqid;
	
	@OneToOne
	@JoinColumn(name="voyage_resfixed_seqid",insertable=false, updatable=false)
	private Q88_VoyageResultFixed q88voyageresultfixed;

	
	
	

}
