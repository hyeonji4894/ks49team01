package ks49team01.branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchSurcharge;

@Mapper
public interface BranchSurchargeMapper {
	
	// 시즌 추가금 등록
	List<BranchSurcharge> getAddSurchargeList();
	
	//  시즌 추가금 목록
	List<BranchSurcharge> getSurchargeList();

}
