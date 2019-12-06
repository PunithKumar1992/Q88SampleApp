package com.bsol.q88.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_TcOutVoyageCPK;


@Entity
@Table(name = "Q88_TC_TCOUTVOYAGE")
@IdClass(Q88_TcOutVoyageCPK.class)
public class Q88_TcOutVoyage {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "TCOUTVOYAGE_SEQID")
	private Integer tcOutVoyage_SeqId;
	
	
	@Id
	@Column(name = "TCOUTDETAIL_SEQID")
	private Integer tcOutDetail_SeqId;
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;

	@Column(name = "FIRSTLOAD")
	private String firstLoad;
	@Column(name = "FIRSTLOADPORTIDENCRYPTED")
	private String firstLoadPortIdEncrypted;
	@Column(name ="LASTDISCHARGE")
	private String lastDischarge; 
	@Column(name = "LASTDISCHARGEPORTIDENCRYPTED")
	private String lastDischargePortIdEncrypted;
	@Column(name = "VOYAGENUMBER")
	private String voyageNumber;
	@Column(name = "VOYAGEIDENCRYPTED")
	private String voyageIdEncrypted;
	@Column(name = "ENDDATE")
	private String endDate;
	
	@ManyToOne
	 @JoinColumns({
		  @JoinColumn(name = "TCOUTDETAIL_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTDETAIL_SEQID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	private Q88_TcOutListDetails q88TcOutVoyage;

	public Integer getTcOutVoyage_SeqId() {
		return tcOutVoyage_SeqId;
	}

	public void setTcOutVoyage_SeqId(Integer tcOutVoyage_SeqId) {
		this.tcOutVoyage_SeqId = tcOutVoyage_SeqId;
	}

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

	public String getFirstLoad() {
		return firstLoad;
	}

	public void setFirstLoad(String firstLoad) {
		this.firstLoad = firstLoad;
	}

	public String getFirstLoadPortIdEncrypted() {
		return firstLoadPortIdEncrypted;
	}

	public void setFirstLoadPortIdEncrypted(String firstLoadPortIdEncrypted) {
		this.firstLoadPortIdEncrypted = firstLoadPortIdEncrypted;
	}

	public String getLastDischarge() {
		return lastDischarge;
	}

	public void setLastDischarge(String lastDischarge) {
		this.lastDischarge = lastDischarge;
	}

	public String getLastDischargePortIdEncrypted() {
		return lastDischargePortIdEncrypted;
	}

	public void setLastDischargePortIdEncrypted(String lastDischargePortIdEncrypted) {
		this.lastDischargePortIdEncrypted = lastDischargePortIdEncrypted;
	}

	public String getVoyageNumber() {
		return voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		this.voyageNumber = voyageNumber;
	}

	public String getVoyageIdEncrypted() {
		return voyageIdEncrypted;
	}

	public void setVoyageIdEncrypted(String voyageIdEncrypted) {
		this.voyageIdEncrypted = voyageIdEncrypted;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Q88_TcOutListDetails getQ88TcOutVoyage() {
		return q88TcOutVoyage;
	}

	public void setQ88TcOutVoyage(Q88_TcOutListDetails q88TcOutVoyage) {
		this.q88TcOutVoyage = q88TcOutVoyage;
	}

	@Override
	public String toString() {
		return "Q88_TcOutVoyage [tcOutVoyage_SeqId=" + tcOutVoyage_SeqId + ", tcOutDetail_SeqId=" + tcOutDetail_SeqId
				+ ", tcOutIdEncrypted=" + tcOutIdEncrypted + ", vesselIdEncrypted=" + vesselIdEncrypted + ", firstLoad="
				+ firstLoad + ", firstLoadPortIdEncrypted=" + firstLoadPortIdEncrypted + ", lastDischarge="
				+ lastDischarge + ", lastDischargePortIdEncrypted=" + lastDischargePortIdEncrypted + ", voyageNumber="
				+ voyageNumber + ", voyageIdEncrypted=" + voyageIdEncrypted + ", endDate=" + endDate + "]";
	}
	
	

}
