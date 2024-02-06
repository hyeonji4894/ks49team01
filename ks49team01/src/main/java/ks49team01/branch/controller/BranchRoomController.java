package ks49team01.branch.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;
import ks49team01.branch.dto.BranchRoom;
import ks49team01.branch.mapper.BranchRoomMapper;
import ks49team01.branch.service.BranchRoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/branch/room")
public class BranchRoomController {

	private final BranchRoomService roomService;
	private final BranchRoomMapper roomMapper;

	
	@GetMapping("/removeRoomInfo")
	public String removeRoomInfo(Model model) {
		
		log.info("객실삭제");
		
		model.addAttribute("pageTitle", "객실삭제");
		
		return "branch/room/remove_room_info";
	}
	
	@PostMapping("/modifyRoomInfo")
	public String modifyRoomInfo(BranchRoom branchRoom, HttpSession session) {
		log.info("객실수정 : {}" , branchRoom);
		
		// 특정코드로 수정
		roomService.modifyRoomInfo(branchRoom);
		
		return "redirect:/branch/room/roomInfo";
	}
	
	@GetMapping("/modifyRoomInfo")
	public String modifyRoomInfo (@RequestParam(value = "roomCode")String roomCode
								  ,Model model) {
		
	log.info("수정화면 roomCode : {}", roomCode);
	
	// 특정코드 조회
	BranchRoom roomInfo = roomService.getRoomInfoByCode(roomCode);
		
		model.addAttribute("roomInfo", roomInfo);
		
		return "branch/room/modify_room_info";
	}
	
	
	@GetMapping("/addRoomInfo")
	public String addRoomInfo(Model model) {
		List<Map<String, Object>> branchList = roomMapper.getBranchList();
		model.addAttribute("branchList", branchList);
		
		return "branch/room/add_room_info";
	}
	
	@PostMapping("/addRoomInfo")
	public String addRoomInfo(BranchRoom branchRoom
							, HttpSession session
							, @RequestPart(value = "uploadFile", required = false) MultipartFile[] uploadfile) {
		
		log.info("객실등록 branchRoom: {}", branchRoom);
		
		//String sessionId = (String) session.getAttribute("SID");
		//adminRoom.setRegistrantId(sessionId);
		
		branchRoom.setRegistrantId("id001");
		
		roomService.addRoom(branchRoom, uploadfile);
		
		return "redirect:/branch/room/roomInfo";
	}
	
	@PostMapping("/searchRoomInfo")
	@ResponseBody
	public List<BranchRoom> searchRoomInfo(@RequestBody List<Map<String, Object>> paramList){
		
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
		
		List<BranchRoom> searchByRoom = roomService.getSearchByRoom(paramList);
		return searchByRoom;
		
	}	
	
	// modal search roomName
	@PostMapping("/searchRoomName")
	@ResponseBody
	public List<BranchRoom> searchRoomName(@RequestParam(value="searchBranchName") String searchBranchName){
		
		log.info("검색 매장명:{}" , searchBranchName);
		List<BranchRoom> roomSearchList = roomMapper.getRoomInfoSearch(searchBranchName);
		
		return roomSearchList;
		
	}
	
	
	@GetMapping("/roomInfo")
		public String roomInfo(Model model) {
		
		log.info("객실정보조회");
		List<BranchRoom> roomInfoList = roomService.getRoomInfoList();
		
		model.addAttribute("pageTitle", "객실정보조회");
		model.addAttribute("roomInfoList", roomInfoList);
		
		return "branch/room/get_room_info";
	}	
	
	
}
