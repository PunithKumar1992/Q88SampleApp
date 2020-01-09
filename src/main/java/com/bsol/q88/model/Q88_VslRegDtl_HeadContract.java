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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VslRegDtl_HeadContractCPK;

@Entity
@Table(name = "Q88_VSLREGDTL_HEADCONTRACT")
@IdClass(Q88_VslRegDtl_HeadContractCPK.class)
public class Q88_VslRegDtl_HeadContract {

	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;

	@Id
	@Column(name = "VESSELID")
	private String vesselId;

	@Column(name = "HEADCONTRACT_SEQID")
	private Integer headContract_SeqId;
	
	@OneToMany(mappedBy = "vslHeadContract",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_VslRegDtl_HeadContractDtl.class)
	private List<Q88_VslRegDtl_HeadContractDtl> list = new ArrayList<Q88_VslRegDtl_HeadContractDtl>();

	@OneToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumns({
			@JoinColumn(name = "TRANS_ID", nullable = false, insertable = false, updatable = false, referencedColumnName = "TRANS_ID"),
			@JoinColumn(name = "VESSELID", nullable = false, insertable = false, updatable = false, referencedColumnName = "VESSELID"), })
	private Q88_VslRegDtl vslRegHeadContract;

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

	public Integer getHeadContract_SeqId() {
		return headContract_SeqId;
	}

	public void setHeadContract_SeqId(Integer headContract_SeqId) {
		this.headContract_SeqId = headContract_SeqId;
	}

	public Q88_VslRegDtl getVslRegHeadContract() {
		return vslRegHeadContract;
	}

	public void setVslRegHeadContract(Q88_VslRegDtl vslRegHeadContract) {
		this.vslRegHeadContract = vslRegHeadContract;
	}

	public List<Q88_VslRegDtl_HeadContractDtl> getList() {
		return list;
	}

	public void addList(List<Q88_VslRegDtl_HeadContractDtl> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Q88_VslRegDtl_HeadContract [trans_Id=" + trans_Id + ", vesselId=" + vesselId + ", headContract_SeqId="
				+ headContract_SeqId + ", list=" + list + "]";
	}

	

}
