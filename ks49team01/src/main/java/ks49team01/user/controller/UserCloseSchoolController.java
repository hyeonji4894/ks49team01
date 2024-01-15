package ks49team01.user.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequestMapping("user/closeSchool")
@Slf4j
public class UserCloseSchoolController{


	@GetMapping("/getCloseSchool")
	public String getCloseSchool(Model model) {
		
		log.info("getCloseSchool");
		model.addAttribute("page", "폐교목록 조회");
		
		return "user/close_school/close_school_get";
	}	
	
	@GetMapping("getCloseSchoolImg")
	public String getCloseSchoolImg(Model model) {

		log.info("getCloseSchoolImg");
		model.addAttribute("page", "폐교 이미지 조회");
		
		return "user/close_school/close_school_img_get";
	}	
}
