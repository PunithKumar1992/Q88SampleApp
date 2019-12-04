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

import com.bsol.q88.model.cpk.Q88_FixtureExpenseCPK;

@Entity
@IdClass(Q88_FixtureExpenseCPK.class)
@Table(name = "Q88_FIXTURE_EXPENSE",schema = "CHOPS_WEB")
public class Q88_FixtureExpense implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "FIXTUREEXPENSE_SEQID")
	private Integer fixtureExpense_seqid;
	@Column(name = "AMOUNT")
	private Double amount;
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
	private Double total;
	@Column(name = "FIXTURELISTSEQ_ID")
	private Integer fixturelistseq_id;
	
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
	
	private Q88_Fixture q88fixtureexpense;


	public Integer getFixtureExpense_seqid() {
		return fixtureExpense_seqid;
	}

	public void setFixtureExpense_seqid(Integer fixtureExpense_seqid) {
		this.fixtureExpense_seqid = fixtureExpense_seqid;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
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

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getFixturelistseq_id() {
		return fixturelistseq_id;
	}

	public void setFixturelistseq_id(Integer fixturelistseq_id) {
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

	public Q88_Fixture getQ88fixtureexpense() {
		return q88fixtureexpense;
	}

	public void setQ88fixtureexpense(Q88_Fixture q88fixtureexpense) {
		this.q88fixtureexpense = q88fixtureexpense;
	}

	@Override
	public String toString() {
		return "Q88_FixtureExpense [fixtureExpense_seqid=" + fixtureExpense_seqid + ", amount=" + amount + ", daily="
				+ daily + ", displayOrder=" + displayOrder + ", fixtureDisplayOrder=" + fixtureDisplayOrder + ", name="
				+ name + ", remark=" + remark + ", total=" + total + ", fixturelistseq_id=" + fixturelistseq_id
				+ ", voyageid=" + voyageid + ", vesselid=" + vesselid + "]";
	}


	
	
	
}
*/