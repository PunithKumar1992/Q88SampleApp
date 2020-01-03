package com.bsol.q88.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88InterfaceHeaderDao;
import com.bsol.q88.model.Q88_Interface_Header;

@Service
public class Q88InterfaceHeaderServiceImpl implements Q88InterfaceHeaderService {
	
	@Autowired
	private Q88InterfaceHeaderDao headerdao;

	@Override
	public Integer getTransId() {
		return headerdao.getTransId();
	}

	@Override
	public LocalDateTime getLastCallTime(String api) {
		return headerdao.getLastCallTime(api);
	}

	@Override
	public LocalDateTime getLastModifiedDate(String api) {
		return headerdao.getLastModifiedDate(api);
	}

	@Override
	public void saveHeader(Q88_Interface_Header header) {
		headerdao.save(header);

	}

	@Override
	public List<Q88_Interface_Header> getAllunProcessedRecords(String api, String process) {
		return headerdao.getAllunProcessedRecords(api, process);
	}

	@Override
	@Transactional
	public void updateTcOutDtlRecords(String status, String api, Integer trans_id, String vessel_id, String tcout_id) {
		headerdao.updateTcOutDtlRecords(status, api, trans_id, vessel_id, tcout_id);
		
	}

	@Override
	public int ModifiedDateCountforFirsTime(String api) {
		return headerdao.ModifiedDateCountforFirsTime(api);
	}

	@Override
	@Transactional
	public void updateVoyobjRecords(String status, String api, Integer trans_id, String voyageId) {
		headerdao.updateVoyobjRecords(status, api, trans_id, voyageId);
		
	}

	
}
