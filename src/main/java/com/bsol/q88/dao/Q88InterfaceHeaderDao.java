package com.bsol.q88.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.bsol.q88.model.Q88_Interface_Header;

@Repository
public interface Q88InterfaceHeaderDao extends JpaRepository<Q88_Interface_Header, Integer> {
	
	@Query(value = "SELECT TRANSID_SEQUENCE.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getTransId();
	
	@Query(value = "SELECT Max(CALL_START) FROM Q88_INTF_HEADER where api_call = :api and is_processed ='Y'", nativeQuery = true)
	public LocalDateTime getLastCallTime(String api);
	
	@Query(value = "SELECT Max(MODIFIED_DATE) FROM Q88_INTF_HEADER where  api_call = :api and is_processed ='Y'", nativeQuery = true)
	public LocalDateTime getLastModifiedDate(String api);
	
	@Query(value = "SELECT * from Q88_INTF_HEADER where is_processed =:process and api_call =:api and reason IS NULL", nativeQuery = true)
	public List<Q88_Interface_Header> getAllunProcessedRecords(String api,String process);
	
	@Modifying
	@Query(value = "Update Q88_INTF_HEADER set IS_PROCESSED = :status where API_CALL =:api and TRANS_ID =:trans_id and VESSEL_ID_ENCYRPT =:vessel_id and TC_OUT_ID_ENCRYPT =:tcout_id", nativeQuery = true)
	public void updateTcOutDtlRecords(String status,String api,Integer trans_id, String vessel_id,String tcout_id);
	
	@Modifying
	@Query(value = "Update Q88_INTF_HEADER set IS_PROCESSED = :status where API_CALL =:api and TRANS_ID =:trans_id and VOYAGE_ID =:voyageId ", nativeQuery = true)
	public void updateVoyobjRecords(String status,String api,Integer trans_id,String voyageId);
	
	@Modifying
	@Query(value = "Update Q88_INTF_HEADER set IS_PROCESSED = :status where API_CALL =:api and TRANS_ID =:trans_id and VESSEL_ID_ENCYRPT =:vessel_id ", nativeQuery = true)
	public void updateVesselRecord(String status,String api, Integer trans_id, String vessel_id);
	
	
	@Query(value = "Select count(*) from Q88_INTF_HEADER Where api_call =:api and is_processed ='Y'",nativeQuery = true)
	public int ModifiedDateCountforFirsTime(String api);
	
	
	@Modifying
	@Query(value = "Update Q88_INTF_HEADER set REASON = :reason where API_CALL =:api and TRANS_ID =:trans_id and VOYAGE_ID =:voyageId ", nativeQuery = true)
	public void updateVoyageObjNonProcess(String api, String voyageId,Integer trans_id ,String reason);
	
	@Modifying
	@Query(value = "Update Q88_INTF_HEADER set IS_PROCESSED = 'Y' where API_CALL =:api and TRANS_ID =:transId and VESSEL_ID_ENCYRPT =:vesselId and TC_IN_ID_ENCRYPT =:tcInId", nativeQuery = true)
	public void updateVslHeadContractDtl(String api, String vesselId,String tcInId,Integer transId);
	

}
