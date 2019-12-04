package com.bsol.q88.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88VoyageObjectDao;
import com.bsol.q88.dao.Q88_VoyageResultDao;
import com.bsol.q88.dto.Q88_VoyageDTO;
import com.bsol.q88.dto.Q88_VoyageResultDTO;
import com.bsol.q88.model.Q88_Voyage;
import com.bsol.q88.model.Q88_VoyageResult;

@Service
@Transactional
public class Q88VoyageObjectServiceImpl implements Q88VoyageObjectService {

	@Autowired
	private Q88VoyageObjectDao q88voyagedao;

	

	@Autowired
	private Q88_VoyageResultDao q88VoyageResdao;

	/*@Autowired
	private Q88_VoyageResultDetailDao q88VoyageResDtldao;

	@Autowired
	private Q88_VoyageResultFixedDao q88VoyageResfixeddao;

	@Autowired
	private Q88_VoyageResultDetailFixedDao q88VoyageResDtlFixeddao;

	@Autowired
	private Q88_FixtureDao q88fixturedao;

	@Autowired
	private Q88_FixtureBillOfLadingDao q88FixtureBilldao;
	
	@Autowired
	private Q88_FixtureCommissionDao q88FixtureCommissiondao;
	@Autowired
	private  Q88_FixtureGradeDao q88FixtureGradedao;

	@Autowired
	private Q88_FixturePortDao q88FixturePortdao;
	
	@Autowired
	private Q88_FixtureRevenueDao q88FixtureRevenuedao;
	
	@Autowired
	private Q88_FixtureExpenseDao q88FixtureExpensedao;
	
	@Autowired
	private Q88_FixtureTagDataDao q88FixtureTagdao;*/
	
	@SuppressWarnings("unchecked")
	@Override
	public void saveVoyageObjList(Q88_Voyage voyageObj) {
		/*String voyageId = voyageObj.getVoyageId();
		String vesselId = voyageObj.getVesselId();
		
		ModelMapper mapper = new ModelMapper();
		Q88_VoyageDTO voyageDTO = mapper.map(voyageObj, Q88_VoyageDTO.class);
		Q88_VoyageResultDTO voyageResDTO = mapper.map(voyageObj.getResults(), Q88_VoyageResultDTO.class);
		Q88_Voyage voyage = new Q88_Voyage();
		Q88_VoyageResult voyageRes = new Q88_VoyageResult();
		BeanUtils.copyProperties(voyageDTO, voyage);
		BeanUtils.copyProperties(voyageResDTO, voyageRes);
		voyage = q88voyagedao.save(voyage);
		voyageRes.setVoyageTrans_Id(voyage.getVoyageTrans_Id());
		voyageRes.setVesselId(voyage.getVesselId());
		voyageRes.setVoyageId(voyage.getVoyageId());
		q88VoyageResdao.save(voyageRes);*/

		/*List<Q88_VoyageResultDetail> q88VoyageResDtl = voyageObj.getResults().getResultDetail();
		if (q88VoyageResDtl != null) {
			for (int i = 0; i < q88VoyageResDtl.size(); i++) {
				Q88_VoyageResultDetail q88VoyResDtl = q88VoyageResDtl.get(i);
				q88VoyResDtl.setVoyageTrans_Id(voyage.getVoyageTrans_Id());
				q88VoyResDtl.setVesselId(vesselId);
				q88VoyResDtl.setVoyageId(voyageId);
				q88VoyageResDtldao.save(q88VoyResDtl);
			}
		}*/
		/*Q88_VoyageResultFixed q88Voyageresfixed = q88VoyageTransfer.getQ88VoyageObjects(voyageObj,Q88_VoyageResultFixed.class);
		q88Voyageresfixed.setVoyage_Trans_Id(q88Voyage.getVoyage_Trans_Id());
		q88Voyageresfixed = q88VoyageResfixeddao.save(q88Voyageresfixed);

		List<Q88_VoyageResultDetailFixed> q88VoyageResDtlFixed = voyageObj.getResultsWhenFixed().getResultDetail();
		if (q88VoyageResDtlFixed != null) {
			for (int i = 0; i < q88VoyageResDtlFixed.size(); i++) {
				Q88_VoyageResultDetailFixed q88VoyResDtlfixed = q88VoyageResDtlFixed.get(i);
				q88VoyResDtlfixed.setVoyage_resfixed_seqid(q88Voyageresfixed.getVoyage_resfixed_seqid());
				q88VoyResDtlfixed.setVesselid(vesselId);
				q88VoyResDtlfixed.setVoyageid(voyageId);
				q88VoyageResDtlFixeddao.save(q88VoyResDtlfixed);
			}
		}

		List<Q88_Fixture> fixturelist = voyageObj.getFixtureList();
		if (!fixturelist.isEmpty() && fixturelist != null) {
			for (int i = 0; i < fixturelist.size(); i++) {
				
				Q88_Voyage q88FixtureVoyage = new Q88_Voyage();
				Q88_Fixture q88Fixture = fixturelist.get(i);
				List<Q88_Fixture> q88FixList =new ArrayList<Q88_Fixture>();
				q88FixList.add(q88Fixture);
				q88FixtureVoyage.setFixtureList(q88FixList);
				Q88_Fixture q88fixture =q88VoyageTransfer.getQ88VoyageObjects(q88FixtureVoyage, Q88_Fixture.class);
				q88fixture.setVesselid(vesselId);
				q88fixture.setVoyageid(voyageId);
				q88fixture.setVoyage_Trans_Id(q88Voyage.getVoyage_Trans_Id());
				q88fixture = q88fixturedao.save(q88fixture);

				List<Q88_FixtureBillOfLading> fixtureBillList = fixturelist.get(i).getFixtureBillsOfLadings();

				if (fixtureBillList != null && !fixtureBillList.isEmpty()) {
					for (int j = 0; j < fixtureBillList.size(); j++) {
						Q88_FixtureBillOfLading fixtureBill = fixtureBillList.get(j);
						fixtureBill.setFixturelistseq_id(q88fixture.getFixturelistseq_id());
						fixtureBill.setVoyageid(voyageId);
						fixtureBill.setVesselid(vesselId);
						q88FixtureBilldao.save(fixtureBill);
					}

				}
	
				List<Q88_FixtureCommission> fixtureCommissionList = fixturelist.get(i).getFixtureCommissions();
				if (!fixtureCommissionList.isEmpty() && fixtureCommissionList != null) {
					for (int k = 0; k < fixtureCommissionList.size(); k++) {
						Q88_FixtureCommission fixtureCommission = fixtureCommissionList.get(k);
						fixtureCommission.setVoyageid(voyageId);
						fixtureCommission.setVesselid(vesselId);
						fixtureCommission.setFixturelistseq_id(q88fixture.getFixturelistseq_id());
						q88FixtureCommissiondao.save(fixtureCommission);
					}
				}
				List<Q88_FixtureGrade> fixtureGradeList = fixturelist.get(i).getFixtureGrades();
				if (!fixtureGradeList.isEmpty() && fixtureGradeList != null) {
					for (int l = 0; l < fixtureGradeList.size(); l++) {
						Q88_FixtureGrade fixtureGrade = fixtureGradeList.get(l);
						fixtureGrade.setFixturelistseq_id(q88fixture.getFixturelistseq_id());
						fixtureGrade.setVesselid(vesselId);
						fixtureGrade.setVoyageid(voyageId);
						q88FixtureGradedao.save(fixtureGrade);
					}

				}

				List<Q88_FixturePort> fixturePortList = fixturelist.get(i).getFixturePorts();
				if (!fixturePortList.isEmpty() && fixturePortList != null) {
					for (int m = 0; m < fixturePortList.size(); m++) {
						Q88_FixturePort fixturePort = fixturePortList.get(m);
						fixturePort.setFixturelistseq_id(q88fixture.getFixturelistseq_id());
						fixturePort.setVesselid(q88Voyage.getVesselId());
						fixturePort.setVoyageid(q88Voyage.getVoyageId());
						q88FixturePortdao.save(fixturePort);
					}

				}

				List<Q88_FixtureRevenue> fixtureRevenueList = fixturelist.get(i).getFixtureRevenueList();
				if (!fixtureRevenueList.isEmpty() && fixtureRevenueList != null) {
					for (int n = 0; n < fixtureRevenueList.size(); n++) {
						Q88_FixtureRevenue fixtureRevenue = fixtureRevenueList.get(n);
						fixtureRevenue.setFixturelistseq_id(q88fixture.getFixturelistseq_id());
						fixtureRevenue.setVesselid(q88Voyage.getVesselId());
						fixtureRevenue.setVoyageid(q88Voyage.getVoyageId());
						q88FixtureRevenuedao.save(fixtureRevenue);

					}
				}

				List<Q88_FixtureExpense> fixtureExpensesList = fixturelist.get(i).getFixtureExpenseList();
				if (!fixtureExpensesList.isEmpty() && fixtureExpensesList != null) {
					for (int O = 0; O < fixtureExpensesList.size(); O++) {
						Q88_FixtureExpense fixtureExpense = fixtureExpensesList.get(O);
						fixtureExpense.setFixturelistseq_id(q88fixture.getFixturelistseq_id());
						fixtureExpense.setVesselid(q88Voyage.getVesselId());
						fixtureExpense.setVoyageid(q88Voyage.getVoyageId());
						q88FixtureExpensedao.save(fixtureExpense);

					}

				}

				List<Q88_FixtureTagData> fixtureTagDataList = fixturelist.get(i).getTagList();
				if (!fixtureTagDataList.isEmpty() && fixtureTagDataList != null) {
					for (int p = 0; p < fixtureTagDataList.size(); p++) {
						Q88_FixtureTagData fixtureTagData = fixtureTagDataList.get(p);
						fixtureTagData.setFixturelistseq_id(q88fixture.getFixturelistseq_id());
						fixtureTagData.setVesselid(q88Voyage.getVesselId());
						fixtureTagData.setVoyageid(q88Voyage.getVoyageId());
						q88FixtureTagdao.save(fixtureTagData);

					}
				}
				

			}
		}*/
		ModelMapper mapper = new ModelMapper();
		Q88_VoyageDTO voyageDTO = mapper.map(voyageObj, Q88_VoyageDTO.class);
		Q88_VoyageResultDTO voyageResDTO = mapper.map(voyageObj.getResults(), Q88_VoyageResultDTO.class);
		Q88_Voyage voyage = new Q88_Voyage();
		Q88_VoyageResult voyageRes = new Q88_VoyageResult();
		BeanUtils.copyProperties(voyageDTO, voyage);
		BeanUtils.copyProperties(voyageResDTO, voyageRes);
		voyageRes.setQ88voyageres(voyage);
		voyage.setResults(voyageRes);
		q88voyagedao.save(voyageObj);
	}

	@Override
	public Q88_Voyage getVoyageObject(String voyageId, String vesselId) {
		return q88voyagedao.getVoyageobject(voyageId, vesselId);
	}

}
