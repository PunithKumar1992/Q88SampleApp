package com.bsol.q88.mapper;



import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_TcOutList_Review;

public class CustomTcOutListMapper {
	
	private Q88_TcOutList tcOutListDto;
	private Integer trans_Id;
	private String tcOutIdEncrypted;
	private String vesselIdEncrypted ;
	
	private CustomTcOutListMapper() {
	}
	
	public CustomTcOutListMapper(Q88_TcOutList tcOutListDto) {
		this();
		this.tcOutListDto = tcOutListDto;;
		this.trans_Id = tcOutListDto.getTrans_Id();
		this.tcOutIdEncrypted = tcOutListDto.getTcOutIdEncrypted();
		this.vesselIdEncrypted = tcOutListDto.getVesselIdEncrypted();
	}
	
	
	public Q88_TcOutList getTcOutList() {
		Q88_TcOutList tcOutList = new Q88_TcOutList();
		tcOutList.setCharterer(tcOutListDto.getCharterer());
		tcOutList.setCp_Date(tcOutListDto.getCpDate());
		tcOutList.setDuration(tcOutListDto.getDuration());
		tcOutList.setModified_date(tcOutListDto.getModifiedDate());
		tcOutList.setModifiedBy(tcOutListDto.getModifiedBy());
		tcOutList.setStart_Date(tcOutListDto.getStartDate());
		tcOutList.setTcNumber(tcOutListDto.getTcNumber());
		tcOutList.setTcOutIdEncrypted(tcOutListDto.getTcOutIdEncrypted());
		tcOutList.setTrans_Id(tcOutListDto.getTrans_Id());
		tcOutList.setVessel(tcOutListDto.getVessel());
		tcOutList.setVesselIdEncrypted(tcOutListDto.getVesselIdEncrypted());
		return tcOutList;
	}

		public Q88_TcOutList_Review getTcOutListReview() {
			if(tcOutListDto.getReview()!=null) {
			Q88_TcOutList_Review review =   this.tcOutListDto.getReview();
			Q88_TcOutList_Review tcoutListReview = new Q88_TcOutList_Review();
			tcoutListReview.setReview_Date(review.getReviewDate());
			tcoutListReview.setReviewedBy(review.getReviewedBy());
			tcoutListReview.setReviewStatus(review.getReviewStatus());
			tcoutListReview.setTcOutIdEncrypted(tcOutIdEncrypted);
			tcoutListReview.setTrans_Id(trans_Id);
			tcoutListReview.setVesselIdEncrypted(vesselIdEncrypted);
			return tcoutListReview;
			}
			else {
				return null;
			}
			
		}
}
