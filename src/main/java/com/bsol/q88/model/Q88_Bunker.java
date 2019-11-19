package com.bsol.q88.model;

import java.io.Serializable;

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
@Table(name = "Q88_BUNKER",schema = "CHOPS_WEB")
public class Q88_Bunker implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "BUNER_SEQID")
	private Integer buner_seqid;
	@Column(name = "AVERAGECONSUMPTIONCOST")
	private Number averageConsumptionCost;
	@Column(name = "BUNKERGRADENAME")
	private String bunkerGradeName;
	@Column(name = "CONSCOST")
	private Number consCost;	
	@Column(name = "CONSTOTAL")
	private Number consTotal;
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	@Column(name = "REFILLPRICE")
	private Number refillPrice;			
	@Column(name = "REMAINDERCONSCOST")
	private Number remainderConsCost;	
	@Column(name = "TOTALCOST")
	private Number totalCost;
	@Column(name = "VOYAGEID")
	private String voyageid;		
	@Column(name = "VESSELID")
	private String vesselid;		
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="voyageid",referencedColumnName = "VOYAGEID",insertable=false, updatable=false),
		@JoinColumn(name="vesselid",referencedColumnName = "VESSELID",insertable=false, updatable=false)
	})
	private Q88_Voyage q88voyagebunker;

	public Integer getBuner_seqid() {
		return buner_seqid;
	}

	public void setBuner_seqid(Integer buner_seqid) {
		this.buner_seqid = buner_seqid;
	}

	public Number getAverageConsumptionCost() {
		return averageConsumptionCost;
	}

	public void setAverageConsumptionCost(Number averageConsumptionCost) {
		this.averageConsumptionCost = averageConsumptionCost;
	}

	public String getBunkerGradeName() {
		return bunkerGradeName;
	}

	public void setBunkerGradeName(String bunkerGradeName) {
		this.bunkerGradeName = bunkerGradeName;
	}

	public Number getConsCost() {
		return consCost;
	}

	public void setConsCost(Number consCost) {
		this.consCost = consCost;
	}

	public Number getConsTotal() {
		return consTotal;
	}

	public void setConsTotal(Number consTotal) {
		this.consTotal = consTotal;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Number getRefillPrice() {
		return refillPrice;
	}

	public void setRefillPrice(Number refillPrice) {
		this.refillPrice = refillPrice;
	}

	public Number getRemainderConsCost() {
		return remainderConsCost;
	}

	public void setRemainderConsCost(Number remainderConsCost) {
		this.remainderConsCost = remainderConsCost;
	}

	public Number getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Number totalCost) {
		this.totalCost = totalCost;
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

	public Q88_Voyage getQ88voyagebunker() {
		return q88voyagebunker;
	}

	public void setQ88voyagebunker(Q88_Voyage q88voyagebunker) {
		this.q88voyagebunker = q88voyagebunker;
	}

	@Override
	public String toString() {
		return "Q88_Bunker [buner_seqid=" + buner_seqid + ", averageConsumptionCost=" + averageConsumptionCost
				+ ", bunkerGradeName=" + bunkerGradeName + ", consCost=" + consCost + ", consTotal=" + consTotal
				+ ", displayOrder=" + displayOrder + ", refillPrice=" + refillPrice + ", remainderConsCost="
				+ remainderConsCost + ", totalCost=" + totalCost + ", voyageid=" + voyageid 
				 + ", vesselid=" + vesselid + ", q88voyagebunker=" + q88voyagebunker + "]";
	}
	
	

	
}
