package com.bsol.q88.model;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VesselListCPK;

@Entity
@Table(name = "Q88_VESSELLIST")
@IdClass(Q88_VesselListCPK.class)
public class Q88_VesselList {
	
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELID" )
	private String vesselId;
	@Column(name = "VESSELNAME")
	private String vesselName;
	@Column(name = "IMO")
	private String imo;
	@Column(name = "ACCOUNTCODE")
	private String accountCode;
	@Transient
	private String modifiedDate;
	@Column(name ="MODIFIEDDATE")
	private LocalDateTime  modified_Date;
	
	
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
	public String getVesselName() {
		return vesselName;
	}
	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
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
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	public LocalDateTime getModified_Date() {
		return modified_Date;
	}
	public void setModified_Date(String modified_Date) {
		this.modified_Date = LocalDateTime.parse(modified_Date);
	}
	
	@Override
	public String toString() {
		return "Q88_VesselList [trans_Id=" + trans_Id + ", vesselId=" + vesselId + ", vesselName=" + vesselName
				+ ", imo=" + imo + ", accountCode=" + accountCode + ", modifiedDate=" + modifiedDate
				+ ", modified_Date=" + modified_Date + "]";
	}
	
	

	
	

}
