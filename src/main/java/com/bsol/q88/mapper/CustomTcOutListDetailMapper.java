package com.bsol.q88.mapper;

import java.util.ArrayList;
import java.util.List;

import com.bsol.q88.model.Q88_TcOutDelivery;
import com.bsol.q88.model.Q88_TcOutDeliveryDetail;
import com.bsol.q88.model.Q88_TcOutDtlReview;
import com.bsol.q88.model.Q88_TcOutFixtureCommission;
import com.bsol.q88.model.Q88_TcOutListDetails;
import com.bsol.q88.model.Q88_TcOutPeriod;
import com.bsol.q88.model.Q88_TcOutReDeliveryDetail;
import com.bsol.q88.model.Q88_TcOutResults;
import com.bsol.q88.model.Q88_TcOutVoyage;
import com.bsol.q88.model.Q88_TcoFixture;

public class CustomTcOutListDetailMapper {

	private Q88_TcOutListDetails tcOutListDtlDto;
	 private Integer tcOutDetail_SeqId;
	 private String tcOutIdEncrypted;
	 private String vesselIdEncrypted;	  
	 
	 private  CustomTcOutListDetailMapper() {
		 
	 }

	public CustomTcOutListDetailMapper(Q88_TcOutListDetails tcOutListDtlDto) {
		super();
		this.tcOutListDtlDto = tcOutListDtlDto;
		this.tcOutDetail_SeqId = tcOutListDtlDto.getTcOutDetail_SeqId();
		this.tcOutIdEncrypted = tcOutListDtlDto.getContract().getTcOutIdEncrypted();
		this.vesselIdEncrypted = tcOutListDtlDto.getContract().getVesselIdEncrypted();
	}
	 
	public Q88_TcOutListDetails getTcOutListDetail() {

		Q88_TcOutListDetails tcOutListDtl = new Q88_TcOutListDetails();
		tcOutListDtl.setTcOutDetail_SeqId(tcOutDetail_SeqId);
		tcOutListDtl.setTcOutIdEncrypted(tcOutIdEncrypted);
		tcOutListDtl.setVesselIdEncrypted(vesselIdEncrypted);
		tcOutListDtl.setDurationRedeliveryDays(tcOutListDtlDto.getDurationRedeliveryDays());
		return tcOutListDtl;
	}
	public Q88_TcoFixture getContract() {
		Q88_TcoFixture  fixture = tcOutListDtlDto.getContract();
		
		Q88_TcoFixture q88TcOutFixture = new Q88_TcoFixture();
		q88TcOutFixture.setCharterer(fixture.getCharterer());
		q88TcOutFixture.setCpDate(fixture.getCpDate());
		q88TcOutFixture.setDuration(fixture.getDuration());
		q88TcOutFixture.setModifiedBy(fixture.getModifiedBy());
		q88TcOutFixture.setModifiedDate(fixture.getModifiedDate());
		q88TcOutFixture.setStartDate(fixture.getStartDate());
		q88TcOutFixture.setTcNumber(fixture.getTcNumber());
		q88TcOutFixture.setTcOutDetail_SeqId(tcOutDetail_SeqId);
		q88TcOutFixture.setTcOutIdEncrypted(tcOutIdEncrypted);
		q88TcOutFixture.setVessel(fixture.getVessel());
		q88TcOutFixture.setVesselIdEncrypted(vesselIdEncrypted);
		return q88TcOutFixture;
	}
	
	public Q88_TcOutDtlReview getTcOutDtlReview() {
		Q88_TcOutDtlReview review = tcOutListDtlDto.getContract().getReview();
		
		Q88_TcOutDtlReview tcOutDtlReview = new Q88_TcOutDtlReview();
		tcOutDtlReview.setReviewDate(review.getReviewDate());
		tcOutDtlReview.setReviewedBy(review.getReviewedBy());
		tcOutDtlReview.setReviewStatus(review.getReviewStatus());
		tcOutDtlReview.setTcOutDetail_SeqId(tcOutDetail_SeqId);
		tcOutDtlReview.setTcOutIdEncrypted(tcOutIdEncrypted);
		tcOutDtlReview.setVesselIdEncrypted(vesselIdEncrypted);
		return tcOutDtlReview;
	}
	
	public List<Q88_TcOutFixtureCommission> getTcOutFixtureCommission(){
		
		List<Q88_TcOutFixtureCommission> commissionlist = tcOutListDtlDto.getCommissionList();
		
		List<Q88_TcOutFixtureCommission>  tcOFixtureCommissionList =  new ArrayList<Q88_TcOutFixtureCommission>();
		
		for(Q88_TcOutFixtureCommission commission : commissionlist) {
			
			Q88_TcOutFixtureCommission fixCommission =  new Q88_TcOutFixtureCommission();
			  fixCommission.setCommissionType(commission.getCommissionType());
			  fixCommission.setOrganizationExternalId(commission.getOrganizationExternalId());
			  fixCommission.setOrganizationGroupName(commission.getOrganizationGroupName());
			  fixCommission.setOrganizationName(commission.getOrganizationName());
			  fixCommission.setRate(commission.getRate());
			  fixCommission.setTcOutDetail_SeqId(tcOutListDtlDto.getTcOutDetail_SeqId());
			  fixCommission.setTcOutIdEncrypted(tcOutIdEncrypted);
			  fixCommission.setVesselIdEncrypted(vesselIdEncrypted);
			  fixCommission.setTcOutFixtureCommission(getTcOutListDetail());
			  tcOFixtureCommissionList.add(fixCommission);
		}
		
		return tcOFixtureCommissionList;
	}
	
	public Q88_TcOutResults getTcOutResults() {
		Q88_TcOutResults results = tcOutListDtlDto.getResults();
		
		Q88_TcOutResults tcOutResults = new Q88_TcOutResults();
		tcOutResults.setBunkers(results.getBunkers());
		tcOutResults.setCommission(results.getCommission());
		tcOutResults.setNetDays(results.getNetDays());
		tcOutResults.setRemark(results.getRemark());
		tcOutResults.setRevenueHire(results.getRevenueHire());
		tcOutResults.setRevenueMisc(results.getRevenueMisc());
		tcOutResults.setTCE(results.getTCE());
		tcOutResults.setTcOutDetail_SeqId(tcOutListDtlDto.getTcOutDetail_SeqId());
		tcOutResults.setTcOutIdEncrypted(tcOutIdEncrypted);
		tcOutResults.setVesselIdEncrypted(vesselIdEncrypted);
		
		return tcOutResults;
	}
	
	public List<Q88_TcOutPeriod> getPeriods(){
		List<Q88_TcOutPeriod> periodList = tcOutListDtlDto.getDuration();
		
		List<Q88_TcOutPeriod>  tcOutPeriodList =  new ArrayList<Q88_TcOutPeriod>();
		
		for(Q88_TcOutPeriod tcOutPeriod : periodList) {
			Q88_TcOutPeriod period = new Q88_TcOutPeriod();
			period.setDurationLength(tcOutPeriod.getDurationLength());
			period.setDurationType(tcOutPeriod.getDurationType());
			period.setOption(tcOutPeriod.getOption());
			period.setStartDate(tcOutPeriod.getStartDate());
			period.setTcOutDetail_SeqId(tcOutListDtlDto.getTcOutDetail_SeqId());
			period.setTcOutIdEncrypted(tcOutIdEncrypted);
			period.setVesselIdEncrypted(vesselIdEncrypted);
			period.setQ88TcOutPeriod(getTcOutListDetail());
			tcOutPeriodList.add(period);
		}
		return tcOutPeriodList;
		
	}
	
	public List<Q88_TcOutVoyage> getTcOutVoyageList(){
		
		List<Q88_TcOutVoyage> voyageList = tcOutListDtlDto.getVoyageList();
		
		List<Q88_TcOutVoyage> tcOutVoyageList = new ArrayList<Q88_TcOutVoyage>();
		
		for(Q88_TcOutVoyage voyage : voyageList) {
			Q88_TcOutVoyage  tcVoyage = new Q88_TcOutVoyage();
			tcVoyage.setEndDate(voyage.getEndDate());
			tcVoyage.setFirstLoad(voyage.getFirstLoad());
			tcVoyage.setFirstLoadPortIdEncrypted(voyage.getFirstLoadPortIdEncrypted());
			tcVoyage.setLastDischarge(voyage.getLastDischarge());
			tcVoyage.setLastDischargePortIdEncrypted(voyage.getLastDischargePortIdEncrypted());
			tcVoyage.setVoyageNumber(voyage.getVoyageNumber());
			tcVoyage.setVoyageIdEncrypted(voyage.getVoyageIdEncrypted());
			tcVoyage.setTcOutDetail_SeqId(tcOutListDtlDto.getTcOutDetail_SeqId());
			tcVoyage.setTcOutIdEncrypted(tcOutIdEncrypted);
			tcVoyage.setVesselIdEncrypted(vesselIdEncrypted);
			tcOutVoyageList.add(tcVoyage);
		}
		return tcOutVoyageList;
	}
	
	public Q88_TcOutDelivery getDelivery() {
		 if(tcOutListDtlDto.getTcOutDeliveryRedelivery()!=null) {
		Q88_TcOutDelivery q88Delivery = new Q88_TcOutDelivery();
		q88Delivery.setTcOutDetail_SeqId(tcOutListDtlDto.getTcOutDetail_SeqId());
		q88Delivery.setTcOutIdEncrypted(tcOutIdEncrypted);
		q88Delivery.setVesselIdEncrypted(vesselIdEncrypted);
		return q88Delivery;
		 }
		 else {
			 return null;
		 }
		
	}
	
	public Q88_TcOutDeliveryDetail getDeliveryDetail() {
		if((tcOutListDtlDto.getTcOutDeliveryRedelivery())!=null) {
		Q88_TcOutDeliveryDetail  tcOutDeliverydtl = tcOutListDtlDto.getTcOutDeliveryRedelivery().getDelivery();
		
		Q88_TcOutDeliveryDetail deliveryDtl = new Q88_TcOutDeliveryDetail();
		deliveryDtl.setTime(tcOutDeliverydtl.getTime());
		deliveryDtl.setVoyageNumber(tcOutDeliverydtl.getVoyageNumber());
		deliveryDtl.setVoyageLegName(tcOutDeliverydtl.getVoyageLegName());
		deliveryDtl.setVoyageIdEncrypted(tcOutDeliverydtl.getVoyageIdEncrypted());
		deliveryDtl.setTcOutDetail_SeqId(tcOutListDtlDto.getTcOutDetail_SeqId());
		deliveryDtl.setTcOutIdEncrypted(tcOutIdEncrypted);
		deliveryDtl.setVesselIdEncrypted(vesselIdEncrypted);
		
		return deliveryDtl;
		}
		else {
			return new Q88_TcOutDeliveryDetail();
		}
	}
	
	public Q88_TcOutReDeliveryDetail getReDeliveryDetail() {
		if((tcOutListDtlDto.getTcOutDeliveryRedelivery()) !=null) {
			
		Q88_TcOutReDeliveryDetail reDeliverydtl = tcOutListDtlDto.getTcOutDeliveryRedelivery().getRedelivery();
		Q88_TcOutReDeliveryDetail reDelivery = new Q88_TcOutReDeliveryDetail();
		reDelivery.setTime(reDeliverydtl.getTime());
		reDelivery.setVoyageNumber(reDeliverydtl.getVoyageNumber());
		reDelivery.setVoyageLegName(reDeliverydtl.getVoyageLegName());
		reDelivery.setVoyageIdEncrypted(reDeliverydtl.getVoyageIdEncrypted());
		reDelivery.setTcOutDetail_SeqId(tcOutListDtlDto.getTcOutDetail_SeqId());
		reDelivery.setTcOutIdEncrypted(tcOutIdEncrypted);
		reDelivery.setVesselIdEncrypted(vesselIdEncrypted);
		
		return reDelivery;
		}
		else {
			
			return new Q88_TcOutReDeliveryDetail();
		}
		
	}

	
	
}
