package ks49team01.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.admin.dto.AdminRoom;

@Mapper
public interface AdminRoomMapper {
	
	// 객실삭제
	public int removeRoomInfo(String roomCode);
	
	// 특정 코드로 객실 수정
	public int modifyRoomInfo(AdminRoom adminRoom);
	
	// 특정 코드 조회
	public AdminRoom getRoomInfoByCode(String roomCode);
	
	// 가맹점 목록
	List<Map<String, Object>>getBranchList();
	
	// 객실 등록
	int addRoom(AdminRoom adminRoom);
	
	// 조건별 객실 조회
	List<AdminRoom> getSearchByRoom(List<Map<String, Object>> paramList);
	
	// search 객실명 
	List<AdminRoom> getRoomInfoSearch(String searchRoomName);

	// 객실 정보
	List<AdminRoom> getRoomInfoList();
}
