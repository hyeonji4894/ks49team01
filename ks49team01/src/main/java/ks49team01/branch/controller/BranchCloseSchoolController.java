package ks49team01.branch.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("/branch/closeSchool")
@Slf4j
public class BranchCloseSchoolController{


	@GetMapping("/getCloseSchool")
	public String getCloseSchool(Model model) {
		
		log.info("getCloseSchool");
		model.addAttribute("page", "폐교목록 조회");
		
		return "branch/close_school/close_school_get";
	}	
	
	@GetMapping("/getCloseSchoolImg")
	public String getCloseSchoolImg(Model model) {

		log.info("getCloseSchoolImg");
		model.addAttribute("page", "폐교 이미지 조회");
		
		return "branch/close_school/close_school_img_get";
	}	
}
