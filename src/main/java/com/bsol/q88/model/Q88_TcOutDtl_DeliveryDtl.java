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

import com.bsol.q88.model.cpk.Q88_TcOutDtl_DeliveryDtlCPK;

@Entity
@Table(name = "Q88_TCOUTDTL_DELIVERYDTL")
@IdClass(Q88_TcOutDtl_DeliveryDtlCPK.class)
public class Q88_TcOutDtl_DeliveryDtl implements Serializable{
	
	
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
	@Column(name = "TIME")
	private String time;
	@Column(name = "VOYAGENUMBER")
	private String voyageNumber;
	@Column(name = "VOYAGELEGNAME")
	private String voyageLegName;
	@Column(name = "VOYAGEIDENCRYPTED" )
	private String voyageIdEncrypted;
	
	@OneToOne(optional = true,fetch = FetchType.EAGER)
	 @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	private Q88_TcOutDtl_Delivery tcOutDelivery;
	
	
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVoyageNumber() {
		return voyageNumber;
	}
	public void setVoyageNumber(String voyageNumber) {
		this.voyageNumber = voyageNumber;
	}
	public String getVoyageLegName() {
		return voyageLegName;
	}
	public void setVoyageLegName(String voyageLegName) {
		this.voyageLegName = voyageLegName;
	}
	public String getVoyageIdEncrypted() {
		return voyageIdEncrypted;
	}
	public void setVoyageIdEncrypted(String voyageIdEncrypted) {
		this.voyageIdEncrypted = voyageIdEncrypted;
	}
	
	public Q88_TcOutDtl_Delivery getTcOutDelivery() {
		return tcOutDelivery;
	}
	public void setTcOutDelivery(Q88_TcOutDtl_Delivery tcOutDelivery) {
		this.tcOutDelivery = tcOutDelivery;
	}
	@Override
	public String toString() {
		return "Q88_TcOutDtl_DeliveryDtl [trans_Id=" + trans_Id + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", time=" + time + ", voyageNumber=" + voyageNumber
				+ ", voyageLegName=" + voyageLegName + ", voyageIdEncrypted=" + voyageIdEncrypted + "]";
	}
	
	
	
	

}
