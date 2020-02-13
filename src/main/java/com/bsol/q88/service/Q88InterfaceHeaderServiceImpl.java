package com.bsol.q88.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88InterfaceHeaderDao;
import com.bsol.q88.model.Q88_Interface_Header;

@Service
public class Q88InterfaceHeaderServiceImpl implements Q88InterfaceHeaderService {
	
	@Autowired
	private Q88InterfaceHeaderDao headerdao;
	
	Logger logger = Logger.getLogger(this.getClass());


	@Override
	public Integer getTransId() {
		logger.info("getting  Q88Interface Header transId information in Q88 InterfaceHeader Service");
		return headerdao.getTransId();
	}

	@Override
	public LocalDateTime getLastCallTime(String api) {
		logger.info("getting  Q88Interface Header last call time  information in Q88 InterfaceHeader Service");
		return headerdao.getLastCallTime(api);
	}

	@Override
	public LocalDateTime getLastModifiedDate(String api) {
		logger.info("getting  Q88Interface Header last modified date information in Q88 InterfaceHeader Service");
		return headerdao.getLastModifiedDate(api);
	}

	@Override
	public void saveHeader(Q88_Interface_Header header) {
		logger.info("Saving Q88Interface Header information ");
		headerdao.save(header);

	}

	@Override
	public List<Q88_Interface_Header> getAllunProcessedRecords(String api, String process) {
		logger.info("getting all unProcessedRecords for processing Q88Interface Header information ");
		return headerdao.getAllunProcessedRecords(api, process);
	}

	@Override
	@Transactional
	public void updateTcOutDtlRecords(String status, String api, Integer trans_id, String vessel_id, String tcout_id) {
		logger.info("update TcOutDtls Records in Q88Interface Header table ");
		headerdao.updateTcOutDtlRecords(status, api, trans_id, vessel_id, tcout_id);
		
	}

	@Override
	public int ModifiedDateCountforFirsTime(String api) {
		logger.info("getting ModifiedDateCount  from Q88Interface Header table ");
		return headerdao.ModifiedDateCountforFirsTime(api);
	}

	@Override
	@Transactional
	public void updateVoyobjRecords(String status, String api, Integer trans_id, String voyageId) {
		logger.info("update VoyObj Records in Q88Interface Header table ");
		headerdao.updateVoyobjRecords(status, api, trans_id, voyageId);
		
	}

	@Override
	@Transactional
	public void updateVesselRecord(String status, String api, Integer trans_id, String vessel_id) {
		logger.info("update Vessel Records in Q88Interface Header table ");
		headerdao.updateVesselRecord(status, api, trans_id, vessel_id);
		
	}

	@Override
	@Transactional
	@Modifying
	public void updateVoyageObjNonProcess(String api, String voyageId, Integer trans_id, String reason) {
		headerdao.updateVoyageObjNonProcess(api, voyageId, trans_id, reason);
		
	}

	@Override
	@Transactional
	public void updateVslHeadContractDtl(String api, String vesselId, String tcInId, Integer transId) {
		headerdao.updateVslHeadContractDtl(api, vesselId, tcInId, transId);
		
	}

	
}
