package com.hexaware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.connection.JDBCMYSQLTest;
import com.hexaware.entity.User;

public class UserServiceImpl implements IUserService{
	
	@Override
	public boolean createUser(User obj) throws SQLException {
		Connection conn= JDBCMYSQLTest.getConnection();
		boolean status=false;
		String sql = "INSERT INTO Users (user_id, username, password, email) VALUES (?,?, ?, ?)";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, obj.getUserId());
		statement.setString(2, obj.getUserName());
		statement.setString(3, obj.getPassword());
		statement.setString(4, obj.getEmail());
		 
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
		    status=true;
		}
		statement.close();
		conn.close();
		return status;
		
	}

	@Override
	public boolean updateUser(User obj) throws SQLException {
		boolean status=false;
		Connection conn= JDBCMYSQLTest.getConnection();
		String sql = "UPDATE Users SET username=?,password=?, email=? WHERE user_id=?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, obj.getUserName());
		statement.setString(2, obj.getPassword());
		statement.setString(3, obj.getEmail());
		statement.setInt(4, obj.getUserId());
		 
		int rowsUpdated = statement.executeUpdate();
		if (rowsUpdated > 0) {
		    System.out.println("An existing user was updated successfully!");
		    status=true;
		}
		statement.close();
		conn.close();
		return status;
	}

	@Override
	public List<User> displayUsers() throws SQLException {
		List<User>userList=new ArrayList<>();
		Connection conn= JDBCMYSQLTest.getConnection();
		String sql = "SELECT * FROM Users";
		
		 
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		 
		while (result.next()){
			int userId = Integer.parseInt( result.getString(1));
		    String name = result.getString(2);
		    String pass = result.getString(3);
		    String email = result.getString("email");
		    User user=new User(userId,name, pass, email);
		    userList.add(user);
		}
		result.close();
		statement.close();
		conn.close();
		return userList;
	}

	@Override
	public boolean deleteUser(int userId) throws SQLException {
		Connection conn= JDBCMYSQLTest.getConnection();
		boolean status=false;
		String sql = "DELETE FROM Users WHERE user_id=?";
		 
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, userId);
		 
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
		    System.out.println("A user was deleted successfully!");
		    status=true;
		}
		statement.close();
		conn.close();
		return status;
	}

}
