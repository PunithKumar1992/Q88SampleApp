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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VslRegDtl_TagLstCPK;

@Entity
@Table(name = "Q88_VSLREGDTL_TAGLST")
@IdClass(Q88_VslRegDtl_TagLstCPK.class)
public class Q88_VslRegDtl_TagLst {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELID")
	private String vesselId;
	
	@Id
	@Column(name = "TAG_SEQID")
	@SequenceGenerator(name = "tagSeqId", sequenceName = "Q88_VSLREGDTL_TAG_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "tagSeqId")
	private Integer tag_SeqId;
	
	@Column(name = "CATEGORY")
	private String CATEGORY;
	
	@Column(name = "VALUE")
	private String value;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELID"),
	  })
	 
	 private Q88_VslRegDtl vslRegTagLst;

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getVesselId() {
		return vesselId;
	}

	public void setVesselId(String vesselId) {
		this.vesselId = vesselId;
	}

	public Integer getTag_SeqId() {
		return tag_SeqId;
	}

	public void setTag_SeqId(Integer tag_SeqId) {
		this.tag_SeqId = tag_SeqId;
	}

	public String getCATEGORY() {
		return CATEGORY;
	}

	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Q88_VslRegDtl getVslRegTagLst() {
		return vslRegTagLst;
	}

	public void setVslRegTagLst(Q88_VslRegDtl vslRegTagLst) {
		this.vslRegTagLst = vslRegTagLst;
	}

	@Override
	public String toString() {
		return "Q88_VslRegDtl_TagLst [trans_Id=" + trans_Id + ", vesselId=" + vesselId + ", tag_SeqId=" + tag_SeqId
				+ ", CATEGORY=" + CATEGORY + ", value=" + value + "]";
	}
	
	
	

	
	

}
