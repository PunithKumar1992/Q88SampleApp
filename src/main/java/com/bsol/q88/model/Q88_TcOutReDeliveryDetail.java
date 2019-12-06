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

import com.bsol.q88.model.cpk.Q88_TcOutReDeliveryDetailCPK;

@Entity
@Table(name = "Q88_TC_TCOUTREDELIVERYDTL")
@IdClass(Q88_TcOutReDeliveryDetailCPK.class)
public class Q88_TcOutReDeliveryDetail implements Serializable {

	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TCOUTDETAIL_SEQID")
	private Integer tcOutDetail_SeqId;
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
		  @JoinColumn(name = "TCOUTDETAIL_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTDETAIL_SEQID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	private Q88_TcOutDelivery tcOutRedelivery;
	public Integer getTcOutDetail_SeqId() {
		return tcOutDetail_SeqId;
	}
	public void setTcOutDetail_SeqId(Integer tcOutDetail_SeqId) {
		this.tcOutDetail_SeqId = tcOutDetail_SeqId;
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
	
	public Q88_TcOutDelivery getTcOutRedelivery() {
		return tcOutRedelivery;
	}
	public void setTcOutRedelivery(Q88_TcOutDelivery tcOutRedelivery) {
		this.tcOutRedelivery = tcOutRedelivery;
	}
	@Override
	public String toString() {
		return "Q88_TcOutDeliveryDetail [tcOutDetail_SeqId=" + tcOutDetail_SeqId + ", tcOutIdEncrypted="
				+ tcOutIdEncrypted + ", vesselIdEncrypted=" + vesselIdEncrypted + ", time=" + time + ", voyageNumber="
				+ voyageNumber + ", voyageLegName=" + voyageLegName + ", voyageIdEncrypted=" + voyageIdEncrypted + "]";
	}
	
	
}
