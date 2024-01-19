package ks49team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.user.dto.UserBranchManagement;

@Mapper
public interface UserBranchManagementMapper {

	void addUserBranchManagement(UserBranchManagement userBranchManagement);

	List<UserBranchManagement> getUserBranchManagementList();
	

}
