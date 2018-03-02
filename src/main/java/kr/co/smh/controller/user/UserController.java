package kr.co.smh.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.smh.domain.user.dto.LoginDTO;
import kr.co.smh.domain.user.vo.LoginVO;
import kr.co.smh.service.user.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//로그인 처리
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String doLogin(Model model, LoginDTO loginDTO) throws Exception{
		LoginVO loginVO = userService.loginUser(loginDTO);
		model.addAttribute("login", loginVO);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/logout")
	public String doLogout(HttpServletRequest request){
		request.getSession().invalidate();
		return "redirect:/";
	}
	
}
