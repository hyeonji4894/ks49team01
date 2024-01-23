package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminReservationUser;
import ks49team01.admin.mapper.AdminReservationMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AdminReservationService {
	
	private final AdminReservationMapper adminReservationMapper;
	
	
	/**
	 * 객실예약고객조회
	 * @return List<AdminReservationUser>
	 */
	public List<AdminReservationUser> getReservationUserList(){
		
		return adminReservationMapper.getReservationUserList();
	}

}
