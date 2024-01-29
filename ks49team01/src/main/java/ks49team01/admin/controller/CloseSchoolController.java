package ks49team01.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import ks49team01.admin.dto.AdminCloseSchool;
import ks49team01.admin.mapper.AdminCloseSchoolMapper;
import ks49team01.admin.service.AdminCloseSchoolService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/admin/closeSchool")
@Slf4j
@AllArgsConstructor
public class CloseSchoolController{

	//의존성 주입 완료
	private final AdminCloseSchoolService adminCloseSchoolService;
	
	private final AdminCloseSchoolMapper adminCloseSchoolMapper;
	
// 폐교 삭제 개념은 존재 하지 않음.	
// 필요할 시 작성
	
//	페교 목록 Controller
	
	@GetMapping("/getCloseSchool")
	public String getCloseSchool(Model model) {
		
		List<AdminCloseSchool> closeSchoolList = adminCloseSchoolService.getCloseSchool();
		log.info("closeSchoolList:{}",closeSchoolList);
		model.addAttribute("page", "폐교목록 조회");
		model.addAttribute("closeSchoolList", closeSchoolList);
		return "admin/close_school/close_school_get";
	}	
	
 //폐교 등록 Controller
	
	@GetMapping("/addCloseSchool")
	public String addCloseSchool(Model model) {
		
		model.addAttribute("page", "폐교 등록");
		log.info("addCloseSchool");
		
		return "admin/close_school/close_school_add";	
	}
	
//페교 수정
	/**
	 * 문제 1. closeSchoolName : undefined 값임
	 * 해결 -> closeSchool.html에서 closeSchoolList에 data-close-school-name 값을 바인딩 하지 않았음
	 *  input 에 넣은 data-?-?와 클릭 시 검색되는 버튼
	 *  const closeSchoolName = $('.check:checked').data('closeSchoolName')
				location.href = `/admin/closeSchool/modifyCloseSchoolInfo?closeSchoolName=${closeSchoolName}`;
				이 부분과 일치시켜야 한다
	 * 
	 * */
	
	@PostMapping("/modifyCloseSchoolInfo")
	public String modifyCloseSchoolInfo(AdminCloseSchool adminCloseSchool, HttpSession session) {
			
		log.info("adminCloseSchool폐교 수정 : {}", adminCloseSchool);
		adminCloseSchoolService.modifyCloseSchoolInfo(adminCloseSchool);
		
		return "redirect:/admin/close_school/modifyCloseSchoolInfo";
	}
	
	@GetMapping("/modifyCloseSchoolInfo")
	public String modifyCloseSchoolInfo(@RequestParam(value = "closeSchoolName")String closeSchoolName, Model model) 
	{
		
		log.info("closeSchoolName : {}", closeSchoolName);
		
		//
		AdminCloseSchool closeSchoolInfo = adminCloseSchoolService.getCloseSchoolInfoByName(closeSchoolName);
		
		model.addAttribute("closeSchoolInfo", closeSchoolInfo);
		log.info("closeSchoolInfo : {}", closeSchoolInfo);
		return "admin/close_school/close_school_modify";	
 
		
	}
	
	
	/*
	 * @PostMapping("/getCloseSchool") public String getCloseSchool() {
	 * 
	 * return null; }
	 */	
	@PostMapping("/addCloseSchool")
	public String addCloseSchool(AdminCloseSchool closeSchoolList, HttpSession session) {
		
		
		log.info("closeSchoolList : {}, session : {}", closeSchoolList, session);
		
		adminCloseSchoolService.addCloseSchool(closeSchoolList);
		
		return "redirect:/admin/closeSchool/getCloseSchool";
	 
		
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
	
	
	//폐교명 검색
	@PostMapping("/getCloseSchoolSearch")
	@ResponseBody
	public List<AdminCloseSchool> getCloseSchoolSearch(@RequestParam(value="searchValue") String searchValue) {
		List<AdminCloseSchool> searchSchoolList = adminCloseSchoolMapper.getCloseSchoolSearch(searchValue);
		return searchSchoolList;
	}
	
	
	//전체 검색
	@PostMapping("/getCloseSchoolSearchTotal")
	@ResponseBody
	public List<AdminCloseSchool> getCloseSchoolSearchTotal(@RequestBody List<Map<String, Object>> paramList) {
		log.info("paramList : {}", paramList);
		if(paramList != null) {
			paramList.forEach(paramMap -> {
				String searchKey = (String) paramMap.get("searchKey");
				switch (searchKey) {
					case "closeSchoolName" -> searchKey = "close_school_name"; 
					case "constractStatus" -> searchKey = "branch_current_situation"; 
				}
				paramMap.put("searchKey",searchKey);
			});
		}
		log.info("paramList : {}", paramList);
		List<AdminCloseSchool> searchSchoolList = adminCloseSchoolMapper.getCloseSchoolSearchTotal(paramList);
		return searchSchoolList;
	}
	
}
