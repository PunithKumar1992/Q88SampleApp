package com.bsol.q88.model;

import java.time.LocalDateTime;

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

import com.bsol.q88.model.cpk.Q88_VoyObj_TcreletCPK;

@Entity
@Table(name = "Q88_VOYOBJ_TCRELET")
@IdClass(Q88_VoyObj_TcreletCPK.class)
public class Q88_VoyObj_Tcrelet {
	

	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Column(name = "FIXTUREREMARKS")
	private String fixtureRemarks;
	
	@Transient
	private String deliveryDateTimeZ;
	
	@Column(name = "DELIVERYDATETIMEZ")
	private LocalDateTime delivery_DateTimeZ;
	
	@Column(name = "DELIVERYLEGNAME")
	private String deliveryLegName;
	
	@Transient
	private String redeliveryDateTimeZ;
	
	@Column(name = "REDELIVERYDATETIMEZ")
	private LocalDateTime redelivery_DateTimeZ;
	
	@Column(name = "REDELIVERYLEGNAME")
	private String redeliveryLegName;
	
	@Column(name = "TCRELETDURATION")
	private Double tcReletDuration;
	
	@Column(name = "TCRELETDURATIONUNIT")
	private String tcReletDurationUnit;
	
	@OneToOne(optional = true,fetch = FetchType.EAGER)
	@JoinColumns({
		@JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		@JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	})
	private Q88_VoyObj voyObjTcRelet;

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getVoyageId() {
		return voyageId;
	}

	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
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

	public LocalDateTime getDelivery_DateTimeZ() {
		return delivery_DateTimeZ;
	}

	public void setDelivery_DateTimeZ(String  delivery_DateTimeZ) {
		if(delivery_DateTimeZ !=null) {
		this.delivery_DateTimeZ = LocalDateTime.parse(delivery_DateTimeZ);
		}
		else {
			this.delivery_DateTimeZ = null;
		}
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

	public LocalDateTime getRedelivery_DateTimeZ() {
		return redelivery_DateTimeZ;
	}

	public void setRedelivery_DateTimeZ(String redelivery_DateTimeZ) {	
		if(redelivery_DateTimeZ !=null) {
			this.redelivery_DateTimeZ = LocalDateTime.parse(redelivery_DateTimeZ);
		}
		else {
			this.redelivery_DateTimeZ = null;
		}
	}

	public String getRedeliveryLegName() {
		return redeliveryLegName;
	}

	public void setRedeliveryLegName(String redeliveryLegName) {
		this.redeliveryLegName = redeliveryLegName;
	}

	public Double getTcReletDuration() {
		return tcReletDuration;
	}

	public void setTcReletDuration(Double tcReletDuration) {
		this.tcReletDuration = tcReletDuration;
	}

	public String getTcReletDurationUnit() {
		return tcReletDurationUnit;
	}

	public void setTcReletDurationUnit(String tcReletDurationUnit) {
		this.tcReletDurationUnit = tcReletDurationUnit;
	}

	public Q88_VoyObj getVoyObjTcRelet() {
		return voyObjTcRelet;
	}

	public void setVoyObjTcRelet(Q88_VoyObj voyObjTcRelet) {
		this.voyObjTcRelet = voyObjTcRelet;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Tcrelet [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", fixtureRemarks="
				+ fixtureRemarks + ", deliveryDateTimeZ=" + deliveryDateTimeZ + ", delivery_DateTimeZ="
				+ delivery_DateTimeZ + ", deliveryLegName=" + deliveryLegName + ", redeliveryDateTimeZ="
				+ redeliveryDateTimeZ + ", redelivery_DateTimeZ=" + redelivery_DateTimeZ + ", redeliveryLegName="
				+ redeliveryLegName + ", tcReletDuration=" + tcReletDuration + ", tcReletDurationUnit="
				+ tcReletDurationUnit + "]";
	}
	
	
	

}
