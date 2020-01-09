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

import com.bsol.q88.model.cpk.Q88_VslRegDtl_ProfLstCPK;

@Entity
@Table(name = "Q88_VSLREGDTL_PROFLST")
@IdClass(Q88_VslRegDtl_ProfLstCPK.class)
public class Q88_VslRegDtl_ProfLst {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELID")
	private String vesselId;
	
	@Id
	@Column(name = "VSLPROF_SEQID")
	private Integer vslProf_SeqId;
	
	@Column(name = "PROFILENAME")
	private String profileName;
	
	@OneToMany(mappedBy = "vslRegProflstPP",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VslRegDtl_ProfLst_PP.class)
	private List<Q88_VslRegDtl_ProfLst_PP> passageProfile  = new ArrayList<Q88_VslRegDtl_ProfLst_PP>();

	@OneToMany(mappedBy = "vslRegNonProflstPP",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VslRegDtl_ProfLst_NPP.class)
	private List<Q88_VslRegDtl_ProfLst_NPP> nonPassageProfile   = new ArrayList<Q88_VslRegDtl_ProfLst_NPP>();

	
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELID"),
	  })
	 
	 private Q88_VslRegDtl vslRegProflst;

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

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public List<Q88_VslRegDtl_ProfLst_PP> getPassageProfile() {
		return passageProfile;
	}

	public void addPassageProfile(List<Q88_VslRegDtl_ProfLst_PP> passageProfile) {
		this.passageProfile = passageProfile;
	}

	public Q88_VslRegDtl getVslRegProflst() {
		return vslRegProflst;
	}

	public void setVslRegProflst(Q88_VslRegDtl vslRegProflst) {
		this.vslRegProflst = vslRegProflst;
	}

	public List<Q88_VslRegDtl_ProfLst_NPP> getNonPassageProfile() {
		return nonPassageProfile;
	}

	public void addNonPassageProfile(List<Q88_VslRegDtl_ProfLst_NPP> nonPassageProfile) {
		this.nonPassageProfile = nonPassageProfile;
	}

	@Override
	public String toString() {
		return "Q88_VslRegDtl_ProfLst [trans_Id=" + trans_Id + ", vesselId=" + vesselId + ", vslProf_SeqId="
				+ vslProf_SeqId + ", profileName=" + profileName + ", passageProfile=" + passageProfile
				+ ", nonPassageProfile=" + nonPassageProfile + ", vslRegProflst=" + vslRegProflst + "]";
	}

	

	
	
	
	

}
