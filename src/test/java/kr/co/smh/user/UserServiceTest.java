package kr.co.smh.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.smh.dao.user.UserDao;
import kr.co.smh.domain.user.dto.LoginDTO;
import kr.co.smh.domain.user.dto.UserDTO;
import kr.co.smh.domain.user.vo.LoginVO;
import kr.co.smh.service.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserServiceTest {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserService userService;
	//회원가입 테스트
//	@Test
//	public void testUserJoinService() throws Exception{
//		UserDTO userVO = new UserDTO();
//		userVO.setEmail("testMail");
//		userVO.setUserid("testId");
//		userVO.setUserpw("testpw");
//		userVO.setUsername("testName");
//		
//		userService.joinUser(userVO);
//		userDao.deleteUser(userVO.getUserid());
//	}
	//로그인 테스트
	@Test
	public void loginUserService() throws Exception{
		
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserid("testId");
		loginDTO.setUserpw("testpw");
		LoginVO loginVO = userService.loginUser(loginDTO);
		
		System.out.println("loginId : " + loginVO.getUserid());
		System.out.println("loginName : " + loginVO.getUsername());
		System.out.println("loginDate : " + loginVO.getLogindate());
		
	}
}