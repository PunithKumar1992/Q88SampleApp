package com.bsol.q88.model;



import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

import com.bsol.q88.model.cpk.Q88_PortListCPK;

@Entity
@Table(name ="Q88_PORTLIST")
@IdClass(Q88_PortListCPK.class)
public class Q88_PortList implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "PORTID", nullable = false)
	private Integer portId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SHORTNAME")
	private String shortName;
	
	@Column(name = "LAT")
	private Double lat;
	
	@Column(name = "LON")
	private Double lon;
	
	@Column(name = "UNCODE")
	private String unCode;
	
	@Column(name = "TIMEZONE")
	private Double timeZone;
	
	@Column(name = "AREANAME")
	private String areaName;
	
	@Column(name ="ISINACTIVE")
	private String isInactive ;

	@Transient
	private String  modifiedDate;
	
	@Column(name ="MODIFIEDDATE")
	private LocalDateTime  modified_Date;
	
	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public Integer getPortId() {
		return portId;
	}

	public void setPortId(Integer portId) {
		this.portId = portId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public String getUnCode() {
		return unCode;
	}

	public void setUnCode(String unCode) {
		this.unCode = unCode;
	}

	public Double getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(Double timeZone) {
		this.timeZone = timeZone;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getIsInactive() {
		return isInactive;
	}

	public void setIsInactive(String isInactive) {
		this.isInactive = isInactive;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public LocalDateTime getModified_Date() {
		return modified_Date;
	}

	public void setModified_Date(String modified_Date) {
		this.modified_Date = LocalDateTime.parse(modified_Date);
	}

	@Override
	public String toString() {
		return "Q88_PortList [trans_Id=" + trans_Id + ", portId=" + portId + ", name=" + name + ", shortName="
				+ shortName + ", lat=" + lat + ", lon=" + lon + ", unCode=" + unCode + ", timeZone=" + timeZone
				+ ", areaName=" + areaName + ", isInactive=" + isInactive + ", modifiedDate=" + modifiedDate
				+ ", modified_Date=" + modified_Date + "]";
	}

	

	

	
	
	
	

}
