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
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_HdCntrtDTL_Cntrt_RDlvrCPK;

@Entity
@Table(name = "Q88_HDCNTRTDTL_CNTRT_RDLVR")
@IdClass(Q88_HdCntrtDTL_Cntrt_RDlvrCPK.class)
public class Q88_HdCntrtDTL_Cntrt_RDlvr {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	@Id
	@Column(name = "TCINIDENCRYPTED")
	private String tcInIdEncrypted;
	
	@Column(name = "PORTIDENCRYPTED")
	private String portIdEncrypted;
	
	@Column(name = "PORTNAME")
	private String portName;
	
	@Transient
	private String datetime;
	
	@Column(name = "DATETIME")
	private LocalDateTime date_time;
	
	@OneToMany(mappedBy = "vslHdCntrctReDlvrBunker",fetch = FetchType.LAZY,cascade = CascadeType.ALL,targetEntity = Q88_HdCntrtDTL_Cntrt_RDlvr_Bun.class)
	private List<Q88_HdCntrtDTL_Cntrt_RDlvr_Bun> bunkerList   = new ArrayList<Q88_HdCntrtDTL_Cntrt_RDlvr_Bun>();

	
	@OneToOne(optional = true, fetch = FetchType.EAGER)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),
		  @JoinColumn(name = "TCINIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCINIDENCRYPTED"),
	  })
	
	private Q88_HdCntrtDTL_Cntrt vslHdCntrctReDlvr;

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

	public String getPortIdEncrypted() {
		return portIdEncrypted;
	}

	public void setPortIdEncrypted(String portIdEncrypted) {
		this.portIdEncrypted = portIdEncrypted;
	}

	public String getPortName() {
		return portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public LocalDateTime getDate_time() {
		return date_time;
	}

	public void setDate_time(String date_time) {
		String dateFormat = "dd MMM uuuu HH:mm";
		 DateTimeFormatter dateTimeFormatter = DateTimeFormatter
		            .ofPattern(dateFormat, Locale.US)
		            .withResolverStyle(ResolverStyle.STRICT);
		 if(date_time !=null) {
			 try {
					LocalDateTime date = LocalDateTime.parse(date_time, dateTimeFormatter);
					this.date_time = date;
				}catch (DateTimeParseException e) {
		            System.out.println("Exception was thrown ");
		        }
		 }else {
			 this.date_time = null;
		 }
		
	}


	public Q88_HdCntrtDTL_Cntrt getVslHdCntrctReDlvr() {
		return vslHdCntrctReDlvr;
	}

	public void setVslHdCntrctReDlvr(Q88_HdCntrtDTL_Cntrt vslHdCntrctReDlvr) {
		this.vslHdCntrctReDlvr = vslHdCntrctReDlvr;
	}

	public List<Q88_HdCntrtDTL_Cntrt_RDlvr_Bun> getBunkerList() {
		return bunkerList;
	}

	public void addBunkerList(List<Q88_HdCntrtDTL_Cntrt_RDlvr_Bun> bunkerList) {
		this.bunkerList = bunkerList;
	}

	@Override
	public String toString() {
		return "Q88_HdCntrtDTL_Cntrt_RDlvr [trans_Id=" + trans_Id + ", vesselIdEncrypted=" + vesselIdEncrypted
				+ ", tcInIdEncrypted=" + tcInIdEncrypted + ", portIdEncrypted=" + portIdEncrypted + ", portName="
				+ portName + ", datetime=" + datetime + ", date_time=" + date_time + ", bunkerList=" + bunkerList + "]";
	}

	
	

}
