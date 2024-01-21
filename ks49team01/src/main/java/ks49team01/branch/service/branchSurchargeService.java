package ks49team01.branch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks49team01.branch.dto.BranchSurcharge;
import ks49team01.branch.mapper.BranchSurchargeMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class branchSurchargeService {
	
	private BranchSurchargeMapper branchSurchargeMapper;
	
	
	
	public List<BranchSurcharge> getSurchargeList(){
		
		return branchSurchargeMapper.getSurchargeList();
	}
	
	
}
