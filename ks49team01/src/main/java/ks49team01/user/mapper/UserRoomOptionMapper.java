package ks49team01.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.user.dto.UserRoomOption;

@Mapper
public interface UserRoomOptionMapper {
	
	// 옵션 리스트
	public List<UserRoomOption> getRoomOptionList();
}