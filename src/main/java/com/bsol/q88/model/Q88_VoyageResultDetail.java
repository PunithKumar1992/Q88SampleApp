package com.bsol.q88.model;

import java.io.Serializable;

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
@Table(name = "Q88_VOYAGE_RESULTDETAIL",schema = "CHOPS_WEB")
public class Q88_VoyageResultDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "VOYAGERESULTDTL_SEQID")
	private Integer voyageresultdtl_seqid;
	@Column(name = "CLASSIFICATIONNAME")
	private String classificationName;
	@Column(name = "CLASSIFICATIONTOTAL")
	private Double classificationTotal;
	@Column(name = "VOYAGE_RES_SEQID")
	private Double voyage_res_seqid;
	
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumn(name="voyage_res_seqid",nullable = false, referencedColumnName ="VOYAGE_RES_SEQID",insertable=false, updatable=false)
	private Q88_VoyageResult q88voyageresult;

	public Integer getVoyageresultdtl_seqid() {
		return voyageresultdtl_seqid;
	}

	public void setVoyageresultdtl_seqid(Integer voyageresultdtl_seqid) {
		this.voyageresultdtl_seqid = voyageresultdtl_seqid;
	}

	public String getClassificationName() {
		return classificationName;
	}

	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}

	public Double getClassificationTotal() {
		return classificationTotal;
	}

	public void setClassificationTotal(Double classificationTotal) {
		this.classificationTotal = classificationTotal;
	}

	public Double getVoyage_res_seqid() {
		return voyage_res_seqid;
	}

	public void setVoyage_res_seqid(Double voyage_res_seqid) {
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
