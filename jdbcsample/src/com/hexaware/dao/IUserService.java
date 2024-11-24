package com.hexaware.dao;
import java.sql.SQLException;
import java.util.List;
import com.hexaware.entity.User;

public interface IUserService {
	boolean createUser(User obj) throws SQLException;
	boolean updateUser(User obj)throws SQLException;
	List<User> displayUsers()throws SQLException;
	boolean deleteUser(int userId)throws SQLException;
}
