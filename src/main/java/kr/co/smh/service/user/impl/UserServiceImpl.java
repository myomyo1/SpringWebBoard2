package kr.co.smh.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.smh.dao.user.UserDao;
import kr.co.smh.domain.user.dto.LoginDTO;
import kr.co.smh.domain.user.dto.UserDTO;
import kr.co.smh.domain.user.vo.LoginVO;
import kr.co.smh.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void joinUser(UserDTO userDTO) throws Exception {
		userDao.insertUser(userDTO);
	}

	@Override
	public LoginVO loginUser(LoginDTO loginDTO) throws Exception {
		return userDao.loginUser(loginDTO);
	}

}
