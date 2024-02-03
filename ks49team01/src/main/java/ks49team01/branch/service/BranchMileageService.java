package ks49team01.branch.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.branch.dto.BranchMileage;
import ks49team01.branch.dto.BranchPaymentCriteriaMileage;
import ks49team01.branch.dto.BranchReviewMileageCriteria;
import ks49team01.branch.mapper.BranchMileageMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class BranchMileageService {

	private final BranchMileageMapper branchMileageMapper;
	
	
	// 결제적립금 기준 조회
	public List<BranchPaymentCriteriaMileage> getBranchPaymentCriteriaMileage(){
		
		return branchMileageMapper.getBranchPaymentCriteriaMileage();
	}
	
	//결제적립금 기준 등록
	public void addBranchPaymentCriteriaMileage(BranchPaymentCriteriaMileage branchPaymentCriteriaMileage) {
		log.info("결제적립금 기준 insert 전 branchPaymentCriteriaMileage: {}", branchPaymentCriteriaMileage);
		branchMileageMapper.addBranchPaymentCriteriaMileage(branchPaymentCriteriaMileage);
		log.info("결제적립금 기준 insert 후 branchPaymentCriteriaMileage: {}", branchPaymentCriteriaMileage);	
	}	
	
	// 특정코드로 결제적립금 기준 조회
	public BranchPaymentCriteriaMileage getPaymentMileageCriteriaByCode(String roompayMileageRateCode) {
		
		BranchPaymentCriteriaMileage branchPaymentCriteriaMileage = branchMileageMapper.getPaymentMileageCriteriaByCode(roompayMileageRateCode);
		
		return branchPaymentCriteriaMileage;
	}
	
	// 특정코드로 결제적립금기준 수정
	public void modifyBranchPaymentCriteriaMileage(BranchPaymentCriteriaMileage branchPaymentCriteriaMileage) {
		int result = branchMileageMapper.modifyBranchPaymentCriteriaMileage(branchPaymentCriteriaMileage);
		if(result > 0) log.info("결제적립금 기준 수정완료");
	}
	
	
	
	
	
	
	
	
	// 리뷰적립금 기준 조회
	public List<BranchReviewMileageCriteria> getBranchReviewMileageCriteria(){
		
		return branchMileageMapper.getBranchReviewMileageCriteria();
	}
	
	//리뷰적립금 기준 등록
	public void addBranchReviewMileageCriteria(BranchReviewMileageCriteria branchReviewMileageCriteria) {
		log.info("리뷰적립금 기준 inser 전 branchReviewMileageCriteria: {}", branchReviewMileageCriteria);
		branchMileageMapper.addBranchReviewMileageCriteria(branchReviewMileageCriteria);
		log.info("리뷰적립금 기준 inser 후 branchReviewMileageCriteria: {}", branchReviewMileageCriteria);
	}
	
	// 특정코드로 리뷰적립금기준 조회
		public BranchReviewMileageCriteria getReviewMileageCriteriaByCode(String mileageCriteriaCode) {
			
			BranchReviewMileageCriteria branchReviewMileageCriteria = branchMileageMapper.getReviewMileageCriteriaByCode(mileageCriteriaCode);
			
			return branchReviewMileageCriteria;
		}
		
		// 특정코드로 리뷰적립금기준 수정
		public void modifyBranchReviewMileageCriteria(BranchReviewMileageCriteria branchReviewMileageCriteria) {
			int result = branchMileageMapper.modifyBranchReviewMileageCriteria(branchReviewMileageCriteria);
			if(result > 0) log.info("리뷰적립금 기준 수정완료");
		}
		
	
	
	
	
	
	
	
	// 적립금목록 조회
	public List<BranchMileage> getMileageList(){
		
		return branchMileageMapper.getMileageList();
				
	}
	
	// 적립금지급내역 지급받은아이디 검색(모달)
	public List<BranchMileage> getSearchMileageId(String memberId){
		
		return branchMileageMapper.getSearchMileageId(memberId);
	}
	
	// 조건에 따른 적립금 목록 검색(최종)
	public List<BranchMileage> getSearchMileageList(List<Map<String, Object>> paramList){
		
		return branchMileageMapper.getSearchMileageList(paramList);
	}
}
