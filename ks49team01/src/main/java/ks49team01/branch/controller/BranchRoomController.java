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
	
	// 객실옵션
	
	@GetMapping("/roomOptionList")
	public String roomOptionList(Model model) {
	
		log.info("객실옵션조회");
		
		model.addAttribute("pageTitle", "객실옵션리스트 조회");
		
		return "branch/option/get_room_option";
	}
	
	
	// 시즌 추가금 리스트
	
	@GetMapping("/modifySurchargeList")
	public String modifySurchargeList(Model model) {
		
		log.info("시즌추가금리스트수정");
		
		model.addAttribute("pageTitle", "시즌추가금리스트수정");
		
		return "branch/season_surcharge/modify_season_surcharge_list";
	}
	
	@GetMapping("/addSurchargeList")
	public String addSurchargeList(Model model) {
		
		log.info("시즌추가금리스트등록");
		
		model.addAttribute("pageTitle", "시즌추가금리스트등록");
		
		return "branch/season_surcharge/add_season_surcharge_list";
	}
	
	@GetMapping("/surchargeList")
	public String surchargeList(Model model) {
		
		log.info("시즌추가금리스트");
		
		model.addAttribute("pageTitle", "시즌추가금리스트");
		
		return "branch/season_surcharge/get_season_surcharge_list";
	}
}
