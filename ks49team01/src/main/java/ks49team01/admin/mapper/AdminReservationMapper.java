package ks49team01.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminReservationUser;

@Mapper
public interface AdminReservationMapper {
	

	// 객실조회
	List<AdminReservationUser> getReservationUserList();
}
