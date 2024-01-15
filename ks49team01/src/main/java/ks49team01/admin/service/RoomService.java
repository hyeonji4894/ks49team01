package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminSurcharge;
import ks49team01.admin.mapper.RoomMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class RoomService {
	
	
	private RoomMapper roomMapper;
	
	/**
	 * 시즌추가금리스트조회
	 * @return List<AdminSurchargeList>
	 */
	public List<AdminSurcharge> getAdminSurchargeList(){
		
		return roomMapper.getAdminSurchargeList();
	};
}
