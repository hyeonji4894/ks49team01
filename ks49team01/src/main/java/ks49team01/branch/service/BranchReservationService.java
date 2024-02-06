package ks49team01.branch.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.branch.dto.BranchReservationUser;
import ks49team01.branch.mapper.BranchReservationMapper;
import lombok.AllArgsConstructor;

@Transactional
@AllArgsConstructor
@Service
public class BranchReservationService {
	
	private final BranchReservationMapper branchReservationMapper;
	
	
	/**
	 * 객실예약고객조회
	 * @return List<AdminReservationUser>
	 */
	public List<BranchReservationUser> getReservationUserList(){
		
		return branchReservationMapper.getReservationUserList();
	}
	

}
