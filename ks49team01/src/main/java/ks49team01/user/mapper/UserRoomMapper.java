package ks49team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.user.dto.UserRoom;

@Mapper
public interface UserRoomMapper {
	
	// roomCode로 객실 불러오기
	public int datailRoomView(UserRoom userRoom);
	
	// roomCode로 객실 조회
	public UserRoom getRoomInfoByCode(String roomCode);
	
	
	List<UserRoom> getRoomList();
}
