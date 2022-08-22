package in.ashokit.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Plan;

@Service
public class PlanServiceImpl implements PlanService {

	@Override
	public Map<Integer, String> getPlanCategories() {
		
		return null;
	}

	@Override
	public boolean savePlan(Plan plan) {
		
		return false;
	}

	@Override
	public List<Plan> getAllPlans() {
		
		return null;
	}

	@Override
	public Plan getPlanById(Integer planid) {
		
		return null;
	}

	@Override
	public boolean updatePlan(Plan plan) {
		
		return false;
	}

	@Override
	public boolean deletePlanById(Integer planid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean planStstusChange(Integer planid, String status) {
		// TODO Auto-generated method stub
		return false;
	}

}
