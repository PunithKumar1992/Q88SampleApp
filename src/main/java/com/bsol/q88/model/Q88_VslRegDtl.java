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

import com.bsol.q88.model.cpk.Q88_VslRegDtlCPK;

@Entity
@Table(name = "Q88_VSLREGDTL")
@IdClass(Q88_VslRegDtlCPK.class)
public class Q88_VslRegDtl {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELID")
	private String vesselId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "IMO")
	private String imo;
	
	@Column(name = "ACCOUNTCODE")
	private String accountCode;
	
	@Column(name = "HIRERATE")
	private Double hireRate;
	
	@Column(name = "MASTERSEMAIL")
	private String mastersEmail;
	
	@OneToMany(mappedBy = "vslRegProflst",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VslRegDtl_ProfLst.class)
	private List<Q88_VslRegDtl_ProfLst> profileList  = new ArrayList<Q88_VslRegDtl_ProfLst>();


	@OneToMany(mappedBy = "vslRegTagLst",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VslRegDtl_TagLst.class)
	private List<Q88_VslRegDtl_TagLst> tagList   = new ArrayList<Q88_VslRegDtl_TagLst>();
	
	@OneToOne(mappedBy = "vslRegHeadContract", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_VslRegDtl_HeadContract headContract;


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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImo() {
		return imo;
	}

	public void setImo(String imo) {
		this.imo = imo;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public Double getHireRate() {
		return hireRate;
	}

	public void setHireRate(Double hireRate) {
		this.hireRate = hireRate;
	}

	public String getMastersEmail() {
		return mastersEmail;
	}

	public void setMastersEmail(String mastersEmail) {
		this.mastersEmail = mastersEmail;
	}

	public List<Q88_VslRegDtl_ProfLst> getProfileList() {
		return profileList;
	}

	public void addProfileList(List<Q88_VslRegDtl_ProfLst> profileList) {
		this.profileList = profileList;
	}

	public List<Q88_VslRegDtl_TagLst> getTagList() {
		return tagList;
	}

	public void addTagList(List<Q88_VslRegDtl_TagLst> tagList) {
		this.tagList = tagList;
	}


	public Q88_VslRegDtl_HeadContract getHeadContract() {
		return headContract;
	}

	public void addHeadContract(Q88_VslRegDtl_HeadContract headContract) {
		this.headContract = headContract;
	}

	@Override
	public String toString() {
		return "Q88_VslRegDtl [trans_Id=" + trans_Id + ", vesselId=" + vesselId + ", name=" + name + ", imo=" + imo
				+ ", accountCode=" + accountCode + ", hireRate=" + hireRate + ", mastersEmail=" + mastersEmail
				+ ", profileList=" + profileList + ", tagList=" + tagList + ", headContract=" + headContract + "]";
	}



	
	
	
	
	

}
