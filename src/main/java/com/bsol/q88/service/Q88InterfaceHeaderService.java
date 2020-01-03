package com.bsol.q88.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bsol.q88.model.Q88_Interface_Header;

@Service
public interface Q88InterfaceHeaderService {
	
	public Integer getTransId();
	public LocalDateTime getLastCallTime(String api);
	public LocalDateTime getLastModifiedDate(String api);
	public void saveHeader(Q88_Interface_Header header);
	public List<Q88_Interface_Header> getAllunProcessedRecords(String api,String process);
	public void updateTcOutDtlRecords(String status,String api,Integer trans_id, String vessel_id,String tcout_id);
	public int ModifiedDateCountforFirsTime(String api);
	public void updateVoyobjRecords(String status,String api,Integer trans_id,String voyageId);

}
