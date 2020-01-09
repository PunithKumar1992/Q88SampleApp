package com.bsol.q88.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bsol.q88.model.Q88_HdCntrtDTL;

@Repository
public interface Q88VslHeadContractDtlDao extends  JpaRepository<Q88_HdCntrtDTL, Integer>{
	
	@Query(value = "SELECT Q88_HDCNTRTDTL_OFFHIRE_SEQID.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getVslHdCntrctOffHireSeqId();

}
