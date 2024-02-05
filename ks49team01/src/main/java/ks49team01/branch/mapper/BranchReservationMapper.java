package ks49team01.branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchReservationUser;


@Mapper
public interface BranchReservationMapper {
	
		// 객실조회
		List<BranchReservationUser> getReservationUserList();
		
		// search 예약자아이디
		List<BranchReservationUser> getMemberIdSearch(String searchMemberId);

}
