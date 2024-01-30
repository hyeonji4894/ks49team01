package ks49team01.branch.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.branch.dto.BranchRoom;
import ks49team01.branch.mapper.BranchRoomMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
@AllArgsConstructor
@Service
public class BranchRoomService {
	
	private final BranchRoomMapper branchRoomMapper;
	
	// 특정코드로 객실 수정
	public void modifyRoomInfo(BranchRoom branchRoom) {
		int result = branchRoomMapper.modifyRoomInfo(branchRoom);
		if(result > 0) log.info("객실 수정 완료");
	}
	
	// 특정 코드로 객실 조회
	public BranchRoom getRoomInfoByCode(String roomCode) {
		
		BranchRoom roomInfo = branchRoomMapper.getRoomInfoByCode(roomCode);
		return roomInfo;
	}
	
	// 객실 등록
	public void addRoom(BranchRoom branchRoom) {
		log.info("객실 insert 전 brnachRoom: {}", branchRoom);
		branchRoomMapper.addRoom(branchRoom);
		log.info("객실 insert 후 brnachRoom: {}", branchRoom);
	}
	
	// 조건별 객실 조회
	public List<BranchRoom> getSearchByRoom(List<Map<String, Object>> paramList){
		return branchRoomMapper.getSearchByRoom(paramList);
	}
	
	public List<BranchRoom> getRoomInfoList(){
		
		return branchRoomMapper.getRoomInfoList();
	}

}
