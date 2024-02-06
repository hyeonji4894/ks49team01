package ks49team01.branch.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.branch.dto.BranchCoupon;
import ks49team01.branch.mapper.BranchCouponMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class BranchCouponService {

	
	private final BranchCouponMapper branchCouponMapper;
	
	// 쿠폰종류 등록
	public void addCouponKind(BranchCoupon branchCoupon) {
		log.info("쿠폰종류 insert 전 branchCoupon: {}", branchCoupon);
		branchCouponMapper.addCouponKind(branchCoupon);
		log.info("쿠폰종류 insert 후 branchCoupon: {}", branchCoupon);
		
	}
	
	// 쿠폰종류 목록조회
	public List<BranchCoupon> getCouponKind(){
		
		return branchCouponMapper.getCouponKind();
	}
	
	// 쿠폰종류 이름 검색
	public List<BranchCoupon> getSearchCouponName(String couponName) {
		
		return branchCouponMapper.getSearchCouponName(couponName);
	}
		
	// 쿠폰종류 가격 검색
	public List<BranchCoupon> getSearchCouponPrice(List<Map<String, Object>> paramList){
		
		return branchCouponMapper.getSearchCouponPrice(paramList);
	}
	
	// 특정코드로 쿠폰종류 조회
	public BranchCoupon getCouponKindByCode(String couponCode) {
		
		BranchCoupon branchCouponKind = branchCouponMapper.getCouponKindByCode(couponCode);
		
		return branchCouponKind;
	}
	
	// 특정코드로 쿠폰종류 수정
	public void modifyCouponKind(BranchCoupon branchCoupon) {
		int result = branchCouponMapper.modifyCouponKind(branchCoupon);
		if(result > 0) log.info("쿠폰종류 수정 완료");
	}
	
	
	
	
	
	
	// 쿠폰지급내역 목록조회
	public List<BranchCoupon> getCouponList(){
		
		return branchCouponMapper.getCouponList();
	}
	
	// 쿠폰지급내역 지급받은아이디 검색(모달)
		public List<BranchCoupon> getSearchCouponId(String memberId){
			
			return branchCouponMapper.getSearchCouponId(memberId);
		}
		
	// 조건에 따른 쿠폰지급내역 검색(최종)
	public List<BranchCoupon> getSearchCouponList(List<Map<String, Object>> paramList){
		
		return branchCouponMapper.getSearchCouponList(paramList);
	}
}
