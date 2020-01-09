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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_VoyObj_RevenueCPK;

@Entity
@Table(name = "Q88_VOYOBJ_REVENUE")
@IdClass(Q88_VoyObj_RevenueCPK.class)
public class Q88_VoyObj_Revenue {

	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "REVENUE_SEQID")
	@SequenceGenerator(name = "OffRevenue_SeqId", sequenceName = "Q88_VOYOBJ_REVENUE_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "OffRevenue_SeqId")
	private Integer revenue_SeqId;
	
	
	@Column(name = "ACCRUAL")
	private Double accrual;
	
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
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
		  
	  })
	private Q88_VoyObj voyObjRevenue;

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

	public Integer getRevenue_SeqId() {
		return revenue_SeqId;
	}

	public void setRevenue_SeqId(Integer revenue_SeqId) {
		this.revenue_SeqId = revenue_SeqId;
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

	public Q88_VoyObj getVoyObjRevenue() {
		return voyObjRevenue;
	}

	public void setVoyObjRevenue(Q88_VoyObj voyObjRevenue) {
		this.voyObjRevenue = voyObjRevenue;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Revenue [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", revenue_SeqId="
				+ revenue_SeqId + ", accrual=" + accrual + ", displayOrder=" + displayOrder + ", fixtureDisplayOrder="
				+ fixtureDisplayOrder + ", flatRate=" + flatRate + ", isCommission=" + isCommission + ", name=" + name
				+ ", quantity=" + quantity + ", remark=" + remark + ", total=" + total + ", totalAccrued="
				+ totalAccrued + ", ws=" + ws + "]";
	}

	
}
