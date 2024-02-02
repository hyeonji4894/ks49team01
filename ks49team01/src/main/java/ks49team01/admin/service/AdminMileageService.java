package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminMileage;
import ks49team01.admin.dto.AdminPaymentCriteriaMileage;
import ks49team01.admin.dto.AdminReviewMileageCriteria;
import ks49team01.admin.mapper.AdminMileageMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminMileageService {

	private final AdminMileageMapper adminMileageMapper;
	
	
	// 결제적립금 기준 조회
	public List<AdminPaymentCriteriaMileage> getAdminPaymentCriteriaMileage(){
		
		return adminMileageMapper.getAdminPaymentCriteriaMileage();
	}
	
	//결제적립금 기준 등록
	public void addAdminPaymentCriteriaMileage(AdminPaymentCriteriaMileage adminPaymentCriteriaMileage) {
		log.info("결제적립금 기준 insert 전 adminPaymentCriteriaMileage: {}", adminPaymentCriteriaMileage);
		adminMileageMapper.addAdminPaymentCriteriaMileage(adminPaymentCriteriaMileage);
		log.info("결제적립금 기준 insert 후 adminPaymentCriteriaMileage: {}", adminPaymentCriteriaMileage);	
	}	
	
	// 특정코드로 결제적립금 기준 조회
	public AdminPaymentCriteriaMileage getPaymentMileageCriteriaByCode(String roompayMileageRateCode) {
		
		AdminPaymentCriteriaMileage adminPaymentCriteriaMileage = adminMileageMapper.getPaymentMileageCriteriaByCode(roompayMileageRateCode);
		
		return adminPaymentCriteriaMileage;
	}
	
	// 특정코드로 결제적립금기준 수정
	public void modifyAdminPaymentCriteriaMileage(AdminPaymentCriteriaMileage adminPaymentCriteriaMileage) {
		int result = adminMileageMapper.modifyAdminPaymentCriteriaMileage(adminPaymentCriteriaMileage);
		if(result > 0) log.info("결제적립금 기준 수정완료");
	}
	
	
	
	
	
	
	
	
	// 리뷰적립금 기준 조회
	public List<AdminReviewMileageCriteria> getAdminReviewMileageCriteria(){
		
		return adminMileageMapper.getAdminReviewMileageCriteria();
	}
	
	//리뷰적립금 기준 등록
	public void addAdminReviewMileageCriteria(AdminReviewMileageCriteria adminReviewMileageCriteria) {
		log.info("리뷰적립금 기준 inser 전 adminReviewMileageCriteria: {}", adminReviewMileageCriteria);
		adminMileageMapper.addAdminReviewMileageCriteria(adminReviewMileageCriteria);
		log.info("리뷰적립금 기준 inser 후 adminReviewMileageCriteria: {}", adminReviewMileageCriteria);
	}
	
	// 특정코드로 리뷰적립금기준 조회
		public AdminReviewMileageCriteria getReviewMileageCriteriaByCode(String mileageCriteriaCode) {
			
			AdminReviewMileageCriteria adminReviewMileageCriteria = adminMileageMapper.getReviewMileageCriteriaByCode(mileageCriteriaCode);
			
			return adminReviewMileageCriteria;
		}
		
		// 특정코드로 리뷰적립금기준 수정
		public void modifyAdminReviewMileageCriteria(AdminReviewMileageCriteria adminReviewMileageCriteria) {
			int result = adminMileageMapper.modifyAdminReviewMileageCriteria(adminReviewMileageCriteria);
			if(result > 0) log.info("리뷰적립금 기준 수정완료");
		}
		
	
	
	
	
	
	
	
	// 적립금목록 조회
	public List<AdminMileage> getMileageList(){
		
		return adminMileageMapper.getMileageList();
				
	}
	
	// 적립금지급내역 지급받은아이디 검색(모달)
	public List<AdminMileage> getSearchMileageId(String memberId){
		
		return adminMileageMapper.getSearchMileageId(memberId);
	}
	
	// 조건에 따른 적립금 목록 검색(최종)
	public List<AdminMileage> getSearchMileageList(List<Map<String, Object>> paramList){
		
		return adminMileageMapper.getSearchMileageList(paramList);
	}
}
