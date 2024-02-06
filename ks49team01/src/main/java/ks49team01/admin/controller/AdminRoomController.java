package ks49team01.admin.controller;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import ks49team01.admin.dto.AdminRoom;
import ks49team01.admin.mapper.AdminRoomMapper;
import ks49team01.admin.service.AdminRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin/room")
@AllArgsConstructor
public class AdminRoomController {
	
	private final AdminRoomService roomService;
	private final AdminRoomMapper roomMapper;
	
	
	
	@PostMapping("/removeRoomInfo")
	@ResponseBody
	public String removeRoomInfo(@RequestBody List<String> paramList){
		
		log.info("객실삭제 : {}" , paramList);
		roomService.removeRoomInfo(paramList);
		return "admin/room/remove_room_info";
		
	}
	
	
	
	@PostMapping("/modifyRoomInfo")
	public String modifyRoomInfo(AdminRoom adminRoom, HttpSession session ) {
		log.info("객실수정 : {}" , adminRoom);
		
		// 특정코드로 수정
		roomService.modifyRoomInfo(adminRoom);
		
		return "redirect:/admin/room/roomInfo";
	}
	
	@GetMapping("/modifyRoomInfo")
	public String modifyRoomInfo(@RequestParam(value = "roomCode")String roomCode
								,Model model) {
		
		log.info("수정화면 roomCode : {}", roomCode);
		
		//  특정코드 조회
		AdminRoom roomInfo = roomService.getRoomInfoByCode(roomCode);
		
		model.addAttribute("roomInfo", roomInfo);
		
		return "admin/room/modify_room_info";
	}
	
	
	@GetMapping("/addRoomInfo")
	public String addRoomInfo(Model model) {
		List<Map<String, Object>> branchList = roomMapper.getBranchList();
		model.addAttribute("branchList", branchList);
		
		return "admin/room/add_room_info";
	}
	
	@PostMapping("/addRoomInfo")
	public String addRoomInfo(AdminRoom adminRoom, HttpSession session) {
		
		log.info("객실등록 adminRoom: {}",adminRoom);
		
		// 관리자 로그인 가능할 때 사용
		//String sessionId = (String) session.getAttribute("SID");
		//adminRoom.setRegistrantId(sessionId);
		
		adminRoom.setRegistrantId("id001");
		
		roomService.addRoom(adminRoom);
		
		return "redirect:/admin/room/roomInfo";
	}
	
	@PostMapping("/searchRoomInfo")
	@ResponseBody
	public List<AdminRoom> searchRoomInfo(@RequestBody List<Map<String, Object>> paramList){
		
		log.info("검색 조건 선택:{}" , paramList);
		paramList.forEach(searchMap -> {
			String searchKey = (String) searchMap.get("searchKey");
			switch (searchKey) {
				case "branchName" -> searchKey = "bm.branch_name";
				case "roomPrice" -> searchKey = "ri.room_basic_price";
			}
			searchMap.put("searchKey", searchKey);
		});
		log.info("선택 조건 검색:{}" , paramList);
		
		List<AdminRoom> searchByRoom = roomService.getSearchByRoom(paramList);
		return searchByRoom;
		
	}
	
	@GetMapping("/roomInfo")
		public String roomInfo(Model model) {
		
		List<AdminRoom> roomInfoList = roomService.getRoomInfoList();
		
		log.info("객실목록: {}", roomInfoList);
		
		model.addAttribute("service", "객실정보");
		model.addAttribute("serviceUri", "/admin/room");
		model.addAttribute("pageTitle", "객실정보조회");
		model.addAttribute("roomInfoList", roomInfoList);
		
		return "admin/room/get_room_info";
	}
	
	// modal search roomName
	@PostMapping("/searchRoomName")
	@ResponseBody
	public List<AdminRoom> searchRoomName(@RequestParam(value="searchBranchName") String searchBranchName){
		
		log.info("검색 매장명:{}" , searchBranchName);
		List<AdminRoom> roomSearchList = roomMapper.getRoomInfoSearch(searchBranchName);
		
		return roomSearchList;
		
	}
	
	
}
