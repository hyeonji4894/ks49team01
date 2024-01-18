package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminReview;
import ks49team01.admin.mapper.AdminReviewMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminReviewService {

	private AdminReviewMapper adminReviewMapper;
	
	/**
	 * 리뷰 목록 조회
	 */
	
	public List<AdminReview> getReviewList(){
		
		return adminReviewMapper.getReviewList();
	}
}
