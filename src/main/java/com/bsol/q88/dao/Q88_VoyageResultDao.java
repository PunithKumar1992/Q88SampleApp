package com.bsol.q88.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bsol.q88.model.Q88_VoyageResult;

@Repository
public interface Q88_VoyageResultDao extends JpaRepository<Q88_VoyageResult, Integer>{

}
