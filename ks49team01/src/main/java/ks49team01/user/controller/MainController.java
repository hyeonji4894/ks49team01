package ks49team01.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks49team01.user.dto.UserRoom;
import ks49team01.user.service.UserRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Controller("/userMainController")
@RequestMapping("/user")
public class MainController {

	private final UserRoomService roomService;
	
	@GetMapping(value={"","/"})
	public String mainPage(Model model) {
		
		List<UserRoom> roomList = roomService.getRoomList("");
		log.info("roomList:{}", roomList);
		if(roomList != null) roomList = roomList.stream().limit(8).toList();
		model.addAttribute("roomList", roomList);
		return "user/main";
	}
	
}
