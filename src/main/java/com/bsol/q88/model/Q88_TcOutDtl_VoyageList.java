package com.bsol.q88.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_TcOutDtl_VoyageListCPK;


@Entity
@Table(name = "Q88_TCOUTDTL_VOYAGELIST")
@IdClass(Q88_TcOutDtl_VoyageListCPK.class)
public class Q88_TcOutDtl_VoyageList {
	
	
	@Id
	@SequenceGenerator(name = "VoyLst_SeqId", sequenceName = "Q88_TCOUTDTL_VOYAGELIST_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "VoyLst_SeqId")
	@Column(name = "VOYAGELIST_SEQID")
	private Integer voyageList_SeqId;
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
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
	@Transient
	private String endDate;
	@Column(name = "ENDDATE")
	private LocalDateTime end_Date;
	
	@ManyToOne
	 @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	private Q88_TcOutDtl q88TcOutVoyage;

	

	public Integer getVoyageList_SeqId() {
		return voyageList_SeqId;
	}

	public void setVoyageList_SeqId(Integer voyageList_SeqId) {
		this.voyageList_SeqId = voyageList_SeqId;
	}

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

	public Q88_TcOutDtl getQ88TcOutVoyage() {
		return q88TcOutVoyage;
	}

	public void setQ88TcOutVoyage(Q88_TcOutDtl q88TcOutVoyage) {
		this.q88TcOutVoyage = q88TcOutVoyage;
	}
	
	

	public LocalDateTime getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(String end_Date) {
		 String dateFormat = "dd MMM uuuu HH:mm";
	        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
	            .ofPattern(dateFormat, Locale.US)
	            .withResolverStyle(ResolverStyle.STRICT);
	        try {
	            LocalDateTime date = LocalDateTime.parse(end_Date, dateTimeFormatter);
	            this.end_Date = date;
	        } catch (DateTimeParseException e) {
	            System.out.println("Exception was thrown ");
	        }
		
	}

	@Override
	public String toString() {
		return "Q88_TcOutDtl_VoyageList [voyageList_SeqId=" + voyageList_SeqId + ", trans_Id=" + trans_Id
				+ ", tcOutIdEncrypted=" + tcOutIdEncrypted + ", vesselIdEncrypted=" + vesselIdEncrypted + ", firstLoad="
				+ firstLoad + ", firstLoadPortIdEncrypted=" + firstLoadPortIdEncrypted + ", lastDischarge="
				+ lastDischarge + ", lastDischargePortIdEncrypted=" + lastDischargePortIdEncrypted + ", voyageNumber="
				+ voyageNumber + ", voyageIdEncrypted=" + voyageIdEncrypted + ", endDate=" + endDate + ", end_Date="
				+ end_Date + "]";
	}

	
	
	

}
