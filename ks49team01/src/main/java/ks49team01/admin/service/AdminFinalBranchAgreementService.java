package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminFinalBranchAgreement;
import ks49team01.admin.mapper.AdminFinalBranchAgreementMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminFinalBranchAgreementService {

	private  AdminFinalBranchAgreementMapper adminFinalBranchAgreementMapper;
	
	public void addAdminFinalBranchAgreement(AdminFinalBranchAgreement adminFinalBranchAgreement) {
		log.info("최종 가맹 계약 전 adminFinalBranchAgreement: {}", adminFinalBranchAgreement);
		adminFinalBranchAgreementMapper.addAdminFinalBranchAgreement(adminFinalBranchAgreement);
		log.info("최종 가맹 계약 후 adminFinalBranchAgreement: {}", adminFinalBranchAgreement);
	}
	/**
	 * 가맹 신청 조회
	 */
	public List<AdminFinalBranchAgreement> getAdminFinalBranchAgreementList(){
		return adminFinalBranchAgreementMapper.getAdminFinalBranchAgreementList();
	}
}
