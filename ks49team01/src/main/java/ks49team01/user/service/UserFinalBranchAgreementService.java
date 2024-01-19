package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserFinalBranchAgreement;
import ks49team01.user.mapper.UserFinalBranchAgreementMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UserFinalBranchAgreementService {

	private  UserFinalBranchAgreementMapper userFinalBranchAgreementMapper;
	
	/**
	 * 가맹 신청 조회
	 */
	public List<UserFinalBranchAgreement> getUserFinalBranchAgreementList(){
		return userFinalBranchAgreementMapper.getUserFinalBranchAgreementList();
	}
}
