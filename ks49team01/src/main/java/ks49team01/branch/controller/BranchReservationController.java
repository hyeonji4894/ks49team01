package ks49team01.branch.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.branch.dto.BranchReservationUser;
import ks49team01.branch.service.BranchReservationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Controller
@RequestMapping("/branch/reservation")
public class BranchReservationController {
	
	private final BranchReservationService reservationService;

	// 객실예약 고객 조회
		@GetMapping("/reservationUser")
		public String reservationUser(Model model) {
			
			List<BranchReservationUser> reservationUserList = reservationService.getReservationUserList();
			log.info("객실예약고객조회");
			log.info("reservationUserList: {}",reservationUserList);
			
			model.addAttribute("Title", "객실예약고객조회");
			model.addAttribute("reservationUserList", reservationUserList);
			
			return "branch/reservation/get_reservation_user";
		}
		
		// 객실예약 취소 고객 조회
		@GetMapping("/reservationCancelUser")
		public String reservationCancelUser(Model model) {
			
			log.info("객실예약취소고객조회");
			
			model.addAttribute("Title", "객실예약취소고객조회");
			
			return "branch/reservation/get_reservation_cancel_user";
		}
}
