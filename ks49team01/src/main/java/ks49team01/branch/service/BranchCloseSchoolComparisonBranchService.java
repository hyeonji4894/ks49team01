package ks49team01.branch.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.branch.dto.BranchCloseSchoolComparisonBranch;
import ks49team01.branch.mapper.BranchCloseSchoolComparisonBranchMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class BranchCloseSchoolComparisonBranchService {

	private final BranchCloseSchoolComparisonBranchMapper branchCloseSchoolComparisonBranchMapper;
	
	public List<BranchCloseSchoolComparisonBranch> getCloseSchoolComparisonBranch(){
		
		return branchCloseSchoolComparisonBranchMapper.getCloseSchoolComparisonBranch();
	}
	
}
