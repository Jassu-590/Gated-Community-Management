package com.DBados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.models.User;
import com.utils.Constants;
import com.utils.DBConnection;

public class SignupOrLoginados {

	
	public void userSignup(User u1) {
		Connection connection;
		try {
			
			DBConnection d = new DBConnection();
			connection =d.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.USER_SIGNUP);
			statement.setString(1, u1.getEmail());
			statement.setString(2, u1.getPassword());
			statement.executeUpdate();
		}
		catch( ClassNotFoundException| SQLException  e) {
			e.printStackTrace();
		}
	}
	
	public boolean UserLogin(User u1) {
		Connection connection;
		String email=null;
		String password = null;
		try {
			DBConnection d = new DBConnection();
			connection =d.getConnection();
			PreparedStatement res = connection.prepareStatement(Constants.USER_LOGIN);
			res.setString(1, u1.getEmail());
			ResultSet result = res.executeQuery();
			while(result.next()) {
				email = result.getString(1);
				password = result.getString(2);
			}
			
			return  u1.getEmail().equals(email) && u1.getPassword().equals(password);
			
			
		}
		catch( ClassNotFoundException| SQLException  e) {
			e.printStackTrace();
		}
		return false;
	}
}
