package com.bsol.q88.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bsol.q88.model.Q88_TcOutList;

@Repository
public interface Q88TcOutListDao extends JpaRepository<Q88_TcOutList, Integer>{
	
	
	@Query(value = "SELECT TCOUTLIST_SEQUENCE.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getNextTcOutLisId();
	
	@Query(value = "select TCOUTIDENCRYPTED from Q88_TC_OUTLIST",nativeQuery = true)
	public List<String> getTcOutEncryptedId();
	

	
	

}
