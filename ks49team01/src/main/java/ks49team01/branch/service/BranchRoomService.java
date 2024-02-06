package ks49team01.branch.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import ks49team01.branch.dto.BranchRoom;
import ks49team01.branch.dto.RoomImgFileDto;
import ks49team01.branch.mapper.BranchRoomFileMapper;
import ks49team01.branch.mapper.BranchRoomMapper;
import ks49team01.branch.util.BranchFileUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
@AllArgsConstructor
@Service
public class BranchRoomService {
	
	
	
	private final BranchFileUtil branchFileUtil;
	private final BranchRoomMapper branchRoomMapper;
	private final BranchRoomFileMapper branchRoomFileMapper;
	
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
	public void addRoom(BranchRoom branchRoom, MultipartFile[] uploadfile) {
		log.info("객실 insert 전 brnachRoom: {}", branchRoom);
		int result = 0;
		// room 등록이 완료시 int 1 증가
		result += branchRoomMapper.addRoom(branchRoom);
		// 삽입이 완료되면
		if(result > 0) {
			
			// 파일 업로드
			List<RoomImgFileDto> roomImgFileList = branchFileUtil.parseFileInfo(uploadfile);
			
			// 파일 업로드된 파일 정보 List에 담음 -> 파일이 없으면 null
			if(roomImgFileList != null) {
				// 파일 룸 릴레이션테이블에 삽입 
				List<Map<String, Object>> paramList = new ArrayList<Map<String, Object>>();
				
				// 업로드된 파일 리스트에 릴레이션 테이블에 삽입할 데이터 Map 객체에 담음
				roomImgFileList.forEach(roomImgFile -> {
					roomImgFile.setRegistrantId(branchRoom.getRegistrantId());
					Map<String, Object> paramMap = new HashMap<String, Object>();
					paramMap.put("roomCode", branchRoom.getRoomCode());
					paramMap.put("roomImgIdx", roomImgFile.getRoomImgIdx());
					paramList.add(paramMap);
				});
				
				log.info("paramList:{}", paramList);
				// 파일 테이블에 먼저 삽입
				branchRoomFileMapper.addRoomImgFile(roomImgFileList);
				// 최종 릴레이션 테이블에 정리된 List<Map> 삽입
				branchRoomFileMapper.addRoomImgFileRelation(paramList);
			}
		}
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
