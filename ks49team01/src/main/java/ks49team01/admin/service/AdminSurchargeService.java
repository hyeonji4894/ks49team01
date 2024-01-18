package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminSurcharge;
import ks49team01.admin.mapper.AdminRoomMapper;
import ks49team01.admin.mapper.AdminSurchargeMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminSurchargeService {
	
private AdminSurchargeMapper adminSurchargeMapper;
	
	/**
	 * 시즌추가금리스트조회
	 * @return List<AdminSurcharge>
	 */
	public List<AdminSurcharge> getAdminSurchargeList(){
		
		return adminSurchargeMapper.getAdminSurchargeList();
	};

}
