package com.bsol.q88.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
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

import com.bsol.q88.model.cpk.Q88_TCOutDtl_ContractCPK;

@Entity
@Table(name = "Q88_TCOUTDTL_CONTRACT")
@IdClass(Q88_TCOutDtl_ContractCPK.class)
public class Q88_TCOutDtl_Contract implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	@Column(name = "VESSEL")
	private String vessel;
	@Column(name = "CHARTERER")
	private String charterer;
	
	@Transient
	private String cpDate;
	@Column(name = "CPDATE")
	private LocalDateTime cp_Date;
	@Column(name = "TCNUMBER")
	private String tcNumber;
	@Column(name = "DURATION")
	private String duration;
	@Transient
	private String startDate;
	@Column(name = "STARTDATE")
	private LocalDateTime start_Date;
	@Transient
	private String modifiedDate;
	@Column(name = "MODIFIEDDATE")
	private LocalDateTime modified_Date;
	@Column(name = "MODIFIEDBY")
	private String modifiedBy;

	@OneToOne(mappedBy = "q88TcFixturereview", fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = true)
	private Q88_TcOutDtl_Review review;

	@OneToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumns({
			@JoinColumn(name = "TRANS_ID", nullable = false, insertable = false, updatable = false, referencedColumnName = "TRANS_ID"),
			@JoinColumn(name = "TCOUTIDENCRYPTED", nullable = false, insertable = false, updatable = false, referencedColumnName = "TCOUTIDENCRYPTED"),
			@JoinColumn(name = "VESSELIDENCRYPTED", nullable = false, insertable = false, updatable = false, referencedColumnName = "VESSELIDENCRYPTED"),

	})
	private Q88_TcOutDtl q88TcOutListFixture;

	

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}

	public String getTcOutIdEncrypted() {
		return tcOutIdEncrypted;
	}

	public void setTcOutIdEncrypted(String tcOutIdEncrypted) {
		this.tcOutIdEncrypted = tcOutIdEncrypted;
	}

	public String getVesselIdEncrypted() {
		return vesselIdEncrypted;
	}

	public void setVesselIdEncrypted(String vesselIdEncrypted) {
		this.vesselIdEncrypted = vesselIdEncrypted;
	}

	public String getVessel() {
		return vessel;
	}

	public void setVessel(String vessel) {
		this.vessel = vessel;
	}

	public String getCharterer() {
		return charterer;
	}

	public void setCharterer(String charterer) {
		this.charterer = charterer;
	}

	public String getCpDate() {
		return cpDate;
	}

	public void setCpDate(String cpDate) {
		this.cpDate = cpDate;
	}

	public String getTcNumber() {
		return tcNumber;
	}

	public void setTcNumber(String tcNumber) {
		this.tcNumber = tcNumber;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Q88_TcOutDtl_Review getReview() {
		return review;
	}

	public void setReview(Q88_TcOutDtl_Review review) {
		if (review == null) {
			if (this.review != null) {
				this.review.setQ88TcFixturereview(null);
			}
		} else {
			review.setQ88TcFixturereview(this);
		}
		this.review = review;
	}

	public Q88_TcOutDtl getQ88TcOutListFixture() {
		return q88TcOutListFixture;
	}

	public void setQ88TcOutListFixture(Q88_TcOutDtl q88TcOutListFixture) {
		this.q88TcOutListFixture = q88TcOutListFixture;
	}
	
	

	public LocalDateTime getCp_Date() {
		return cp_Date;
	}

	public void setCp_Date(String cp_Date) {
		this.cp_Date = LocalDateTime.parse(cp_Date);
	}

	public LocalDateTime getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(String start_Date) {
		this.start_Date = LocalDateTime.parse(start_Date);
	}

	public LocalDateTime getModified_Date() {
		return modified_Date;
	}

	public void setModified_Date(String modified_Date) {
		this.modified_Date = LocalDateTime.parse(modified_Date);
	}

	@Override
	public String toString() {
		return "Q88_TCOutDtl_Contract [trans_Id=" + trans_Id + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", vessel=" + vessel + ", charterer=" + charterer
				+ ", cpDate=" + cpDate + ", tcNumber=" + tcNumber + ", duration=" + duration + ", startDate="
				+ startDate + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + ", review=" + review
				+ "]";
	}

	

}
