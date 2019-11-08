package com.q88.sample.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_OFFHIRE")
public class Q88_Offhire {

	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name = "OFFHIRESEQ_ID")
	 private Integer offhireseq_id;
	 @Column(name = "DATESTARTUTC")
	 private String dateStartUtc;
	 @Column(name = "DATEENDUTC")
	 private String dateEndUtc;
	 @Column(name = "DAYS")
	 private Number days;
	 @Column(name = "DISPLAYORDER")
	 private Integer displayOrder;
	 @Column(name = "OFFHIREREASON")
	 private String  offhireReason;	
	 @Column(name = "REMARK")
	 private String  remark;	
	 @Column(name = "VOYAGEID")
	 private String  voyageid;	
	 @Column(name = "VOYAGENUMBER")
	 private String  voyagenumber;	
	 @Column(name = "VESSELID")
	 private String  vesselid;		
	 
	 @OneToMany(targetEntity = Q88_OffhireBunker.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "q88offhirebunker",orphanRemoval = false)
	 private List<Q88_OffhireBunker> offhireBunkerList = new ArrayList<Q88_OffhireBunker>();
	 
	 @ManyToOne(optional = false,fetch = FetchType.LAZY)
	 @JoinColumns({
		 @JoinColumn(name="voyageid",referencedColumnName = "VOYAGEID",insertable=false, updatable=false),
		 @JoinColumn(name="voyagenumber",referencedColumnName = "VOYAGENUMBER",insertable=false, updatable=false),
		 @JoinColumn(name="vesselid",referencedColumnName = "VESSELID",insertable=false, updatable=false),
	 })
	 private Q88_Voyage q88voyageoffhire;

	public Integer getOffhireseq_id() {
		return offhireseq_id;
	}

	public void setOffhireseq_id(Integer offhireseq_id) {
		this.offhireseq_id = offhireseq_id;
	}

	public String getDateStartUtc() {
		return dateStartUtc;
	}

	public void setDateStartUtc(String dateStartUtc) {
		this.dateStartUtc = dateStartUtc;
	}

	public String getDateEndUtc() {
		return dateEndUtc;
	}

	public void setDateEndUtc(String dateEndUtc) {
		this.dateEndUtc = dateEndUtc;
	}

	public Number getDays() {
		return days;
	}

	public void setDays(Number days) {
		this.days = days;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getOffhireReason() {
		return offhireReason;
	}

	public void setOffhireReason(String offhireReason) {
		this.offhireReason = offhireReason;
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

	public String getVoyagenumber() {
		return voyagenumber;
	}

	public void setVoyagenumber(String voyagenumber) {
		this.voyagenumber = voyagenumber;
	}

	public String getVesselid() {
		return vesselid;
	}

	public void setVesselid(String vesselid) {
		this.vesselid = vesselid;
	}

	public List<Q88_OffhireBunker> getOffhireBunkerList() {
		return offhireBunkerList;
	}

	public void setOffhireBunkerList(List<Q88_OffhireBunker> offhireBunkerList) {
		this.offhireBunkerList = offhireBunkerList;
	}

	public Q88_Voyage getQ88voyageoffhire() {
		return q88voyageoffhire;
	}

	public void setQ88voyageoffhire(Q88_Voyage q88voyageoffhire) {
		this.q88voyageoffhire = q88voyageoffhire;
	}

	@Override
	public String toString() {
		return "Q88_Offhire [offhireseq_id=" + offhireseq_id + ", dateStartUtc=" + dateStartUtc + ", dateEndUtc="
				+ dateEndUtc + ", days=" + days + ", displayOrder=" + displayOrder + ", offhireReason=" + offhireReason
				+ ", remark=" + remark + ", voyageid=" + voyageid + ", voyagenumber=" + voyagenumber + ", vesselid="
				+ vesselid + ", offhireBunkerList=" + offhireBunkerList + ", q88voyageoffhire=" + q88voyageoffhire
				+ "]";
	}

	
	 
	 
}
