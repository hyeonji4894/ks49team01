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
	
	/**
	 * 쿠폰 종류 등록
	 * @param adminCoupon
	 */
	public void addCouponKind(AdminCoupon adminCoupon) {
		log.info("쿠폰종류 insert 전 adminCoupon: {}", adminCoupon);
		adminCouponMapper.addCouponKind(adminCoupon);
		log.info("쿠폰종류 insert 전 adminCoupon: {}", adminCoupon);
		
	}
	
	
	/**
	 * 쿠폰 종류 조회
	 */
	
	public List<AdminCoupon> getCouponKind(){
		
		return adminCouponMapper.getCouponKind();
	}
	

	/**
	 * 쿠폰 이름 검색
	 * @return
	 */


	public List<AdminCoupon> getSearchCouponName(String couponName) {
		
		return adminCouponMapper.getSearchCouponName(couponName);
	}
		
	/**
	 * 쿠폰 가격 검색
	 * @param paramList
	 * @return
	 */
	public List<AdminCoupon> getSearchCouponPrice(List<Map<String, Object>> paramList){
		
		return adminCouponMapper.getSearchCouponPrice(paramList);
	}
}
