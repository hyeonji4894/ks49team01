package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks49team01.admin.dto.AdminSurcharge;
import ks49team01.admin.service.RoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin/room")
@AllArgsConstructor
public class AdminRoomController {
	
	private final RoomService roomService;
	
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
	
	
	
	
	// 시즌 추가금 리스트
	
	@GetMapping("/removeSurchargeList")
	public String removeSurchargeList(Model model) {
		
		log.info("시즌추가금리스트삭제");
		
		model.addAttribute("pageTitle", "시즌추가금삭제");
		
		return "admin/season_surcharge/remove_season_surcharge_list";
	}
	

	
	@GetMapping("/modifySurchargeList")
	public String modifySurchargeList(Model model) {
		
		log.info("시즌추가금리스트수정");
		
		model.addAttribute("pageTitle", "시즌추가금리스트수정");
		
		return "admin/season_surcharge/modify_season_surcharge_list";
		
	}
	
	@GetMapping("/addSurchargeList")
	public String addSeurcargeList(Model model) {
		
		log.info("시즌추가금리스트등록");
		
		model.addAttribute("service", "시즌추가금등록");
		model.addAttribute("pageTitle", "시즌추가금등록");
		
		return "admin/season_surcharge/add_season_surcharge_list";
		// 나중에 추가금 리스트에 등록하면 목록으로 페이지 전환할수있게 redirect사용
	}
	
	@GetMapping("/surchargeList")
	public String getSurchargeList(Model model) {
		
	
		
		List<AdminSurcharge> adminSurchargeList = roomService.getAdminSurchargeList();
		log.info("adminSurchargeList: {}", adminSurchargeList);
		
		model.addAttribute("service", "시즌추가금");
		model.addAttribute("serviceUri", "/admin/room");
		model.addAttribute("pageTitle", "시즌추가금 목록 조회");
		model.addAttribute("adminSurchargeList", adminSurchargeList);
		
		
		return "admin/season_surcharge/get_season_surcharge_list";
	}

}
