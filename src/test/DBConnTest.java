package test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/beans.xml")
public class DBConnTest {
	
	@Autowired
	DataSource dbInfo55;
	
	@Autowired
	DataSource dbInfo60;
	
	@Test
	public void dataConnection() {
		try {
			System.out.println(dbInfo55.getConnection());
			System.out.println(dbInfo60.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
