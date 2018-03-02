package kr.co.smh.dao.user;

import kr.co.smh.domain.user.dto.LoginDTO;
import kr.co.smh.domain.user.dto.UserDTO;
import kr.co.smh.domain.user.vo.LoginVO;

public interface UserDao {
	public void insertUser(UserDTO userDTO) throws Exception;
	public void deleteUser(String userid) throws Exception;
	public LoginVO loginUser(LoginDTO loginDTO) throws Exception;
}