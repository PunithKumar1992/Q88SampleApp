package com.bsol.q88.model;

import java.time.LocalDateTime;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VoyObj_RemarkCPK;

@Entity
@Table(name = "Q88_VOYOBJ_REMARK")
@IdClass(Q88_VoyObj_RemarkCPK.class)
public class Q88_VoyObj_Remark {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "REMARK_SEQID")
	@SequenceGenerator(name = "OffRemark_SeqId", sequenceName = "Q88_VOYOBJ_REMARK_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "OffRemark_SeqId")
	private Integer remark_SeqId;
	
	@Transient
	private String modifiedDate;
	
	@Column(name = "MODIFIEDDATE")
	private LocalDateTime modified_Date;
	
	@Column(name = "MODIFIEDBYFULL")
	private String modifiedByFull;
	
	@Column(name = "REMARK")
	private String remark;
	
	 @ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	  })
	 private Q88_VoyObj voyObjRemark;

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

	public Integer getRemark_SeqId() {
		return remark_SeqId;
	}

	public void setRemark_SeqId(Integer remark_SeqId) {
		this.remark_SeqId = remark_SeqId;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public LocalDateTime getModified_Date() {
		return modified_Date;
	}

	public void setModified_Date(String modified_Date) {
		if(modified_Date!=null) {
		this.modified_Date = LocalDateTime.parse(modified_Date);
		}
		else {
			this.modified_Date = null;
		}
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

	public Q88_VoyObj getVoyObjRemark() {
		return voyObjRemark;
	}

	public void setVoyObjRemark(Q88_VoyObj voyObjRemark) {
		this.voyObjRemark = voyObjRemark;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Remark [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", remark_SeqId=" + remark_SeqId
				+ ", modifiedDate=" + modifiedDate + ", modified_Date=" + modified_Date + ", modifiedByFull="
				+ modifiedByFull + ", remark=" + remark + "]";
	}
	 
	 
	

}
