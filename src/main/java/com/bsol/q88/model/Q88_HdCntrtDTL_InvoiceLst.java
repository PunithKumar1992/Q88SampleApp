package com.bsol.q88.model;

import java.time.LocalDate;
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

import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_InvoiceLstCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_INVOICELST")
@IdClass(Q88_HdCntrtDTL_InvoiceLstCPK.class)
public class Q88_HdCntrtDTL_InvoiceLst {
	

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
	@Column(name = "INVOICE_SEQID")
	@SequenceGenerator(name = "invoiceSeqId", sequenceName = "Q88_HDCNTRTDTL_INVOICE_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "invoiceSeqId")
	private Integer invoice_SeqId;
	
	@Column(name = "INVOICEDIRECTION")
	private String InvoiceDirection;
	
	@Column(name = "DESCRIPTION")
	private String Description;
	
	@Transient
	private String PeriodStart;
	
	@Column(name = "PERIODSTART")
	private LocalDate period_Start;
	
	@Transient
	private String PeriodEnd;

	@Column(name = "PERIODEND")
	private LocalDate period_End;
	
	@Column(name = "TOTAL")
	private Double Total;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
		  @JoinColumn(name = "TCINIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCINIDENCRYPTED"),
	  })
	
	private Q88_HdCntrtDTL vslHdCntrctInvoice;

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

	public Integer getInvoice_SeqId() {
		return invoice_SeqId;
	}

	public void setInvoice_SeqId(Integer invoice_SeqId) {
		this.invoice_SeqId = invoice_SeqId;
	}

	public String getInvoiceDirection() {
		return InvoiceDirection;
	}

	public void setInvoiceDirection(String invoiceDirection) {
		InvoiceDirection = invoiceDirection;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPeriodStart() {
		return PeriodStart;
	}

	public void setPeriodStart(String periodStart) {
		PeriodStart = periodStart;
	}

	public LocalDate getPeriod_Start() {
		return period_Start;
	}

	public void setPeriod_Start(String  period_Start) {
		String dateFormat = "dd MMM uuuu";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(period_Start !=null) {
			 try {
					LocalDate date = LocalDate.parse(period_Start, dateTimeFormatter);
		           this.period_Start=date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown " +e);
		        }
		 }
		 else {
		this.period_Start = null;
		 }
	}

	public String getPeriodEnd() {
		return PeriodEnd;
	}

	public void setPeriodEnd(String periodEnd) {
		PeriodEnd = periodEnd;
	}

	public LocalDate getPeriod_End() {
		return period_End;
	}

	public void setPeriod_End(String period_End) {
		String dateFormat = "dd MMM uuuu";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(period_End!=null) {
			 try {
					LocalDate date = LocalDate.parse(period_End, dateTimeFormatter);
		           this.period_End=date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown  "+ e);
		        }
		 }
		 else {
			 this.period_End = null;
		 }
		
	}

	public Double getTotal() {
		return Total;
	}

	public void setTotal(Double total) {
		Total = total;
	}

	public Q88_HdCntrtDTL getVslHdCntrctInvoice() {
		return vslHdCntrctInvoice;
	}

	public void setVslHdCntrctInvoice(Q88_HdCntrtDTL vslHdCntrctInvoice) {
		this.vslHdCntrctInvoice = vslHdCntrctInvoice;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_InvoiceLst [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", invoice_SeqId=" + invoice_SeqId + ", InvoiceDirection="
				+ InvoiceDirection + ", Description=" + Description + ", PeriodStart=" + PeriodStart + ", Period_Start="
				+ period_Start + ", PeriodEnd=" + PeriodEnd + ", Period_End=" + period_End + ", Total=" + Total + "]";
	}

	
	
}
