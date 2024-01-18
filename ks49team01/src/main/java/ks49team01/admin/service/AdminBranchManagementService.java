package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminBranchManagement;
import ks49team01.admin.mapper.AdminBranchManagementMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminBranchManagementService {

	private  AdminBranchManagementMapper adminBranchManagementMapper;
	
	public void addAdminBranchManagement(AdminBranchManagement adminBranchManagement) {
		log.info("가맹 관리 전 adminBranchManagement: {}", adminBranchManagement);
		adminBranchManagementMapper.addAdminBranchManagement(adminBranchManagement);
		log.info("가맹 관리 후 adminBranchManagement: {}", adminBranchManagement);
	}
	/**
	 * 가맹 신청 조회
	 */
	public List<AdminBranchManagement> getAdminBranchManagementList(){
		return adminBranchManagementMapper.getAdminBranchManagementList();
	}
}
