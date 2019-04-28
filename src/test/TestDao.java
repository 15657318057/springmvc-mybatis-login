package test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.dao.AdminDao;
import com.edu.model.Admin;
import com.edu.service.AdminService;

public class TestDao {
	@SuppressWarnings("resource")
	@Test
	public void test1() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/spring.xml");
		AdminDao s = (AdminDao) ctx.getBean("adminDao");
		Admin list = s.login("zqq", "123456");
		System.out.println(list.getName()+"\t"+list.getSname());
	}	

}
