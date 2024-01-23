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
	
}
