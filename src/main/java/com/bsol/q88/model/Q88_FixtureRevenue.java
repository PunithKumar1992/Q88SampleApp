package com.bsol.q88.model;

import java.io.Serializable;

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
@Table(name = "Q88_FIXTURE_REVENUE",schema = "CHOPS_WEB")
public class Q88_FixtureRevenue implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "FIXTUREREVENUE_SEQID")
	private Integer fixturerevenue_seqid;
	@Column(name = "ACCRUAL")
	private Number accrual	;	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;		
	@Column(name = "FIXTUREDISPLAYORDER")
	private Integer fixtureDisplayOrder;	
	@Column(name = "FLATRATE")
	private Number flatRate;		
	@Column(name = "ISCOMMISSION")
	private String isCommission;		
	@Column(name = "NAME")
	private String name;
	@Column(name = "QUANTITY")
	private Number quantity;			
	@Column(name = "REMARK")
	private String remark;	
	@Column(name = "TOTAL")
	private Number total;	
	@Column(name = "TOTALACCRUED")
	private Number totalAccrued;	
	@Column(name = "WS")
	private Number ws;		
	@Column(name = "FIXTURELISTSEQ_ID")
	private int fixturelistseq_id;			
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="fixturelistseq_id",referencedColumnName = "FIXTURELISTSEQ_ID",insertable=false, updatable=false)
	private Q88_Fixture q88fixturerevenue;

	public Integer getFixturerevenue_seqid() {
		return fixturerevenue_seqid;
	}

	public void setFixturerevenue_seqid(Integer fixturerevenue_seqid) {
		this.fixturerevenue_seqid = fixturerevenue_seqid;
	}

	public Number getAccrual() {
		return accrual;
	}

	public void setAccrual(Number accrual) {
		this.accrual = accrual;
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

	public Number getFlatRate() {
		return flatRate;
	}

	public void setFlatRate(Number flatRate) {
		this.flatRate = flatRate;
	}

	public String getIsCommission() {
		return isCommission;
	}

	public void setIsCommission(String isCommission) {
		this.isCommission = isCommission;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Number getQuantity() {
		return quantity;
	}

	public void setQuantity(Number quantity) {
		this.quantity = quantity;
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

	public Number getTotalAccrued() {
		return totalAccrued;
	}

	public void setTotalAccrued(Number totalAccrued) {
		this.totalAccrued = totalAccrued;
	}

	public Number getWs() {
		return ws;
	}

	public void setWs(Number ws) {
		this.ws = ws;
	}

	public int getFixturelistseq_id() {
		return fixturelistseq_id;
	}

	public void setFixturelistseq_id(int fixturelistseq_id) {
		this.fixturelistseq_id = fixturelistseq_id;
	}

	public Q88_Fixture getQ88fixturerevenue() {
		return q88fixturerevenue;
	}

	public void setQ88fixturerevenue(Q88_Fixture q88fixturerevenue) {
		this.q88fixturerevenue = q88fixturerevenue;
	}

	@Override
	public String toString() {
		return "Q88_FixtureRevenue [fixturerevenue_seqid=" + fixturerevenue_seqid + ", accrual=" + accrual
				+ ", displayOrder=" + displayOrder + ", fixtureDisplayOrder=" + fixtureDisplayOrder + ", flatRate="
				+ flatRate + ", isCommission=" + isCommission + ", name=" + name + ", quantity=" + quantity
				+ ", remark=" + remark + ", total=" + total + ", totalAccrued=" + totalAccrued + ", ws=" + ws
				+ ", fixturelistseq_id=" + fixturelistseq_id + ", q88fixturerevenue=" + q88fixturerevenue + "]";
	}

	
	
	
}
