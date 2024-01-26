package ks49team01.branch.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.branch.dto.BranchCloseSchoolComparisonBranch;
import ks49team01.branch.service.BranchCloseSchoolComparisonBranchService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/branch/closeSchoolComparisonBranch")
@Slf4j
@AllArgsConstructor
public class BranchCloseSchoolComparisonBranchController{

	private final BranchCloseSchoolComparisonBranchService branchCloseSchoolComparisonBranchService;
	
	@GetMapping("/getCloseSchoolComparisonBranch")
	public String getCloseSchoolComparisonBranch(Model model) {
		
		
		List<BranchCloseSchoolComparisonBranch> getCloseSchoolComparisonBranch = branchCloseSchoolComparisonBranchService.getCloseSchoolComparisonBranch();
		log.info("getCloseSchoolComparisonBranch : {}", getCloseSchoolComparisonBranch);
		model.addAttribute("page", "폐교와 가맹점 사진 조회");
		model.addAttribute("getCloseSchoolComparisonBranch", getCloseSchoolComparisonBranch);
		
		return "branch/close_school_comparison_branch/close_school_comparison_branch_img_get";
	}
}