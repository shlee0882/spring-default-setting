package user.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import user.service.UserService;
import user.vo.UserVO;


@RestController
public class RestUserController {
	@Autowired
	UserService userService;
	
	// http://localhost:8080/Test/users/shlee0882
	// 특정 조회
	@RequestMapping(value="/users/{id}", method=RequestMethod.GET)
	public UserVO getUser(@PathVariable String id) { // {id} 와 String id를 위해 pathVariable
		return userService.getUser(id);
	}
	
	// 전체 조회
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<UserVO> getUserList() {
		return userService.getUserList();
	}
	
	// 등록
	// postman 사용시 [{"key":"Content-Type","value":"application/json"}] 설정
	/* POST http://localhost:8080/Test/users
		{
		    "userId": "shlee04",
		    "name": "이상현",
		    "gender": "남자",
		    "city": "노량진"
		}
	 */
	@RequestMapping(value="/users", method=RequestMethod.POST,
			headers= {"content-type=application/json"})
	public Boolean insertUser(@RequestBody UserVO user) {
		if(user != null) {
			userService.insertUser(user);
			return Boolean.TRUE;
		}else {
			return Boolean.FALSE;
		}
	}

	
}
