package ks49team01.branch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks49team01.branch.dto.BranchCloseSchool;
import ks49team01.branch.mapper.BranchCloseSchoolMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BranchCloseSchoolService {

	private final BranchCloseSchoolMapper branchCloseSchoolMapper;
	
	public List<BranchCloseSchool> getBranchCloseSchoolList(){
		
		return branchCloseSchoolMapper.getBranchCloseSchool();
	}
}
