package com.bsol.q88.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_OffhireLstCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_OFFHIRELST")
@IdClass(Q88_HdCntrtDTL_OffhireLstCPK.class)
public class Q88_HdCntrtDTL_OffhireLst {
	
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
	@Column(name = "OFFHIRE_SEQID")
	private Integer offhire_SeqId;
	
	
	@Column(name = "VOYAGEIDENCRYPTED" )
	private String voyageIdEncrypted;
	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	
	
	@Column(name = "VOYAGENUMBER")
	private String voyageNumber;
	
	@Column(name = "REASON")
	private String reason;

	@Transient
	private String dateFrom;
	
	@Column(name = "DATEFROM")
	private LocalDateTime date_From;
	
	@Transient
	private String dateTo;
	
	@Column(name = "DATETO")
	private LocalDateTime date_To;
	
	@Column(name = "DAYS")
	private Double days;
	

	@Column(name = "REMARK")
	private String remark;
	
	@OneToMany(mappedBy = "vslHdCntrctOffBunker",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_HdCntrtDTL_OffhireLst_Bun.class)
	private List<Q88_HdCntrtDTL_OffhireLst_Bun> offhireBunkers = new ArrayList<Q88_HdCntrtDTL_OffhireLst_Bun>();

	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
		  @JoinColumn(name = "TCINIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCINIDENCRYPTED"),
	  })
	
	private Q88_HdCntrtDTL vslHdCntrctOffhire;

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

	public Integer getOffhire_SeqId() {
		return offhire_SeqId;
	}

	public void setOffhire_SeqId(Integer offhire_SeqId) {
		this.offhire_SeqId = offhire_SeqId;
	}

	public String getVoyageIdEncrypted() {
		return voyageIdEncrypted;
	}

	public void setVoyageIdEncrypted(String voyageIdEncrypted) {
		this.voyageIdEncrypted = voyageIdEncrypted;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getVoyageNumber() {
		return voyageNumber;
	}

	public void setVoyageNumber(String voyageNumber) {
		this.voyageNumber = voyageNumber;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public LocalDateTime getDate_From() {
		return date_From;
	}

	public void setDate_From(String  date_From) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(date_From !=null) {
			 try {
					LocalDateTime date = LocalDateTime.parse(date_From, dateTimeFormatter);
		            this.date_From = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }
		 }
		 else {
		this.date_From = null;
		 }
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public LocalDateTime getDate_To() {
		return date_To;
	}

	public void setDate_To(String date_To) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(date_To !=null) {
			 try {
					LocalDateTime date = LocalDateTime.parse(date_To, dateTimeFormatter);
		            this.date_To = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }
		 }
		 else {
		this.date_To = null;
		 }
	}

	public Double getDays() {
		return days;
	}

	public void setDays(Double days) {
		this.days = days;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Q88_HdCntrtDTL getVslHdCntrctOffhire() {
		return vslHdCntrctOffhire;
	}

	public void setVslHdCntrctOffhire(Q88_HdCntrtDTL vslHdCntrctOffhire) {
		this.vslHdCntrctOffhire = vslHdCntrctOffhire;
	}

	public List<Q88_HdCntrtDTL_OffhireLst_Bun> getOffhireBunkers() {
		return offhireBunkers;
	}

	public void addOffhireBunkers(List<Q88_HdCntrtDTL_OffhireLst_Bun> offhireBunkers) {
		this.offhireBunkers = offhireBunkers;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_OffhireLst [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", offhire_SeqId=" + offhire_SeqId + ", voyageIdEncrypted="
				+ voyageIdEncrypted + ", displayOrder=" + displayOrder + ", voyageNumber=" + voyageNumber + ", reason="
				+ reason + ", dateFrom=" + dateFrom + ", date_From=" + date_From + ", dateTo=" + dateTo + ", date_To="
				+ date_To + ", days=" + days + ", remark=" + remark + ", offhireBunkers=" + offhireBunkers + "]";
	}
	
	

	
	
	
}
