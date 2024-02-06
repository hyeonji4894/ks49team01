package ks49team01.branch.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.BranchRoom;

@Mapper
public interface BranchRoomMapper {
	
	// 특정 코드로 객실 수정
	public int modifyRoomInfo(BranchRoom branchRoom);
	
	// 수정 할 특정 코드 조회
	public BranchRoom getRoomInfoByCode(String roomCode);
	
	// 객실 등록
	int addRoom(BranchRoom branchRoom);
	
	// 가맹점 목록(객실 등록시 가맹점 가져올때 사용)
	List<Map<String, Object>>getBranchList();
	
	// 조건별 객실 조회
	List<BranchRoom> getSearchByRoom(List<Map<String, Object>> paramList);
	
	// search 객실명
	List<BranchRoom> getRoomInfoSearch(String searchRoomName);

	// 객실정보
	List<BranchRoom> getRoomInfoList();
	
}
