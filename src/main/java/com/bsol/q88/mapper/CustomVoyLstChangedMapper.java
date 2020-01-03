package com.bsol.q88.mapper;

import com.bsol.q88.model.Q88_VoyLstChanged;
import com.bsol.q88.model.Q88_VoyLstChanged_Review;

public class CustomVoyLstChangedMapper {
	
	private Q88_VoyLstChanged voyLstChangedDto;
	private Integer trans_Id;
	private String voyageId;

	private CustomVoyLstChangedMapper() {
		
	}
	public CustomVoyLstChangedMapper(Q88_VoyLstChanged voyLstChangedDto) {
		this();
		this.trans_Id = voyLstChangedDto.getTrans_Id();
		this.voyLstChangedDto = voyLstChangedDto;
		this.voyageId = voyLstChangedDto.getVoyageId();
	}
	
	public Q88_VoyLstChanged getVoyLstChanged() {
		Q88_VoyLstChanged voyLst = new Q88_VoyLstChanged();
		voyLst.setTrans_Id(trans_Id);
		voyLst.setVoyageId(voyageId);
		voyLst.setModified_Date(voyLstChangedDto.getModifiedDate());
		voyLst.setVesselName(voyLstChangedDto.getVesselName());
		voyLst.setVoyageNumber(voyLstChangedDto.getVoyageNumber());
		voyLst.setIsUntransferred(voyLstChangedDto.getIsUntransferred());
		return voyLst;
	}
	
	public Q88_VoyLstChanged_Review getVoyLstChangedReview() {
		if(voyLstChangedDto.getReview()!=null) {
			Q88_VoyLstChanged_Review voyLstReview = voyLstChangedDto.getReview();
			Q88_VoyLstChanged_Review review = new Q88_VoyLstChanged_Review();
			review.setTrans_Id(trans_Id);
			review.setVoyageId(voyageId);
			review.setReviewStatus(voyLstReview.getReviewStatus());
			review.setReviewedBy(voyLstReview.getReviewedBy());
			System.out.println("review Date "+voyLstReview.getReviewDate());
			review.setReview_Date(voyLstReview.getReviewDate());
			return review;
		}
		else {
			return null;
		}
		
	}
}
