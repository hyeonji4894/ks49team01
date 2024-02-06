package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminFinalBranchAgreement;
import ks49team01.admin.mapper.AdminFinalBranchAgreementMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminFinalBranchAgreementService {

	private  AdminFinalBranchAgreementMapper adminFinalBranchAgreementMapper;
	
	public List<AdminFinalBranchAgreement> getAdminFinalBranchAgreementList(){
		return adminFinalBranchAgreementMapper.getAdminFinalBranchAgreementList();
	}
}
