package com.bsol.q88.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88VoyObjDao;
import com.bsol.q88.model.Q88_VoyObj;
import com.bsol.q88.model.Q88_VoyObj_Bunker;
import com.bsol.q88.model.Q88_VoyObj_Expense;
import com.bsol.q88.model.Q88_VoyObj_FixtureLst;
import com.bsol.q88.model.Q88_VoyObj_Fixture_BillOfLdng;
import com.bsol.q88.model.Q88_VoyObj_Fixture_Expense;
import com.bsol.q88.model.Q88_VoyObj_Fixture_Revenue;
import com.bsol.q88.model.Q88_VoyObj_Remark;
import com.bsol.q88.model.Q88_VoyObj_Revenue;
import com.bsol.q88.model.Q88_VoyObj_Review;
import com.bsol.q88.model.Q88_VoyObj_Rslt;
import com.bsol.q88.model.Q88_VoyObj_RsltDtl;
import com.bsol.q88.model.Q88_VoyObj_RsltFixed;
import com.bsol.q88.model.Q88_VoyObj_RsltFixedDtl;
import com.bsol.q88.model.Q88_VoyObj_Tcrelet;
import com.bsol.q88.service.Q88VoyObjService;
import com.bsol.q88.service.Q88VoyObjServiceImpl;

public class CustomVoyObjMapper {

	private Q88_VoyObj voyObjDto;
	private Integer trans_Id;
	private String voyageId;
	
	Logger logger = Logger.getLogger(this.getClass());

	public CustomVoyObjMapper() {

	}

	public CustomVoyObjMapper(Q88_VoyObj voyObjDto) {
		this();
		this.voyObjDto = voyObjDto;
		this.trans_Id = voyObjDto.getTrans_Id();
		this.voyageId = voyObjDto.getVoyageId();
	}
	

	public Q88_VoyObj getVoyObj() {
		logger.info("Q88CustomVoyageObjectMapper getVoyObject method inside");
		Q88_VoyObj voyObj = new Q88_VoyObj();
		voyObj.setTrans_Id(trans_Id);
		voyObj.setVoyageId(voyageId);
		voyObj.setVersion(voyObjDto.getVersion());
		voyObj.setVoyageNumber(voyObjDto.getVoyageNumber());
		voyObj.setVesselName(voyObjDto.getVesselName());
		voyObj.setVesselImo(voyObjDto.getVesselImo());
		voyObj.setVesselId(voyObjDto.getVesselId());
		voyObj.setStart_DateUtc(voyObjDto.getStartDateUtc());
		voyObj.setEnd_DateUtc(voyObjDto.getEndDateUtc());
		voyObj.setModuleType(voyObjDto.getModuleType());
		voyObj.setOffhireDays(voyObjDto.getOffhireDays());
		voyObj.setTags(voyObjDto.getTags());
		voyObj.setUrl(voyObjDto.getUrl());
		voyObj.setIsEstimate(voyObjDto.getIsEstimate());
		voyObj.setTcNumber(voyObjDto.getTcNumber());
		voyObj.setTcOutIdEncrypted(voyObjDto.getTcOutIdEncrypted());
		return voyObj;
	}

	public Q88_VoyObj_Rslt getVoyObjRslt() {
		if (voyObjDto.getResults() != null) {
			Q88_VoyObj_Rslt voyObjRes = voyObjDto.getResults();
			Q88_VoyObj_Rslt result = new Q88_VoyObj_Rslt();
			result.setTrans_Id(trans_Id);
			result.setVoyageId(voyageId);
			result.setBunkers(voyObjRes.getBunkers());
			result.setCommission(voyObjRes.getCommission());
			result.setDays(voyObjRes.getDays());
			result.setEfficiency(voyObjRes.getEfficiency());
			result.setExpense(voyObjRes.getExpense());
			result.setExpenses(voyObjRes.getExpenses());
			result.setModifiedByFull(voyObjRes.getModifiedByFull());
			result.setModified_Date(voyObjRes.getModifiedDate());
			result.setPnl(voyObjRes.getPnl());
			result.setPort(voyObjRes.getPort());
			result.setRevenue(voyObjRes.getRevenue());
			result.setSailedIn(voyObjRes.getSailedIn());
			result.setTce(voyObjRes.getTce());
			return result;
		} else {
			return null;
		}
	}

	public List<Q88_VoyObj_RsltDtl> getVoyObjRsltDtl() {

		List<Q88_VoyObj_RsltDtl> voyObjresdtl = voyObjDto.getResults().getResultDetail();
		List<Q88_VoyObj_RsltDtl> resList = new ArrayList<Q88_VoyObj_RsltDtl>();
		if (voyObjDto.getResults().getResultDetail() != null) {
			for (Q88_VoyObj_RsltDtl resDtllist : voyObjresdtl) {
				Q88_VoyObj_RsltDtl resDtl = new Q88_VoyObj_RsltDtl();
				resDtl.setTrans_Id(trans_Id);
				resDtl.setVoyageId(voyageId);
				resDtl.setClassificationName(resDtllist.getClassificationName());
				resDtl.setClassificationTotal(resDtllist.getClassificationTotal());
				resList.add(resDtl);
			}
			return resList;
		} else {
			return null;
		}
	}

	public Q88_VoyObj_RsltFixed getVoyObjRsltFixed() {
		if (voyObjDto.getResultsWhenFixed() != null) {
			Q88_VoyObj_RsltFixed voyObjResfixed = voyObjDto.getResultsWhenFixed();
			Q88_VoyObj_RsltFixed resultfixed = new Q88_VoyObj_RsltFixed();
			resultfixed.setTrans_Id(trans_Id);
			resultfixed.setVoyageId(voyageId);
			resultfixed.setBunkers(voyObjResfixed.getBunkers());
			resultfixed.setCommission(voyObjResfixed.getCommission());
			resultfixed.setDays(voyObjResfixed.getDays());
			resultfixed.setEfficiency(voyObjResfixed.getEfficiency());
			resultfixed.setExpense(voyObjResfixed.getExpense());
			resultfixed.setExpenses(voyObjResfixed.getExpenses());
			resultfixed.setModifiedByFull(voyObjResfixed.getModifiedByFull());
			resultfixed.setModified_Date(voyObjResfixed.getModifiedDate());
			resultfixed.setPnl(voyObjResfixed.getPnl());
			resultfixed.setPort(voyObjResfixed.getPort());
			resultfixed.setRevenue(voyObjResfixed.getRevenue());
			resultfixed.setSailedIn(voyObjResfixed.getSailedIn());
			resultfixed.setTce(voyObjResfixed.getTce());
			return resultfixed;
		} else {
			return null;
		}
	}

	public List<Q88_VoyObj_RsltFixedDtl> getVoyObjRsltFixedDtl() {

		List<Q88_VoyObj_RsltFixedDtl> voyObjresFixdtl = voyObjDto.getResultsWhenFixed().getResultDetail();
		List<Q88_VoyObj_RsltFixedDtl> resfixList = new ArrayList<Q88_VoyObj_RsltFixedDtl>();
		if (voyObjDto.getResultsWhenFixed().getResultDetail() != null) {
			for (Q88_VoyObj_RsltFixedDtl resfixDtllist : voyObjresFixdtl) {
				Q88_VoyObj_RsltFixedDtl resfixDtl = new Q88_VoyObj_RsltFixedDtl();
				resfixDtl.setTrans_Id(trans_Id);
				resfixDtl.setVoyageId(voyageId);
				resfixDtl.setClassificationName(resfixDtllist.getClassificationName());
				resfixDtl.setClassificationTotal(resfixDtllist.getClassificationTotal());
				resfixList.add(resfixDtl);
			}
			return resfixList;
		} else {
			return null;
		}
	}

	public List<Q88_VoyObj_Revenue> getVoyObjRevenue() {
		List<Q88_VoyObj_Revenue> revenueList = voyObjDto.getRevenueList();
		List<Q88_VoyObj_Revenue> voyagerevenue = new ArrayList<Q88_VoyObj_Revenue>();

		if (revenueList != null) {
			for (Q88_VoyObj_Revenue revenuelst : revenueList) {

				Q88_VoyObj_Revenue revenue = new Q88_VoyObj_Revenue();
				revenue.setTrans_Id(trans_Id);
				revenue.setVoyageId(voyageId);
				revenue.setAccrual(revenuelst.getAccrual());
				revenue.setDisplayOrder(revenuelst.getDisplayOrder());
				revenue.setFixtureDisplayOrder(revenuelst.getFixtureDisplayOrder());
				revenue.setFlatRate(revenuelst.getFlatRate());
				revenue.setIsCommission(revenuelst.getIsCommission());
				revenue.setName(revenuelst.getName());
				revenue.setQuantity(revenuelst.getQuantity());
				revenue.setRemark(revenuelst.getRemark());
				revenue.setTotal(revenuelst.getTotal());
				revenue.setTotalAccrued(revenuelst.getTotalAccrued());
				revenue.setWs(revenuelst.getWs());

				voyagerevenue.add(revenue);
			}
			return voyagerevenue;
		} else {
			return null;
		}

	}

	public List<Q88_VoyObj_Expense> getVoyObjExpenselst() {

		List<Q88_VoyObj_Expense> expenseList = voyObjDto.getExpenseList();
		List<Q88_VoyObj_Expense> fixtureExpense = new ArrayList<Q88_VoyObj_Expense>();
		if (expenseList != null) {

			for (Q88_VoyObj_Expense expenselst : expenseList) {
				Q88_VoyObj_Expense expense = new Q88_VoyObj_Expense();
				expense.setTrans_Id(trans_Id);
				expense.setVoyageId(voyageId);
				expense.setAmount(expenselst.getAmount());
				expense.setDaily(expenselst.getDaily());
				expense.setDisplayOrder(expenselst.getDisplayOrder());
				expense.setFixtureDisplayOrder(expenselst.getFixtureDisplayOrder());
				expense.setName(expenselst.getName());
				expense.setRemark(expenselst.getRemark());
				expense.setTotal(expenselst.getTotal());

				fixtureExpense.add(expense);
			}
			return fixtureExpense;
		} else {
			return null;
		}

	}

	public List<Q88_VoyObj_Bunker> getVoyObjBunkerlst() {

		List<Q88_VoyObj_Bunker> bunkerList = voyObjDto.getBunkerList();
		List<Q88_VoyObj_Bunker> voyObjBunker = new ArrayList<Q88_VoyObj_Bunker>();
		if (bunkerList != null) {

			for (Q88_VoyObj_Bunker bunkerlst : bunkerList) {
				Q88_VoyObj_Bunker bunker = new Q88_VoyObj_Bunker();
				bunker.setTrans_Id(trans_Id);
				bunker.setVoyageId(voyageId);
				bunker.setAverageConsumptionCost(bunkerlst.getAverageConsumptionCost());
				bunker.setBunkerGradeName(bunkerlst.getBunkerGradeName());
				bunker.setConsCost(bunkerlst.getConsCost());
				bunker.setConsTotal(bunkerlst.getConsTotal());
				bunker.setDisplayOrder(bunkerlst.getDisplayOrder());
				bunker.setRefillPrice(bunkerlst.getRefillPrice());
				bunker.setRemainderConsCost(bunkerlst.getRemainderConsCost());
				bunker.setTotalCost(bunkerlst.getTotalCost());
				voyObjBunker.add(bunker);

			}
			return voyObjBunker;
		} else {
			return null;
		}

	}

	public List<Q88_VoyObj_Remark> getVoyObjRemarklst() {

		List<Q88_VoyObj_Remark> remarkList = voyObjDto.getRemarkList();
		List<Q88_VoyObj_Remark> voyObjRemark = new ArrayList<Q88_VoyObj_Remark>();
		if (remarkList != null) {

			for (Q88_VoyObj_Remark remarklst : remarkList) {
				Q88_VoyObj_Remark remark = new Q88_VoyObj_Remark();
				remark.setTrans_Id(trans_Id);
				remark.setVoyageId(voyageId);
				remark.setModified_Date(remarklst.getModifiedDate());
				remark.setModifiedByFull(remarklst.getModifiedByFull());
				remark.setRemark(remarklst.getRemark());
				voyObjRemark.add(remark);

			}
			return voyObjRemark;
		} else {
			return null;
		}

	}
	
	public Q88_VoyObj_Tcrelet getVoyObjTcRelet() {
		if (voyObjDto.getTcReletDetail() != null) {
			Q88_VoyObj_Tcrelet voyObjRes = voyObjDto.getTcReletDetail();
			Q88_VoyObj_Tcrelet tcrelet = new Q88_VoyObj_Tcrelet();
			tcrelet.setTrans_Id(trans_Id);
			tcrelet.setVoyageId(voyageId);
			tcrelet.setFixtureRemarks(voyObjDto.getTcReletDetail().getFixtureRemarks());
			tcrelet.setDelivery_DateTimeZ(voyObjDto.getTcReletDetail().getDeliveryDateTimeZ());
			tcrelet.setDeliveryLegName(voyObjDto.getTcReletDetail().getDeliveryLegName());
			tcrelet.setRedelivery_DateTimeZ(voyObjDto.getTcReletDetail().getRedeliveryDateTimeZ());
			tcrelet.setRedeliveryLegName(voyObjDto.getTcReletDetail().getRedeliveryLegName());
			tcrelet.setTcReletDuration(voyObjDto.getTcReletDetail().getTcReletDuration());
			tcrelet.setTcReletDurationUnit(voyObjDto.getTcReletDetail().getTcReletDurationUnit());
			
			return tcrelet;
		} else {
			return null;
		}
	}
	
	
	public Q88_VoyObj_Review getVoyObjReview() {
		if (voyObjDto.getReview() != null) {
			Q88_VoyObj_Review voyObjReview = voyObjDto.getReview();
			Q88_VoyObj_Review review = new Q88_VoyObj_Review();
			review.setTrans_Id(trans_Id);
			review.setVoyageId(voyageId);
			review.setReviewStatus(voyObjDto.getReview().getReviewStatus());
			review.setReviewedBy(voyObjDto.getReview().getReviewedBy());
			review.setReview_Date(voyObjDto.getReview().getReviewDate());
			
			return review;
		} else {
			return null;
		}
	}
}
