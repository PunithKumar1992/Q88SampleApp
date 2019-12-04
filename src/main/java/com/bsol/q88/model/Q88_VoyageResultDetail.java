/*package com.bsol.q88.model;

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
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VoyageResultDetailCPK;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "Q88_VOYAGE_RESULTDETAIL",schema = "CHOPS_WEB")
@IdClass(Q88_VoyageResultDetailCPK.class)
public class Q88_VoyageResultDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "VOYAGE_RESDTLSEQID")
	private Integer voyage_ResDtl_SeqId;
	
	@Id
	@Column(name = "VOYAGE_TRANS_ID")
	private Integer voyageTrans_Id;

	@Id
	@Column(name = "VOYAGE_ID")
	private String voyageId;
	
	@Id
	@Column(name = "VESSEL_ID")
	private String vesselId;
	
	
	@Column(name = "CLASSIFICATIONNAME")
	private String classificationName;
	
	@Column(name = "CLASSIFICATIONTOTAL")
	private Double classificationTotal;
	
	
	@JsonBackReference
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="voyageTrans_Id",referencedColumnName ="VOYAGE_TRANS_ID",insertable = false,updatable = false),
		@JoinColumn(name="voyageId",referencedColumnName ="VOYAGE_ID",insertable = false,updatable = false),
		@JoinColumn(name="vesselId",referencedColumnName ="VESSEL_ID",insertable = false,updatable = false)
	})
	private Q88_VoyageResult q88voyageresult;



	public Integer getVoyage_ResDtl_SeqId() {
		return voyage_ResDtl_SeqId;
	}


	public void setVoyage_ResDtl_SeqId(Integer voyage_ResDtl_SeqId) {
		this.voyage_ResDtl_SeqId = voyage_ResDtl_SeqId;
	}


	public Integer getVoyageTrans_Id() {
		return voyageTrans_Id;
	}


	public void setVoyageTrans_Id(Integer voyageTrans_Id) {
		this.voyageTrans_Id = voyageTrans_Id;
	}


	public String getVoyageId() {
		return voyageId;
	}


	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}


	public String getVesselId() {
		return vesselId;
	}


	public void setVesselId(String vesselId) {
		this.vesselId = vesselId;
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


	public Q88_VoyageResult getQ88voyageresult() {
		return q88voyageresult;
	}


	public void setQ88voyageresult(Q88_VoyageResult q88voyageresult) {
		this.q88voyageresult = q88voyageresult;
	}


	@Override
	public String toString() {
		return "Q88_VoyageResultDetail [voyage_ResDtl_SeqId=" + voyage_ResDtl_SeqId + ", voyageTrans_Id="
				+ voyageTrans_Id + ", voyageId=" + voyageId + ", vesselId=" + vesselId + ", classificationName="
				+ classificationName + ", classificationTotal=" + classificationTotal + "]";
	}

	
	
}*/
