package ks49team01.branch.dto;

import lombok.Data;

@Data
public class RoomImgFileDto {
	private String roomImgIdx; 
	private String registrantId; 
	private String roomFileOriginalName; 
	private String roomFileNewName; 
	private String roomFileSize; 
	private String roomFilePath; 
	private String roomRegistrationDate;
}
