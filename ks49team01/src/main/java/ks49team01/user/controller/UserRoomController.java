package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.user.dto.UserRoom;
import ks49team01.user.service.UserRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user/room")
@AllArgsConstructor
public class UserRoomController {
	
	private final UserRoomService roomService;

	// 객실 예약 확인
	
	@GetMapping("/cancelReserv")
	public String cancelReserv(Model model) {
		
		log.info("객실예약취소");
		
		model.addAttribute("title", "객실예약취소");
		
		return "user/room/cancel_room_reserv";
	}
	
	@GetMapping("/getReservCheck")
	public String getReservCheck(Model model) {
		
		log.info("객실예약내역확인");
		
		model.addAttribute("title", "객실예약내역확인");
		
		return "user/room/get_reserv_room";
	}
	
	// 객실 옵션 선택 + 총 금액
	@GetMapping("/roomTotalAmount")
	public String roomTotalAmount(Model model) {
		
		log.info("객실옵션및총금액확인");
		
		model.addAttribute("title", "객실옵션및총금액확인");
		
		return "user/room/confirm_room_total_amount";
	}
	
	
	
	// 객실 예약
	
	@GetMapping("/roomDetailView")
	public String roomDetailView(Model model) {
		
		log.info("객실보기");
		List<UserRoom> roomList = roomService.getRoomList();
		log.info("roomList: {}" ,roomList);
		
		model.addAttribute("title", "객실보기");		
		model.addAttribute("roomList", roomList);
		
		return "user/room/room_Detail_veiw";
	}
	
	
	@GetMapping("/selectReservDate")
	public String selectReservDate(Model model) {
		
		model.addAttribute("title", "예약날짜선택");
		
		model.addAttribute("title", "예약날짜선택");
		
		return "user/room/reserv_date_select";
	}
	
	@GetMapping("/selectReservRoom")
	public String selectReservRoom(Model model) {
		
		
		List<UserRoom> roomList = roomService.getRoomList();
		
		model.addAttribute("title", "예약객실선택");
		model.addAttribute("roomList", roomList);
		
		return "user/room/room_reserv_select";
	}
	
	
}
