package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserBranchApply;
import ks49team01.user.mapper.UserBranchApplyMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UserBranchApplyService {

	private UserBranchApplyMapper userBranchApplyMapper;
	
	public List<UserBranchApply> getUserBranchApplyList(){
		return userBranchApplyMapper.getUserBranchApplyList();
	}
}
