package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminBranchManagement;
import ks49team01.admin.mapper.AdminBranchManagementMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminBranchManagementService {

	private  AdminBranchManagementMapper adminBranchManagementMapper;
	
	public List<AdminBranchManagement> getAdminBranchManagementList(){
		return adminBranchManagementMapper.getAdminBranchManagementList();
	}
}
