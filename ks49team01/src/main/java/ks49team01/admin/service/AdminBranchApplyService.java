package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminBranchApply;
import ks49team01.admin.mapper.AdminBranchApplyMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminBranchApplyService {

	private AdminBranchApplyMapper adminBranchApplyMapper;
	
	public void addAdminBranchApply(AdminBranchApply adminBranchApply) {
		log.info("가맹 신청 전 adminBranchApply: {}", adminBranchApply);
		adminBranchApplyMapper.addAdminBranchApply(adminBranchApply);
		log.info("가맹 신청 후 adminBranchApply: {}", adminBranchApply);
	}
	/**
	 * 가맹 신청 조회
	 */
	public List<AdminBranchApply> getAdminBranchApplyList(){
		return adminBranchApplyMapper.getAdminBranchApplyList();
	}
}
