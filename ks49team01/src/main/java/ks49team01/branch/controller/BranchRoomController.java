package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/branch/room")
public class BranchRoomController {

	
	// 객실 정보
	
	@GetMapping("/removeRoomInfo")
	public String removeRoomInfo(Model model) {
		
		log.info("객실삭제");
		
		model.addAttribute("pageTitle", "객실삭제");
		
		return "branch/room/remove_room_info";
	}
	
	@GetMapping("/modifyRoomInfo")
	public String modifyRoomInfo(Model model) {
		
		log.info("객실정보수정");
		
		model.addAttribute("pageTitle", "객실정보수정");
		
		return "branch/room/modify_room_info";
	}
	
	
	@GetMapping("/addRoomInfo")
	public String addRoomInfo(Model model) {
		
		log.info("객실정보등록");
		
		model.addAttribute("pageTitle", "객실정보등록");
		
		return "branch/room/add_room_info";
	}
	
	@GetMapping("/roomInfo")
		public String roomInfo(Model model) {
		
		log.info("객실정보조회");
			
		model.addAttribute("pageTitle", "객실정보조회");
		
		return "branch/room/get_room_info";
	}
	
	
	
}
