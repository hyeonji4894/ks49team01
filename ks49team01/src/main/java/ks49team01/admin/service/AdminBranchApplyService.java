package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminBranchApply;
import ks49team01.admin.mapper.AdminBranchApplyMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminBranchApplyService {

	private AdminBranchApplyMapper adminBranchApplyMapper;
	
	/**
	 * 가맹 신청 조회
	 */
	public List<AdminBranchApply> getAdminBranchApplyList(){
		return adminBranchApplyMapper.getAdminBranchApplyList();
	}
}
