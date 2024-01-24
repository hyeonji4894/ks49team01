package ks49team01.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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











