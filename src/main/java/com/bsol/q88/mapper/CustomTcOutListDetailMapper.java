package com.bsol.q88.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.bsol.q88.model.Q88_TcOutDtl_Delivery;
import com.bsol.q88.model.Q88_TcOutDtl_DeliveryDtl;
import com.bsol.q88.model.Q88_TcOutDtl_Review;
import com.bsol.q88.model.Q88_TcOutDtl_CommissionList;
import com.bsol.q88.model.Q88_TcOutDtl;
import com.bsol.q88.model.Q88_TcOutDtl_Duration;
import com.bsol.q88.model.Q88_TcOutDtl_ReDeliveryDtl;
import com.bsol.q88.model.Q88_TcOutDtl_Results;
import com.bsol.q88.model.Q88_TcOutDtl_VoyageList;
import com.bsol.q88.model.Q88_TCOutDtl_Contract;

public class CustomTcOutListDetailMapper {

	private Q88_TcOutDtl tcOutListDtlDto;
	private Integer trans_Id;
	private String tcOutIdEncrypted;
	private String vesselIdEncrypted;

	Logger logger = Logger.getLogger(this.getClass());
	
	private CustomTcOutListDetailMapper() {

	}

	public CustomTcOutListDetailMapper(Q88_TcOutDtl tcOutListDtlDto) {
		super();
		this.tcOutListDtlDto = tcOutListDtlDto;
		this.trans_Id = tcOutListDtlDto.getTrans_Id();
		this.tcOutIdEncrypted = tcOutListDtlDto.getContract().getTcOutIdEncrypted();
		this.vesselIdEncrypted = tcOutListDtlDto.getContract().getVesselIdEncrypted();
	}

	public Q88_TcOutDtl getTcOutListDetail() {
		logger.info("Q88TcOutListDetail Custom getTcoutListDetails method");
		Q88_TcOutDtl tcOutListDtl = new Q88_TcOutDtl();
		tcOutListDtl.setTrans_Id(trans_Id);
		tcOutListDtl.setTcOutIdEncrypted(tcOutIdEncrypted);
		tcOutListDtl.setVesselIdEncrypted(vesselIdEncrypted);
		tcOutListDtl.setDurationRedeliveryDays(tcOutListDtlDto.getDurationRedeliveryDays());
		return tcOutListDtl;
	}

	public Q88_TCOutDtl_Contract getContract() {
		logger.info("Q88TcOutListDetail Custom getTcoutListDetails contract method");
		if (tcOutListDtlDto.getContract() != null) {
			Q88_TCOutDtl_Contract contract = tcOutListDtlDto.getContract();
			Q88_TCOutDtl_Contract q88TcOutcontract = new Q88_TCOutDtl_Contract();
			q88TcOutcontract.setTrans_Id(trans_Id);
			q88TcOutcontract.setCharterer(contract.getCharterer());
			q88TcOutcontract.setCp_Date(contract.getCpDate());
			q88TcOutcontract.setDuration(contract.getDuration());
			q88TcOutcontract.setModifiedBy(contract.getModifiedBy());
			q88TcOutcontract.setModified_Date(contract.getModifiedDate());
			q88TcOutcontract.setStart_Date(contract.getStartDate());
			q88TcOutcontract.setTcNumber(contract.getTcNumber());
			q88TcOutcontract.setTcOutIdEncrypted(tcOutIdEncrypted);
			q88TcOutcontract.setVessel(contract.getVessel());
			q88TcOutcontract.setVesselIdEncrypted(vesselIdEncrypted);
			return q88TcOutcontract;
		} else {
			return new Q88_TCOutDtl_Contract();
		}
	}

	public Q88_TcOutDtl_Review getTcOutDtlReview() {
		logger.info("Q88TcOutListDetail Custom getTcoutListDetails Review method");
		if (tcOutListDtlDto.getContract().getReview() != null) {
			Q88_TcOutDtl_Review review = tcOutListDtlDto.getContract().getReview();

			Q88_TcOutDtl_Review tcOutDtlReview = new Q88_TcOutDtl_Review();
			tcOutDtlReview.setTrans_Id(trans_Id);
			tcOutDtlReview.setReview_Date(review.getReviewDate());
			tcOutDtlReview.setReviewedBy(review.getReviewedBy());
			tcOutDtlReview.setReviewStatus(review.getReviewStatus());
			tcOutDtlReview.setTcOutIdEncrypted(tcOutIdEncrypted);
			tcOutDtlReview.setVesselIdEncrypted(vesselIdEncrypted);
			return tcOutDtlReview;
		} else {
			return new Q88_TcOutDtl_Review();
		}
	}

	public List<Q88_TcOutDtl_CommissionList> getTcOutFixtureCommission() {

		logger.info("Q88TcOutListDetail Custom getTcoutListDetails TcOutFixtureCommission method");
		List<Q88_TcOutDtl_CommissionList> commissionlist = tcOutListDtlDto.getCommissionList();

		List<Q88_TcOutDtl_CommissionList> tcOFixtureCommissionList = new ArrayList<Q88_TcOutDtl_CommissionList>();
		if (tcOutListDtlDto.getCommissionList() != null) {
			for (Q88_TcOutDtl_CommissionList commission : commissionlist) {

				Q88_TcOutDtl_CommissionList fixCommission = new Q88_TcOutDtl_CommissionList();
				fixCommission.setTrans_Id(tcOutListDtlDto.getTrans_Id());
				fixCommission.setCommissionType(commission.getCommissionType());
				fixCommission.setOrganizationExternalId(commission.getOrganizationExternalId());
				fixCommission.setOrganizationGroupName(commission.getOrganizationGroupName());
				fixCommission.setOrganizationName(commission.getOrganizationName());
				fixCommission.setRate(commission.getRate());
				fixCommission.setTcOutIdEncrypted(tcOutIdEncrypted);
				fixCommission.setVesselIdEncrypted(vesselIdEncrypted);
				fixCommission.setTcOutFixtureCommission(getTcOutListDetail());
				tcOFixtureCommissionList.add(fixCommission);
			}
		} else {
			List<Q88_TcOutDtl_CommissionList> CommissionList = new ArrayList<Q88_TcOutDtl_CommissionList>();
			return CommissionList;
		}

		return tcOFixtureCommissionList;
	}

	public Q88_TcOutDtl_Results getTcOutResults() {
		logger.info("Q88TcOutListDetail Custom getTcoutListDetails TcOutResult method");
		if (tcOutListDtlDto.getResults() != null) {
			Q88_TcOutDtl_Results results = tcOutListDtlDto.getResults();
			Q88_TcOutDtl_Results tcOutResults = new Q88_TcOutDtl_Results();
			tcOutResults.setTrans_Id(tcOutListDtlDto.getTrans_Id());
			tcOutResults.setBunkers(results.getBunkers());
			tcOutResults.setCommission(results.getCommission());
			tcOutResults.setNetDays(results.getNetDays());
			tcOutResults.setRemark(results.getRemark());
			tcOutResults.setRevenueHire(results.getRevenueHire());
			tcOutResults.setRevenueMisc(results.getRevenueMisc());
			tcOutResults.setTCE(results.getTCE());
			tcOutResults.setTcOutIdEncrypted(tcOutIdEncrypted);
			tcOutResults.setVesselIdEncrypted(vesselIdEncrypted);

			return tcOutResults;
		} else {
			return new Q88_TcOutDtl_Results();
		}

	}

	public List<Q88_TcOutDtl_Duration> getPeriods() {
		logger.info("Q88TcOutListDetail Custom getTcoutListDetails periods method");
		List<Q88_TcOutDtl_Duration> periodList = tcOutListDtlDto.getDuration();

		List<Q88_TcOutDtl_Duration> tcOutdurationList = new ArrayList<Q88_TcOutDtl_Duration>();

		if (tcOutListDtlDto.getDuration() != null) {
			for (Q88_TcOutDtl_Duration tcOutPeriod : periodList) {
				Q88_TcOutDtl_Duration duration = new Q88_TcOutDtl_Duration();
				duration.setTrans_Id(tcOutListDtlDto.getTrans_Id());
				duration.setDurationLength(tcOutPeriod.getDurationLength());
				duration.setDurationType(tcOutPeriod.getDurationType());
				duration.setOption(tcOutPeriod.getOption());
				duration.setStart_Date(tcOutPeriod.getStartDate());
				duration.setTcOutIdEncrypted(tcOutIdEncrypted);
				duration.setVesselIdEncrypted(vesselIdEncrypted);
				duration.setQ88TcOutPeriod(getTcOutListDetail());
				tcOutdurationList.add(duration);
			}
			return tcOutdurationList;
		} else {
			List<Q88_TcOutDtl_Duration> durationList = new ArrayList<Q88_TcOutDtl_Duration>();
			return durationList;
		}

	}

	public List<Q88_TcOutDtl_VoyageList> getTcOutVoyageList() {
		logger.info("Q88TcOutListDetail Custom getTcoutListDetails voyagelist method");
		List<Q88_TcOutDtl_VoyageList> voyageList = tcOutListDtlDto.getVoyageList();

		List<Q88_TcOutDtl_VoyageList> tcOutVoyageList = new ArrayList<Q88_TcOutDtl_VoyageList>();

		if (tcOutListDtlDto.getVoyageList() != null) {
			for (Q88_TcOutDtl_VoyageList voyage : voyageList) {
				Q88_TcOutDtl_VoyageList tcVoyage = new Q88_TcOutDtl_VoyageList();
				tcVoyage.setTrans_Id(tcOutListDtlDto.getTrans_Id());
				tcVoyage.setEnd_Date(voyage.getEndDate());
				tcVoyage.setFirstLoad(voyage.getFirstLoad());
				tcVoyage.setFirstLoadPortIdEncrypted(voyage.getFirstLoadPortIdEncrypted());
				tcVoyage.setLastDischarge(voyage.getLastDischarge());
				tcVoyage.setLastDischargePortIdEncrypted(voyage.getLastDischargePortIdEncrypted());
				tcVoyage.setVoyageNumber(voyage.getVoyageNumber());
				tcVoyage.setVoyageIdEncrypted(voyage.getVoyageIdEncrypted());
				tcVoyage.setTcOutIdEncrypted(tcOutIdEncrypted);
				tcVoyage.setVesselIdEncrypted(vesselIdEncrypted);
				tcOutVoyageList.add(tcVoyage);
			}
			return tcOutVoyageList;
		}
		else {
			List<Q88_TcOutDtl_VoyageList> voyageList1 = new ArrayList<Q88_TcOutDtl_VoyageList>();
			return voyageList1;
			
		}
	}

	public Q88_TcOutDtl_Delivery getDelivery() {
		logger.info("Q88TcOutListDetail Custom getTcoutListDetails Delivery main method");
		if (tcOutListDtlDto.getTcOutDeliveryRedelivery() != null) {
			Q88_TcOutDtl_Delivery q88Delivery = new Q88_TcOutDtl_Delivery();
			q88Delivery.setTrans_Id(tcOutListDtlDto.getTrans_Id());
			q88Delivery.setTcOutIdEncrypted(tcOutIdEncrypted);
			q88Delivery.setVesselIdEncrypted(vesselIdEncrypted);
			return q88Delivery;
		} else {
			return null;
		}

	}

	public Q88_TcOutDtl_DeliveryDtl getDeliveryDetail() {
		logger.info("Q88TcOutListDetail Custom getTcoutListDetails Delivery method");
		if ((tcOutListDtlDto.getTcOutDeliveryRedelivery()) != null) {
			Q88_TcOutDtl_DeliveryDtl tcOutDeliverydtl = tcOutListDtlDto.getTcOutDeliveryRedelivery().getDelivery();

			Q88_TcOutDtl_DeliveryDtl deliveryDtl = new Q88_TcOutDtl_DeliveryDtl();
			deliveryDtl.setTime(tcOutDeliverydtl.getTime());
			deliveryDtl.setVoyageNumber(tcOutDeliverydtl.getVoyageNumber());
			deliveryDtl.setVoyageLegName(tcOutDeliverydtl.getVoyageLegName());
			deliveryDtl.setVoyageIdEncrypted(tcOutDeliverydtl.getVoyageIdEncrypted());
			deliveryDtl.setTrans_Id(tcOutListDtlDto.getTrans_Id());
			deliveryDtl.setTcOutIdEncrypted(tcOutIdEncrypted);
			deliveryDtl.setVesselIdEncrypted(vesselIdEncrypted);

			return deliveryDtl;
		} else {
			return new Q88_TcOutDtl_DeliveryDtl();
		}
	}

	public Q88_TcOutDtl_ReDeliveryDtl getReDeliveryDetail() {
		
		logger.info("Q88TcOutListDetail Custom getTcoutListDetails ReDelivery method");
		if ((tcOutListDtlDto.getTcOutDeliveryRedelivery()) != null) {

			Q88_TcOutDtl_ReDeliveryDtl reDeliverydtl = tcOutListDtlDto.getTcOutDeliveryRedelivery().getRedelivery();
			Q88_TcOutDtl_ReDeliveryDtl reDelivery = new Q88_TcOutDtl_ReDeliveryDtl();
			reDelivery.setTime(reDeliverydtl.getTime());
			reDelivery.setVoyageNumber(reDeliverydtl.getVoyageNumber());
			reDelivery.setVoyageLegName(reDeliverydtl.getVoyageLegName());
			reDelivery.setVoyageIdEncrypted(reDeliverydtl.getVoyageIdEncrypted());
			reDelivery.setTrans_Id(tcOutListDtlDto.getTrans_Id());
			reDelivery.setTcOutIdEncrypted(tcOutIdEncrypted);
			reDelivery.setVesselIdEncrypted(vesselIdEncrypted);

			return reDelivery;
		} else {

			return new Q88_TcOutDtl_ReDeliveryDtl();
		}

	}

}
