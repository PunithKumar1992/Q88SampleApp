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

import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_OffhireLst_BunCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_OFFHIRELST_BUN")
@IdClass(Q88_HdCntrtDTL_OffhireLst_BunCPK.class)
public class Q88_HdCntrtDTL_OffhireLst_Bun {
	
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
	@Column(name = "OFFHIRE_SEQID")
	private Integer offhire_SeqId;
	
	@Id
	@Column(name = "OFFBUNKER_SEQID")
	@SequenceGenerator(name = "offBunkSeqId", sequenceName = "Q88_HDCNTRTDTL_OFFEBUN_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "offBunkSeqId")
	private Integer offBunker_SeqId;
	
	@Column(name = "GRADE")
	private String grade;
	
	@Column(name = "QUANTITY")
	private Double quantity;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "COST")
	private Double cost;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
		  @JoinColumn(name = "TCINIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCINIDENCRYPTED"),
		  @JoinColumn(name = "OFFHIRE_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "OFFHIRE_SEQID"),
	  })
	 
	 private Q88_HdCntrtDTL_OffhireLst vslHdCntrctOffBunker;

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

	public Integer getOffhire_SeqId() {
		return offhire_SeqId;
	}

	public void setOffhire_SeqId(Integer offhire_SeqId) {
		this.offhire_SeqId = offhire_SeqId;
	}

	public Integer getOffBunker_SeqId() {
		return offBunker_SeqId;
	}

	public void setOffBunker_SeqId(Integer offBunker_SeqId) {
		this.offBunker_SeqId = offBunker_SeqId;
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

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Q88_HdCntrtDTL_OffhireLst getVslHdCntrctOffBunker() {
		return vslHdCntrctOffBunker;
	}

	public void setVslHdCntrctOffBunker(Q88_HdCntrtDTL_OffhireLst vslHdCntrctOffBunker) {
		this.vslHdCntrctOffBunker = vslHdCntrctOffBunker;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_OffhireLst_Bun [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", offhire_SeqId=" + offhire_SeqId + ", offBunker_SeqId="
				+ offBunker_SeqId + ", grade=" + grade + ", quantity=" + quantity + ", price=" + price + ", cost="
				+ cost + "]";
	}
	
	

}
