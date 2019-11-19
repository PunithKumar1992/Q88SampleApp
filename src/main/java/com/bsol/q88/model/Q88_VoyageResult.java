package com.bsol.q88.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="Q88_VOYAGE_RESULT" ,schema = "CHOPS_WEB")
public class Q88_VoyageResult implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "VOYAGE_RES_SEQID")
	private Integer voyage_res_seqid;
	@Column(name = "VOYAGEID")
	private String voyageid;
	@Column(name = "VESSELID")
	private String vesselid;
	@Column(name = "BUNKERS")
	private Double bunkers;
	@Column(name = "COMMISSION")
	private Double commission;
	@Column(name = "DAYS")
	private Double days;
	@Column(name = "EFFICIENCY")
	private Double efficiency;
	@Column(name = "EXPENSE")
	private Double expense;
	@Column(name = "EXPENSES")
	private Double expenses;
	@Column(name = "MODIFIEDBYFULL")
	private String modifiedByFull;
	@Column(name = "MODIFIEDDATE")
	private String modifiedDate;
	@Column(name = "PNL")
	private Double pnl;
	@Column(name = "PORT")
	private Double port;
	@Column(name = "REVENUE")
	private Double revenue;
	@Column(name = "SAILEDIN")
	private Double sailedIn;
	@Column(name = "TCE")
	private Double tce;
	
	@OneToMany(targetEntity =Q88_VoyageResultDetail.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "q88voyageresult",orphanRemoval = false)
	private List<Q88_VoyageResultDetail> resultDetail = new ArrayList<Q88_VoyageResultDetail>();
	
	@OneToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="voyageid",nullable = false,referencedColumnName ="VOYAGEID",insertable=false, updatable=false),
		@JoinColumn(name="vesselid",nullable = false,referencedColumnName ="VESSELID",insertable=false, updatable=false)
	})
	private Q88_Voyage q88voyageres;

	public Integer getVoyage_res_seqid() {
		return voyage_res_seqid;
	}

	public void setVoyage_res_seqid(Integer voyage_res_seqid) {
		this.voyage_res_seqid = voyage_res_seqid;
	}

	public String getVoyageid() {
		return voyageid;
	}

	public void setVoyageid(String voyageid) {
		this.voyageid = voyageid;
	}

	public String getVesselid() {
		return vesselid;
	}

	public void setVesselid(String vesselid) {
		this.vesselid = vesselid;
	}

	public Double getBunkers() {
		return bunkers;
	}

	public void setBunkers(Double bunkers) {
		this.bunkers = bunkers;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public Double getDays() {
		return days;
	}

	public void setDays(Double days) {
		this.days = days;
	}

	public Double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(Double efficiency) {
		this.efficiency = efficiency;
	}

	public Double getExpense() {
		return expense;
	}

	public void setExpense(Double expense) {
		this.expense = expense;
	}

	public Double getExpenses() {
		return expenses;
	}

	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}

	public String getModifiedByFull() {
		return modifiedByFull;
	}

	public void setModifiedByFull(String modifiedByFull) {
		this.modifiedByFull = modifiedByFull;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Double getPnl() {
		return pnl;
	}

	public void setPnl(Double pnl) {
		this.pnl = pnl;
	}

	public Double getPort() {
		return port;
	}

	public void setPort(Double port) {
		this.port = port;
	}

	public Double getRevenue() {
		return revenue;
	}

	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}

	public Double getSailedIn() {
		return sailedIn;
	}

	public void setSailedIn(Double sailedIn) {
		this.sailedIn = sailedIn;
	}

	public Double getTce() {
		return tce;
	}

	public void setTce(Double tce) {
		this.tce = tce;
	}

	public List<Q88_VoyageResultDetail> getResultDetail() {
		return resultDetail;
	}

	public void setResultDetail(List<Q88_VoyageResultDetail> resultDetail) {
		this.resultDetail = resultDetail;
	}

	public Q88_Voyage getQ88voyageres() {
		return q88voyageres;
	}

	public void setQ88voyageres(Q88_Voyage q88voyageres) {
		this.q88voyageres = q88voyageres;
	}

	@Override
	public String toString() {
		return "Q88_VoyageResult [voyage_res_seqid=" + voyage_res_seqid + ", voyageid=" + voyageid + ", vesselid="
				+ vesselid + ", bunkers=" + bunkers + ", commission=" + commission + ", days=" + days + ", efficiency="
				+ efficiency + ", expense=" + expense + ", expenses=" + expenses + ", modifiedByFull=" + modifiedByFull
				+ ", modifiedDate=" + modifiedDate + ", pnl=" + pnl + ", port=" + port + ", revenue=" + revenue
				+ ", sailedIn=" + sailedIn + ", tce=" + tce + ", resultDetail=" + resultDetail + ", q88voyageres="
				+ q88voyageres + "]";
	}
	
	


	

}
