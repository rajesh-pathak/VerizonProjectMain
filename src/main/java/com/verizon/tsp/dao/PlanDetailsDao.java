package com.verizon.tsp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.tsp.models.PlanDetails;

@Repository
public interface PlanDetailsDao extends JpaRepository<PlanDetails, Long>{

}
