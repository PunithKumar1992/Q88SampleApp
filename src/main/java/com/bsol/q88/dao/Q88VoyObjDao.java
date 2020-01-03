package com.bsol.q88.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bsol.q88.model.Q88_VoyObj;

@Repository
public interface Q88VoyObjDao extends JpaRepository<Q88_VoyObj, Integer>{
	
	@Query(value = "SELECT Q88_VOYOBJ_FIXTURELST_SEQID.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getfixtureSeqId();
	
	@Query(value = "SELECT Q88_VOYOBJ_LEGLST_SEQID.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getVoyLegLstSeqId();

	@Query(value = "SELECT Q88_VOYOBJ_OFFHIRE_SEQUENCE.NEXTVAL FROM dual", nativeQuery =true)
	public Integer getVoyOffhireSeqId();
}
