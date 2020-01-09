package com.bsol.q88.model;

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

import com.bsol.q88.model.cpk.Q88_VslRegDtl_ProfLst_PPCPK;

@Entity
@Table(name = "Q88_VSLREGDTL_PROFLST_PP")
@IdClass(Q88_VslRegDtl_ProfLst_PPCPK.class)
public class Q88_VslRegDtl_ProfLst_PP {
	
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
	@Column(name = "PP_SEQID")
	private Integer pp_SeqId;
	
	@Column(name = "PASSAGETYPE")
	private String passageType;
	
	@OneToMany(mappedBy = "vslRegProflstPPP",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VslRegDtl_ProfLst_PPP.class)
	private List<Q88_VslRegDtl_ProfLst_PPP> consumption   = new ArrayList<Q88_VslRegDtl_ProfLst_PPP>();

	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELID"),
		  @JoinColumn(name = "VSLPROF_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VSLPROF_SEQID"),
	  })
	 
	 private Q88_VslRegDtl_ProfLst vslRegProflstPP;

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

	public Integer getPp_SeqId() {
		return pp_SeqId;
	}

	public void setPp_SeqId(Integer pp_SeqId) {
		this.pp_SeqId = pp_SeqId;
	}

	public String getPassageType() {
		return passageType;
	}

	public void setPassageType(String passageType) {
		this.passageType = passageType;
	}

	public Q88_VslRegDtl_ProfLst getVslRegProflstPP() {
		return vslRegProflstPP;
	}

	public void setVslRegProflstPP(Q88_VslRegDtl_ProfLst vslRegProflstPP) {
		this.vslRegProflstPP = vslRegProflstPP;
	}

	public List<Q88_VslRegDtl_ProfLst_PPP> getConsumption() {
		return consumption;
	}

	public void addConsumption(List<Q88_VslRegDtl_ProfLst_PPP> consumption) {
		this.consumption = consumption;
	}

	@Override
	public String toString() {
		return "Q88_VslRegDtl_ProfLst_PP [trans_Id=" + trans_Id + ", vesselId=" + vesselId + ", vslProf_SeqId="
				+ vslProf_SeqId + ", pp_SeqId=" + pp_SeqId + ", passageType=" + passageType + ", consumption="
				+ consumption + "]";
	}

	
	
	
	

}
