package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks49team01.user.dto.UserRoom;
import ks49team01.user.mapper.UserRoomMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserRoomService {
	
	private UserRoomMapper userRoomMapper;
	
	public List<UserRoom> getRoomList(){
		
		return userRoomMapper.getRoomList();
	}
	
}
