package com.bsol.q88.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VoyObj_RsltCPK;

@Entity
@Table(name = "Q88_VOYOBJ_RSLT")
@IdClass(Q88_VoyObj_RsltCPK.class)
public class Q88_VoyObj_Rslt implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
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
	
	@Transient
	private String modifiedDate;
	
	@Column(name = "MODIFIEDDATE")
	private LocalDateTime modified_Date;
	
	@Column(name = "PNL")
	private Double pnl;
	
	@Column(name = "PORT")
	private Double port;
	
	@Column(name = "REVENUE")
	private Double revenue;
	
	@Column(name = "SAILEDIN" )
	private Double sailedIn;
	
	@Column(name = "TCE")
	private Double tce;
	
	@OneToMany(mappedBy = "voyObjRsltDtl", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Q88_VoyObj_RsltDtl.class)
	private List<Q88_VoyObj_RsltDtl> resultDetail = new ArrayList<Q88_VoyObj_RsltDtl>();
	
	@OneToOne(optional = true,fetch = FetchType.EAGER)
	@JoinColumns({
		@JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		@JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	})
	private Q88_VoyObj voyObjResult;

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

	public LocalDateTime getModified_Date() {
		return modified_Date;
	}

	public void setModified_Date(String modified_Date) {
		this.modified_Date = LocalDateTime.parse(modified_Date);
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

	

	public List<Q88_VoyObj_RsltDtl> getResultDetail() {
		return resultDetail;
	}

	public void addResultDetail(List<Q88_VoyObj_RsltDtl> resultDetail) {
		this.resultDetail=resultDetail;
	}

	public Q88_VoyObj getVoyObjResult() {
		return voyObjResult;
	}

	public void setVoyObjResult(Q88_VoyObj voyObjResult) {
		this.voyObjResult = voyObjResult;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Rslt [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", bunkers=" + bunkers
				+ ", commission=" + commission + ", days=" + days + ", efficiency=" + efficiency + ", expense="
				+ expense + ", expenses=" + expenses + ", modifiedByFull=" + modifiedByFull + ", modifiedDate="
				+ modifiedDate + ", modified_Date=" + modified_Date + ", pnl=" + pnl + ", port=" + port + ", revenue="
				+ revenue + ", sailedIn=" + sailedIn + ", tce=" + tce + ", resultDetail=" + resultDetail + "]";
	}
	
	
	
	
	
	

}
