package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminRoom;
import ks49team01.admin.mapper.AdminRoomMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
@AllArgsConstructor
public class AdminRoomService {
	
	private final AdminRoomMapper adminRoomMapper;
	
	public void addRoom(AdminRoom adminRoom) {
		log.info("객실 insert 전 adminRoom: {}", adminRoom);
		adminRoomMapper.addRoom(adminRoom);
		log.info("객실 insert 후 adminRoom: {}", adminRoom);
	}
	
	// 조건별 객실 조회
	public List<AdminRoom> getSearchByRoom(List<Map<String, Object>> paramList){
		return adminRoomMapper.getSearchByRoom(paramList);
	}
	
	
	public List<AdminRoom> getRoomInfoList(){
		
		return adminRoomMapper.getRoomInfoList();
	}
	
	// 특정 코드로 객실 조회
	public AdminRoom getRoomInfoByCode(String roomCode) {
		
		AdminRoom roomInfo = adminRoomMapper.getRoomInfoByCode(roomCode);
		return roomInfo;
	}
	
	// 특정코드로 객실 수정
	public void modifyroomInfo(AdminRoom adminRoom) {
		int result = adminRoomMapper.modifyRoomInfo(adminRoom);
		if(result > 0) log.info("객실 수정 완료");
	}

	public void removeRoomInfo(List<String> paramList) {
		int result1 = adminRoomMapper.removeRoomImg(paramList);
		if(result1 > 0) log.info("객실 이미지 삭제 완료");
		int result3 = adminRoomMapper.removeRoomReview(paramList);
		if(result3 > 0) log.info("객실 리뷰 삭제 완료");
		int result2 = adminRoomMapper.removeRoomReservation(paramList);
		if(result2 > 0) log.info("객실 예약 삭제 완료");
		int result4 = adminRoomMapper.removeRoomInfo(paramList);
		if(result4 > 0) log.info("객실 정보 삭제 완료");
	}
	

	
}
