package com.q88.sample.model;

import java.io.Serializable;

public class Q88_TcReviewCPK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer tc_Review_SeqId;

	public Integer getTc_Review_SeqId() {
		return tc_Review_SeqId;
	}

	public void setTc_Review_SeqId(Integer tc_Review_SeqId) {
		this.tc_Review_SeqId = tc_Review_SeqId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tc_Review_SeqId == null) ? 0 : tc_Review_SeqId.hashCode());
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
		Q88_TcReviewCPK other = (Q88_TcReviewCPK) obj;
		if (tc_Review_SeqId == null) {
			if (other.tc_Review_SeqId != null)
				return false;
		} else if (!tc_Review_SeqId.equals(other.tc_Review_SeqId))
			return false;
		return true;
	}
	
	

}
