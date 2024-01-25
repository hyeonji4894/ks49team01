package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import ks49team01.admin.dto.AdminOption;
import ks49team01.admin.service.AdminOptionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin/option")
@AllArgsConstructor
public class AdminOptionController {
	
	private final AdminOptionService optionService;
	

	// 객실 옵션
	
		@GetMapping("/removeRoomOption")
		public String removeRoomPorion(Model model) {
			
			log.info("객실옵션삭제");
			List<AdminOption> optionList = optionService.getOptionList();	
			log.info("optionList : {}" , optionList);
			
			model.addAttribute("pageTitle", "객실옵션삭제");
			model.addAttribute("optionList", optionList);
			
			return "admin/option/remove_room_option";
		}
		
		@PostMapping("/modifyRoomOption")
		public String modifyRoomOption(AdminOption adminOption, HttpSession session) {
			log.info("옵션수정 : {}" , adminOption);
			
			//옵션넘버로 수정
			optionService.modifyRoomOption(adminOption);
			return "redirect:/admin/option/roomOptionList";
		}
		
		
		@GetMapping("/modifyRoomOption")
		public String modifyRoomOption(@RequestParam(value = "roomOptionNumber") String roomOptionNumber
										,Model model) {
			
			log.info("옵션수정 화면 roomOptionNumber : {}", roomOptionNumber);
			
			// 옵션넘버 조회
			AdminOption optionInfo = optionService.getNumberByOption(roomOptionNumber);
			log.info("옵션 한줄 : {}", optionInfo);
			
			model.addAttribute("optionInfo", optionInfo);
			
			return "admin/option/modify_room_option";
		}
		
		
		
		 @GetMapping("/addRoomOption") 
		 public String addRoomOption(Model model) {
		 
		 model.addAttribute("pageTitle", "객실옵션등록");
		 
		 return "admin/option/add_room_option"; }
		 
		
		@PostMapping("/addRoomOption")
		public String addRoomOption(AdminOption adminOption, HttpSession session) {
			
			log.info("옵션등록 adminOption: {}", adminOption);
			
			adminOption.setRoomOptionRegistrationId("id001");
			
			optionService.addOption(adminOption);
			
			return "redirect:/admin/option/roomOptionList";
		}
		
		
		@GetMapping("/roomOptionList")
		public String roomOptionList(Model model) {
		
			log.info("객실옵션리스트 조회");
			List<AdminOption> optionList = optionService.getOptionList();
			log.info("optionList : {}" , optionList);
			
			model.addAttribute("pageTitle", "객실옵션리스트 조회");
			model.addAttribute("optionList", optionList);
			
			return "admin/option/get_room_option";
		}
		
		/*
		@PostMapping("/searchOption")
		@ResponseBody
		public List<AdminOption> searchOption(@RequestBody List<Map<String, Object>> paramList){
			
			log.info("paramList:{}" , paramList);
			paramList.forEach(searchMap -> {
				String searchKey = (String) searchMap.get("searchKey");
				switch(searchKey) {
					case "roomOptionCate" -> searchKey = "room_option_cate";
				}
				searchMap.put("searchKey", searchKey);
			});
			log.info("paramList:{}" , paramList);
			
			List<AdminOption> optionList = optionService.getSearchOption(paramList);
			return optionList;
		}
		*/
}











