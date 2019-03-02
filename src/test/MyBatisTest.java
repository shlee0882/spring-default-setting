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
	
	// service�� ȣ���ؼ� serviceImpl -> dao -> daoImpl -> mapper ����� �� �������� ���� Ȯ��
	// controller�� �����ؼ� service�� ȣ���ϸ� �ȴ�.
	
	@Test @Ignore
	public void getUser() {
		UserVO user = userService.getUser("shlee0882");
		System.out.println("����� �˻� : "+user);
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
		UserVO userVO = new UserVO("shlee0882","������","����","����");
		int cnt = 0;
		cnt = userService.updateUser(userVO);
		if(cnt==0) System.out.println("update ����"); else System.out.println("update ����");
	}
	
	@Test @Ignore
	public void updateUser2() {
		UserVO user = new UserVO("shlee01", "������", "����", "���ǵ�");
		int cnt = sqlSession.update("userNS.updateUser",user);
		System.out.println("������Ʈ : "+cnt);
	}
	
	@Test @Ignore
	public void deleteUser() {
		int cnt = sqlSession.delete("userNS.deleteUser","shlee04");
		System.out.println("���� : " +cnt);
	}
	
	@Test @Ignore
	public void insert() {
		UserVO user = new UserVO("shlee04", "�̻���", "����", "�Ҽ�");
		int cnt = sqlSession.insert("userNS.insertUser",user);
		System.out.println("�μ�Ʈ : " +cnt);
	}
	
}
