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
@Table(name = "Q88_BUNKERSTEM")
public class Q88_BunkerStem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "BUNKERSTEM_SEQID")
	private int bunkerstem_seqid;
	@Column(name = "STEMSTATUS")
	private String stemStatus;	
	@Column(name = "BUNKERGRADENAME")
	private String bunkerGradeName;	
	@Column(name = "QTYPLANNED")
	private int qtyPlanned;
	@Column(name = "STEMMEDDATE")
	private String stemmedDate;
	@Column(name = "STEMNUMBER")
	private String stemNumber;	
	@Column(name = "STEMTERMS")
	private String stemTerms;		
	@Column(name = "STEMSUPPLIERNAME")
	private String stemSupplierName;
	@Column(name = "STEMBROKERNAME")
	private String stemBrokerName;	
	@Column(name = "PERTONPRICE")
	private int perTonPrice;
	@Column(name = "DELIVERYCOST")
	private double deliveryCost;
	@Column(name = "QTYSTEMMED")
	private int qtyStemmed;	
	@Column(name = "QTYRECEIVED")
	private double qtyReceived;
	@Column(name = "DELIVERYDATE")
	private String deliveryDate;
	@Column(name = "STEMDUEDATE")
	private String stemDueDate;	
	@Column(name = "STEMTOTALCOST")
	private int stemTotalCost;
	@Column(name = "TOTALPERTONCOST")
	private int totalPerTonCost;
	@Column(name = "LEGSEQ_ID")
	private int legseq_id;	
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="legseq_id",referencedColumnName = "LEGSEQ_ID",insertable=false, updatable=false)
	private Q88_Leg q88bunkerleg;

	public int getBunkerstem_seqid() {
		return bunkerstem_seqid;
	}

	public void setBunkerstem_seqid(int bunkerstem_seqid) {
		this.bunkerstem_seqid = bunkerstem_seqid;
	}

	public String getStemStatus() {
		return stemStatus;
	}

	public void setStemStatus(String stemStatus) {
		this.stemStatus = stemStatus;
	}

	public String getBunkerGradeName() {
		return bunkerGradeName;
	}

	public void setBunkerGradeName(String bunkerGradeName) {
		this.bunkerGradeName = bunkerGradeName;
	}

	public int getQtyPlanned() {
		return qtyPlanned;
	}

	public void setQtyPlanned(int qtyPlanned) {
		this.qtyPlanned = qtyPlanned;
	}

	public String getStemmedDate() {
		return stemmedDate;
	}

	public void setStemmedDate(String stemmedDate) {
		this.stemmedDate = stemmedDate;
	}

	public String getStemNumber() {
		return stemNumber;
	}

	public void setStemNumber(String stemNumber) {
		this.stemNumber = stemNumber;
	}

	public String getStemTerms() {
		return stemTerms;
	}

	public void setStemTerms(String stemTerms) {
		this.stemTerms = stemTerms;
	}

	public String getStemSupplierName() {
		return stemSupplierName;
	}

	public void setStemSupplierName(String stemSupplierName) {
		this.stemSupplierName = stemSupplierName;
	}

	public String getStemBrokerName() {
		return stemBrokerName;
	}

	public void setStemBrokerName(String stemBrokerName) {
		this.stemBrokerName = stemBrokerName;
	}

	public int getPerTonPrice() {
		return perTonPrice;
	}

	public void setPerTonPrice(int perTonPrice) {
		this.perTonPrice = perTonPrice;
	}

	public double getDeliveryCost() {
		return deliveryCost;
	}

	public void setDeliveryCost(double deliveryCost) {
		this.deliveryCost = deliveryCost;
	}

	public int getQtyStemmed() {
		return qtyStemmed;
	}

	public void setQtyStemmed(int qtyStemmed) {
		this.qtyStemmed = qtyStemmed;
	}

	public double getQtyReceived() {
		return qtyReceived;
	}

	public void setQtyReceived(double qtyReceived) {
		this.qtyReceived = qtyReceived;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getStemDueDate() {
		return stemDueDate;
	}

	public void setStemDueDate(String stemDueDate) {
		this.stemDueDate = stemDueDate;
	}

	public int getStemTotalCost() {
		return stemTotalCost;
	}

	public void setStemTotalCost(int stemTotalCost) {
		this.stemTotalCost = stemTotalCost;
	}

	public int getTotalPerTonCost() {
		return totalPerTonCost;
	}

	public void setTotalPerTonCost(int totalPerTonCost) {
		this.totalPerTonCost = totalPerTonCost;
	}

	public int getLegseq_id() {
		return legseq_id;
	}

	public void setLegseq_id(int legseq_id) {
		this.legseq_id = legseq_id;
	}

	public Q88_Leg getQ88bunkerleg() {
		return q88bunkerleg;
	}

	public void setQ88bunkerleg(Q88_Leg q88bunkerleg) {
		this.q88bunkerleg = q88bunkerleg;
	}

	@Override
	public String toString() {
		return "Q88_BunkerStem [bunkerstem_seqid=" + bunkerstem_seqid + ", stemStatus=" + stemStatus
				+ ", bunkerGradeName=" + bunkerGradeName + ", qtyPlanned=" + qtyPlanned + ", stemmedDate=" + stemmedDate
				+ ", stemNumber=" + stemNumber + ", stemTerms=" + stemTerms + ", stemSupplierName=" + stemSupplierName
				+ ", stemBrokerName=" + stemBrokerName + ", perTonPrice=" + perTonPrice + ", deliveryCost="
				+ deliveryCost + ", qtyStemmed=" + qtyStemmed + ", qtyReceived=" + qtyReceived + ", deliveryDate="
				+ deliveryDate + ", stemDueDate=" + stemDueDate + ", stemTotalCost=" + stemTotalCost
				+ ", totalPerTonCost=" + totalPerTonCost + ", legseq_id=" + legseq_id + ", q88bunkerleg=" + q88bunkerleg
				+ "]";
	}
	
	

	


}
