package com.bsol.q88.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VoyObj_OffhireCPK;

@Entity
@Table(name = "Q88_VOYOBJ_OFFHIRE")
@IdClass(Q88_VoyObj_OffhireCPK.class)
public class Q88_VoyObj_Offhire {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "OFFHIRE_SEQID")
	private Integer offhire_SeqId; 
	
	@Transient
	private String dateStartUtc;
	
	@Column(name = "DATESTARTUTC")
	private LocalDateTime date_StartUtc;
	
	@Transient
	private String dateEndUtc;
	
	@Column(name = "DATEENDUTC")
	private LocalDateTime date_EndUtc;
	
	@Column(name = "DAYS")
	private Double days;
	
	@Column(name = "DISPLAYORDER" )
	private Integer displayOrder;
	
	@Column(name = "OFFHIREREASON")
	private String offhireReason;
	
	@Column(name = "REMARK")
	private String remark;
	
	@OneToMany(mappedBy = "voyobjoffhireBunker",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VoyObj_Offhire_Bunker.class)
	private List<Q88_VoyObj_Offhire_Bunker> offhireBunkerList   = new  ArrayList<Q88_VoyObj_Offhire_Bunker>();

	
	 @ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	  })
	 private Q88_VoyObj voyObjOffhire;


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


	public Integer getOffhire_SeqId() {
		return offhire_SeqId;
	}


	public void setOffhire_SeqId(Integer offhire_SeqId) {
		this.offhire_SeqId = offhire_SeqId;
	}


	public String getDateStartUtc() {
		return dateStartUtc;
	}


	public void setDateStartUtc(String dateStartUtc) {
		this.dateStartUtc = dateStartUtc;
	}


	public LocalDateTime getDate_StartUtc() {
		return date_StartUtc;
	}


	public void setDate_StartUtc(String  date_StartUtc) {
		if(date_StartUtc !=null) {
			this.date_StartUtc = LocalDateTime.parse(date_StartUtc);
		}
		else {
			this.date_StartUtc = null;
		}
		
	}


	public String getDateEndUtc() {
		return dateEndUtc;
	}


	public void setDateEndUtc(String dateEndUtc) {
		this.dateEndUtc = dateEndUtc;
	}


	public LocalDateTime getDate_EndUtc() {
		return date_EndUtc;
	}


	public void setDate_EndUtc(String date_EndUtc) {
		if(date_EndUtc !=null) {
			this.date_EndUtc = LocalDateTime.parse(date_EndUtc);
		}
		else {
			this.date_EndUtc = null;
		}
		
	}


	public Double getDays() {
		return days;
	}


	public void setDays(Double days) {
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


	public List<Q88_VoyObj_Offhire_Bunker> getOffhireBunkerList() {
		return offhireBunkerList;
	}


	public void addOffhireBunkerList(List<Q88_VoyObj_Offhire_Bunker> offhireBunkerList) {
		this.offhireBunkerList = offhireBunkerList;
	}


	public Q88_VoyObj getVoyObjOffhire() {
		return voyObjOffhire;
	}


	public void setVoyObjOffhire(Q88_VoyObj voyObjOffhire) {
		this.voyObjOffhire = voyObjOffhire;
	}


	@Override
	public String toString() {
		return "Q88_VoyObj_Offhire [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", offhire_SeqId="
				+ offhire_SeqId + ", dateStartUtc=" + dateStartUtc + ", date_StartUtc=" + date_StartUtc
				+ ", dateEndUtc=" + dateEndUtc + ", date_EndUtc=" + date_EndUtc + ", days=" + days + ", displayOrder="
				+ displayOrder + ", offhireReason=" + offhireReason + ", remark=" + remark + ", offhireBunkerList="
				+ offhireBunkerList + "]";
	}
	 
	 
	 
	 
}
