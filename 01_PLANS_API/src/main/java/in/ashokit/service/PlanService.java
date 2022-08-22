package in.ashokit.service;

import java.util.List;
import java.util.Map;

import in.ashokit.entity.Plan;

public interface PlanService {
	public Map<Integer,String>getPlanCategories();
	public boolean savePlan(Plan plan);
	public List<Plan>getAllPlans();
	public Plan getPlanById(Integer planid);
	public boolean updatePlan(Plan plan);
	public boolean deletePlanById(Integer planid);
	public boolean planStstusChange(Integer planid,String status);
}
