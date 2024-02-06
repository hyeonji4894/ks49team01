package ks49team01.branch.mapper;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchCoupon;

@Mapper
public interface BranchCouponMapper {
	
	// 쿠폰 종류 조회
	List<BranchCoupon> getCouponKind();

	// 쿠폰 종류 등록
	int addCouponKind(BranchCoupon branchCoupon);
	
	// 특정 코드로 쿠폰종류 조회
	public BranchCoupon getCouponKindByCode(String couponCode);
	
	//특정 코드로 쿠폰종류 수정
	public int modifyCouponKind(BranchCoupon branchCoupon);

	// 쿠폰 종류 삭제
	public int removeCouponKind(List<String> paramList);
	
	// 쿠폰종류 이름 검색
	List<BranchCoupon> getSearchCouponName(String couponName);
	
	// 쿠폰종류 가격 검색
	List<BranchCoupon> getSearchCouponPrice(List<Map<String, Object>> paramList);
	
	
	
	// 쿠폰지급내역 목록조회
	List<BranchCoupon> getCouponList();
	
	// 쿠폰지급내역 지급받은아이디 검색(모달)
	List<BranchCoupon> getSearchCouponId(String memberId);
		
	// 쿠폰 지급받은 아이디 최종검색
	List<BranchCoupon> getSearchCouponList(List<Map<String, Object>> paramList);
	}

	
	
	
	