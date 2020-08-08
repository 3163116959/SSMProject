package org.service.impl;

import java.util.List;

import org.entity.Login;
import org.mapper.LoginMapper;
import org.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	//service调用mapper
	private LoginMapper loginMapper;
	
	public void setLoginMapper(LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}

	
	//登陆
	public int selectusers(Login login) {
//		return loginMapper.selectusers(login);
		int logins = loginMapper.selectusers(login);
		return logins;
	}

	//注册
	public int addusers(Login login) {
//		return loginMapper.addusers(login);
		return loginMapper.addusers(login);
	}

}
