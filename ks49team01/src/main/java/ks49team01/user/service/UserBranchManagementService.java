package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserBranchManagement;
import ks49team01.user.mapper.UserBranchManagementMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UserBranchManagementService {

	private  UserBranchManagementMapper userBranchManagementMapper;
	
	public List<UserBranchManagement> getUserBranchManagementList(){
		return userBranchManagementMapper.getUserBranchManagementList();
	}
}
