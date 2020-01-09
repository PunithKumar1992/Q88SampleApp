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

import com.bsol.q88.model.cpk.Q88_VoyObj_LegLst_BunRobCPK;

@Entity
@Table(name = "Q88_VOYOBJ_LEGLST_BUNROB")
@IdClass(Q88_VoyObj_LegLst_BunRobCPK.class)
public class Q88_VoyObj_LegLst_BunRob {
	
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
	@Column(name = "BUNROB_SEQID")
	@SequenceGenerator(name = "BunkerRob_SeqId", sequenceName = "Q88_VOY_LEGLST_BUNROB_SEQID", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "BunkerRob_SeqId")
	private Integer bunkerRob_SeqId;
	
	@Column(name = "BUNKERGRADENAME")
	private String bunkerGradeName;
	
	@Column(name = "ARRIVALROBQUANTITY")
	private Double arrivalROBQuantity;
	
	@Column(name = "DEPARTUREROBQUANTITY")
	private Double departureROBQuantity;
	
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	  @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "VOYAGEID",nullable = false,insertable = false,updatable = false,referencedColumnName = "VOYAGEID"),
		  @JoinColumn(name = "LEG_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "LEG_SEQID"),
	  })
	private Q88_VoyObj_LegLst voyObjLegBunkerRob;

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

	public Integer getBunkerRob_SeqId() {
		return bunkerRob_SeqId;
	}

	public void setBunkerRob_SeqId(Integer bunkerRob_SeqId) {
		this.bunkerRob_SeqId = bunkerRob_SeqId;
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

	public Q88_VoyObj_LegLst getVoyObjLegBunkerRob() {
		return voyObjLegBunkerRob;
	}

	public void setVoyObjLegBunkerRob(Q88_VoyObj_LegLst voyObjLegBunkerRob) {
		this.voyObjLegBunkerRob = voyObjLegBunkerRob;
	}

	@Override
	public String toString() {
		return "Q88_VoyObj_LegLst_BunRob [trans_Id=" + trans_Id + ", voyageId=" + voyageId + ", leg_SeqId=" + leg_SeqId
				+ ", bunkerRob_SeqId=" + bunkerRob_SeqId + ", bunkerGradeName=" + bunkerGradeName
				+ ", arrivalROBQuantity=" + arrivalROBQuantity + ", departureROBQuantity=" + departureROBQuantity + "]";
	}
	
	
	

}
