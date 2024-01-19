package ks49team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.user.dto.UserBranchEvaluation;

@Mapper
public interface UserBranchEvaluationMapper {

	List<UserBranchEvaluation> getUserBranchEvaluationList();
	
}
