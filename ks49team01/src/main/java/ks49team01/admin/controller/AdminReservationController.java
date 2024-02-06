package ks49team01.admin.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks49team01.admin.dto.AdminReservationUser;
import ks49team01.admin.mapper.AdminReservationMapper;
import ks49team01.admin.service.AdminReservationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin/reservation")
@AllArgsConstructor
public class AdminReservationController {
	
	private final AdminReservationService reservationService;
	private final AdminReservationMapper reservationMapper;
	
	
	
	// 객실예약 고객 조회
	@GetMapping("/reservationUser")
	public String reservationUser(Model model) {
		
		
		List<AdminReservationUser> reservationUserList = reservationService.getReservationUserList();
		log.info("객실예약고객조회");
		log.info("reservationUserList: {}", reservationUserList);
		
		model.addAttribute("Title", "객실예약고객조회");
		model.addAttribute("reservationUserList", reservationUserList);
		
		return "admin/reservation/get_reservation_user";
	}
	
	// modal search memberId
	@PostMapping("/searchMemberId")
	@ResponseBody
	public List<AdminReservationUser> searchMemberId(@RequestParam(value = "searchMemberId")String searchMemberId){
		
		log.info("검색 예약자 아이디: {}",searchMemberId);
		List<AdminReservationUser> reservationSearchList = reservationMapper.getMemberIdSearch(searchMemberId);
		
		return reservationSearchList;
	}
	
	
	
	
	
	
	
	// 객실예약 취소 고객 조회
	@GetMapping("/reservationCancelUser")
	public String reservationCancelUser(Model model) {
		
		
		
		log.info("객실예약취소고객조회");
		
		model.addAttribute("Title", "객실예약취소고객조회");
		
		return "admin/reservation/get_reservation_cancel_user";
	}
}
