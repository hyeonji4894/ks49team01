package ks49team01.branch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks49team01.branch.dto.BranchSurcharge;
import ks49team01.branch.mapper.BranchSurchargeMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BranchSurchargeService {
	
	private BranchSurchargeMapper branchSurchargeMapper;
	
	/**
	 * 가맹별 추가금 등록
	 * @return
	 */
	public List<BranchSurcharge> getAddSurchargeList(){
		return branchSurchargeMapper.getAddSurchargeList();
	}
	
	
	/**
	 * 본사가 정한 리스트 목록확인
	 * @return
	 */
	public List<BranchSurcharge> getSurchargeList(){
		
		return branchSurchargeMapper.getSurchargeList();
	}
	
	
}
