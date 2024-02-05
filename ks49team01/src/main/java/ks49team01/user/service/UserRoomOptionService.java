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
	
	//옵션리스트
	public List<UserRoomOption> getOptionLis(){
		
		return userRoomOptionMapper.getOptionList();
	}
	
	// 조건옵션 인원추가
	public List<UserRoomOption> getOptionByPersonnel(){
		
		return userRoomOptionMapper.getOptionByPersonnel();
	}

}
