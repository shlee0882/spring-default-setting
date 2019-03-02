package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import user.service.UserService;
import user.vo.UserVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/beans.xml")
public class MyBatisTest {
		
	@Autowired
	SqlSession sqlSession;
	
	@Autowired	
	UserService userService;
	
	// service를 호출해서 serviceImpl -> dao -> daoImpl -> mapper 결과를 잘 가져오는 것을 확인
	// controller를 연결해서 service를 호출하면 된다.
	
	@Test @Ignore
	public void getUser() {
		UserVO user = userService.getUser("shlee0882");
		System.out.println("사용자 검색 : "+user);
	}
	
	@Test
	public void getUserList() {
		List<UserVO> userList = userService.getUserList();
		for (UserVO userVO : userList) {
			System.out.println(userVO);
		}
	}
	
	@Test @Ignore
	public void updateUser1() {
		UserVO userVO = new UserVO("shlee0882","김지숙","여자","서울");
		int cnt = 0;
		cnt = userService.updateUser(userVO);
		if(cnt==0) System.out.println("update 실패"); else System.out.println("update 성공");
	}
	
	@Test @Ignore
	public void updateUser2() {
		UserVO user = new UserVO("shlee01", "조현영", "여자", "여의도");
		int cnt = sqlSession.update("userNS.updateUser",user);
		System.out.println("업데이트 : "+cnt);
	}
	
	@Test @Ignore
	public void deleteUser() {
		int cnt = sqlSession.delete("userNS.deleteUser","shlee04");
		System.out.println("삭제 : " +cnt);
	}
	
	@Test @Ignore
	public void insert() {
		UserVO user = new UserVO("shlee04", "이상현", "남자", "뚝섬");
		int cnt = sqlSession.insert("userNS.insertUser",user);
		System.out.println("인서트 : " +cnt);
	}
	
}
