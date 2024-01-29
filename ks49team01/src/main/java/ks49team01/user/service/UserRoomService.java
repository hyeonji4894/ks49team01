package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserRoom;
import ks49team01.user.mapper.UserRoomMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
@AllArgsConstructor
public class UserRoomService {
	
	private final UserRoomMapper userRoomMapper;
	
	//roomCode로 객실 불러오기
	public void datailRoomView(UserRoom userRoom) {
		int result = userRoomMapper.datailRoomView(userRoom);
		if(result > 0) log.info("객실불러오기");
	}
	
	// roomCode로 객실 조회
	public UserRoom getRoomInfoByName(String roomName) {
		
		UserRoom roomInfo = userRoomMapper.getRoomInfoByName(roomName);
		return roomInfo;
	}
	
	
	public List<UserRoom> getRoomList(){
		
		return userRoomMapper.getRoomList();
	}
	
}
