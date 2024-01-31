package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserRoom;
import ks49team01.user.dto.UserRoomOption;
import ks49team01.user.mapper.UserRoomMapper;
import ks49team01.user.mapper.UserRoomOptionMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
@AllArgsConstructor
public class UserRoomService {
	
	private final UserRoomMapper userRoomMapper;
	private final UserRoomOptionMapper userRoomOptionMapper;
	
	public List<UserRoomOption> getRoomOptionList(){
		
		return userRoomOptionMapper.getRoomOptionList();
	}
	
	//roomCode로 객실 불러오기
	public void datailRoomView(UserRoom userRoom) {
		int result = userRoomMapper.datailRoomView(userRoom);
		if(result > 0) log.info("객실불러오기");
	}
	
	// roomCode로 객실 조회
	public UserRoom getRoomInfoByCode(String roomCode) {
		
		UserRoom oneRoomInfo = userRoomMapper.getRoomInfoByCode(roomCode);
		return oneRoomInfo;
	}
	
	
	public List<UserRoom> getRoomList(String location){
		
		return userRoomMapper.getRoomList(location);
	}
	
}
