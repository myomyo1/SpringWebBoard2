package kr.co.smh.service.user;

import kr.co.smh.domain.user.dto.LoginDTO;
import kr.co.smh.domain.user.dto.UserDTO;
import kr.co.smh.domain.user.vo.LoginVO;

public interface UserService {

	public void 	joinUser(UserDTO userDTO) throws Exception;
	public LoginVO	loginUser(LoginDTO loginDTO) throws Exception;
	
}
