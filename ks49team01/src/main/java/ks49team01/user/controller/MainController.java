package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ks49team01.user.dto.UserRoom;
import ks49team01.user.mapper.UserRoomMapper;
import ks49team01.user.service.UserRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Controller("/userMainController")
@RequestMapping("/user")
public class MainController {

	private final UserRoomService roomService;
	private final UserRoomMapper roomMapper;
	
	@GetMapping(value={"","/"})
	public String mainPage(Model model,@RequestParam(value = "location", required = false)
							String location) {
		
		List<String> locationList = roomMapper.getLocationList();
		
		List<UserRoom> roomList = roomService.getRoomList(location);
		log.info("roomList:{}", roomList);
		if(roomList != null) roomList = roomList.stream().limit(8).toList();
		model.addAttribute("roomList", roomList);
		
		model.addAttribute("roomList",roomList);
		model.addAttribute("locationList", locationList);
		
		return "user/main";
	}
	
	@GetMapping("/account/myPage")
	public String myPage(Model model) {
		
		model.addAttribute("pageTitle", "마이페이지");
		return "user/account/my_page";
	}
	
	
}
