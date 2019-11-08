package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_EXPENSE")
public class Q88_Expense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "EXPENSE_SEQID")
	private Integer expense_seqid;
	@Column(name = "AMOUNT")
	private Number amount;
	@Column(name = "DAILY")
	private String daily;
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;	
	@Column(name = "FIXTUREDISPLAYORDER")
	private Integer fixtureDisplayOrder;
	@Column(name = "NAME")
	private String name;
	@Column(name = "REMARK")
	private String remark;
	@Column(name = "TOTAL")
	private Number total;
	@Column(name = "VOYAGEID")
	private String voyageid;	
	@Column(name = "VOYAGENUMBER")
	private String voyagenumber;
	@Column(name = "VESSELID")
	private String vesselid;	
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumns({
	@JoinColumn(name="voyageid",insertable=false, updatable=false),
	@JoinColumn(name="voyagenumber",insertable=false, updatable=false),
	@JoinColumn(name="vesselid",insertable=false, updatable=false),
	})
	private Q88_Voyage q88voyageexpense;

	public Integer getExpense_seqid() {
		return expense_seqid;
	}

	public void setExpense_seqid(Integer expense_seqid) {
		this.expense_seqid = expense_seqid;
	}

	public Number getAmount() {
		return amount;
	}

	public void setAmount(Number amount) {
		this.amount = amount;
	}

	public String getDaily() {
		return daily;
	}

	public void setDaily(String daily) {
		this.daily = daily;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Integer getFixtureDisplayOrder() {
		return fixtureDisplayOrder;
	}

	public void setFixtureDisplayOrder(Integer fixtureDisplayOrder) {
		this.fixtureDisplayOrder = fixtureDisplayOrder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Number getTotal() {
		return total;
	}

	public void setTotal(Number total) {
		this.total = total;
	}

	public String getVoyageid() {
		return voyageid;
	}

	public void setVoyageid(String voyageid) {
		this.voyageid = voyageid;
	}

	public String getVoyagenumber() {
		return voyagenumber;
	}

	public void setVoyagenumber(String voyagenumber) {
		this.voyagenumber = voyagenumber;
	}

	public String getVesselid() {
		return vesselid;
	}

	public void setVesselid(String vesselid) {
		this.vesselid = vesselid;
	}

	public Q88_Voyage getQ88voyageexpense() {
		return q88voyageexpense;
	}

	public void setQ88voyageexpense(Q88_Voyage q88voyageexpense) {
		this.q88voyageexpense = q88voyageexpense;
	}

	@Override
	public String toString() {
		return "Q88_Expense [expense_seqid=" + expense_seqid + ", amount=" + amount + ", daily=" + daily
				+ ", displayOrder=" + displayOrder + ", fixtureDisplayOrder=" + fixtureDisplayOrder + ", name=" + name
				+ ", remark=" + remark + ", total=" + total + ", voyageid=" + voyageid + ", voyagenumber="
				+ voyagenumber + ", vesselid=" + vesselid + ", q88voyageexpense=" + q88voyageexpense + "]";
	}

	

}
