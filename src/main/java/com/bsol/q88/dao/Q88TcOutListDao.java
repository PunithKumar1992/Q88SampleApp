package com.bsol.q88.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bsol.q88.model.Q88_TcOutList;

@Repository
public interface Q88TcOutListDao extends JpaRepository<Q88_TcOutList, String>{
	
	@Query("from Q88_TcOutList where tcOutIdEncrypted =:voyageId and vesselIdEncrypted =:vesselId")
	public Q88_TcOutList getVoyageobject(String voyageId , String vesselId);

}
