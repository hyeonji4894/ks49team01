package ks49team01.branch.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.branch.dto.BranchReview;
import ks49team01.branch.dto.BranchReviewReply;
import ks49team01.branch.mapper.BranchReviewMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class BranchReviewService {

	private BranchReviewMapper branchReviewMapper;
	
	/**
	 * 리뷰 목록 조회
	 */
	
	public List<BranchReview> getReveiwList(){
		
		return branchReviewMapper.getReviewList();
	}
	
	/**
	 * 리뷰 댓글 조회
	 */
	public List<BranchReviewReply> getBranchReviewReply(){
		
		return branchReviewMapper.getBranchReviewReply();
	}
	
}
