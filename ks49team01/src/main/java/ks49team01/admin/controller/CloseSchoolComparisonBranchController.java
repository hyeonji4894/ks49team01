package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/admin/closeSchoolComparisonBranch")
@Slf4j
public class CloseSchoolComparisonBranchController{
	
	@GetMapping("/addCloseSchoolComparisonBranch")
	public String addCloseSchoolComparisonBranch(Model model){
		
		log.info("addCloseSchoolComparisonBranch");
		model.addAttribute("page", "폐교와 가맹점 사진 등록");
		
		return"admin/close_school_comparison_branch/close_school_comparison_branch_img_add";
	}
	
	@GetMapping("/getCloseSchoolComparisonBranch")
	public String getCloseSchoolComparisonBranch(Model model) {

		log.info("getCloseSchoolComparisonBranch");
		model.addAttribute("page", "폐교와 가맹점 사진 조회");
		
		return "admin/close_school_comparison_branch/close_school_comparison_branch_img_get";
	}
	
	@GetMapping("/modifyCloseSchoolComparisonBranch")
	public String modifyCloseSchoolComparisonBranch(Model model) {

		log.info("modifyCloseSchoolComparisonBranch");
		model.addAttribute("page", "폐교와 가맹점 사진 수정");
		
		return "admin/close_school_comparison_branch/close_school_comparison_branch_img_modify";
	}
	
	@GetMapping("/removeCloseSchoolComparisonBranch")
	public String removeCloseSchoolComparisonBranch(Model model) {

		log.info("removeCloseSchoolComparisonBranch");
		model.addAttribute("page", "폐교와 가맹점 사진 삭제");
	
		return "admin/close_school_comparison_branch/close_school_comparison_branch_img_remove";
	}
}
