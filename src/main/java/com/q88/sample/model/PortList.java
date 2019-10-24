package com.q88.sample.model;

import java.sql.Timestamp;
import java.util.TimeZone;

import javax.persistence.Entity;
import javax.persistence.Table;


public class PortList {
	
	private int portId;
	private String name;
	private String shortName;
	private float lat;
	private float lon;
	private String unCode;
	private Timestamp timeZone;
	private String areaName;
	private String isInactive ;
	private Timestamp modifiedDate;
	public int getPortId() {
		return portId;
	}
	public void setPortId(int portId) {
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
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	public String getUnCode() {
		return unCode;
	}
	public void setUnCode(String unCode) {
		this.unCode = unCode;
	}
	public Timestamp getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(Timestamp timeZone) {
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
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Override
	public String toString() {
		return "PortList [portId=" + portId + ", name=" + name + ", shortName=" + shortName + ", lat=" + lat + ", lon="
				+ lon + ", unCode=" + unCode + ", timeZone=" + timeZone + ", areaName=" + areaName + ", isInactive="
				+ isInactive + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
	
	

}
