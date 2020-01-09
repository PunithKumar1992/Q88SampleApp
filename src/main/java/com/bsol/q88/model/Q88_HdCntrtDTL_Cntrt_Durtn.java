package com.bsol.q88.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_Cntrt_DurtnCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_CNTRT_DURTN")
@IdClass(Q88_HdCntrtDTL_Cntrt_DurtnCPK.class)
public class Q88_HdCntrtDTL_Cntrt_Durtn {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	@Id
	@Column(name = "TCINIDENCRYPTED")
	private String tcInIdEncrypted;
	
	
	@OneToMany(mappedBy = "vslHdCntrctDurtn",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_HdCntrtDTL_Cntrt_DurtnDtl.class)
	private List<Q88_HdCntrtDTL_Cntrt_DurtnDtl> list  = new ArrayList<Q88_HdCntrtDTL_Cntrt_DurtnDtl>();


	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
		  @JoinColumn(name = "TCINIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCINIDENCRYPTED"),
	  })
	
	private Q88_HdCntrtDTL_Cntrt vslHdCntrct;



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



	public List<Q88_HdCntrtDTL_Cntrt_DurtnDtl> getList() {
		return list;
	}



	public void setList(List<Q88_HdCntrtDTL_Cntrt_DurtnDtl> list) {
		this.list = list;
	}



	public Q88_HdCntrtDTL_Cntrt getVslHdCntrct() {
		return vslHdCntrct;
	}



	public void setVslHdCntrct(Q88_HdCntrtDTL_Cntrt vslHdCntrct) {
		this.vslHdCntrct = vslHdCntrct;
	}



	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_Cntrt_Durtn [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", list=" + list + "]";
	}
	
	

	
	

}
