package cn.scut.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value="userService")
public class UserService {
	
//	@Autowired
//	private UserDao userDao;
	@Resource(name="userDao")
	private UserDao userDao;
	
	public void show(){
		System.out.println("service............");
		userDao.show();
	}
}
