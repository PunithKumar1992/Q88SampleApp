package com.bsol.q88.mapper;

import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_TcOutListCPK;
import com.bsol.q88.model.Q88_TcReview;

public class CustomTcOutMapper {
	
	private Q88_TcOutList  q88tcOutlist;
	private String tcOutIdEncrypted;
	private String vesselIdEncrypted;
	
	private CustomTcOutMapper() {
		
	}
	
	public CustomTcOutMapper(@NotNull Q88_TcOutList q88tcOutlist) {
		this();
		this.q88tcOutlist = q88tcOutlist;
		this.tcOutIdEncrypted = q88tcOutlist.getTcOutIdEncrypted();
		this.vesselIdEncrypted = q88tcOutlist.getVesselIdEncrypted();
	}
	
	public Q88_TcOutList getTcoutList() {
		
		Q88_TcOutList q88tclist = new Q88_TcOutList();
		q88tclist.setTcOutIdEncrypted(tcOutIdEncrypted);
		q88tclist.setVesselIdEncrypted(vesselIdEncrypted);
		q88tclist.setCharterer(q88tcOutlist.getCharterer());
		q88tclist.setCpDate(q88tcOutlist.getCpDate());
		q88tclist.setDuration(q88tcOutlist.getDuration());
		q88tclist.setModifiedBy(q88tcOutlist.getModifiedBy());
		q88tclist.setModifiedDate(q88tcOutlist.getModifiedDate());
		q88tclist.setStartDate(q88tcOutlist.getStartDate());
		q88tclist.setTcNumber(q88tcOutlist.getTcNumber());
		q88tclist.setVessel(q88tcOutlist.getVessel());
		
		return q88tclist;
	}
	
	private Q88_TcOutListCPK tcOutListPk() {
		Q88_TcOutListCPK  tcoutPk = new Q88_TcOutListCPK();
		tcoutPk.setTcOutIdEncrypted(tcOutIdEncrypted);
		tcoutPk.setVesselIdEncrypted(vesselIdEncrypted);
		return tcoutPk;
	}
	
	public Q88_TcReview getTcoutReview() {
		
		Q88_TcReview q88tcreview = new Q88_TcReview();
		q88tcreview.setReviewDate(q88tcOutlist.getReview().getReviewDate());
		q88tcreview.setReviewedBy(q88tcOutlist.getReview().getReviewedBy());
		q88tcreview.setReviewStatus(q88tcOutlist.getReview().getReviewStatus());
		q88tcreview.setTcOutIdEncrypted(tcOutIdEncrypted);
		q88tcreview.setVesselIdEncrypted(vesselIdEncrypted);
		return q88tcreview;
	}

}
