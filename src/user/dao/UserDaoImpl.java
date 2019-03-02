package user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import user.vo.UserVO;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
    private SqlSession session;
	
	@Override
	public UserVO getUser(String id) {
		UserVO user  = session.selectOne("userNS.selectUserById", id);
		return user;
	}

	@Override
	public List<UserVO> getUserList() {
		// TODO Auto-generated method stub
		List<UserVO> userList = session.selectList("userNS.selectUserList");
		return userList;
	}

	@Override
	public int updateUser(UserVO userVO) {
		int cnt = session.update("userNS.updateUser", userVO);
		return cnt;
	}

	@Override
	public void insert(UserVO user) {
		session.update("userNS.insertUser", user);
		System.out.println("µî·ÏµÈ Record UserId=" + user.getUserId() + " Name=" + user.getName());
	}

	

	

}
