package com.bsol.q88.mapper;



import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_TcoutListReview;

public class CustomTcOutListMapper {
	
	private Q88_TcOutList tcOutListDto;
	private Integer tcoutListId;
	private String tcOutIdEncrypted;
	private String vesselIdEncrypted ;
	
	private CustomTcOutListMapper() {
	}
	
	public CustomTcOutListMapper(Q88_TcOutList tcOutListDto) {
		this();
		this.tcOutListDto = tcOutListDto;;
		this.tcoutListId = tcOutListDto.getTcout_SeqId();
		this.tcOutIdEncrypted = tcOutListDto.getTcOutIdEncrypted();
		this.vesselIdEncrypted = tcOutListDto.getVesselIdEncrypted();
	}
	
	
	public Q88_TcOutList getTcOutList() {
		Q88_TcOutList tcOutList = new Q88_TcOutList();
		tcOutList.setCharterer(tcOutListDto.getCharterer());
		tcOutList.setCpDate(tcOutListDto.getCpDate());
		tcOutList.setDuration(tcOutListDto.getDuration());
		tcOutList.setModifiedBy(tcOutListDto.getModifiedBy());
		tcOutList.setModifiedDate(tcOutListDto.getModifiedDate());
		tcOutList.setStartDate(tcOutListDto.getStartDate());
		tcOutList.setTcNumber(tcOutListDto.getTcNumber());
		tcOutList.setTcout_SeqId(tcoutListId);
		tcOutList.setTcOutIdEncrypted(tcOutIdEncrypted);
		tcOutList.setVessel(tcOutListDto.getVessel());
		tcOutList.setVesselIdEncrypted(vesselIdEncrypted);
		return tcOutList;
	}

		public Q88_TcoutListReview getTcOutListReview() {
			Q88_TcoutListReview Review =   this.tcOutListDto.getReview();
			
			Q88_TcoutListReview tcoutListReview = new Q88_TcoutListReview();
			tcoutListReview.setReviewDate(Review.getReviewDate());
			tcoutListReview.setReviewedBy(Review.getReviewedBy());
			tcoutListReview.setReviewStatus(Review.getReviewStatus());
			tcoutListReview.setTcout_SeqId(tcoutListId);
			tcoutListReview.setTcOutIdEncrypted(tcOutIdEncrypted);
			tcoutListReview.setVesselIdEncrypted(vesselIdEncrypted);
			return tcoutListReview;
			
		}
}
