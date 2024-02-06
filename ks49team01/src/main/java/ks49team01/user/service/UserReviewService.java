package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserReview;
import ks49team01.user.mapper.UserReviewMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class UserReviewService {

	private final UserReviewMapper userReviewMapper;
	
	
	// 리뷰종류 목록조회
	public List<UserReview> getUserReviewList(){
		
		List<UserReview> reviewList = userReviewMapper.getUserReviewList();
		
		log.info("reviewList: {}", reviewList);
		
		return userReviewMapper.getUserReviewList();
	}
	
	// 리뷰 등록
	public void addReview(UserReview userReview) {
		
		log.info("리뷰 insert 전 userReview: {}", userReview);
		userReviewMapper.addReview(userReview);
		log.info("리뷰 insert 후 userReview: {}", userReview);
	}
	
	// 리뷰 자세히보기
	public UserReview getReviewDetail(String reviewNum) {
		
		UserReview reviewDetail = userReviewMapper.getReviewDetail(reviewNum);
		
		return reviewDetail;
	}
	
	// reviewNum으로 리뷰자세히보기 조회
	public UserReview getReviewDetailByCode(String reviewNum) {
		
		UserReview reviewDetail = userReviewMapper.getReviewDetailByNum(reviewNum);
		return reviewDetail;
	}
	

	// 리뷰 수정
	public void modifyReview(UserReview userReview) {
		
		userReviewMapper.modifyReview(userReview);
	}
	
	// 리뷰 삭제
	public void removeRemove(String reviewNum) {
		
		userReviewMapper.removeReview(reviewNum);
	}
}
