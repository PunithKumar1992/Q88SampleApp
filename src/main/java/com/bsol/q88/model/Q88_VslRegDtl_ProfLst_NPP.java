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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VslRegDtl_ProfLst_NPPCPK;

@Entity
@Table(name = "Q88_VSLREGDTL_PROFLST_NPP")
@IdClass(Q88_VslRegDtl_ProfLst_NPPCPK.class)
public class Q88_VslRegDtl_ProfLst_NPP {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELID")
	private String vesselId;
	
	@Id
	@Column(name = "VSLPROF_SEQID")
	private Integer vslProf_SeqId;
	
	@Id
	@Column(name = "NPP_SEQID")
	private Integer npp_SeqId;
	
	@OneToMany(mappedBy = "vslRegProflstNPPP",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VslRegDtl_ProfLst_NPPP.class)
	private List<Q88_VslRegDtl_ProfLst_NPPP> consumption    = new ArrayList<Q88_VslRegDtl_ProfLst_NPPP>();

	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELID"),
		  @JoinColumn(name = "VSLPROF_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VSLPROF_SEQID"),
	  })
	 
	 private Q88_VslRegDtl_ProfLst vslRegNonProflstPP;

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

	public Integer getVslProf_SeqId() {
		return vslProf_SeqId;
	}

	public void setVslProf_SeqId(Integer vslProf_SeqId) {
		this.vslProf_SeqId = vslProf_SeqId;
	}

	public Integer getNpp_SeqId() {
		return npp_SeqId;
	}

	public void setNpp_SeqId(Integer npp_SeqId) {
		this.npp_SeqId = npp_SeqId;
	}

	public Q88_VslRegDtl_ProfLst getVslRegNonProflstPP() {
		return vslRegNonProflstPP;
	}

	public void setVslRegNonProflstPP(Q88_VslRegDtl_ProfLst vslRegNonProflstPP) {
		this.vslRegNonProflstPP = vslRegNonProflstPP;
	}
	

	public List<Q88_VslRegDtl_ProfLst_NPPP> getConsumption() {
		return consumption;
	}

	public void addConsumption(List<Q88_VslRegDtl_ProfLst_NPPP> consumption) {
		this.consumption = consumption;
	}

	@Override
	public String toString() {
		return "Q88_VslRegDtl_ProfLst_NPP [trans_Id=" + trans_Id + ", vesselId=" + vesselId + ", vslProf_SeqId="
				+ vslProf_SeqId + ", npp_SeqId=" + npp_SeqId + ", consumption=" + consumption + "]";
	}

	

}
