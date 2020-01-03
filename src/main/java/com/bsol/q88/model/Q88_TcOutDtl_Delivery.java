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

import com.bsol.q88.model.cpk.Q88_TcOutDtl_DeliveryCPK;

@Entity
@Table(name = "Q88_TCOUTDTL_DELIVERY")
@IdClass(Q88_TcOutDtl_DeliveryCPK.class)
public class Q88_TcOutDtl_Delivery implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TRANS_ID")
	private Integer trans_Id;
	@Id
	@Column(name = "TCOUTIDENCRYPTED")
	private String tcOutIdEncrypted;
	@Id
	@Column(name = "VESSELIDENCRYPTED")
	private String vesselIdEncrypted;
	
	@OneToOne(mappedBy = "tcOutDelivery",fetch = FetchType.EAGER,cascade = CascadeType.ALL,targetEntity = Q88_TcOutDtl_DeliveryDtl.class)
	private Q88_TcOutDtl_DeliveryDtl delivery;
	
	@OneToOne(mappedBy = "tcOutRedelivery",fetch = FetchType.EAGER,cascade = CascadeType.ALL,targetEntity =Q88_TcOutDtl_ReDeliveryDtl.class )
	private Q88_TcOutDtl_ReDeliveryDtl redelivery;

	

	@OneToOne(optional = true,fetch = FetchType.EAGER)
	 @JoinColumns({
		  @JoinColumn(name = "TRANS_ID",nullable = false,insertable = false,updatable = false,referencedColumnName = "TRANS_ID"),
		  @JoinColumn(name = "TCOUTIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "TCOUTIDENCRYPTED"),
		  @JoinColumn(name = "VESSELIDENCRYPTED",nullable = false,insertable = false,updatable = false,referencedColumnName = "VESSELIDENCRYPTED"),

	  })
	private Q88_TcOutDtl q88TcOutDelivery;
	
	

	public Integer getTrans_Id() {
		return trans_Id;
	}

	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
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

	public Q88_TcOutDtl_DeliveryDtl getDelivery() {
		return delivery;
	}

	public void setDelivery(Q88_TcOutDtl_DeliveryDtl delivery) {
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

	public Q88_TcOutDtl_ReDeliveryDtl getRedelivery() {
		return redelivery;
	}

	public void setRedelivery(Q88_TcOutDtl_ReDeliveryDtl redelivery) {
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
	

	public Q88_TcOutDtl getQ88TcOutDelivery() {
		return q88TcOutDelivery;
	}

	public void setQ88TcOutDelivery(Q88_TcOutDtl q88TcOutDelivery) {
		this.q88TcOutDelivery = q88TcOutDelivery;
	}

	@Override
	public String toString() {
		return "Q88_TcOutDtl_Delivery [trans_Id=" + trans_Id + ", tcOutIdEncrypted=" + tcOutIdEncrypted
				+ ", vesselIdEncrypted=" + vesselIdEncrypted + ", delivery=" + delivery + ", redelivery=" + redelivery
				+ "]";
	}

	
	
	
	

}
