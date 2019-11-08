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
@Table(name = "Q88_OFFHIREBUNKER")
public class Q88_OffhireBunker {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name = "OFFHIREBUNKER_SEQID	")
	  private Integer offhirebunker_seqid;
	  @Column(name = "GRADENAME")
	  private String gradeName;
	  @Column(name = "QUANTITY")
	  private Number quantity;
	  @Column(name = "PRICE")
	  private Number  price;
	  @Column(name = "DISPLAYORDER")
	  private Integer displayOrder;
	  @Column(name = "OFFHIRESEQ_ID")
	  private Integer offhireseq_id;
	  
	  @ManyToOne(optional = false,fetch = FetchType.LAZY)
	  @JoinColumn(name = "offhireseq_id",referencedColumnName = "OFFHIRESEQ_ID",insertable = false,updatable = false)
	  private Q88_Offhire q88offhirebunker;

	public Integer getOffhirebunker_seqid() {
		return offhirebunker_seqid;
	}

	public void setOffhirebunker_seqid(Integer offhirebunker_seqid) {
		this.offhirebunker_seqid = offhirebunker_seqid;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public Number getQuantity() {
		return quantity;
	}

	public void setQuantity(Number quantity) {
		this.quantity = quantity;
	}

	public Number getPrice() {
		return price;
	}

	public void setPrice(Number price) {
		this.price = price;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Integer getOffhireseq_id() {
		return offhireseq_id;
	}

	public void setOffhireseq_id(Integer offhireseq_id) {
		this.offhireseq_id = offhireseq_id;
	}

	public Q88_Offhire getQ88offhirebunker() {
		return q88offhirebunker;
	}

	public void setQ88offhirebunker(Q88_Offhire q88offhirebunker) {
		this.q88offhirebunker = q88offhirebunker;
	}

	@Override
	public String toString() {
		return "Q88_OffhireBunker [offhirebunker_seqid=" + offhirebunker_seqid + ", gradeName=" + gradeName
				+ ", quantity=" + quantity + ", price=" + price + ", displayOrder=" + displayOrder + ", offhireseq_id="
				+ offhireseq_id + ", q88offhirebunker=" + q88offhirebunker + "]";
	}

	

}
