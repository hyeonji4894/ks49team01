package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminCloseSchoolComparisonBranch;
import ks49team01.admin.mapper.AdminCloseSchoolComparisonBranchMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminCloseSchoolComparisonBranchService {

	private final AdminCloseSchoolComparisonBranchMapper adminCloseSchoolComparisonBranchMapper;
	
	/*
	 * public void addCloseSchool(AdminCloseSchoolComparisonBranch
	 * AdminCloseSchoolComparisonBranch) {
	 * log.info("폐교 목록 전 AdminCloseSchoolComparisonBranch : {}",
	 * AdminCloseSchoolComparisonBranch); AdminCloseSchoolComparisonBranch. }
	 */
	/**
	 * 폐교 목록 조회
	 * */
	public List<AdminCloseSchoolComparisonBranch> getAdminCloseSchoolComparisonBranchList(){
		return adminCloseSchoolComparisonBranchMapper.getAdminCloseSchoolComparisonBranchList();
	}
	
}
