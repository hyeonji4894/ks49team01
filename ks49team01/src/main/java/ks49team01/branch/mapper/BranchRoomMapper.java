package ks49team01.branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchRoom;

@Mapper
public interface BranchRoomMapper {

	// 객실정보
	List<BranchRoom>  getRoomInfoList();
	
}
