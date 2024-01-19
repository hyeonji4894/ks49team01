package ks49team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.user.dto.UserFinalBranchAgreement;

@Mapper
public interface UserFinalBranchAgreementMapper {

	List<UserFinalBranchAgreement> getUserFinalBranchAgreementList();
	
}
