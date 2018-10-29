package com.verizon.tsp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.tsp.models.CSA;

@Repository
public interface CSADao extends JpaRepository<CSA, Long>{

}
