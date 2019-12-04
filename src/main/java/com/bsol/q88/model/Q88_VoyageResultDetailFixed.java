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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.bsol.q88.model.cpk.Q88_VoyageResultDetailFixedCPK;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Entity
@IdClass(Q88_VoyageResultDetailFixedCPK.class)
@Table(name = "Q88_VOYAGE_RESULTDETAILFIXED",schema = "CHOPS_WEB")
@JsonInclude(Include.NON_NULL)
public class Q88_VoyageResultDetailFixed  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "VOYAGERESFIXED_SEQID")
	private Integer voyageresfixed_seqid;
	@Column(name = "CLASSIFICATIONNAME")
	private String classificationName;
	@Column(name = "CLASSIFICATIONTOTAL")
	private Double classificationTotal;
	
	@Column(name = "VOYAGE_RESFIXED_SEQID")
	private Integer voyage_resfixed_seqid;
	
	
	@ManyToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="voyage_resfixed_seqid",referencedColumnName = "VOYAGE_RESFIXED_SEQID",insertable=false, updatable=false),
		@JoinColumn(name="voyageid",referencedColumnName = "VOYAGEID",insertable=false, updatable=false),
		@JoinColumn(name="vesselid",referencedColumnName = "VESSELID",insertable=false, updatable=false)
	})
	
	private Q88_VoyageResultFixed q88voyageresultfixed;

	@Id
	@Column(name = "VOYAGEID")
	private String  voyageid;
	
	@Id
	@Column(name = "VESSELID")
	private String  vesselid;

	public Integer getVoyageresfixed_seqid() {
		return voyageresfixed_seqid;
	}

	public void setVoyageresfixed_seqid(Integer voyageresfixed_seqid) {
		this.voyageresfixed_seqid = voyageresfixed_seqid;
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

	public Integer getVoyage_resfixed_seqid() {
		return voyage_resfixed_seqid;
	}

	public void setVoyage_resfixed_seqid(Integer voyage_resfixed_seqid) {
		this.voyage_resfixed_seqid = voyage_resfixed_seqid;
	}

	public Q88_VoyageResultFixed getQ88voyageresultfixed() {
		return q88voyageresultfixed;
	}

	public void setQ88voyageresultfixed(Q88_VoyageResultFixed q88voyageresultfixed) {
		this.q88voyageresultfixed = q88voyageresultfixed;
	}

	public String getVoyageid() {
		return voyageid;
	}

	public void setVoyageid(String voyageid) {
		this.voyageid = voyageid;
	}

	public String getVesselid() {
		return vesselid;
	}

	public void setVesselid(String vesselid) {
		this.vesselid = vesselid;
	}

	@Override
	public String toString() {
		return "Q88_VoyageResultDetailFixed [voyageresfixed_seqid=" + voyageresfixed_seqid + ", classificationName="
				+ classificationName + ", classificationTotal=" + classificationTotal + ", voyage_resfixed_seqid="
				+ voyage_resfixed_seqid + ", voyageid=" + voyageid + ", vesselid=" + vesselid + "]";
	}
	
	


	
	
	
}
*/