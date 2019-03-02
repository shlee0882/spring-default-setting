package user.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.dao.UserDao;
import user.vo.UserVO;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	
	@Override
	public UserVO getUser(String id) {
		return userdao.getUser(id);
	}

	@Override
	public List<UserVO> getUserList() {
		return userdao.getUserList();
	}

	@Override
	public int updateUser(UserVO userVO) {
		return userdao.updateUser(userVO);
	}

	@Override
	public void insertUser(UserVO user) {
		userdao.insert(user);
	}




}
