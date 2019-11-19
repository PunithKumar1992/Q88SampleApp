package com.bsol.q88.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_REMARK",schema = "CHOPS_WEB")
public class Q88_Remark implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "REMARK_SEQID")
	private Integer remark_seqid;
	@Column(name = "MODIFIEDDATE")
	private String modifiedDate ;
	@Column(name = "MODIFIEDBYFULL")
	private String modifiedByFull ;	
	@Column(name = "REMARK")
	private String remark ;		
	@Column(name = "VOYAGEID")
	private String voyageid;	
	@Column(name = "VESSELID")
	private String vesselid;		
	
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="voyageid",referencedColumnName = "VOYAGEID",insertable=false, updatable=false),
		@JoinColumn(name="vesselid",referencedColumnName = "VESSELID",insertable=false, updatable=false)
	})
	private Q88_Voyage q88voyageremark;


	public Integer getRemark_seqid() {
		return remark_seqid;
	}


	public void setRemark_seqid(Integer remark_seqid) {
		this.remark_seqid = remark_seqid;
	}


	public String getModifiedDate() {
		return modifiedDate;
	}


	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	public String getModifiedByFull() {
		return modifiedByFull;
	}


	public void setModifiedByFull(String modifiedByFull) {
		this.modifiedByFull = modifiedByFull;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
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


	public Q88_Voyage getQ88voyageremark() {
		return q88voyageremark;
	}


	public void setQ88voyageremark(Q88_Voyage q88voyageremark) {
		this.q88voyageremark = q88voyageremark;
	}


	@Override
	public String toString() {
		return "Q88_Remark [remark_seqid=" + remark_seqid + ", modifiedDate=" + modifiedDate + ", modifiedByFull="
				+ modifiedByFull + ", remark=" + remark + ", voyageid=" + voyageid 
				+ ", vesselid=" + vesselid + ", q88voyageremark=" + q88voyageremark + "]";
	}


	

}
