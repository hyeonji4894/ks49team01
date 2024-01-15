package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminSurcharge;

@Mapper
public interface RoomMapper {
	
	// 시즌 추가금 목록 조회
	List<AdminSurcharge> getAdminSurchargeList();
}
