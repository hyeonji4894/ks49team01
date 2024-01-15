package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.User;
import ks49team01.admin.mapper.UserMapper;
import lombok.AllArgsConstructor;
@Service
@Transactional
@AllArgsConstructor
public class UserService {
	
	private UserMapper userMapper;

	public List<User> getuserLsit(){
		return userMapper.getuserLsit();
		
	}
	

}
