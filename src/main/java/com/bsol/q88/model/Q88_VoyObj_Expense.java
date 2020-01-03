package com.bsol.q88.model;

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

import com.bsol.q88.model.cpk.Q88_VoyObj_ExpenseCPK;

@Entity
@Table(name = "Q88_VOYOBJ_EXPENSE")
@IdClass(Q88_VoyObj_ExpenseCPK.class)
public class Q88_VoyObj_Expense {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "EXPENSE_SEQID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer expense_SeqId;
	
	@Column(name = "AMOUNT")
	private Double amount;
	
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
	private Double total;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	  })
	private Q88_VoyObj voyObjExpense;

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

	public Integer getExpense_SeqId() {
		return expense_SeqId;
	}

	public void setExpense_SeqId(Integer expense_SeqId) {
		this.expense_SeqId = expense_SeqId;
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

	public Q88_VoyObj getVoyObjExpense() {
		return voyObjExpense;
	}

	public void setVoyObjExpense(Q88_VoyObj voyObjExpense) {
		this.voyObjExpense = voyObjExpense;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Expense [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", expense_SeqId="
				+ expense_SeqId + ", amount=" + amount + ", daily=" + daily + ", displayOrder=" + displayOrder
				+ ", fixtureDisplayOrder=" + fixtureDisplayOrder + ", name=" + name + ", remark=" + remark + ", total="
				+ total + "]";
	}
	
	
	


}
