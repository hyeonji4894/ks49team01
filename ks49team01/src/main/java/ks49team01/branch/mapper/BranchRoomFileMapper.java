package ks49team01.branch.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ks49team01.branch.dto.RoomImgFileDto;

@Mapper
public interface BranchRoomFileMapper {

	// 파일 리스트 
	List<RoomImgFileDto> getRoomImgFileList();
	
	// 파일 정보 (idx)
	RoomImgFileDto getRoomImgFileInfoByIdx();
	
	// 파일 삽입
	int addRoomImgFile(List<RoomImgFileDto> roomImgFileList);
	
	// 파일 릴레이션 삽입
	int addRoomImgFileRelation(List<Map<String, Object>> paramList);
	
	// 파일 삭제
	int deleteRoomImgFileByIdx(String fileIdx);
	
}
