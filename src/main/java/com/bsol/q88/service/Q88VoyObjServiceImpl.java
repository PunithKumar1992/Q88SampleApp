package com.bsol.q88.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bsol.q88.dao.Q88VoyObjDao;
import com.bsol.q88.mapper.CustomVoyObjMapper;
import com.bsol.q88.model.Q88_VoyObj;
import com.bsol.q88.model.Q88_VoyObj_Bunker;
import com.bsol.q88.model.Q88_VoyObj_Expense;
import com.bsol.q88.model.Q88_VoyObj_FixtureLst;
import com.bsol.q88.model.Q88_VoyObj_Fixture_BillOfLdng;
import com.bsol.q88.model.Q88_VoyObj_Fixture_Commission;
import com.bsol.q88.model.Q88_VoyObj_Fixture_Expense;
import com.bsol.q88.model.Q88_VoyObj_Fixture_Grade;
import com.bsol.q88.model.Q88_VoyObj_Fixture_Port;
import com.bsol.q88.model.Q88_VoyObj_Fixture_Revenue;
import com.bsol.q88.model.Q88_VoyObj_Fixture_TagLst;
import com.bsol.q88.model.Q88_VoyObj_LegLst;
import com.bsol.q88.model.Q88_VoyObj_LegLst_BunRob;
import com.bsol.q88.model.Q88_VoyObj_LegLst_BunStem;
import com.bsol.q88.model.Q88_VoyObj_Offhire;
import com.bsol.q88.model.Q88_VoyObj_Offhire_Bunker;
import com.bsol.q88.model.Q88_VoyObj_Remark;
import com.bsol.q88.model.Q88_VoyObj_Revenue;
import com.bsol.q88.model.Q88_VoyObj_Review;
import com.bsol.q88.model.Q88_VoyObj_Rslt;
import com.bsol.q88.model.Q88_VoyObj_RsltDtl;
import com.bsol.q88.model.Q88_VoyObj_RsltFixed;
import com.bsol.q88.model.Q88_VoyObj_RsltFixedDtl;
import com.bsol.q88.model.Q88_VoyObj_Tcrelet;
import com.bsol.q88.util.dataconvertor.Q88_VoyObjDataTransfer;

@Service
public class Q88VoyObjServiceImpl implements Q88VoyObjService {

	@Autowired
	private Q88VoyObjDao voyObjdao;
	Integer test;

	@Autowired
	private Q88_VoyObjDataTransfer voyObjTransfer;

	@Override
	public void saveVoyObj(Q88_VoyObj voyObj) {
		CustomVoyObjMapper custom = new CustomVoyObjMapper(voyObj);
		Q88_VoyObj voyObject = voyObjTransfer.getVoyObj(voyObj, Q88_VoyObj.class);
		Q88_VoyObj_Rslt voyObjRes = voyObjTransfer.getVoyObj(voyObj, Q88_VoyObj_Rslt.class);
		List<Q88_VoyObj_RsltDtl> voyObjResDtl = custom.getVoyObjRsltDtl();
		Q88_VoyObj_RsltFixed voyObjResfixed = voyObjTransfer.getVoyObj(voyObj, Q88_VoyObj_RsltFixed.class);
		List<Q88_VoyObj_RsltFixedDtl> voyObjResfixedDtl = custom.getVoyObjRsltFixedDtl();
		List<Q88_VoyObj_FixtureLst> voyFixtureLst = voyObj.getFixtureList();
		List<Q88_VoyObj_Revenue> revenuelist = custom.getVoyObjRevenue();
		List<Q88_VoyObj_Expense> expenselist = custom.getVoyObjExpenselst();
		List<Q88_VoyObj_Bunker> bunkerlist = custom.getVoyObjBunkerlst();
		List<Q88_VoyObj_Remark> remarkList = custom.getVoyObjRemarklst();
		Q88_VoyObj_Tcrelet tcrelet = voyObjTransfer.getVoyObj(voyObj, Q88_VoyObj_Tcrelet.class);
		Q88_VoyObj_Review review = voyObjTransfer.getVoyObj(voyObj, Q88_VoyObj_Review.class);
		Integer transID = voyObj.getTrans_Id();
		String voyageID = voyObj.getVoyageId();

		List<Q88_VoyObj_FixtureLst> fixtureList = new ArrayList<Q88_VoyObj_FixtureLst>();

		if (voyObj.getFixtureList() != null) {
			for (Q88_VoyObj_FixtureLst fixturelst : voyFixtureLst) {
				Integer fixtureSeqId = voyObjdao.getfixtureSeqId();
				Q88_VoyObj_FixtureLst fixture = new Q88_VoyObj_FixtureLst();
				fixture.setTrans_Id(transID);
				fixture.setVoyageId(voyageID);
				fixture.setFixtureLst_SeqId(fixtureSeqId);
				fixture.setCp_Date(fixturelst.getCpDate());
				fixture.setCpQuantity(fixturelst.getCpQuantity());
				fixture.setDemurrage(fixturelst.getDemurrage());
				fixture.setDisplayOrder(fixturelst.getDisplayOrder());
				fixture.setFixtureNumber(fixturelst.getFixtureNumber());
				fixture.setFixtureRemark(fixturelst.getFixtureRemark());
				fixture.setGrades(fixturelst.getGrades());
				fixture.setLayCan_DateEnd(fixturelst.getLayCanDateEnd());
				fixture.setLayCan_DateStart(fixturelst.getLayCanDateStart());
				fixture.setLaytime(fixturelst.getLaytime());
				fixture.setOtherTimeBar(fixturelst.getOtherTimeBar());
				fixture.setOverage(fixturelst.getOverage());
				fixture.setTimeBar(fixturelst.getTimeBar());
				fixture.setTags(fixturelst.getTags());
				List<Q88_VoyObj_Fixture_BillOfLdng> billofLdng = fixturelst.getFixtureBillsOfLading();
				List<Q88_VoyObj_Fixture_BillOfLdng> fixtureBillList = new ArrayList<Q88_VoyObj_Fixture_BillOfLdng>();
				if (billofLdng != null) {
					for (Q88_VoyObj_Fixture_BillOfLdng billOfLading : billofLdng) {
						Q88_VoyObj_Fixture_BillOfLdng fixtureBill = new Q88_VoyObj_Fixture_BillOfLdng();
						fixtureBill.setTrans_Id(transID);
						fixtureBill.setVoyageId(voyageID);
						fixtureBill.setFixtureLst_SeqId(fixtureSeqId);
						fixtureBill.setBillOfLading_Date(billOfLading.getBillOfLadingDate());
						fixtureBill.setDescription(billOfLading.getDescription());
						fixtureBill.setDisplayOrder(billOfLading.getDisplayOrder());
						fixtureBill.setFixtureGradeName(billOfLading.getFixtureGradeName());
						fixtureBill.setPortName(billOfLading.getPortName());
						fixtureBill.setPortId(billOfLading.getPortId());
						fixtureBill.setFixturePortLinkToken(billOfLading.getFixturePortLinkToken());
						fixtureBill.setQuantityBBLS(billOfLading.getQuantityBBLS());
						fixtureBill.setQuantityMT(billOfLading.getQuantityMT());
						fixtureBill.setShipper(billOfLading.getShipper());
						fixtureBill.setVoyageFixtureGradeDisplayOrder(billOfLading.getVoyageFixtureGradeDisplayOrder());
						fixtureBillList.add(fixtureBill);
					}
				}
				List<Q88_VoyObj_Fixture_Commission> commissionlist = fixturelst.getFixtureCommissions();
				List<Q88_VoyObj_Fixture_Commission> fixtureCommission = new ArrayList<Q88_VoyObj_Fixture_Commission>();
				if (commissionlist != null) {
					for (Q88_VoyObj_Fixture_Commission commissionlst : commissionlist) {
						Q88_VoyObj_Fixture_Commission commission = new Q88_VoyObj_Fixture_Commission();
						commission.setTrans_Id(transID);
						commission.setVoyageId(voyageID);
						commission.setFixtureLst_SeqId(fixtureSeqId);
						commission.setCommissionType(commissionlst.getCommissionType());
						commission.setOrganizationGroupName(commissionlst.getOrganizationGroupName());
						commission.setOrganizationName(commissionlst.getOrganizationName());
						commission.setOrganizationExternalId(commissionlst.getOrganizationExternalId());
						commission.setRate(commissionlst.getRate());
						fixtureCommission.add(commission);
					}
				}

				List<Q88_VoyObj_Fixture_Grade> gradeList = fixturelst.getFixtureGrades();
				List<Q88_VoyObj_Fixture_Grade> fixtureGrade = new ArrayList<Q88_VoyObj_Fixture_Grade>();
				if (gradeList != null) {
					for (Q88_VoyObj_Fixture_Grade gradelst : gradeList) {
						Q88_VoyObj_Fixture_Grade grade = new Q88_VoyObj_Fixture_Grade();
						grade.setTrans_Id(transID);
						grade.setVoyageId(voyageID);
						grade.setFixtureLst_SeqId(fixtureSeqId);
						grade.setDisplayOrder(gradelst.getDisplayOrder());
						grade.setGradeName(gradelst.getGradeName());

						fixtureGrade.add(grade);

					}
				}

				List<Q88_VoyObj_Fixture_Port> portList = fixturelst.getFixturePorts();
				List<Q88_VoyObj_Fixture_Port> fixturePort = new ArrayList<Q88_VoyObj_Fixture_Port>();

				if (portList != null) {
					for (Q88_VoyObj_Fixture_Port portlst : portList) {
						Q88_VoyObj_Fixture_Port port = new Q88_VoyObj_Fixture_Port();
						port.setTrans_Id(transID);
						port.setVoyageId(voyageID);
						port.setFixtureLst_SeqId(fixtureSeqId);
						port.setPortId(portlst.getPortId());
						port.setPortName(portlst.getPortName());
						port.setDisplayOrder(portlst.getDisplayOrder());
						port.setActivityType(portlst.getActivityType());
						port.setFixturePortLinkToken(portlst.getFixturePortLinkToken());

						fixturePort.add(port);
					}
				}
				List<Q88_VoyObj_Fixture_Revenue> revenueList = fixturelst.getFixtureRevenueList();
				List<Q88_VoyObj_Fixture_Revenue> fixturerevenue = new ArrayList<Q88_VoyObj_Fixture_Revenue>();

				if (revenueList != null) {
					for (Q88_VoyObj_Fixture_Revenue revenuelst : revenueList) {
						Q88_VoyObj_Fixture_Revenue revenue = new Q88_VoyObj_Fixture_Revenue();
						revenue.setTrans_Id(transID);
						revenue.setVoyageId(voyageID);
						revenue.setFixtureLst_SeqId(fixtureSeqId);
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

						fixturerevenue.add(revenue);
					}
				}

				List<Q88_VoyObj_Fixture_Expense> expenseList = fixturelst.getFixtureExpenseList();
				List<Q88_VoyObj_Fixture_Expense> fixtureExpense = new ArrayList<Q88_VoyObj_Fixture_Expense>();
				if (expenseList != null) {

					for (Q88_VoyObj_Fixture_Expense expenselst : expenseList) {
						Q88_VoyObj_Fixture_Expense expense = new Q88_VoyObj_Fixture_Expense();
						expense.setTrans_Id(transID);
						expense.setVoyageId(voyageID);
						expense.setFixtureLst_SeqId(fixtureSeqId);
						expense.setAmount(expenselst.getAmount());
						expense.setDaily(expenselst.getDaily());
						expense.setDisplayOrder(expenselst.getDisplayOrder());
						expense.setFixtureDisplayOrder(expenselst.getFixtureDisplayOrder());
						expense.setName(expenselst.getName());
						expense.setRemark(expenselst.getRemark());
						expense.setTotal(expenselst.getTotal());

						fixtureExpense.add(expense);
					}
				}

				List<Q88_VoyObj_Fixture_TagLst> tagList = fixturelst.getTagList();
				List<Q88_VoyObj_Fixture_TagLst> fixtureTag = new ArrayList<Q88_VoyObj_Fixture_TagLst>();

				if (tagList != null) {
					for (Q88_VoyObj_Fixture_TagLst taglst : tagList) {
						Q88_VoyObj_Fixture_TagLst tag = new Q88_VoyObj_Fixture_TagLst();
						tag.setTrans_Id(transID);
						tag.setVoyageId(voyageID);
						tag.setFixtureLst_SeqId(fixtureSeqId);
						tag.setCategory(taglst.getCategory());
						tag.setValue(taglst.getValue());

						fixtureTag.add(tag);
					}
				}

				if (fixtureBillList != null)
					fixture.addFixtureBillsOfLading(fixtureBillList);
				if (fixtureCommission != null)
					fixture.addFixtureCommissions(fixtureCommission);
				if (fixtureGrade != null)
					fixture.addFixtureGrades(fixtureGrade);
				if (fixturePort != null)
					fixture.addFixturePorts(fixturePort);
				if (fixturerevenue != null)
					fixture.addFixtureRevenueList(fixturerevenue);
				if (fixtureExpense != null)
					fixture.addFixtureExpenseList(fixtureExpense);
				if (fixtureTag != null)
					fixture.addTagList(fixtureTag);
				if (fixture != null)
					fixtureList.add(fixture);

			}

		}

		List<Q88_VoyObj_LegLst> legList = voyObj.getLegList();
		List<Q88_VoyObj_LegLst> voyLeg = new ArrayList<Q88_VoyObj_LegLst>();
		if (legList != null) {

			for (Q88_VoyObj_LegLst leglst : legList) {
				Integer voyLegSeqId = voyObjdao.getVoyLegLstSeqId();
				Q88_VoyObj_LegLst leg = new Q88_VoyObj_LegLst();
				leg.setTrans_Id(transID);
				leg.setVoyageId(voyageID);
				leg.setLeg_SeqId(voyLegSeqId);
				leg.setArriveActualized(leglst.getArriveActualized());
				leg.setArriveDraftFore(leglst.getArriveDraftFore());
				leg.setArriveDraftAft(leglst.getArriveDraftAft());
				leg.setArriveFw(leglst.getArriveFw());
				leg.setArriveSlops(leglst.getArriveSlops());
				leg.setArrive_Utc(leglst.getArriveUtc());
				leg.setAwaitingLaycanDays(leglst.getAwaitingLaycanDays());
				leg.setCleaningDay(leglst.getCleaningDay());
				leg.setCost(leglst.getCost());
				leg.setDepartActualized(leglst.getDepartActualized());
				leg.setDepartDraftAft(leglst.getDepartDraftAft());
				leg.setDepartDraftFore(leglst.getDepartDraftFore());
				leg.setDepartFw(leglst.getDepartFw());
				leg.setDepartSlops(leglst.getDepartSlops());
				leg.setDepart_Utc(leglst.getDepartUtc());
				leg.setDisplayOrder(leglst.getDisplayOrder());
				leg.setDistanceEca(leglst.getDistanceEca());
				leg.setDistanceEcaPercent(leglst.getDistanceEcaPercent());
				leg.setDistanceNonEca(leglst.getDistanceNonEca());
				leg.setDistanceTotal(leglst.getDistanceTotal());
				leg.setFixturePortLinkToken(leglst.getFixturePortLinkToken());
				leg.setHeatingRatio(leglst.getHeatingRatio());
				leg.setIsTCODelivery(leglst.getIsTCODelivery());
				leg.setIsTCORedelivery(leglst.getIsTCORedelivery());
				leg.setPassageDays(leglst.getPassageDays());
				leg.setPortId(leglst.getPortId());
				leg.setPortName(leglst.getPortName());
				leg.setPortRegulation(leglst.getPortRegulation());
				leg.setPortShortName(leglst.getPortShortName());
				leg.setPortTimeZone(leglst.getPortTimeZone());
				leg.setSpeed(leglst.getSpeed());
				leg.setTimeZoneArrive(leglst.getTimeZoneArrive());
				leg.setTimeZoneDepart(leglst.getTimeZoneDepart());
				leg.setTotalPortDays(leglst.getTotalPortDays());
				leg.setType(leglst.getType());
				leg.setWx(leglst.getWx());
				leg.setVoyageLegId(leglst.getVoyageLegId());

				List<Q88_VoyObj_LegLst_BunStem> bunkerStemList = leglst.getBunkerStemsList();
				List<Q88_VoyObj_LegLst_BunStem> bunkerStem = new ArrayList<Q88_VoyObj_LegLst_BunStem>();
				if (bunkerStemList != null) {
					for (Q88_VoyObj_LegLst_BunStem bunkStemlst : bunkerStemList) {
						Q88_VoyObj_LegLst_BunStem bunker = new Q88_VoyObj_LegLst_BunStem();
						bunker.setTrans_Id(transID);
						bunker.setVoyageId(voyageID);
						bunker.setLeg_SeqId(voyLegSeqId);
						bunker.setStemStatus(bunkStemlst.getStemStatus());
						bunker.setBunkerGradeName(bunkStemlst.getBunkerGradeName());
						bunker.setQtyPlanned(bunkStemlst.getQtyPlanned());
						bunker.setStemmed_Date(bunkStemlst.getStemmedDate());
						bunker.setStemNumber(bunkStemlst.getStemNumber());
						bunker.setStemTerms(bunkStemlst.getStemTerms());
						bunker.setStemSupplierName(bunkStemlst.getStemSupplierName());
						bunker.setStemBrokerName(bunkStemlst.getStemBrokerName());
						bunker.setPerTonPrice(bunkStemlst.getPerTonPrice());
						bunker.setDeliveryCost(bunkStemlst.getDeliveryCost());
						bunker.setQtyStemmed(bunkStemlst.getQtyStemmed());
						bunker.setQtyReceived(bunkStemlst.getQtyReceived());
						bunker.setDelivery_Date(bunkStemlst.getDelivery_Date());
						bunker.setStemDue_Date(bunkStemlst.getStemDueDate());
						bunker.setStemTotalCost(bunkStemlst.getStemTotalCost());
						bunker.setTotalPerTonCost(bunkStemlst.getTotalPerTonCost());
						bunkerStem.add(bunker);
					}

				}

				List<Q88_VoyObj_LegLst_BunRob> bunkerRobList = leglst.getBunkerROBList();
				List<Q88_VoyObj_LegLst_BunRob> bunkerRob = new ArrayList<Q88_VoyObj_LegLst_BunRob>();
				if (bunkerRobList != null) {
					for (Q88_VoyObj_LegLst_BunRob bunkRoblst : bunkerRobList) {
						Q88_VoyObj_LegLst_BunRob rob = new Q88_VoyObj_LegLst_BunRob();
						rob.setTrans_Id(transID);
						rob.setVoyageId(voyageID);
						rob.setLeg_SeqId(voyLegSeqId);
						rob.setBunkerGradeName(bunkRoblst.getBunkerGradeName());
						rob.setArrivalROBQuantity(bunkRoblst.getArrivalROBQuantity());
						rob.setDepartureROBQuantity(bunkRoblst.getDepartureROBQuantity());

						bunkerRob.add(rob);
					}

				}

				if (bunkerStem != null)
					leg.addBunkerStemsList(bunkerStem);
				if (bunkerRob != null)
					leg.addBunkerROBList(bunkerRob);
				if (leg != null)
					voyLeg.add(leg);

			}

		}

		List<Q88_VoyObj_Offhire> offhireList = voyObj.getOffhireList();
		List<Q88_VoyObj_Offhire> voyOffhire = new ArrayList<Q88_VoyObj_Offhire>();

		if (offhireList != null) {
			for (Q88_VoyObj_Offhire offhirelst : offhireList) {
				Integer offhireSeqId = voyObjdao.getVoyOffhireSeqId();
				Q88_VoyObj_Offhire offhire = new Q88_VoyObj_Offhire();
				offhire.setTrans_Id(transID);
				offhire.setVoyageId(voyageID);
				offhire.setOffhire_SeqId(offhireSeqId);
				offhire.setDate_StartUtc(offhirelst.getDateStartUtc());
				offhire.setDate_EndUtc(offhirelst.getDateEndUtc());
				offhire.setDays(offhirelst.getDays());
				offhire.setDisplayOrder(offhirelst.getDisplayOrder());
				offhire.setOffhireReason(offhirelst.getOffhireReason());
				offhire.setRemark(offhirelst.getRemark());

				List<Q88_VoyObj_Offhire_Bunker> offhireBunkerList = offhirelst.getOffhireBunkerList();
				List<Q88_VoyObj_Offhire_Bunker> voyOffhireBunker = new ArrayList<Q88_VoyObj_Offhire_Bunker>();

				if (offhireBunkerList != null) {
					for (Q88_VoyObj_Offhire_Bunker offbunkerlst : offhireBunkerList) {
						Q88_VoyObj_Offhire_Bunker offbunker = new Q88_VoyObj_Offhire_Bunker();
						offbunker.setTrans_Id(transID);
						offbunker.setVoyageId(voyageID);
						offbunker.setOffhire_SeqId(offhireSeqId);
						offbunker.setGradeName(offbunkerlst.getGradeName());
						offbunker.setQuantity(offbunkerlst.getQuantity());
						offbunker.setPrice(offbunkerlst.getPrice());
						offbunker.setDisplayOrder(offbunkerlst.getDisplayOrder());
						voyOffhireBunker.add(offbunker);
					}
				}
				if (voyOffhireBunker != null) {
					offhire.addOffhireBunkerList(voyOffhireBunker);
				}
				voyOffhire.add(offhire);
			}
		}

		if (voyObjResDtl != null) {

			if (voyObjRes != null) {
				voyObjRes.addResultDetail(voyObjResDtl);
				voyObject.setResults(voyObjRes);
			}
		}

		if (voyObjResfixedDtl != null) {

			if (voyObjResfixed != null) {
				voyObjResfixed.addResultDetail(voyObjResfixedDtl);
				voyObject.setResultsWhenFixed(voyObjResfixed);
			}
		}
		if (fixtureList != null)
			voyObject.addFixtureList(fixtureList);

		if (voyLeg != null)
			voyObject.addLegList(voyLeg);

		if (revenuelist != null)
			voyObject.addRevenueList(revenuelist);

		if (expenselist != null)
			voyObject.addExpenseList(expenselist);

		if (bunkerlist != null)
			voyObject.addBunkerList(bunkerlist);

		if (remarkList != null)
			voyObject.addRemarkList(remarkList);

		if (voyOffhire != null)
			voyObject.addOffhireList(voyOffhire);
		if (tcrelet != null)
			voyObject.setTcReletDetail(tcrelet);
		if (review != null)
			voyObject.setReview(review);
		voyObjdao.save(voyObject);
	}

}
