package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminReview;
import ks49team01.admin.dto.AdminReviewCategory;
import ks49team01.admin.dto.AdminReviewReply;
import ks49team01.admin.mapper.AdminReviewMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminReviewService {

	private final AdminReviewMapper adminReviewMapper;
	
	/**
	 * 리뷰 목록 조회
	 */
	
	public List<AdminReview> getReviewList(){
		
		return adminReviewMapper.getReviewList();
	}
	
	/**
	 * 리뷰 분위기 카테고리 조회
	 */
	public List<AdminReviewCategory> getReviewMoodCategory(){
		
		return adminReviewMapper.getReviewMoodCategory();
	}
	
	/**
	 * 리뷰 시설 카테고리 조회
	 */
	public List<AdminReviewCategory> getReviewFacilityCategory(){
		
		return adminReviewMapper.getReviewFacilityCategory();
	}
	
	/**
	 * 리뷰 댓글 조회
	 */
	public List<AdminReviewReply> getAdminReviewReply(){
		
		return adminReviewMapper.getAdminReviewReply();
	}
}
