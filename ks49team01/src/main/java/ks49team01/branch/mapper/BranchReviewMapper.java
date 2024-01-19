package ks49team01.branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchReview;
import ks49team01.branch.dto.BranchReviewReply;

@Mapper
public interface BranchReviewMapper {
	
	
	List<BranchReview> getReviewList();
	
	List<BranchReviewReply> getBranchReviewReply();
}
