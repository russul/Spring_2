package cn.scut.anno;

import org.springframework.stereotype.Component;


@Component(value="userDao")
public class UserDao {
	
	public void show(){
		System.out.println("dao........");
	}
}
