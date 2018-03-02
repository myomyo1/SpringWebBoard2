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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserDaoTest {
	@Autowired
	private UserDao userDao;
	
	//회원가입 테스트
	@Test
	public void testUserJoin() throws Exception{
//		UserDTO userVO = new UserDTO();
//		userVO.setEmail("testMail");
//		userVO.setUserid("mhso");
//		userVO.setUserpw("mhso");
//		userVO.setUsername("testName");
//		
//		userDao.insertUser(userVO);
		//userDao.deleteUser(userVO.getUserid());
	}
	//로그인 테스트
	@Test
	public void loginUser() throws Exception{
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserid("mhso");
		loginDTO.setUserpw("mhso");
		LoginVO loginVO = userDao.loginUser(loginDTO);
		
		System.out.println("loginId : " + loginVO.getUserid());
		System.out.println("loginName : " + loginVO.getUsername());
		System.out.println("loginDate : " + loginVO.getLogindate());
	}
	
}
