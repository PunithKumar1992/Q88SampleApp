package com.bsol.q88.model.cpk;

import java.io.Serializable;

public class Q88_HdCntrtDTL_InvoiceLstCPK implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer trans_Id;
	private String vesselIdEncrypted;
	private String tcInIdEncrypted;
	private Integer invoice_SeqId;
	public Integer getTrans_Id() {
		return trans_Id;
	}
	public void setTrans_Id(Integer trans_Id) {
		this.trans_Id = trans_Id;
	}
	public String getVesselIdEncrypted() {
		return vesselIdEncrypted;
	}
	public void setVesselIdEncrypted(String vesselIdEncrypted) {
		this.vesselIdEncrypted = vesselIdEncrypted;
	}
	public String getTcInIdEncrypted() {
		return tcInIdEncrypted;
	}
	public void setTcInIdEncrypted(String tcInIdEncrypted) {
		this.tcInIdEncrypted = tcInIdEncrypted;
	}
	public Integer getInvoice_SeqId() {
		return invoice_SeqId;
	}
	public void setInvoice_SeqId(Integer invoice_SeqId) {
		this.invoice_SeqId = invoice_SeqId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((invoice_SeqId == null) ? 0 : invoice_SeqId.hashCode());
		result = prime * result + ((tcInIdEncrypted == null) ? 0 : tcInIdEncrypted.hashCode());
		result = prime * result + ((trans_Id == null) ? 0 : trans_Id.hashCode());
		result = prime * result + ((vesselIdEncrypted == null) ? 0 : vesselIdEncrypted.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q88_HdCntrtDTL_InvoiceLstCPK other = (Q88_HdCntrtDTL_InvoiceLstCPK) obj;
		if (invoice_SeqId == null) {
			if (other.invoice_SeqId != null)
				return false;
		} else if (!invoice_SeqId.equals(other.invoice_SeqId))
			return false;
		if (tcInIdEncrypted == null) {
			if (other.tcInIdEncrypted != null)
				return false;
		} else if (!tcInIdEncrypted.equals(other.tcInIdEncrypted))
			return false;
		if (trans_Id == null) {
			if (other.trans_Id != null)
				return false;
		} else if (!trans_Id.equals(other.trans_Id))
			return false;
		if (vesselIdEncrypted == null) {
			if (other.vesselIdEncrypted != null)
				return false;
		} else if (!vesselIdEncrypted.equals(other.vesselIdEncrypted))
			return false;
		return true;
	}
	
	

}
