package com.bsol.q88.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_HdCntrtDTLCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL")
@IdClass(Q88_HdCntrtDTLCPK.class)
public class Q88_HdCntrtDTL {
	
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;

	
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	@Id
	@Column(name = "TCINIDENCRYPTED")
	private String tcInIdEncrypted;
	
	@OneToOne(mappedBy = "HeadContractDtl", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_HdCntrtDTL_Cntrt Contract;

	@OneToMany(mappedBy = "vslHdCntrctVoyage",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_HdCntrtDTL_VoyLst.class)
	private List<Q88_HdCntrtDTL_VoyLst> VoyageList   = new ArrayList<Q88_HdCntrtDTL_VoyLst>();

	@OneToMany(mappedBy = "vslHdCntrctOffhire",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_HdCntrtDTL_OffhireLst.class)
	private List<Q88_HdCntrtDTL_OffhireLst> OffhireList    = new ArrayList<Q88_HdCntrtDTL_OffhireLst>();

	@OneToMany(mappedBy = "vslHdCntrctInvoice",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_HdCntrtDTL_InvoiceLst.class)
	private List<Q88_HdCntrtDTL_InvoiceLst> InvoiceList     = new ArrayList<Q88_HdCntrtDTL_InvoiceLst>();

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

	
	public Q88_HdCntrtDTL_Cntrt getContract() {
		return Contract;
	}

	public void setContract(Q88_HdCntrtDTL_Cntrt contract) {
		this.Contract = contract;
	}

	public List<Q88_HdCntrtDTL_VoyLst> getVoyageList() {
		return VoyageList;
	}

	public void addVoyageList(List<Q88_HdCntrtDTL_VoyLst> voyageList) {
		VoyageList = voyageList;
	}

	public List<Q88_HdCntrtDTL_OffhireLst> getOffhireList() {
		return OffhireList;
	}

	public void addOffhireList(List<Q88_HdCntrtDTL_OffhireLst> offhireList) {
		OffhireList = offhireList;
	}

	public List<Q88_HdCntrtDTL_InvoiceLst> getInvoiceList() {
		return InvoiceList;
	}

	public void addInvoiceList(List<Q88_HdCntrtDTL_InvoiceLst> invoiceList) {
		InvoiceList = invoiceList;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", Contract=" + Contract + ", VoyageList=" + VoyageList
				+ ", OffhireList=" + OffhireList + ", InvoiceList=" + InvoiceList + "]";
	}

	

	

	
	
	
}
