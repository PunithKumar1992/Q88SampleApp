package com.bsol.q88.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bsol.q88.model.Q88_TcOutListDetails;

@Repository
public interface Q88_TcOutListDetailDao extends JpaRepository<Q88_TcOutListDetails, Integer>{
	
	@Query(value = "SELECT TCOUTLISTDTL_SEQUENCE.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getNextTcOutLisDtlId();
	

}
