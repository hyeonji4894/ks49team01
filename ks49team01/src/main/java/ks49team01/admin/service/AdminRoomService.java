package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminRoom;
import ks49team01.admin.dto.AdminSurcharge;
import ks49team01.admin.mapper.AdminRoomMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminRoomService {
	
	private final AdminRoomMapper adminRoomMapper;
	
	public List<AdminRoom> getRoomInfoList(){
		
		return adminRoomMapper.getRoomInfoList();
	}
	
}
