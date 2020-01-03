package com.bsol.q88.model;

import java.time.LocalDateTime;

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
import javax.persistence.Transient;

import com.bsol.q88.model.cpk.Q88_VoyObj_LegLst_BunStemCPK;

@Entity
@Table(name = "Q88_VOYOBJ_LEGLST_BUNSTEM")
@IdClass(Q88_VoyObj_LegLst_BunStemCPK.class)
public class Q88_VoyObj_LegLst_BunStem {
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "LEG_SEQID")
	private Integer leg_SeqId;
	
	@Id
	@Column(name = "BUNKERSTEM_SEQID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer bunkerStem_SeqId;
	
	@Column(name = "STEMSTATUS")
	private String stemStatus;

	@Column(name = "BUNKERGRADENAME")
	private String bunkerGradeName;
	
	@Column(name = "QTYPLANNED")
	private Double qtyPlanned;
	
	@Transient
	private String stemmedDate;
	
	@Column(name = "STEMMEDDATE")
	private LocalDateTime stemmed_Date;
	
	@Column(name = "STEMNUMBER")
	private String stemNumber;
	
	@Column(name = "STEMTERMS")
	private String stemTerms;
	
	@Column(name = "STEMSUPPLIERNAME")
	private String stemSupplierName;
	
	@Column(name = "STEMBROKERNAME")
	private String stemBrokerName;
	
	@Column(name = "PERTONPRICE")
	private Double perTonPrice;
	
	@Column(name = "DELIVERYCOST")
	private Double deliveryCost;
	
	@Column(name = "QTYSTEMMED")
	private Double qtyStemmed;
	
	@Column(name = "QTYRECEIVED")
	private Double qtyReceived;
	
	@Transient
	private String deliveryDate;
	
	@Column(name ="DELIVERYDATE")
	private LocalDateTime delivery_Date;
	
	@Transient
	private String stemDueDate;
	
	@Column(name = "STEMDUEDATE")
	private LocalDateTime stemDue_Date;
	
	@Column(name = "STEMTOTALCOST")
	private Double stemTotalCost;
	
	@Column(name = "TOTALPERTONCOST")
	private Double totalPerTonCost;
	
	 @ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
		  @JoinColumn(name = "LEG_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "LEG_SEQID"),
	  })
	private Q88_VoyObj_LegLst voyObjLegBunkerStem;

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

	public Integer getLeg_SeqId() {
		return leg_SeqId;
	}

	public void setLeg_SeqId(Integer leg_SeqId) {
		this.leg_SeqId = leg_SeqId;
	}

	public Integer getBunkerStem_SeqId() {
		return bunkerStem_SeqId;
	}

	public void setBunkerStem_SeqId(Integer bunkerStem_SeqId) {
		this.bunkerStem_SeqId = bunkerStem_SeqId;
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

	public Double getQtyPlanned() {
		return qtyPlanned;
	}

	public void setQtyPlanned(Double qtyPlanned) {
		this.qtyPlanned = qtyPlanned;
	}

	public String getStemmedDate() {
		return stemmedDate;
	}

	public void setStemmedDate(String stemmedDate) {
		this.stemmedDate = stemmedDate;
	}

	public LocalDateTime getStemmed_Date() {
		return stemmed_Date;
	}

	public void setStemmed_Date(String  stemmed_Date) {
		if(stemmed_Date !=null) {
		this.stemmed_Date = LocalDateTime.parse(stemmed_Date);
		}
		else {
			this.stemmed_Date = null;
		}
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

	public Double getPerTonPrice() {
		return perTonPrice;
	}

	public void setPerTonPrice(Double perTonPrice) {
		this.perTonPrice = perTonPrice;
	}

	public Double getDeliveryCost() {
		return deliveryCost;
	}

	public void setDeliveryCost(Double deliveryCost) {
		this.deliveryCost = deliveryCost;
	}

	public Double getQtyStemmed() {
		return qtyStemmed;
	}

	public void setQtyStemmed(Double qtyStemmed) {
		this.qtyStemmed = qtyStemmed;
	}

	public Double getQtyReceived() {
		return qtyReceived;
	}

	public void setQtyReceived(Double qtyReceived) {
		this.qtyReceived = qtyReceived;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public LocalDateTime getDelivery_Date() {
		return delivery_Date;
	}

	public void setDelivery_Date(LocalDateTime delivery_Date) {
		this.delivery_Date = delivery_Date;
	}

	public String getStemDueDate() {
		return stemDueDate;
	}

	public void setStemDueDate(String stemDueDate) {
		this.stemDueDate = stemDueDate;
	}

	public LocalDateTime getStemDue_Date() {
		return stemDue_Date;
	}

	public void setStemDue_Date(String stemDue_Date) {
		if(stemDue_Date !=null) {
		this.stemDue_Date = LocalDateTime.parse(stemDue_Date);
		}
		else {
			this.stemDue_Date = null;
		}
	}

	public Double getStemTotalCost() {
		return stemTotalCost;
	}

	public void setStemTotalCost(Double stemTotalCost) {
		this.stemTotalCost = stemTotalCost;
	}

	public Double getTotalPerTonCost() {
		return totalPerTonCost;
	}

	public void setTotalPerTonCost(Double totalPerTonCost) {
		this.totalPerTonCost = totalPerTonCost;
	}

	public Q88_VoyObj_LegLst getVoyObjLegBunkerStem() {
		return voyObjLegBunkerStem;
	}

	public void setVoyObjLegBunkerStem(Q88_VoyObj_LegLst voyObjLegBunkerStem) {
		this.voyObjLegBunkerStem = voyObjLegBunkerStem;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_LegLst_BunStem [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", leg_SeqId=" + leg_SeqId
				+ ", bunkerStem_SeqId=" + bunkerStem_SeqId + ", stemStatus=" + stemStatus + ", bunkerGradeName="
				+ bunkerGradeName + ", qtyPlanned=" + qtyPlanned + ", stemmedDate=" + stemmedDate + ", stemmed_Date="
				+ stemmed_Date + ", stemNumber=" + stemNumber + ", stemTerms=" + stemTerms + ", stemSupplierName="
				+ stemSupplierName + ", stemBrokerName=" + stemBrokerName + ", perTonPrice=" + perTonPrice
				+ ", deliveryCost=" + deliveryCost + ", qtyStemmed=" + qtyStemmed + ", qtyReceived=" + qtyReceived
				+ ", deliveryDate=" + deliveryDate + ", delivery_Date=" + delivery_Date + ", stemDueDate=" + stemDueDate
				+ ", stemDue_Date=" + stemDue_Date + ", stemTotalCost=" + stemTotalCost + ", totalPerTonCost="
				+ totalPerTonCost + "]";
	}
	 
	 
}
