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

import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_Cntrt_RDlvr_BunCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_CNTRT_RDLVR_BUN")
@IdClass(Q88_HdCntrtDTL_Cntrt_RDlvr_BunCPK.class)
public class Q88_HdCntrtDTL_Cntrt_RDlvr_Bun {
	
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
	@Column(name = "RDLVRBUNKER_SEQID")
	@SequenceGenerator(name = "reDlvrdunkerSeqId", sequenceName = "Q88_HDCNTRTDTL_REDLVRBUN_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "reDlvrdunkerSeqId")
	private Integer rdlvrBunker_SeqId;
	
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
	 
	 private Q88_HdCntrtDTL_Cntrt_RDlvr vslHdCntrctReDlvrBunker;

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

	
	public Integer getRdlvrBunker_SeqId() {
		return rdlvrBunker_SeqId;
	}

	public void setRdlvrBunker_SeqId(Integer rdlvrBunker_SeqId) {
		this.rdlvrBunker_SeqId = rdlvrBunker_SeqId;
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

	

	public Q88_HdCntrtDTL_Cntrt_RDlvr getVslHdCntrctReDlvrBunker() {
		return vslHdCntrctReDlvrBunker;
	}

	public void setVslHdCntrctReDlvrBunker(Q88_HdCntrtDTL_Cntrt_RDlvr vslHdCntrctReDlvrBunker) {
		this.vslHdCntrctReDlvrBunker = vslHdCntrctReDlvrBunker;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_Cntrt_RDlvr_Bun [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", rdlvrBunker_SeqId=" + rdlvrBunker_SeqId + ", grade="
				+ grade + ", quantity=" + quantity + ", price=" + price + "]";
	}

	
	

}
