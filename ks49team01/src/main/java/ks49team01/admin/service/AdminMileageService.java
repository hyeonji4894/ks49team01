package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.PaymentCriteriaMileage;
import ks49team01.admin.dto.ReviewMileageCriteria;
import ks49team01.admin.mapper.AdminMileageMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminMileageService {

	private AdminMileageMapper adminMileageMapper;
	
	/**
	 * 리뷰 적립금 기준 조회
	 */
	
	public List<ReviewMileageCriteria> getReviewMileageCriteria(){
		
		return adminMileageMapper.getReviewMileageCriteria();
	}
	
	/**
	 * 결제금액 기준 적립률 조회
	 */
	
	public List<PaymentCriteriaMileage> getPaymentCriteriaMileage(){
		
		return adminMileageMapper.getPaymentCriteriaMileage();
	}
}
