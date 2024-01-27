package ks49team01.branch.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.branch.dto.BranchCloseSchool;
import ks49team01.branch.service.BranchCloseSchoolService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/branch/closeSchool")
@Slf4j
@AllArgsConstructor
public class BranchCloseSchoolController{

	private final BranchCloseSchoolService branchCloseSchoolService;
	
	@GetMapping("/getCloseSchool")
	public String getCloseSchool(Model model) {
		
		List<BranchCloseSchool> branchCloseSchoolList = branchCloseSchoolService.getBranchCloseSchoolList();
		log.info("branchCloseSchoolList : {}", branchCloseSchoolList);
		model.addAttribute("page", "폐교목록 조회");
		model.addAttribute("branchCloseSchoolList",branchCloseSchoolList);
		return "branch/close_school/close_school_get";
	}	
	
	@GetMapping("/getCloseSchoolImg")
	public String getCloseSchoolImg(Model model) {

		log.info("getCloseSchoolImg");
		model.addAttribute("page", "폐교 이미지 조회");
		
		return "branch/close_school/close_school_img_get";
	}	
}
