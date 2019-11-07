package com.q88.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.q88.sample.model.PortList;

@Repository
public interface Q88PortListDao extends JpaRepository<PortList, Integer> {

}
