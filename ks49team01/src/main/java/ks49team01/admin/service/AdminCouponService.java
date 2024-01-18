package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminCoupon;
import ks49team01.admin.mapper.AdminCouponMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminCouponService {

	private AdminCouponMapper adminCouponMapper;
	
	/**
	 * 쿠폰 종류 조회
	 */
	
	public List<AdminCoupon> getCouponKind(){
		
		return adminCouponMapper.getCouponKind();
	}
	
}
