package com.bsol.q88.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_VoyLstCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_VOYLST")
@IdClass(Q88_HdCntrtDTL_VoyLstCPK.class)
public class Q88_HdCntrtDTL_VoyLst {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;

	
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	@Id
	@Column(name = "TCINIDENCRYPTED")
	private String tcInIdEncrypted;
	
	@Id
	@Column(name = "VOYAGE_SEQID")
	@SequenceGenerator(name = "voyLstSeq_Id", sequenceName = "Q88_HDCNTRTDTL_VOYLST_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "voyLstSeq_Id")
	private Integer voyage_SeqId;
	
	@Column(name = "VOYAGEIDENCRYPTED")
	private String voyageIdEncrypted;
	
	@Column(name = "VOYAGENUMBER")
	private String voyageNumber;
	
	@Column(name = "FIRSTLOADPORT")
	private String firstLoadPort;
	
	@Column(name = "LASTDISCHARGEPORT")
	private String lastDischargePort;
	
	@Transient
	private String endDate;
	
	@Column(name ="ENDDATE")
	private LocalDateTime end_Date;
	
	@Column(name = "CARGOES")
	private String cargoes;
	
	@Column(name = "HIRE")
	private Double hire;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
		  @JoinColumn(name = "TCINIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCINIDENCRYPTED"),
	  })
	
	private Q88_HdCntrtDTL vslHdCntrctVoyage;

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getVesselIdEncrypted() {
		return vesselIdEncrypted;
	}

	public void setVesselIdEncrypted(String vesselIdEncrypted) {
		this.vesselIdEncrypted = vesselIdEncrypted;
	}

	public String getTcInIdEncrypted() {
		return tcInIdEncrypted;
	}

	public void setTcInIdEncrypted(String tcInIdEncrypted) {
		this.tcInIdEncrypted = tcInIdEncrypted;
	}

	public Integer getVoyage_SeqId() {
		return voyage_SeqId;
	}

	public void setVoyage_SeqId(Integer voyage_SeqId) {
		this.voyage_SeqId = voyage_SeqId;
	}

	public String getVoyageIdEncrypted() {
		return voyageIdEncrypted;
	}

	public void setVoyageIdEncrypted(String voyageIdEncrypted) {
		this.voyageIdEncrypted = voyageIdEncrypted;
	}

	public String getVoyageNumber() {
		return voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		this.voyageNumber = voyageNumber;
	}

	public String getFirstLoadPort() {
		return firstLoadPort;
	}

	public void setFirstLoadPort(String firstLoadPort) {
		this.firstLoadPort = firstLoadPort;
	}

	public String getLastDischargePort() {
		return lastDischargePort;
	}

	public void setLastDischargePort(String lastDischargePort) {
		this.lastDischargePort = lastDischargePort;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public LocalDateTime getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(String end_Date) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(end_Date !=null) {
			 try {
					LocalDateTime date = LocalDateTime.parse(end_Date, dateTimeFormatter);
		            this.end_Date = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }	
		 }
		 else {
			 this.end_Date = null;
		 }
		
	}

	public String getCargoes() {
		return cargoes;
	}

	public void setCargoes(String cargoes) {
		this.cargoes = cargoes;
	}

	public Double getHire() {
		return hire;
	}

	public void setHire(Double hire) {
		this.hire = hire;
	}

	public Q88_HdCntrtDTL getVslHdCntrctVoyage() {
		return vslHdCntrctVoyage;
	}

	public void setVslHdCntrctVoyage(Q88_HdCntrtDTL vslHdCntrctVoyage) {
		this.vslHdCntrctVoyage = vslHdCntrctVoyage;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_VoyLst [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", voyage_SeqId=" + voyage_SeqId + ", voyageIdEncrypted="
				+ voyageIdEncrypted + ", voyageNumber=" + voyageNumber + ", firstLoadPort=" + firstLoadPort
				+ ", lastDischargePort=" + lastDischargePort + ", endDate=" + endDate + ", end_Date=" + end_Date
				+ ", cargoes=" + cargoes + ", hire=" + hire + "]";
	}
	
	

}
