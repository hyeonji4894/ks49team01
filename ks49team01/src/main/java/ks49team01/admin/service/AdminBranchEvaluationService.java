package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminBranchEvaluation;
import ks49team01.admin.mapper.AdminBranchEvaluationMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
public class AdminBranchEvaluationService {

	private AdminBranchEvaluationMapper adminBranchEvaluationMapper;
	
	public List<AdminBranchEvaluation> getAdminBranchEvaluationList(){
		return adminBranchEvaluationMapper.getAdminBranchEvaluationList();
	}
}
