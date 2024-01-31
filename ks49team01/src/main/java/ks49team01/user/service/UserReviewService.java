package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserReview;
import ks49team01.user.mapper.UserReviewMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UserReviewService {

	private final UserReviewMapper userReviewMapper;
	
	
	// 리뷰종류 목록조회
	public List<UserReview> getReviewList(){
		
		return userReviewMapper.getSearchReviewList();
	}
}
