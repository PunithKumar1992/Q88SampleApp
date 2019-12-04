package com.bsol.q88.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bsol.q88.model.Q88_TcOutList;
import com.bsol.q88.model.Q88_Voyage;

@Repository
public interface Q88VoyageObjectDao extends JpaRepository<Q88_Voyage, String>{
	
	@Query("from Q88_Voyage where voyageId =:voyageId and vesselId =:vesselId")
	public Q88_Voyage getVoyageobject(String voyageId, String vesselId);
		

}
