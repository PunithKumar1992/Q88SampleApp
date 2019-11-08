package com.q88.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Q88_FIXTUREREVENUE")
public class Q88_FixtureExpense {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "FIXTUREREVENUE_SEQID")
	private Integer fixturerevenue_seqid;
	@Column(name = "AMOUNT")
	private Number amount;
	@Column(name = "DAILY")
	private String daily;
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	@Column(name = "FIXTUREDISPLAYORDER")
	private Integer fixtureDisplayOrder;
	@Column(name = "NAME")
	private  String name;
	@Column(name = "REMARK")
	private String remark;
	@Column(name = "TOTAL")
	private Number total;
	@Column(name = "FIXTURELISTSEQ_ID")
	private Integer fixturelistseq_id;
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="fixturelistseq_id",referencedColumnName = "FIXTURELISTSEQ_ID",insertable=false, updatable=false)
	private Q88_Fixture q88fixtureexpense;

	public Integer getFixturerevenue_seqid() {
		return fixturerevenue_seqid;
	}

	public void setFixturerevenue_seqid(Integer fixturerevenue_seqid) {
		this.fixturerevenue_seqid = fixturerevenue_seqid;
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

	public Integer getFixturelistseq_id() {
		return fixturelistseq_id;
	}

	public void setFixturelistseq_id(Integer fixturelistseq_id) {
		this.fixturelistseq_id = fixturelistseq_id;
	}

	public Q88_Fixture getQ88fixtureexpense() {
		return q88fixtureexpense;
	}

	public void setQ88fixtureexpense(Q88_Fixture q88fixtureexpense) {
		this.q88fixtureexpense = q88fixtureexpense;
	}

	@Override
	public String toString() {
		return "Q88_FixtureExpense [fixturerevenue_seqid=" + fixturerevenue_seqid + ", amount=" + amount + ", daily="
				+ daily + ", displayOrder=" + displayOrder + ", fixtureDisplayOrder=" + fixtureDisplayOrder + ", name="
				+ name + ", remark=" + remark + ", total=" + total + ", fixturelistseq_id=" + fixturelistseq_id
				+ ", q88fixtureexpense=" + q88fixtureexpense + "]";
	}

	
	
}
