package com.verizon.tsp.services;

import java.util.List;

import com.verizon.tsp.models.PlanDetails;

public interface PlanDetailsService {

	public List<PlanDetails> getAllPlan();
	public PlanDetails findByPlanId(long planId); //getbyid
	public PlanDetails createPlan(PlanDetails pd);
	public PlanDetails updatePlan(PlanDetails pd);
	public boolean deletePlan(long planId);
}
