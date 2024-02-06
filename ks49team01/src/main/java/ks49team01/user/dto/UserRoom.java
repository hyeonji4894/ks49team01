package ks49team01.user.dto;

import java.util.List;

import ks49team01.branch.dto.RoomImgFileDto;
import lombok.Data;

@Data
public class UserRoom {
	
	private String roomCode;
	private String branchCode;
	private String registrantId;
	private String branchName;
	private String roomName;
	private String roomSize;
	private String roomBasicPersonnel;
	private String roomMaxPersonnel;
	private String availableDogTypes;
	private int roomBasicPrice;
	private String roomRegistrationDate;
	
	private String roomSubtotalAmount;
	private String checkIn;
	private String checkOut;
	private String numberOfStays;
	
	private List<UserRoomOption> roomOptionList;
	
	private List<RoomImgFileDto> roomImgFileList;
}
