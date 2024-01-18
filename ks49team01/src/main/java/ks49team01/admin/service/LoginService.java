package ks49team01.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks49team01.admin.dto.AdminLogin;
import ks49team01.admin.mapper.LoginMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class LoginService {

	private final LoginMapper loginMapper;
	
	public List<AdminLogin> getLoginList(){
		return loginMapper.getLoginList();
	}

}
