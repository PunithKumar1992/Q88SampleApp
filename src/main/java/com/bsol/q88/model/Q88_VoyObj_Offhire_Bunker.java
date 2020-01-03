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

import com.bsol.q88.model.cpk.Q88_VoyObj_Offhire_BunkerCPK;

@Entity
@Table(name = "Q88_VOYOBJ_OFFHIRE_BUNKER")
@IdClass(Q88_VoyObj_Offhire_BunkerCPK.class)
public class Q88_VoyObj_Offhire_Bunker {
	
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	
	@Id
	@Column(name = "VOYAGEID")
	private String voyageId; 
	
	@Id
	@Column(name = "OFFHIRE_SEQID")
	private Integer offhire_SeqId;
	
	@Id
	@Column(name = "OFFBUNKER_SEQID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer offBunker_SeqId;
	
	@Column(name = "GRADENAME")
	private String gradeName;
	
	@Column(name = "QUANTITY")
	private Double quantity;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "DISPLAYORDER")
	private Integer displayOrder;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
		  @JoinColumn(name = "OFFHIRE_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "OFFHIRE_SEQID"),
	  })
	private Q88_VoyObj_Offhire  voyobjoffhireBunker;

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

	public Integer getOffhire_SeqId() {
		return offhire_SeqId;
	}

	public void setOffhire_SeqId(Integer offhire_SeqId) {
		this.offhire_SeqId = offhire_SeqId;
	}

	public Integer getOffBunker_SeqId() {
		return offBunker_SeqId;
	}

	public void setOffBunker_SeqId(Integer offBunker_SeqId) {
		this.offBunker_SeqId = offBunker_SeqId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Q88_VoyObj_Offhire getVoyobjoffhireBunker() {
		return voyobjoffhireBunker;
	}

	public void setVoyobjoffhireBunker(Q88_VoyObj_Offhire voyobjoffhireBunker) {
		this.voyobjoffhireBunker = voyobjoffhireBunker;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_Offhire_Bunker [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", offhire_SeqId="
				+ offhire_SeqId + ", offBunker_SeqId=" + offBunker_SeqId + ", gradeName=" + gradeName + ", quantity="
				+ quantity + ", price=" + price + ", displayOrder=" + displayOrder + "]";
	}
	
	

}
