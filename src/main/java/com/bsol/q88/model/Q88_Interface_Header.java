package com.bsol.q88.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Q88_INTF_HEADER")
public class Q88_Interface_Header {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Column(name = "API_CALL")
	private String apiCall;
	
	@Column(name = "VOYAGE_ID")
	private String voyageId;
	@Column(name = "PORT_ID")
	private Integer portId;
	@Column(name = "VESSEL_ID_ENCYRPT")
	private String vesselIDEncrypt;
	@Column(name = "TC_IN_ID_ENCRYPT")
	private String tcInIdEncrypt;
	@Column(name = "TC_OUT_ID_ENCRYPT")
	private String tcOutIdEncrypt;
	@Column(name = "CALL_START")
	private LocalDateTime callStart;
	@Column(name = "CALL_END")
	private LocalDateTime callEnd;
	@Column(name = "MODIFIED_DATE")
	private LocalDateTime modifiedDate;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "REASON")
	private String reason;
	@Column(name = "RECORD_PROCESSED")
	private Integer recordProcessed;
	@Column(name = "USER_INS")
	private String userIns;
	@Column(name = "DATE_INS")
	private LocalDateTime dateIns;
	
	@Column(name = "IS_PROCESSED")
	private String is_processed;
	
	public Integer getTrans_Id() {
		return trans_Id;
	}
	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}
	public String getApiCall() {
		return apiCall;
	}
	public void setApiCall(String apiCall) {
		this.apiCall = apiCall;
	}
	public String getVoyageId() {
		return voyageId;
	}
	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}
	public Integer getPortId() {
		return portId;
	}
	public void setPortId(Integer portId) {
		this.portId = portId;
	}
	public String getVesselIDEncrypt() {
		return vesselIDEncrypt;
	}
	public void setVesselIDEncrypt(String vesselIDEncrypt) {
		this.vesselIDEncrypt = vesselIDEncrypt;
	}
	public String getTcInIdEncrypt() {
		return tcInIdEncrypt;
	}
	public void setTcInIdEncrypt(String tcInIdEncrypt) {
		this.tcInIdEncrypt = tcInIdEncrypt;
	}
	public String getTcOutIdEncrypt() {
		return tcOutIdEncrypt;
	}
	public void setTcOutIdEncrypt(String tcOutIdEncrypt) {
		this.tcOutIdEncrypt = tcOutIdEncrypt;
	}
	public LocalDateTime getCallStart() {
		return callStart;
	}
	public void setCallStart(LocalDateTime callStart) {
		this.callStart = callStart;
	}
	public LocalDateTime getCallEnd() {
		return callEnd;
	}
	public void setCallEnd(LocalDateTime callEnd) {
		this.callEnd = callEnd;
	}
	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = LocalDateTime.parse(modifiedDate);
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getRecordProcessed() {
		return recordProcessed;
	}
	public void setRecordProcessed(Integer recordProcessed) {
		this.recordProcessed = recordProcessed;
	}
	public String getUserIns() {
		return userIns;
	}
	public void setUserIns(String userIns) {
		this.userIns = userIns;
	}
	public LocalDateTime getDateIns() {
		return dateIns;
	}
	public void setDateIns(LocalDateTime dateIns) {
		this.dateIns = dateIns;
	}
	
	public String getIs_processed() {
		return is_processed;
	}
	public void setIs_processed(String is_processed) {
		this.is_processed = is_processed;
	}
	@Override
	public String toString() {
		return "Q88_Interface_Header [trans_Id=" + trans_Id + ", apiCall=" + apiCall + ", voyageId=" + voyageId
				+ ", portId=" + portId + ", vesselIDEncrypt=" + vesselIDEncrypt + ", tcInIdEncrypt=" + tcInIdEncrypt
				+ ", tcOutIdEncrypt=" + tcOutIdEncrypt + ", callStart=" + callStart + ", callEnd=" + callEnd
				+ ", modifiedDate=" + modifiedDate + ", status=" + status + ", reason=" + reason + ", recordProcessed="
				+ recordProcessed + ", userIns=" + userIns + ", dateIns=" + dateIns + ", is_processed=" + is_processed
				+ "]";
	}
	
	
	
}
