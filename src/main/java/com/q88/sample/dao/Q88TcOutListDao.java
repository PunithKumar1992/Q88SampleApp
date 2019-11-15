package com.q88.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.q88.sample.model.Q88_TcOutList;

@Repository
public interface Q88TcOutListDao extends JpaRepository<Q88_TcOutList, String>{

}
