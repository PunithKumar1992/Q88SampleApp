package com.bsol.q88.dto;

public class Q88_VoyageDTO {
	
	private String voyageId;
	private String vesselId;
	private String version;
	private String voyageNumber;
	private String vesselName;
	private String vesselimo;
	private String startDateUtc;
	private String endDateUtc;
	private String moduleType;
	private Double offhireDays;
	private String tags;
	private String url;
	private String isEstimate;
	private String tcnumber;
	private String tcoutidencrypted;
	public String getVoyageId() {
		return voyageId;
	}
	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}
	public String getVesselId() {
		return vesselId;
	}
	public void setVesselId(String vesselId) {
		this.vesselId = vesselId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVoyageNumber() {
		return voyageNumber;
	}
	public void setVoyageNumber(String voyageNumber) {
		this.voyageNumber = voyageNumber;
	}
	public String getVesselName() {
		return vesselName;
	}
	public void setVesselName(String vesselName) {
		this.vesselName = vesselName;
	}
	public String getVesselimo() {
		return vesselimo;
	}
	public void setVesselimo(String vesselimo) {
		this.vesselimo = vesselimo;
	}
	public String getStartDateUtc() {
		return startDateUtc;
	}
	public void setStartDateUtc(String startDateUtc) {
		this.startDateUtc = startDateUtc;
	}
	public String getEndDateUtc() {
		return endDateUtc;
	}
	public void setEndDateUtc(String endDateUtc) {
		this.endDateUtc = endDateUtc;
	}
	public String getModuleType() {
		return moduleType;
	}
	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}
	public Double getOffhireDays() {
		return offhireDays;
	}
	public void setOffhireDays(Double offhireDays) {
		this.offhireDays = offhireDays;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIsEstimate() {
		return isEstimate;
	}
	public void setIsEstimate(String isEstimate) {
		this.isEstimate = isEstimate;
	}
	public String getTcnumber() {
		return tcnumber;
	}
	public void setTcnumber(String tcnumber) {
		this.tcnumber = tcnumber;
	}
	public String getTcoutidencrypted() {
		return tcoutidencrypted;
	}
	public void setTcoutidencrypted(String tcoutidencrypted) {
		this.tcoutidencrypted = tcoutidencrypted;
	}
	@Override
	public String toString() {
		return "Q88_VoyageDTO [voyageId=" + voyageId + ", vesselId=" + vesselId + ", version=" + version
				+ ", voyageNumber=" + voyageNumber + ", vesselName=" + vesselName + ", vesselimo=" + vesselimo
				+ ", startDateUtc=" + startDateUtc + ", endDateUtc=" + endDateUtc + ", moduleType=" + moduleType
				+ ", offhireDays=" + offhireDays + ", tags=" + tags + ", url=" + url + ", isEstimate=" + isEstimate
				+ ", tcnumber=" + tcnumber + ", tcoutidencrypted=" + tcoutidencrypted + "]";
	}
	
	
	
	

}
