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

import com.bsol.q88.model.cpk.Q88_VslRegDtl_ProfLst_PPPCPK;

@Entity
@Table(name = "Q88_VSLREGDTL_PROFLST_PPP")
@IdClass(Q88_VslRegDtl_ProfLst_PPPCPK.class)
public class Q88_VslRegDtl_ProfLst_PPP {
	
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
	
	@Id
	@Column(name = "PPP_SEQID")
	@SequenceGenerator(name = "ppp_SeqId", sequenceName = "Q88_VSL_PROFLST_PPP_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "ppp_SeqId")
	private Integer ppp_SeqId;
	
	@Column(name = "RPM")
	private Integer rpm;
	
	@Column(name = "IFO")
	private Double ifo;
	
	@Column(name = "MGO")
	private Double mgo;
	
	@Column(name = "SPEED")
	private Double speed;
	
	@Column(name = "ISDEFAULT")
	private String isDefault;
	
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELID"),
		  @JoinColumn(name = "VSLPROF_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VSLPROF_SEQID"),
		  @JoinColumn(name = "PP_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "PP_SEQID"),
	  })
	 
	 private Q88_VslRegDtl_ProfLst_PP vslRegProflstPPP;


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


	public Integer getPpp_SeqId() {
		return ppp_SeqId;
	}


	public void setPpp_SeqId(Integer ppp_SeqId) {
		this.ppp_SeqId = ppp_SeqId;
	}


	public Integer getRpm() {
		return rpm;
	}


	public void setRpm(Integer rpm) {
		this.rpm = rpm;
	}


	public Double getIfo() {
		return ifo;
	}


	public void setIfo(Double ifo) {
		this.ifo = ifo;
	}


	public Double getMgo() {
		return mgo;
	}


	public void setMgo(Double mgo) {
		this.mgo = mgo;
	}


	public Double getSpeed() {
		return speed;
	}


	public void setSpeed(Double speed) {
		this.speed = speed;
	}


	public String getIsDefault() {
		return isDefault;
	}


	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}


	public Q88_VslRegDtl_ProfLst_PP getVslRegProflstPPP() {
		return vslRegProflstPPP;
	}


	public void setVslRegProflstPPP(Q88_VslRegDtl_ProfLst_PP vslRegProflstPPP) {
		this.vslRegProflstPPP = vslRegProflstPPP;
	}


	@Override
	public String toString() {
		return "Q88_VslRegDtl_ProfLst_PPP [trans_Id=" + trans_Id + ", vesselId=" + vesselId + ", vslProf_SeqId="
				+ vslProf_SeqId + ", pp_SeqId=" + pp_SeqId + ", ppp_SeqId=" + ppp_SeqId + ", rpm=" + rpm + ", ifo="
				+ ifo + ", mgo=" + mgo + ", speed=" + speed + ", isDefault=" + isDefault + "]";
	}


	
	
	
	

}
