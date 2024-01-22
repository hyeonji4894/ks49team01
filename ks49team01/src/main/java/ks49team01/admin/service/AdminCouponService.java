package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminCoupon;
import ks49team01.admin.mapper.AdminCouponMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminCouponService {

	
	private final AdminCouponMapper adminCouponMapper;
	
	/**
	 * 쿠폰 종류 조회
	 */
	
	public List<AdminCoupon> getCouponKind(){
		
		return adminCouponMapper.getCouponKind();
	}
	
	/**
	 * 쿠폰 종류 검색
	 * @param searchMap
	 * @return
	 */
	
	public List<AdminCoupon> getSearchForCouponList(Map<String, Object> searchMap) {
		
		return adminCouponMapper.getSearchForCouponList(searchMap);
	}
	
	
}
