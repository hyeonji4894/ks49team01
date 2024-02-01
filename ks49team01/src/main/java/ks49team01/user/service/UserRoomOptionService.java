package ks49team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.user.dto.UserRoomOption;
import ks49team01.user.mapper.UserRoomOptionMapper;
import lombok.AllArgsConstructor;

@Transactional
@AllArgsConstructor
@Service
public class UserRoomOptionService {
	
	private final UserRoomOptionMapper userRoomOptionMapper;
	
	public List<UserRoomOption> getRoomOptionLis(){
		
		return userRoomOptionMapper.getRoomOptionList();
	}

}
