package com.bsol.q88.model;

import java.io.Serializable;

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

import com.bsol.q88.model.cpk.Q88_VoyObj_RsltDtlCPK;

@Entity
@Table(name = "Q88_VOYOBJ_RSLTDTL")
@IdClass(Q88_VoyObj_RsltDtlCPK.class)
public class Q88_VoyObj_RsltDtl implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "VOYOBJ_RESDTL_SEQID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer voyObj_ResDtl_SeqId;
	
	@Column(name = "CLASSIFICATIONNAME")
	private String classificationName;
	
	@Column(name = "CLASSIFICATIONTOTAL")
	private Double classificationTotal;
	
	@ManyToOne(optional = true,fetch = FetchType.EAGER)
	@JoinColumns({
		@JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		@JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	})
	private Q88_VoyObj_Rslt voyObjRsltDtl;

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
	

	public Integer getVoyObj_ResDtl_SeqId() {
		return voyObj_ResDtl_SeqId;
	}

	public void setVoyObj_ResDtl_SeqId(Integer voyObj_ResDtl_SeqId) {
		this.voyObj_ResDtl_SeqId = voyObj_ResDtl_SeqId;
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

	public Q88_VoyObj_Rslt getVoyObjRsltDtl() {
		return voyObjRsltDtl;
	}

	public void setVoyObjRsltDtl(Q88_VoyObj_Rslt voyObjRsltDtl) {
		this.voyObjRsltDtl = voyObjRsltDtl;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_RsltDtl [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", voyObj_ResDtl_SeqId="
				+ voyObj_ResDtl_SeqId + ", classificationName=" + classificationName + ", classificationTotal="
				+ classificationTotal + "]";
	}

	
	
	
	
	
	
	

}
