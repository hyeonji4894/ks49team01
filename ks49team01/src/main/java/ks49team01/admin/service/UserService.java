package ks49team01.admin.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.User;
import ks49team01.admin.mapper.UserMapper;
import lombok.AllArgsConstructor;
@Service
@Transactional
@AllArgsConstructor
public class UserService {
	
	private final UserMapper userMapper;

	public List<User> getuserList(){
		return userMapper.getuserList();
		
	}

	public List<User> getSearchForUserList(Map<String, Object> searchMap) {
		// TODO Auto-generated method stub
		return userMapper.getSearchForUserList(searchMap);
	}


}
