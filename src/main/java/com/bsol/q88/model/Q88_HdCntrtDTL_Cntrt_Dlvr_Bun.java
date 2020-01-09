package com.bsol.q88.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_Cntrt_Dlvr_BunCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_CNTRT_DLVR_BUN")
@IdClass(Q88_HdCntrtDTL_Cntrt_Dlvr_BunCPK.class)
public class Q88_HdCntrtDTL_Cntrt_Dlvr_Bun {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	@Id
	@Column(name = "TCINIDENCRYPTED")
	private String tcInIdEncrypted;
	
	
	@Id
	@Column(name = "BUNKER_SEQID")
	@SequenceGenerator(name = "dunkerSeqId", sequenceName = "Q88_HDCNTRTDTL_DLVBUN_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "dunkerSeqId")
	private Integer bunker_SeqId;
	
	@Column(name = "GRADE")
	private String grade;
	
	@Column(name = "QUANTITY")
	private Double quantity;
	
	@Column(name = "PRICE")
	private Double price;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
		  @JoinColumn(name = "TCINIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCINIDENCRYPTED"),
	  })
	 
	 private Q88_HdCntrtDTL_Cntrt_Dlvr vslHdCntrctBunker;

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getVesselIdEncrypted() {
		return vesselIdEncrypted;
	}

	public void setVesselIdEncrypted(String vesselIdEncrypted) {
		this.vesselIdEncrypted = vesselIdEncrypted;
	}

	public String getTcInIdEncrypted() {
		return tcInIdEncrypted;
	}

	public void setTcInIdEncrypted(String tcInIdEncrypted) {
		this.tcInIdEncrypted = tcInIdEncrypted;
	}

	

	public Integer getBunker_SeqId() {
		return bunker_SeqId;
	}

	public void setBunker_SeqId(Integer bunker_SeqId) {
		this.bunker_SeqId = bunker_SeqId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Q88_HdCntrtDTL_Cntrt_Dlvr getVslHdCntrctBunker() {
		return vslHdCntrctBunker;
	}

	public void setVslHdCntrctBunker(Q88_HdCntrtDTL_Cntrt_Dlvr vslHdCntrctBunker) {
		this.vslHdCntrctBunker = vslHdCntrctBunker;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_Cntrt_Dlvr_Bun [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", bunker_SeqId=" + bunker_SeqId + ", grade=" + grade
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}

	
	
	
	
	
	
	

}
