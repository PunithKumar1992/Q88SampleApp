package com.bsol.q88.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bsol.q88.model.Q88_PortList;

@Repository
public interface Q88PortListDao extends JpaRepository<Q88_PortList, Integer> {

}
