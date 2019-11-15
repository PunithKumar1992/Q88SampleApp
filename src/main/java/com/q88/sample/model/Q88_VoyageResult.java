package com.q88.sample.model;


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
	private Number bunkers;
	@Column(name = "COMMISSION")
	private Number commission;
	@Column(name = "DAYS")
	private Number days;
	@Column(name = "EFFICIENCY")
	private Number efficiency;
	@Column(name = "EXPENSE")
	private Number expense;
	@Column(name = "EXPENSES")
	private Number expenses;
	@Column(name = "MODIFIEDBYFULL")
	private String modifiedByFull;
	@Column(name = "MODIFIEDDATE")
	private String modifiedDate;
	@Column(name = "PNL")
	private Number pnl;
	@Column(name = "PORT")
	private Number port;
	@Column(name = "REVENUE")
	private Number revenue;
	@Column(name = "SAILEDIN")
	private Number sailedIn;
	@Column(name = "TCE")
	private Number tce;
	
	@OneToMany(targetEntity =Q88_VoyageResultDetail.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "q88voyageresult",orphanRemoval = false)
	private List<Q88_VoyageResultDetail> resultDetail = new ArrayList<Q88_VoyageResultDetail>();
	
	@OneToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="voyageid",referencedColumnName ="VOYAGEID",insertable=false, updatable=false),
		@JoinColumn(name="vesselid",referencedColumnName ="VESSELID",insertable=false, updatable=false)
	})
	private Q88_Voyage q88voyageres;


	public Integer getVoyage_res_seqid() {
		return voyage_res_seqid;
	}


	public void setVoyage_res_seqid(Integer voyage_res_seqid) {
		this.voyage_res_seqid = voyage_res_seqid;
	}

	public Number getBunkers() {
		return bunkers;
	}

	public void setBunkers(Number bunkers) {
		this.bunkers = bunkers;
	}

	public Number getCommission() {
		return commission;
	}

	public void setCommission(Number commission) {
		this.commission = commission;
	}

	public Number getDays() {
		return days;
	}

	public void setDays(Number days) {
		this.days = days;
	}

	public Number getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(Number efficiency) {
		this.efficiency = efficiency;
	}
	public Number getExpense() {
		return expense;
	}



	public void setExpense(Number expense) {
		this.expense = expense;
	}



	public Number getExpenses() {
		return expenses;
	}



	public void setExpenses(Number expenses) {
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



	public Number getPnl() {
		return pnl;
	}



	public void setPnl(Number pnl) {
		this.pnl = pnl;
	}



	public Number getPort() {
		return port;
	}



	public void setPort(Number port) {
		this.port = port;
	}



	public Number getRevenue() {
		return revenue;
	}



	public void setRevenue(Number revenue) {
		this.revenue = revenue;
	}



	public Number getSailedIn() {
		return sailedIn;
	}



	public void setSailedIn(Number sailedIn) {
		this.sailedIn = sailedIn;
	}



	public Number getTce() {
		return tce;
	}



	public void setTce(Number tce) {
		this.tce = tce;
	}



	public List<Q88_VoyageResultDetail> getResultDetail() {
		return resultDetail;
	}



	public void setResultDetail(List<Q88_VoyageResultDetail> resultDetail) {
		this.resultDetail = resultDetail;
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



	public Q88_Voyage getQ88voyageres() {
		return q88voyageres;
	}



	public void setQ88voyageres(Q88_Voyage q88voyageres) {
		this.q88voyageres = q88voyageres;
	}



	@Override
	public String toString() {
		return "Q88_VoyageResult [voyage_res_seqid=" + voyage_res_seqid + ", bunkers=" + bunkers + ", commission="
				+ commission + ", days=" + days + ", efficiency=" + efficiency + ", expense=" + expense + ", expenses="
				+ expenses + ", modifiedByFull=" + modifiedByFull + ", modifiedDate=" + modifiedDate + ", pnl=" + pnl
				+ ", port=" + port + ", revenue=" + revenue + ", sailedIn=" + sailedIn + ", tce=" + tce
				+ ", resultDetail=" + resultDetail + ", voyageid=" + voyageid + ", vesselid=" + vesselid 
				+ ", q88voyageres=" + q88voyageres + "]";
	}

	
	

}
