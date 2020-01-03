package com.bsol.q88.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VoyObj_RsltFixedDtlCPK;


@Entity
@Table(name = "Q88_VOYOBJ_RSLTFIXEDDTL")
@IdClass(Q88_VoyObj_RsltFixedDtlCPK.class)
public class Q88_VoyObj_RsltFixedDtl {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "VOYOBJ_RESFIXDTL_SEQID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer voyObj_ResFixDtl_SeqId;
	
	@Column(name = "CLASSIFICATIONNAME")
	private String classificationName;
	
	@Column(name = "CLASSIFICATIONTOTAL")
	private Double classificationTotal;
	
	@ManyToOne(optional = true,fetch = FetchType.EAGER)
	@JoinColumns({
		@JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		@JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	})
	private Q88_VoyObj_RsltFixed voyObjRsltFixedDtl;

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getVoyageId() {
		return voyageId;
	}

	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}

	public Integer getVoyObj_ResFixDtl_SeqId() {
		return voyObj_ResFixDtl_SeqId;
	}

	public void setVoyObj_ResFixDtl_SeqId(Integer voyObj_ResFixDtl_SeqId) {
		this.voyObj_ResFixDtl_SeqId = voyObj_ResFixDtl_SeqId;
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

	public Q88_VoyObj_RsltFixed getVoyObjRsltFixedDtl() {
		return voyObjRsltFixedDtl;
	}

	public void setVoyObjRsltFixedDtl(Q88_VoyObj_RsltFixed voyObjRsltFixedDtl) {
		this.voyObjRsltFixedDtl = voyObjRsltFixedDtl;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_RsltFixedDtl [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", voyObj_ResFixDtl_SeqId="
				+ voyObj_ResFixDtl_SeqId + ", classificationName=" + classificationName + ", classificationTotal="
				+ classificationTotal + "]";
	}
	
	
	

}
