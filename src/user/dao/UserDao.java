package user.dao;

import java.util.List;
import java.util.Map;

import user.vo.UserVO;

public interface UserDao {

	public UserVO getUser(String id);

	public List<UserVO> getUserList();

	public int updateUser(UserVO userVO);

	public void insert(UserVO user);

}
