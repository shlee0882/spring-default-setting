package user.service;

import java.util.List;
import java.util.Map;

import user.vo.UserVO;

public interface UserService {
	
	public UserVO getUser(String id);

	public List<UserVO> getUserList();

	public int updateUser(UserVO userVO);

	public void insertUser(UserVO user);

	
}
