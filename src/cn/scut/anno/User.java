package cn.scut.anno;

import org.springframework.stereotype.Component;


@Component(value="user")
public class User {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void show() {
		System.out.println("hello:" + username);

	}
}
