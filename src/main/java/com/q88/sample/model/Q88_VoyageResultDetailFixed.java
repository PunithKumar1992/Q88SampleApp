package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Q88_VOYAGERESULTDETAILFIXED")
public class Q88_VoyageResultDetailFixed {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "VOYAGERESFIXED_SEQID")
	private Number voyageresfixed_seqid;
	@Column(name = "CLASSIFICATIONNAME")
	private String classificationName;
	@Column(name = "CLASSIFICATIONTOTAL")
	private Number classificationTotal;
	@Column(name = "VOYAGE_RESFIXED_SEQID")
	private Number voyage_resfixed_seqid;
	
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumn(name="voyage_resfixed_seqid",referencedColumnName = "VOYAGE_RESFIXED_SEQID",insertable=false, updatable=false)
	private Q88_VoyageResultFixed q88voyageresultfixed;

	public Number getVoyageresfixed_seqid() {
		return voyageresfixed_seqid;
	}

	public void setVoyageresfixed_seqid(Number voyageresfixed_seqid) {
		this.voyageresfixed_seqid = voyageresfixed_seqid;
	}

	public String getClassificationName() {
		return classificationName;
	}

	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}

	public Number getClassificationTotal() {
		return classificationTotal;
	}

	public void setClassificationTotal(Number classificationTotal) {
		this.classificationTotal = classificationTotal;
	}

	public Number getVoyage_resfixed_seqid() {
		return voyage_resfixed_seqid;
	}

	public void setVoyage_resfixed_seqid(Number voyage_resfixed_seqid) {
		this.voyage_resfixed_seqid = voyage_resfixed_seqid;
	}

	public Q88_VoyageResultFixed getQ88voyageresultfixed() {
		return q88voyageresultfixed;
	}

	public void setQ88voyageresultfixed(Q88_VoyageResultFixed q88voyageresultfixed) {
		this.q88voyageresultfixed = q88voyageresultfixed;
	}

	@Override
	public String toString() {
		return "Q88_VoyageResultDetailFixed [voyageresfixed_seqid=" + voyageresfixed_seqid + ", classificationName="
				+ classificationName + ", classificationTotal=" + classificationTotal + ", voyage_resfixed_seqid="
				+ voyage_resfixed_seqid + ", q88voyageresultfixed=" + q88voyageresultfixed + "]";
	}

	
	
	
}
