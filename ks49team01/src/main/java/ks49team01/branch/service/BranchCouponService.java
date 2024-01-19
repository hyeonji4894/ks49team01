package ks49team01.branch.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.branch.dto.BranchCoupon;
import ks49team01.branch.mapper.BranchCouponMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class BranchCouponService {

	private BranchCouponMapper branchCouponMapper;
	
	/**
	 * 쿠폰 종류 조회
	 */
	
	public List<BranchCoupon> getCouponList(){
		
		return branchCouponMapper.getCouponList();
	}
	
	/**
	 * 쿠폰 지급 목록 조회
	 */
	
	public List<BranchCoupon> getSendCouponList(){
		
		return branchCouponMapper.getSendCouponList();
		
	}
}
