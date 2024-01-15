package ks49team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.admin.dto.AdminCloseSchool;
import ks49team01.admin.mapper.AdminCloseSchoolMapper;
import ks49team01.admin.service.AdminCloseSchoolService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/admin/closeSchool")
@AllArgsConstructor
@Slf4j
public class CloseSchoolController{

	//의존성 주입 완료
	private AdminCloseSchoolService adminCloseSchoolService;
//	페교 목록 Controller
	
	@GetMapping("/getCloseSchool")
	public String getCloseSchool(Model model) {
		
		List<AdminCloseSchool> closeSchoolList = adminCloseSchoolService.getCloseSchool();
		log.info("closeSchoolList");
		model.addAttribute("page", "폐교목록 조회");
		model.addAttribute("closeSchoolList", closeSchoolList);
		return "admin/close_school/close_school_get";
	}	
	
	@GetMapping("/modifyListCloseShool")
	public String modifyListCloseShool(Model model) {
		
		log.info("modifyListCloseShool");
		model.addAttribute("page", "폐교목록 수정");
		
		return "admin/close_school/close_school_modify";
	}
	
// 폐교 조감도 이미지 Controller	
	
	@GetMapping("/addCloseSchoolViewMap")
	public String addCloseSchoolViewMap(Model model) {
		
		log.info("addCloseSchoolViewMap");

		model.addAttribute("page", "폐교 조감도 이미지 등록");
		
		return "admin/close_school/close_school_view_map_add";
	}

	@GetMapping("/modifyCloseSchoolViewMap")
	
	public String modifyCloseSchollViewMap(Model model) {
	
		log.info("modifyCloseSchoolViewMap");
		model.addAttribute("page", "폐교 조감도 이미지 수정");
		
		return "admin/close_school/close_school_view_map_modify";
	}
	
	@GetMapping("/removeCloseSchoolViewMap")
	
	public String removeCloseSchoolViewMap(Model model) {
		
		log.info("removeCloseSchoolViewMap");
		model.addAttribute("page", "폐교 조감도 이미지 삭제");
		
		return "admin/close_school/close_school_view_map_remove";
	}
	
//폐교 이미지 Controller
	
	@GetMapping("/addCloseSchoolImg")
	public String addCloseSchoolImg(Model model) {
		
		log.info("addCloseSchoolImg");
		model.addAttribute("page", "폐교 이미지 등록");
		
		return "admin/close_school/close_school_img_add";
	}
	
	@GetMapping("/modifyCloseSchoolImg")
	public String modifyCloseSchoolImg(Model model) {
		
		log.info("modifyCloseSchoolImg");
		model.addAttribute("page", "폐교 이미지 수정");
		
		return "admin/close_school/close_school_img_modify";
	}
	
	@GetMapping("/getCloseSchoolImg")
	public String getCloseSchoolImg(Model model) {

		log.info("getCloseSchoolImg");
		model.addAttribute("page", "폐교 이미지 조회");
		
		return "admin/close_school/close_school_img_get";
	}	
}
