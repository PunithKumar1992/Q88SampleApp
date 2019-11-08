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
@Table(name = "Q88_VOYAGERESULTDETAIL")
public class Q88_VoyageResultDetail {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "VOYAGERESULTDTL_SEQID")
	private Number voyageresultdtl_seqid;
	@Column(name = "CLASSIFICATIONNAME")
	private String classificationName;
	@Column(name = "CLASSIFICATIONTOTAL")
	private Number classificationTotal;
	@Column(name = "VOYAGE_RES_SEQID")
	private Number voyage_res_seqid;
	
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumn(name="voyage_res_seqid",referencedColumnName ="VOYAGE_RES_SEQID",insertable=false, updatable=false)
	private Q88_VoyageResult q88voyageresult;

	public Number getVoyageresultdtl_seqid() {
		return voyageresultdtl_seqid;
	}

	public void setVoyageresultdtl_seqid(Number voyageresultdtl_seqid) {
		this.voyageresultdtl_seqid = voyageresultdtl_seqid;
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

	public Number getVoyage_res_seqid() {
		return voyage_res_seqid;
	}

	public void setVoyage_res_seqid(Number voyage_res_seqid) {
		this.voyage_res_seqid = voyage_res_seqid;
	}

	public Q88_VoyageResult getQ88voyageresult() {
		return q88voyageresult;
	}

	public void setQ88voyageresult(Q88_VoyageResult q88voyageresult) {
		this.q88voyageresult = q88voyageresult;
	}

	@Override
	public String toString() {
		return "Q88_VoyageResultDetail [voyageresultdtl_seqid=" + voyageresultdtl_seqid + ", classificationName="
				+ classificationName + ", classificationTotal=" + classificationTotal + ", voyage_res_seqid="
				+ voyage_res_seqid + ", q88voyageresult=" + q88voyageresult + "]";
	}

	
	
	
}
