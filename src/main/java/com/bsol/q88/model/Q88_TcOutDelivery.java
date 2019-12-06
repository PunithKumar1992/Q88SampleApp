package com.bsol.q88.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bsol.q88.model.cpk.Q88_TcOutDeliveryCPK;

@Entity
@Table(name = "Q88_TC_TCOUTDELIVERY")
@IdClass(Q88_TcOutDeliveryCPK.class)
public class Q88_TcOutDelivery implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TCOUTDETAIL_SEQID")
	private Integer tcOutDetail_SeqId;
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	@OneToOne(mappedBy = "tcOutDelivery",fetch = FetchType.EAGER,cascade = CascadeType.ALL,targetEntity = Q88_TcOutDeliveryDetail.class)
	private Q88_TcOutDeliveryDetail delivery;
	
	@OneToOne(mappedBy = "tcOutRedelivery",fetch = FetchType.EAGER,cascade = CascadeType.ALL,targetEntity =Q88_TcOutReDeliveryDetail.class )
	private Q88_TcOutReDeliveryDetail redelivery;

	public Integer getTcOutDetail_SeqId() {
		return tcOutDetail_SeqId;
	}

	@OneToOne(optional = true,fetch = FetchType.EAGER)
	 @JoinColumns({
		  @JoinColumn(name = "TCOUTDETAIL_SEQID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTDETAIL_SEQID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	private Q88_TcOutListDetails q88TcOutDelivery;
	
	public void setTcOutDetail_SeqId(Integer tcOutDetail_SeqId) {
		this.tcOutDetail_SeqId = tcOutDetail_SeqId;
	}

	public String getTcOutIdEncrypted() {
		return tcOutIdEncrypted;
	}

	public void setTcOutIdEncrypted(String tcOutIdEncrypted) {
		this.tcOutIdEncrypted = tcOutIdEncrypted;
	}

	public String getVesselIdEncrypted() {
		return vesselIdEncrypted;
	}

	public void setVesselIdEncrypted(String vesselIdEncrypted) {
		this.vesselIdEncrypted = vesselIdEncrypted;
	}

	public Q88_TcOutDeliveryDetail getDelivery() {
		return delivery;
	}

	public void setDelivery(Q88_TcOutDeliveryDetail delivery) {
		if(delivery == null) {
			if(this.delivery !=null) {
				this.delivery.setTcOutDelivery(null);
			}
		}
		else {
			delivery.setTcOutDelivery(this);
		}
		this.delivery = delivery;
	}

	public Q88_TcOutReDeliveryDetail getRedelivery() {
		return redelivery;
	}

	public void setRedelivery(Q88_TcOutReDeliveryDetail redelivery) {
		if(redelivery == null) {
			if(this.redelivery !=null) {
				this.redelivery.setTcOutRedelivery(null);
			}
		}
		else {
			redelivery.setTcOutRedelivery(this);
		}
		this.redelivery = redelivery;
	}
	

	public Q88_TcOutListDetails getQ88TcOutDelivery() {
		return q88TcOutDelivery;
	}

	public void setQ88TcOutDelivery(Q88_TcOutListDetails q88TcOutDelivery) {
		this.q88TcOutDelivery = q88TcOutDelivery;
	}

	@Override
	public String toString() {
		return "Q88_TcOutDelivery [tcOutDetail_SeqId=" + tcOutDetail_SeqId + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", delivery=" + delivery + ", redelivery=" + redelivery
				+ "]";
	}
	
	
	

}
