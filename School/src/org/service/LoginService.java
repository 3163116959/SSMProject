package org.service;

import org.entity.Login;

public interface LoginService {
		//登陆
		public int selectusers(Login login);
		
		//注册
		public int addusers(Login login);
}
