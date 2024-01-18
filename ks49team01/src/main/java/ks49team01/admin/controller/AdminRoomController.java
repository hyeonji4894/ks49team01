package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks49team01.admin.dto.AdminSurcharge;
import ks49team01.admin.service.AdminRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin/room")
@AllArgsConstructor
public class AdminRoomController {
	
	private final AdminRoomService roomService;
	
	// 객실 정보
	
	@GetMapping("/removeRoomInfo")
	public String removeRoomInfo(Model model) {
		
		log.info("객실삭제");
		
		model.addAttribute("pageTitle", "객실삭제");
		
		return "admin/room/remove_room_info";
	}
	
	@GetMapping("/modifyRoomInfo")
	public String modifyRoomInfo(Model model) {
		
		log.info("객실정보수정");
		
		model.addAttribute("pageTitle", "객실정보수정");
		
		return "admin/room/modify_room_info";
	}
	
	
	@GetMapping("/addRoomInfo")
	public String addRoomInfo(Model model) {
		
		log.info("객실정보등록");
		
		model.addAttribute("pageTitle", "객실정보등록");
		
		return "admin/room/add_room_info";
	}
	
	@GetMapping("/roomInfo")
		public String roomInfo(Model model) {
		
		log.info("객실정보조회");
			
		model.addAttribute("pageTitle", "객실정보조회");
		
		return "admin/room/get_room_info";
	}
	
}
