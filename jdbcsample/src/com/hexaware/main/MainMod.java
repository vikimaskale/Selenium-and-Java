package com.hexaware.main;

import java.sql.SQLException;
import java.util.List;

import com.hexaware.dao.UserServiceImpl;
import com.hexaware.entity.User;

public class MainMod {
	public static void main(String[] args) throws SQLException {
		UserServiceImpl obj=new UserServiceImpl();
		//creating and inserting user in db
//		User user1=new User(1, "Viki", "root", "viki@gmail.com");
//		User user2=new User(2, "Raj", "rj", "raj@gmail.com");
		User user3=new User(3, "Shyam", "sm", "shyam@gmail.com");
//		obj.createUser(user1);
//		obj.createUser(user2);
		obj.createUser(user3);
		
		List<User>list=obj.displayUsers();
		System.out.println(list);
		
		obj.updateUser(new User(3,"Tiger","tg","tiger@gmail.com"));
		obj.deleteUser(3);
		System.out.println(obj.displayUsers());
	}
}
