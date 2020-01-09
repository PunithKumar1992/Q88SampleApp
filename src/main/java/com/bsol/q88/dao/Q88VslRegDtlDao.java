package com.bsol.q88.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bsol.q88.model.Q88_VslRegDtl;

@Repository
public interface Q88VslRegDtlDao extends JpaRepository<Q88_VslRegDtl, String> {
	
	@Query(value = "SELECT Q88_VSLREGDTL_PROFLST_SEQID.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getVslProfSeqId();
	@Query(value = "SELECT Q88_VSLREGDTL_PROFLST_PP_SEQID.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getVslPasProfProSeqId();
	@Query(value = "SELECT Q88_VSLREGDTL_PROFLST_NPP_SEQ.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getVslNPPSeqId();
	@Query(value = "SELECT Q88_VSLREGDTL_HDCONTRACT_SEQID.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getVslHdContractSeqId();
	
	
	
	

}
