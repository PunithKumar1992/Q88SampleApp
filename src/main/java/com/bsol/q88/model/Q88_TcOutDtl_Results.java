package com.bsol.q88.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_TcOutDtl_ResultsCPK;

@Entity
@Table(name = "Q88_TCOUTDTL_RESULTS")
@IdClass(Q88_TcOutDtl_ResultsCPK.class)
public class Q88_TcOutDtl_Results implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	@Column(name = "REMARK")
	private String remark;
	@Column(name = "REVENUEHIRE")
	private Double revenueHire;
	@Column(name = "COMMISSION")
	private Double commission;
	@Column(name = "BUNKERS")
	private Double bunkers;
	@Column(name = "REVENUEMISC")
	private Double revenueMisc;
	@Column(name = "NETDAYS")
	private Double netDays;
	@Column(name = "TCE")
	private Double TCE;
	
	@OneToOne(optional = true,fetch = FetchType.EAGER)
	 @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	private Q88_TcOutDtl tcOutResults;

	

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getTcOutIdEncrypted() {
		return tcOutIdEncrypted;
	}

	public void setTcOutIdEncrypted(String tcOutIdEncrypted) {
		this.tcOutIdEncrypted = tcOutIdEncrypted;
	}

	public String getVesselIdEncrypted() {
		return vesselIdEncrypted;
	}

	public void setVesselIdEncrypted(String vesselIdEncrypted) {
		this.vesselIdEncrypted = vesselIdEncrypted;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getRevenueHire() {
		return revenueHire;
	}

	public void setRevenueHire(Double revenueHire) {
		this.revenueHire = revenueHire;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public Double getBunkers() {
		return bunkers;
	}

	public void setBunkers(Double bunkers) {
		this.bunkers = bunkers;
	}

	public Double getRevenueMisc() {
		return revenueMisc;
	}

	public void setRevenueMisc(Double revenueMisc) {
		this.revenueMisc = revenueMisc;
	}

	public Double getNetDays() {
		return netDays;
	}

	public void setNetDays(Double netDays) {
		this.netDays = netDays;
	}

	public Double getTCE() {
		return TCE;
	}

	public void setTCE(Double tCE) {
		TCE = tCE;
	}

	public Q88_TcOutDtl getTcOutResults() {
		return tcOutResults;
	}

	public void setTcOutResults(Q88_TcOutDtl tcOutResults) {
		this.tcOutResults = tcOutResults;
	}

	@Override
	public String toString() {
		return "Q88_TcOutDtl_Results [trans_Id=" + trans_Id + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", remark=" + remark + ", revenueHire=" + revenueHire
				+ ", commission=" + commission + ", bunkers=" + bunkers + ", revenueMisc=" + revenueMisc + ", netDays="
				+ netDays + ", TCE=" + TCE + "]";
	}

	
	
	

}
