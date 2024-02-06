package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import ks49team01.user.dto.UserRoom;
import ks49team01.user.dto.UserRoomOption;
import ks49team01.user.mapper.UserRoomMapper;
import ks49team01.user.service.UserRoomOptionService;
import ks49team01.user.service.UserRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user/room")
@AllArgsConstructor
public class UserRoomController {
	
	private final UserRoomService roomService;
	private final UserRoomMapper roomMapper;
	private final UserRoomOptionService optionService;

	
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
	
	
	// 선택한 정보 + 총 금액
	@GetMapping("/roomTotalAmount")
	public String roomTotalAmount(Model model) {
		
		List<UserRoomOption> roomOptionList = optionService.getOptionLis();
		log.info("roomOptionList :{}",roomOptionList);
		
		log.info("선택정보및총금액확인");
		
		model.addAttribute("title", "선택정보및총금액확인");
		model.addAttribute("roomOptionList",roomOptionList);
		
		return "user/room/confirm_room_total_amount";
	}
	
	
	
	// 객실 예약
	
	@PostMapping("/roomDetailView")
	public String roomDetailView(UserRoom userRoom, HttpSession session) {
		log.info("객실선택완료: {}", userRoom);
		
		roomService.datailRoomView(userRoom);
		
		return "redirect:/user/room/roomTotalAmount";
	}
	
	// 한개의 객실 보기
	@GetMapping("/roomDetailView")
	public String roomDetailView(@RequestParam(value = "roomCode") String roomCode
								,Model model) {
		
		UserRoom roomInfo = roomService.getRoomInfoByCode(roomCode);
		log.info("roomInfo: {}", roomInfo);
		
		// 인원추가 옵션
		UserRoomOption roomOptionByPersonnel = optionService.getOptionByPersonnel("option_01");
		log.info("roomOptionByPersonnel :{}",roomOptionByPersonnel);
		
		model.addAttribute("roomInfo", roomInfo);
		model.addAttribute("roomOptionByPersonnel", roomOptionByPersonnel);
		
		return "user/room/room_detail_veiw";
	}
	
	
	
	@GetMapping("/selectReservRoom")
	public String selectReservRoom(Model model,@RequestParam(value="location", required = false)
								   String location) {
		
		
		List<String> locationList = roomMapper.getLocationList();
		
		List<UserRoom> roomList = roomService.getRoomList(location);
		
		model.addAttribute("title", "예약객실선택");
		model.addAttribute("roomList", roomList);
		model.addAttribute("locationList", locationList);
		
		return "user/room/room_reserv_select";
	}
	
	
	@GetMapping("/selectReservDate")
	public String selectReservDate(Model model) {
		
		model.addAttribute("title", "예약날짜선택");
		
		model.addAttribute("title", "예약날짜선택");
		
		return "user/room/reserv_date_select";
	}
	
}
