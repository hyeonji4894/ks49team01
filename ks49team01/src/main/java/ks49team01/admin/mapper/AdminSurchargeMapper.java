package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminSurcharge;

@Mapper
public interface AdminSurchargeMapper {

	// 가맹점이 등록한 추가금 목록 조회
	List<AdminSurcharge> getBranchBySurchargeList();
	
	// 시즌 추가금 목록 조회
	List<AdminSurcharge> getSurchargeList();
}
