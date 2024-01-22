package ks49team01.branch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ks49team01.branch.dto.BranchRoom;
import ks49team01.branch.mapper.BranchRoomMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BranchRoomService {
	
	private final BranchRoomMapper branchRoomMapper;
	
	public List<BranchRoom> getRoomInfoList(){
		
		return branchRoomMapper.getRoomInfoList();
	}

}
