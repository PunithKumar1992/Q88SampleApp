/*package com.bsol.q88.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_FixtureRevenueCPK;

@Entity
@IdClass(Q88_FixtureRevenueCPK.class)
@Table(name = "Q88_FIXTURE_REVENUE",schema = "CHOPS_WEB")
public class Q88_FixtureRevenue implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "FIXTUREREVENUE_SEQID")
	private Integer fixturerevenue_seqid;
	@Column(name = "ACCRUAL")
	private Double accrual	;	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;		
	@Column(name = "FIXTUREDISPLAYORDER")
	private Integer fixtureDisplayOrder;	
	@Column(name = "FLATRATE")
	private Double flatRate;		
	@Column(name = "ISCOMMISSION")
	private String isCommission;		
	@Column(name = "NAME")
	private String name;
	@Column(name = "QUANTITY")
	private Double quantity;			
	@Column(name = "REMARK")
	private String remark;	
	@Column(name = "TOTAL")
	private Double total;	
	@Column(name = "TOTALACCRUED")
	private Double totalAccrued;	
	@Column(name = "WS")
	private Double ws;		
	@Column(name = "FIXTURELISTSEQ_ID")
	private int fixturelistseq_id;			
	
	@Id 
	@Column(name = "VOYAGEID")
	private String voyageid;
	
	@Id
	@Column(name = "VESSELID")
	private String vesselid;
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="fixturelistseq_id",referencedColumnName = "FIXTURELISTSEQ_ID",insertable=false, updatable=false),
		@JoinColumn(name="voyageid",referencedColumnName = "VOYAGEID",insertable=false, updatable=false),
		@JoinColumn(name="vesselid",referencedColumnName = "VESSELID",insertable=false, updatable=false)

	})
	
	private Q88_Fixture q88fixturerevenue;

	public Integer getFixturerevenue_seqid() {
		return fixturerevenue_seqid;
	}

	public void setFixturerevenue_seqid(Integer fixturerevenue_seqid) {
		this.fixturerevenue_seqid = fixturerevenue_seqid;
	}

	public Double getAccrual() {
		return accrual;
	}

	public void setAccrual(Double accrual) {
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

	public Double getFlatRate() {
		return flatRate;
	}

	public void setFlatRate(Double flatRate) {
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

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getTotalAccrued() {
		return totalAccrued;
	}

	public void setTotalAccrued(Double totalAccrued) {
		this.totalAccrued = totalAccrued;
	}

	public Double getWs() {
		return ws;
	}

	public void setWs(Double ws) {
		this.ws = ws;
	}

	public int getFixturelistseq_id() {
		return fixturelistseq_id;
	}

	public void setFixturelistseq_id(int fixturelistseq_id) {
		this.fixturelistseq_id = fixturelistseq_id;
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
				+ ", fixturelistseq_id=" + fixturelistseq_id + ", voyageid=" + voyageid + ", vesselid=" + vesselid
				+ "]";
	}

	
	
}*/
