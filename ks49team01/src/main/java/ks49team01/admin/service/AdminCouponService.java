package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminCoupon;
import ks49team01.admin.mapper.AdminCouponMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminCouponService {

	
	private final AdminCouponMapper adminCouponMapper;
	
	// 쿠폰종류 등록
	public void addCouponKind(AdminCoupon adminCoupon) {
		log.info("쿠폰종류 insert 전 adminCoupon: {}", adminCoupon);
		adminCouponMapper.addCouponKind(adminCoupon);
		log.info("쿠폰종류 insert 전 adminCoupon: {}", adminCoupon);
		
	}
	
	// 쿠폰종류 목록조회
	public List<AdminCoupon> getCouponKind(){
		
		return adminCouponMapper.getCouponKind();
	}
	
	// 쿠폰종류 이름 검색
	public List<AdminCoupon> getSearchCouponName(String couponName) {
		
		return adminCouponMapper.getSearchCouponName(couponName);
	}
		
	// 쿠폰종류 가격 검색
	public List<AdminCoupon> getSearchCouponPrice(List<Map<String, Object>> paramList){
		
		return adminCouponMapper.getSearchCouponPrice(paramList);
	}
	
	// 특정코드로 쿠폰종류 조회
	public AdminCoupon getCouponKindByCode(String couponCode) {
		
		AdminCoupon adminCouponKind = adminCouponMapper.getCouponKindByCode(couponCode);
		
		return adminCouponKind;
	}
	
	// 특정코드로 쿠폰종류 수정
	public void modifyCouponKind(AdminCoupon adminCoupon) {
		int result = adminCouponMapper.modifyCouponKind(adminCoupon);
		if(result > 0) log.info("쿠폰종류 수정 완료");
	}
	
	
	
	
	
	
	// 쿠폰지급내역 목록조회
	public List<AdminCoupon> getCouponList(){
		
		return adminCouponMapper.getCouponList();
	}
	
	// 쿠폰지급내역 지급받은아이디 검색(모달)
		public List<AdminCoupon> getSearchCouponId(String memberId){
			
			return adminCouponMapper.getSearchCouponId(memberId);
		}
		
	// 조건에 따른 쿠폰지급내역 검색(최종)
	public List<AdminCoupon> getSearchCouponList(List<Map<String, Object>> paramList){
		
		return adminCouponMapper.getSearchCouponList(paramList);
	}
}
