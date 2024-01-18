package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminRoom;
import ks49team01.admin.dto.AdminSurcharge;

@Mapper
public interface AdminRoomMapper {
	
	// 객실 정보
	List<AdminRoom> getRoomInfoList();
}
