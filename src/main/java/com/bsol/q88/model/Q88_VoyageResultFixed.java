/*package com.bsol.q88.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.bsol.q88.model.cpk.Q88_VoyageResultFixedCPK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@IdClass(Q88_VoyageResultFixedCPK.class)
@Table(name = "Q88_VOYAGE_RESULTFIXED",schema = "CHOPS_WEB")
@JsonInclude(Include.NON_NULL)
public class Q88_VoyageResultFixed implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "VOYAGE_RESFIXED_SEQID")
	private Integer voyage_resfixed_seqid;
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
	
	@OneToMany(targetEntity =Q88_VoyageResultDetailFixed.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "q88voyageresultfixed",orphanRemoval = false)
	private List<Q88_VoyageResultDetailFixed> resultDetail =new ArrayList<Q88_VoyageResultDetailFixed>();
	
	@Id
	@Column(name = "VOYAGEID")
	private String  voyageid;
	
	@Id
	@Column(name = "VESSELID")
	private String  vesselid;
	

	@Id
	@Column(name = "VOYAGE_TRANS_ID")
	private Integer voyage_Trans_Id;

	@OneToOne(optional=false,fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="voyageid",referencedColumnName = "VOYAGEID",insertable=false, updatable=false),
		@JoinColumn(name="vesselid",referencedColumnName = "VESSELID",insertable=false, updatable=false),
		@JoinColumn(name="voyage_Trans_Id",nullable = false,referencedColumnName ="VOYAGE_TRANS_ID",insertable=false, updatable=false)
	})
	private Q88_Voyage q88voyageresfix;

	public Integer getVoyage_resfixed_seqid() {
		return voyage_resfixed_seqid;
	}

	public void setVoyage_resfixed_seqid(Integer voyage_resfixed_seqid) {
		this.voyage_resfixed_seqid = voyage_resfixed_seqid;
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

	public List<Q88_VoyageResultDetailFixed> getResultDetail() {
		return resultDetail;
	}

	public void setResultDetail(List<Q88_VoyageResultDetailFixed> resultDetail) {
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

	public Integer getVoyage_Trans_Id() {
		return voyage_Trans_Id;
	}

	public void setVoyage_Trans_Id(Integer voyage_Trans_Id) {
		this.voyage_Trans_Id = voyage_Trans_Id;
	}

	public Q88_Voyage getQ88voyageresfix() {
		return q88voyageresfix;
	}

	public void setQ88voyageresfix(Q88_Voyage q88voyageresfix) {
		this.q88voyageresfix = q88voyageresfix;
	}

	@Override
	public String toString() {
		return "Q88_VoyageResultFixed [voyage_resfixed_seqid=" + voyage_resfixed_seqid + ", bunkers=" + bunkers
				+ ", commission=" + commission + ", days=" + days + ", efficiency=" + efficiency + ", expense="
				+ expense + ", expenses=" + expenses + ", modifiedByFull=" + modifiedByFull + ", modifiedDate="
				+ modifiedDate + ", pnl=" + pnl + ", port=" + port + ", revenue=" + revenue + ", sailedIn=" + sailedIn
				+ ", tce=" + tce + ", resultDetail=" + resultDetail + ", voyageid=" + voyageid + ", vesselid="
				+ vesselid + ", voyage_Trans_Id=" + voyage_Trans_Id + "]";
	}

	
	
}
*/