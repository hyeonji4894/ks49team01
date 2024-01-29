package ks49team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller("/adminMainController")
@RequestMapping("/admin")
public class MainController {
	
	//private final AdminRoomService roomService;

	@GetMapping(value={"","/"})
	public String mainPage() {
		
		return "admin/main";
	}
	
	/*
	 * @GetMapping("/roomInfo") public String roomInfo(Model model) {
	 * 
	 * List<AdminRoom> roomInfoList = roomService.getRoomInfoList();
	 * 
	 * log.info("객실목록: {}", roomInfoList);
	 * 
	 * model.addAttribute("service", "객실정보"); model.addAttribute("serviceUri",
	 * "/admin/room"); model.addAttribute("pageTitle", "객실정보조회");
	 * model.addAttribute("roomInfoList", roomInfoList);
	 * 
	 * return "admin/main"; }
	 */
}
