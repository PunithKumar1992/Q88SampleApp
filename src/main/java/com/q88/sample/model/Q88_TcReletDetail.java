package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_TCRELETDETAIL")
public class Q88_TcReletDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "TCRELETDETAIL_SEQID")
	private Integer tcreletdetail_seqid;
	@Column(name = "FIXTUREREMARKS")
	private String  fixtureRemarks ;	
	@Column(name = "DELIVERYDATETIMEZ")
	private String  deliveryDateTimeZ;	
	@Column(name = "DELIVERYLEGNAME")
	private String  deliveryLegName;
	@Column(name = "REDELIVERYDATETIMEZ")
	private String  redeliveryDateTimeZ;	
	@Column(name = "REDELIVERYLEGNAME")
	private String  redeliveryLegName;	
	@Column(name = "TCRELETDURATION")
	private Number tcReletDuration;
	@Column(name = "TCRELETDURATIONUNIT")
	private String tcReletDurationUnit;	
	@Column(name = "VOYAGEID")
	private String voyageid;
	@Column(name = "VOYAGENUMBER")
	private String voyagenumber;	
	@Column(name = "VESSELID")
	private String vesselid;		
	
	@OneToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="voyageid",referencedColumnName = "VOYAGEID",insertable=false, updatable=false),
		@JoinColumn(name="voyagenumber",referencedColumnName = "VOYAGENUMBER",insertable=false, updatable=false),
		@JoinColumn(name="vesselid",referencedColumnName = "VESSELID",insertable=false, updatable=false),
	})
	private Q88_Voyage q88tcreletdetail;

	public Integer getTcreletdetail_seqid() {
		return tcreletdetail_seqid;
	}

	public void setTcreletdetail_seqid(Integer tcreletdetail_seqid) {
		this.tcreletdetail_seqid = tcreletdetail_seqid;
	}

	public String getFixtureRemarks() {
		return fixtureRemarks;
	}

	public void setFixtureRemarks(String fixtureRemarks) {
		this.fixtureRemarks = fixtureRemarks;
	}

	public String getDeliveryDateTimeZ() {
		return deliveryDateTimeZ;
	}

	public void setDeliveryDateTimeZ(String deliveryDateTimeZ) {
		this.deliveryDateTimeZ = deliveryDateTimeZ;
	}

	public String getDeliveryLegName() {
		return deliveryLegName;
	}

	public void setDeliveryLegName(String deliveryLegName) {
		this.deliveryLegName = deliveryLegName;
	}

	public String getRedeliveryDateTimeZ() {
		return redeliveryDateTimeZ;
	}

	public void setRedeliveryDateTimeZ(String redeliveryDateTimeZ) {
		this.redeliveryDateTimeZ = redeliveryDateTimeZ;
	}

	public String getRedeliveryLegName() {
		return redeliveryLegName;
	}

	public void setRedeliveryLegName(String redeliveryLegName) {
		this.redeliveryLegName = redeliveryLegName;
	}

	public Number getTcReletDuration() {
		return tcReletDuration;
	}

	public void setTcReletDuration(Number tcReletDuration) {
		this.tcReletDuration = tcReletDuration;
	}

	public String getTcReletDurationUnit() {
		return tcReletDurationUnit;
	}

	public void setTcReletDurationUnit(String tcReletDurationUnit) {
		this.tcReletDurationUnit = tcReletDurationUnit;
	}

	public String getVoyageid() {
		return voyageid;
	}

	public void setVoyageid(String voyageid) {
		this.voyageid = voyageid;
	}

	public String getVoyagenumber() {
		return voyagenumber;
	}

	public void setVoyagenumber(String voyagenumber) {
		this.voyagenumber = voyagenumber;
	}

	public String getVesselid() {
		return vesselid;
	}

	public void setVesselid(String vesselid) {
		this.vesselid = vesselid;
	}

	public Q88_Voyage getQ88tcreletdetail() {
		return q88tcreletdetail;
	}

	public void setQ88tcreletdetail(Q88_Voyage q88tcreletdetail) {
		this.q88tcreletdetail = q88tcreletdetail;
	}

	@Override
	public String toString() {
		return "Q88_TcReletDetail [tcreletdetail_seqid=" + tcreletdetail_seqid + ", fixtureRemarks=" + fixtureRemarks
				+ ", deliveryDateTimeZ=" + deliveryDateTimeZ + ", deliveryLegName=" + deliveryLegName
				+ ", redeliveryDateTimeZ=" + redeliveryDateTimeZ + ", redeliveryLegName=" + redeliveryLegName
				+ ", tcReletDuration=" + tcReletDuration + ", tcReletDurationUnit=" + tcReletDurationUnit
				+ ", voyageid=" + voyageid + ", voyagenumber=" + voyagenumber + ", vesselid=" + vesselid
				+ ", q88tcreletdetail=" + q88tcreletdetail + "]";
	}

	
}
