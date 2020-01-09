package com.bsol.q88.model;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VslRegDtl_ProfLst_NPPPCPK;

@Entity
@Table(name = "Q88_VSLREGDTL_PROFLST_NPPP")
@IdClass(Q88_VslRegDtl_ProfLst_NPPPCPK.class)
public class Q88_VslRegDtl_ProfLst_NPPP {
	
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
	
	@Id
	@Column(name = "NPPP_SEQID")
	@SequenceGenerator(name = "nppp_SeqId", sequenceName = "Q88_VSLREG_PROFLST_NPPP_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "nppp_SeqId")
	private Integer nppp_SeqId;
	
	@Column(name = "IFOLOAD")
	private Double ifoLoad;
	@Column(name = "IFODISCHARGE")
	private Double ifoDischarge;
	@Column(name = "IFOIDLE")
	private Double ifoIdle;
	@Column(name = "IFOHEAT")
	private Double ifoHeat;
	@Column(name = "IFOCLEAN")
	private Double ifoClean;
	@Column(name = "IFOINERT")
	private Double ifoInert;
	@Column(name = "MGOLOAD")
	private Double mgoLoad;
	@Column(name = "MGODISCHARGE")
	private Double mgoDischarge;
	@Column(name = "MGOIDLE")
	private Double mgoIdle;
	@Column(name = "MGOHEAT")
	private Double mgoHeat;
	@Column(name = "MGOCLEAN")
	private Double mgoClean;
	@Column(name = "MGOINERT")
	private Double mgoInert;
	
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELID"),
		  @JoinColumn(name = "VSLPROF_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VSLPROF_SEQID"),
		  @JoinColumn(name = "NPP_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "NPP_SEQID"),
	  })
	 
	 private Q88_VslRegDtl_ProfLst_NPP vslRegProflstNPPP;


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


	public Integer getNppp_SeqId() {
		return nppp_SeqId;
	}


	public void setNppp_SeqId(Integer nppp_SeqId) {
		this.nppp_SeqId = nppp_SeqId;
	}


	public Double getIfoLoad() {
		return ifoLoad;
	}


	public void setIfoLoad(Double ifoLoad) {
		this.ifoLoad = ifoLoad;
	}


	public Double getIfoDischarge() {
		return ifoDischarge;
	}


	public void setIfoDischarge(Double ifoDischarge) {
		this.ifoDischarge = ifoDischarge;
	}


	public Double getIfoIdle() {
		return ifoIdle;
	}


	public void setIfoIdle(Double ifoIdle) {
		this.ifoIdle = ifoIdle;
	}


	public Double getIfoHeat() {
		return ifoHeat;
	}


	public void setIfoHeat(Double ifoHeat) {
		this.ifoHeat = ifoHeat;
	}


	public Double getIfoClean() {
		return ifoClean;
	}


	public void setIfoClean(Double ifoClean) {
		this.ifoClean = ifoClean;
	}


	public Double getIfoInert() {
		return ifoInert;
	}


	public void setIfoInert(Double ifoInert) {
		this.ifoInert = ifoInert;
	}


	public Double getMgoLoad() {
		return mgoLoad;
	}


	public void setMgoLoad(Double mgoLoad) {
		this.mgoLoad = mgoLoad;
	}


	public Double getMgoDischarge() {
		return mgoDischarge;
	}


	public void setMgoDischarge(Double mgoDischarge) {
		this.mgoDischarge = mgoDischarge;
	}


	public Double getMgoIdle() {
		return mgoIdle;
	}


	public void setMgoIdle(Double mgoIdle) {
		this.mgoIdle = mgoIdle;
	}


	public Double getMgoHeat() {
		return mgoHeat;
	}


	public void setMgoHeat(Double mgoHeat) {
		this.mgoHeat = mgoHeat;
	}


	public Double getMgoClean() {
		return mgoClean;
	}


	public void setMgoClean(Double mgoClean) {
		this.mgoClean = mgoClean;
	}


	public Double getMgoInert() {
		return mgoInert;
	}


	public void setMgoInert(Double mgoInert) {
		this.mgoInert = mgoInert;
	}


	public Q88_VslRegDtl_ProfLst_NPP getVslRegProflstNPPP() {
		return vslRegProflstNPPP;
	}


	public void setVslRegProflstNPPP(Q88_VslRegDtl_ProfLst_NPP vslRegProflstNPPP) {
		this.vslRegProflstNPPP = vslRegProflstNPPP;
	}


	@Override
	public String toString() {
		return "Q88_VslRegDtl_ProfLst_NPPP [trans_Id=" + trans_Id + ", vesselId=" + vesselId + ", vslProf_SeqId="
				+ vslProf_SeqId + ", npp_SeqId=" + npp_SeqId + ", nppp_SeqId=" + nppp_SeqId + ", ifoLoad=" + ifoLoad
				+ ", ifoDischarge=" + ifoDischarge + ", ifoIdle=" + ifoIdle + ", ifoHeat=" + ifoHeat + ", ifoClean="
				+ ifoClean + ", ifoInert=" + ifoInert + ", mgoLoad=" + mgoLoad + ", mgoDischarge=" + mgoDischarge
				+ ", mgoIdle=" + mgoIdle + ", mgoHeat=" + mgoHeat + ", mgoClean=" + mgoClean + ", mgoInert=" + mgoInert
				+ "]";
	}
	
	
	

}
