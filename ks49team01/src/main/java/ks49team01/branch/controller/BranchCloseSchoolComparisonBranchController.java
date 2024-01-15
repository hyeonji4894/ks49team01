package ks49team01.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/branch/closeSchoolComparisonBranch")
@Slf4j
public class BranchCloseSchoolComparisonBranchController{

	
	@GetMapping("/getCloseSchoolComparisonBranch")
	public String getCloseSchoolComparisonBranch(Model model) {

		log.info("getCloseSchoolComparisonBranch");
		model.addAttribute("page", "폐교와 가맹점 사진 조회");
		
		return "branch/close_school_comparison_branch/close_school_comparison_branch_img_get";
	}
}