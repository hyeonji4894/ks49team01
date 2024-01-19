package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserFinalBranchAgreement;
import ks49team01.user.mapper.UserFinalBranchAgreementMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class UserFinalBranchAgreementService {

	private  UserFinalBranchAgreementMapper userFinalBranchAgreementMapper;
	
	public void addUserFinalBranchAgreement(UserFinalBranchAgreement userFinalBranchAgreement) {
		log.info("최종 가맹 계약 전 userFinalBranchAgreement: {}", userFinalBranchAgreement);
		userFinalBranchAgreementMapper.addUserFinalBranchAgreement(userFinalBranchAgreement);
		log.info("최종 가맹 계약 후 userFinalBranchAgreement: {}", userFinalBranchAgreement);
	}
	/**
	 * 가맹 신청 조회
	 */
	public List<UserFinalBranchAgreement> getUserFinalBranchAgreementList(){
		return userFinalBranchAgreementMapper.getUserFinalBranchAgreementList();
	}
}
