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

import com.bsol.q88.model.cpk.Q88_VoyObj_BunkerCPK;

@Entity
@Table(name = "Q88_VOYOBJ_BUNKER")
@IdClass(Q88_VoyObj_BunkerCPK.class)
public class Q88_VoyObj_Bunker {
	
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "BUNKER_SEQID")
	private Integer bunker_SeqId;
	
	@Column(name = "AVERAGECONSUMPTIONCOST")
	private Double averageConsumptionCost;
	
	@Column(name = "BUNKERGRADENAME")
	private String bunkerGradeName;
	
	@Column(name = "CONSCOST")
	private Double consCost;
	
	@Column(name = "CONSTOTAL")
	private Double consTotal;
	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	
	@Column(name = "REFILLPRICE")
	private Double refillPrice;
	
	@Column(name = "REMAINDERCONSCOST")
	private Double remainderConsCost;
	
	@Column(name = "TOTALCOST")
	private Double totalCost;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
	  })
	private Q88_VoyObj voyObjBunker;

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

	public Integer getBunker_SeqId() {
		return bunker_SeqId;
	}

	public void setBunker_SeqId(Integer bunker_SeqId) {
		this.bunker_SeqId = bunker_SeqId;
	}

	public Double getAverageConsumptionCost() {
		return averageConsumptionCost;
	}

	public void setAverageConsumptionCost(Double averageConsumptionCost) {
		this.averageConsumptionCost = averageConsumptionCost;
	}

	public String getBunkerGradeName() {
		return bunkerGradeName;
	}

	public void setBunkerGradeName(String bunkerGradeName) {
		this.bunkerGradeName = bunkerGradeName;
	}

	public Double getConsCost() {
		return consCost;
	}

	public void setConsCost(Double consCost) {
		this.consCost = consCost;
	}

	public Double getConsTotal() {
		return consTotal;
	}

	public void setConsTotal(Double consTotal) {
		this.consTotal = consTotal;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Double getRefillPrice() {
		return refillPrice;
	}

	public void setRefillPrice(Double refillPrice) {
		this.refillPrice = refillPrice;
	}

	public Double getRemainderConsCost() {
		return remainderConsCost;
	}

	public void setRemainderConsCost(Double remainderConsCost) {
		this.remainderConsCost = remainderConsCost;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public Q88_VoyObj getVoyObjBunker() {
		return voyObjBunker;
	}

	public void setVoyObjBunker(Q88_VoyObj voyObjBunker) {
		this.voyObjBunker = voyObjBunker;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Bunker [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", bunker_SeqId=" + bunker_SeqId
				+ ", averageConsumptionCost=" + averageConsumptionCost + ", bunkerGradeName=" + bunkerGradeName
				+ ", consCost=" + consCost + ", consTotal=" + consTotal + ", displayOrder=" + displayOrder
				+ ", refillPrice=" + refillPrice + ", remainderConsCost=" + remainderConsCost + ", totalCost="
				+ totalCost + "]";
	}
	
	

}
