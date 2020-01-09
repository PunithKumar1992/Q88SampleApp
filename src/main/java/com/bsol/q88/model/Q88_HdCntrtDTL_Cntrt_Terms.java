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
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_Cntrt_TermsCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_CNTRT_TERMS")
@IdClass(Q88_HdCntrtDTL_Cntrt_TermsCPK.class)
public class Q88_HdCntrtDTL_Cntrt_Terms {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	@Id
	@Column(name = "TCINIDENCRYPTED")
	private String tcInIdEncrypted;
	
	@Column(name = "DELIVERYRANGE")
	private String deliveryRange;
	
	@Column(name = "REDELIVERYRANGE")
	private String redeliveryRange;
	
	@Column(name = "NOTICES")
	private String notices;
	
	@Column(name = "REDELIVERYDAYS")
	private Integer redeliveryDays;
	
	
	@Column(name = "OPTIONDECLAREDAYS")
	private Integer optionDeclareDays;
	
	@Column(name = "EARLIESTNOTICEDAYS")
	private Integer earliestNoticeDays;
	
	@Transient
	private String declareOptionDate;
	
	@Column(name = "DECLAREOPTIONDATE")
	private LocalDateTime declare_OptionDate;
	
	@Transient
	private String earliestRedeliveryNoticeDate;
	
	@Column(name = "EARLIESTREDELIVERYNOTICEDATE")
	private LocalDateTime earliest_RedeliveryNoticeDate;
	
	@Transient
	private String earliestRedeliveryDate;
	
	@Column(name = "EARLIESTREDELIVERYDATE")
	private LocalDateTime earliest_RedeliveryDate;
	
	@Transient
	private String expectedRedeliveryDate;
	
	@Column(name = "EXPECTEDREDELIVERYDATE")
	private LocalDateTime expected_RedeliveryDate;
	
	@Transient
	private String latestRedeliveryDate;

	@Column(name = "LATESTREDELIVERYDATE")
	private LocalDateTime latest_RedeliveryDate;
	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
		  @JoinColumn(name = "TCINIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCINIDENCRYPTED"),
	  })
	
	private Q88_HdCntrtDTL_Cntrt vslHdCntrctTerms;

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

	public String getDeliveryRange() {
		return deliveryRange;
	}

	public void setDeliveryRange(String deliveryRange) {
		this.deliveryRange = deliveryRange;
	}

	public String getRedeliveryRange() {
		return redeliveryRange;
	}

	public void setRedeliveryRange(String redeliveryRange) {
		this.redeliveryRange = redeliveryRange;
	}

	public String getNotices() {
		return notices;
	}

	public void setNotices(String notices) {
		this.notices = notices;
	}

	public Integer getRedeliveryDays() {
		return redeliveryDays;
	}

	public void setRedeliveryDays(Integer redeliveryDays) {
		this.redeliveryDays = redeliveryDays;
	}

	public Integer getOptionDeclareDays() {
		return optionDeclareDays;
	}

	public void setOptionDeclareDays(Integer optionDeclareDays) {
		this.optionDeclareDays = optionDeclareDays;
	}

	public Integer getEarliestNoticeDays() {
		return earliestNoticeDays;
	}

	public void setEarliestNoticeDays(Integer earliestNoticeDays) {
		this.earliestNoticeDays = earliestNoticeDays;
	}

	public String getDeclareOptionDate() {
		return declareOptionDate;
	}

	public void setDeclareOptionDate(String declareOptionDate) {
		this.declareOptionDate = declareOptionDate;
	}

	public LocalDateTime getDeclare_OptionDate() {
		return declare_OptionDate;
	}

	public void setDeclare_OptionDate(String declare_OptionDate) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(declare_OptionDate !=null) {
			 try {
					LocalDateTime date = LocalDateTime.parse(declare_OptionDate, dateTimeFormatter);
		            this.declare_OptionDate = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }
		 }
		 else {
			 this.declare_OptionDate = null;
			}
	}

	public String getEarliestRedeliveryNoticeDate() {
		return earliestRedeliveryNoticeDate;
	}

	public void setEarliestRedeliveryNoticeDate(String earliestRedeliveryNoticeDate) {
		this.earliestRedeliveryNoticeDate = earliestRedeliveryNoticeDate;
	}

	public LocalDateTime getEarliest_RedeliveryNoticeDate() {
		return earliest_RedeliveryNoticeDate;
	}

	public void setEarliest_RedeliveryNoticeDate(String  earliest_RedeliveryNoticeDate) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(earliest_RedeliveryNoticeDate !=null) {
			 try {
					LocalDateTime date = LocalDateTime.parse(earliest_RedeliveryNoticeDate, dateTimeFormatter);
		            this.earliest_RedeliveryNoticeDate = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }
		 }
		 else {
		this.earliest_RedeliveryNoticeDate = null;
		 }
	}

	public String getEarliestRedeliveryDate() {
		return earliestRedeliveryDate;
	}

	public void setEarliestRedeliveryDate(String earliestRedeliveryDate) {
		this.earliestRedeliveryDate = earliestRedeliveryDate;
	}

	public LocalDateTime getEarliest_RedeliveryDate() {
		return earliest_RedeliveryDate;
	}

	public void setEarliest_RedeliveryDate(String earliest_RedeliveryDate) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(earliest_RedeliveryDate !=null) {
			 try {
					LocalDateTime date = LocalDateTime.parse(earliest_RedeliveryDate, dateTimeFormatter);
		            this.earliest_RedeliveryDate = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }
		 }
		 else {
		this.earliest_RedeliveryDate = null;
		 }
	}

	public String getExpectedRedeliveryDate() {
		return expectedRedeliveryDate;
	}

	public void setExpectedRedeliveryDate(String expectedRedeliveryDate) {
		this.expectedRedeliveryDate = expectedRedeliveryDate;
	}

	public LocalDateTime getExpected_RedeliveryDate() {
		return expected_RedeliveryDate;
	}

	public void setExpected_RedeliveryDate(String  expected_RedeliveryDate) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(expected_RedeliveryDate !=null) {
			 try {
					LocalDateTime date = LocalDateTime.parse(expected_RedeliveryDate, dateTimeFormatter);
		            this.expected_RedeliveryDate = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }
		 }
		 else {
		this.expected_RedeliveryDate = null;
		 }
	}

	public String getLatestRedeliveryDate() {
		return latestRedeliveryDate;
	}

	public void setLatestRedeliveryDate(String latestRedeliveryDate) {
		this.latestRedeliveryDate = latestRedeliveryDate;
	}

	public LocalDateTime getLatest_RedeliveryDate() {
		return latest_RedeliveryDate;
	}

	public void setLatest_RedeliveryDate(String latest_RedeliveryDate) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(latest_RedeliveryDate !=null) {
			 try {
					LocalDateTime date = LocalDateTime.parse(latest_RedeliveryDate, dateTimeFormatter);
		            this.latest_RedeliveryDate = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }
		 }
		 else {
		this.latest_RedeliveryDate = null;
		 }
	}

	public Q88_HdCntrtDTL_Cntrt getVslHdCntrctTerms() {
		return vslHdCntrctTerms;
	}

	public void setVslHdCntrctTerms(Q88_HdCntrtDTL_Cntrt vslHdCntrctTerms) {
		this.vslHdCntrctTerms = vslHdCntrctTerms;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_Cntrt_Terms [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", deliveryRange=" + deliveryRange + ", redeliveryRange="
				+ redeliveryRange + ", notices=" + notices + ", redeliveryDays=" + redeliveryDays
				+ ", optionDeclareDays=" + optionDeclareDays + ", earliestNoticeDays=" + earliestNoticeDays
				+ ", declareOptionDate=" + declareOptionDate + ", declare_OptionDate=" + declare_OptionDate
				+ ", earliestRedeliveryNoticeDate=" + earliestRedeliveryNoticeDate + ", earliest_RedeliveryNoticeDate="
				+ earliest_RedeliveryNoticeDate + ", earliestRedeliveryDate=" + earliestRedeliveryDate
				+ ", earliest_RedeliveryDate=" + earliest_RedeliveryDate + ", expectedRedeliveryDate="
				+ expectedRedeliveryDate + ", expected_RedeliveryDate=" + expected_RedeliveryDate
				+ ", latestRedeliveryDate=" + latestRedeliveryDate + ", latest_RedeliveryDate=" + latest_RedeliveryDate
				+ "]";
	}
	
	
}
