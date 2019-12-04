/*package com.bsol.q88.model;

import java.io.Serializable;

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
@Table(name = "Q88_BUNKER_ROB",schema = "CHOPS_WEB")
public class Q88_BunkerRob implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "BUNKERROB_SEQID")
	private Integer bunkerrob_seqid;
	@Column(name = "BUNKERGRADENAME")
	private String bunkerGradeName;
	@Column(name = "ARRIVALROBQUANTITY")
	private Double arrivalROBQuantity;	
	@Column(name = "DEPARTUREROBQUANTITY")
	private Double departureROBQuantity;
	@Column(name = "LEGSEQ_ID")
	private Integer legseq_id;	
	
	@ManyToOne(optional = false,fetch = FetchType.LAZY)
	@JoinColumn(name="legseq_id",referencedColumnName = "LEGSEQ_ID",insertable=false, updatable=false)
	private Q88_Leg q88bunkerrobleg;

	public Integer getBunkerrob_seqid() {
		return bunkerrob_seqid;
	}

	public void setBunkerrob_seqid(Integer bunkerrob_seqid) {
		this.bunkerrob_seqid = bunkerrob_seqid;
	}

	public String getBunkerGradeName() {
		return bunkerGradeName;
	}

	public void setBunkerGradeName(String bunkerGradeName) {
		this.bunkerGradeName = bunkerGradeName;
	}

	public Double getArrivalROBQuantity() {
		return arrivalROBQuantity;
	}

	public void setArrivalROBQuantity(Double arrivalROBQuantity) {
		this.arrivalROBQuantity = arrivalROBQuantity;
	}

	public Double getDepartureROBQuantity() {
		return departureROBQuantity;
	}

	public void setDepartureROBQuantity(Double departureROBQuantity) {
		this.departureROBQuantity = departureROBQuantity;
	}

	public Integer getLegseq_id() {
		return legseq_id;
	}

	public void setLegseq_id(Integer legseq_id) {
		this.legseq_id = legseq_id;
	}

	public Q88_Leg getQ88bunkerrobleg() {
		return q88bunkerrobleg;
	}

	public void setQ88bunkerrobleg(Q88_Leg q88bunkerrobleg) {
		this.q88bunkerrobleg = q88bunkerrobleg;
	}

	@Override
	public String toString() {
		return "Q88_BunkerRob [bunkerrob_seqid=" + bunkerrob_seqid + ", bunkerGradeName=" + bunkerGradeName
				+ ", arrivalROBQuantity=" + arrivalROBQuantity + ", departureROBQuantity=" + departureROBQuantity
				+ ", legseq_id=" + legseq_id + ", q88bunkerrobleg=" + q88bunkerrobleg + "]";
	}

	
	
}*/
