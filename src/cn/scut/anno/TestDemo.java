package cn.scut.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	@Test
	public void test(){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		User user=(User)context.getBean("user");
		System.out.println(user);
		user.show();
		
	
	}
	
	@Test
	public void testService(){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	
		UserService userService =(UserService)context.getBean("userService");
		userService.show();
	}
	
}
