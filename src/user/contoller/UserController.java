package user.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import user.service.UserService;
import user.vo.UserVO;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/getUser.do")
	public ModelAndView getUser(@RequestParam("id") String userid){
		// (@RequestParam�� request.getparameter�� ������̼����� ����� ������.
		UserVO userVO = userService.getUser(userid);
		return new ModelAndView("userInfo.jsp", "user", userVO);
	}
	
	@RequestMapping("/getUserList.do")
	public String getUserList(Model model) {
		List<UserVO> userList = userService.getUserList();
		model.addAttribute("userList", userList);
		// ��� �ѷ��� ��������
		return "userList.jsp";
	}
}
