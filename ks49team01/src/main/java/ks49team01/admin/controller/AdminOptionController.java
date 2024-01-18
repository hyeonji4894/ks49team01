package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.service.AdminRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin/option")
@AllArgsConstructor
public class AdminOptionController {

	// 객실 옵션
	
		@GetMapping("/removeRoomOption")
		public String removeRoomPorion(Model model) {
			
			log.info("객실옵션삭제");
			
			model.addAttribute("pageTitle", "객실옵션삭제");
			
			return "admin/option/remove_room_option";
		}
		
		@GetMapping("/modifyRoomOption")
		public String modifyRoomOption(Model model) {
			
			log.info("객실옵션수정");
			
			model.addAttribute("pageTitle", "객실옵션수정");
			
			return "admin/option/modify_room_option";
		}
		
		@GetMapping("/addRoomOption")
		public String addRoomOption(Model model) {
			
			log.info("객실옵션등록");
			
			model.addAttribute("pageTitle", "객실옵션등록");
			
			return "admin/option/add_room_option";
		}
		
		@GetMapping("/roomOptionList")
		public String roomOptionList(Model model) {
		
			log.info("객실옵션조회");
			
			model.addAttribute("pageTitle", "객실옵션리스트 조회");
			
			return "admin/option/get_room_option";
		}
}