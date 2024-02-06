package ks49team01.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CommonContoroller {
	
	@GetMapping(value = {"","/"})
	public String index() {
		
		return "common/index";
	}
	
	/**
	 * 템플릿 경로 PAGE1
	 * @return
	 */
	@GetMapping("/common/page1")
	public String page1() {
		return "admin/refer_page/page1";
	}
	/**
	 * 템플릿 경로 PAGE2
	 * @return
	 */
	@GetMapping("/common/page2")
	public String page2() {
		return "admin/refer_page/page2";
	}
}
