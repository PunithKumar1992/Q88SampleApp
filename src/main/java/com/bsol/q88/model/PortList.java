package com.bsol.q88.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Q88_PORTLIST")
public class PortList {
	
	@Id
	@GeneratedValue
	@Column(name = "PORTID", unique = true, nullable = false)
	private int portId;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "SHORTNAME")
	private String shortName;
	
	@Column(name = "LAT")
	private double lat;
	
	@Column(name = "LON")
	private double lon;
	
	@Column(name = "UNCODE")
	private String unCode;
	
	@Column(name = "TIMEZONE")
	private float timeZone;
	
	@Column(name = "AREANAME")
	private String areaName;
	
	@Column(name ="ISINACTIVE")
	private String isInactive ;
	
	@Column(name ="MODIFIEDDATE")
	private String modifiedDate;
	
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
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getUnCode() {
		return unCode;
	}
	public void setUnCode(String unCode) {
		this.unCode = unCode;
	}
	public float getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(float timeZone) {
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
	@Override
	public String toString() {
		return "PortList [portId=" + portId + ", name=" + name + ", shortName=" + shortName + ", lat=" + lat + ", lon="
				+ lon + ", unCode=" + unCode + ", timeZone=" + timeZone + ", areaName=" + areaName + ", isInactive="
				+ isInactive + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
	
	

}
