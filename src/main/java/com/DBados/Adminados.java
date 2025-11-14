package com.DBados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.models.Admin;
import com.models.Complaints;
import com.utils.Constants;
import com.utils.DBConnection;

public class Adminados {
	
	public boolean adminLogin(Admin a) {
		Connection connection;
		try {
			DBConnection db = new DBConnection();
			 connection = db.getConnection();
			 PreparedStatement statement = connection.prepareStatement(Constants.ADMIN_LOGIN);
			 statement.setString(1, a.getUserName());
			 ResultSet res = statement.executeQuery();
			 String username= null;
			 String password = null;
			 while(res.next()) {
				 username= res.getString(1);
				 password = res.getString(2);
			 }
			 return a.getUserName().equals(username) && a.getPassword().equals(password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Complaints> adminData() {
		Connection connection;
		List<Complaints> complaints = new ArrayList<>();
		try {
			DBConnection db = new DBConnection();
			 connection = db.getConnection();
			 PreparedStatement statement = connection.prepareStatement(Constants.ADMINDATA);
			 ResultSet res = statement.executeQuery();
			 while(res.next()) {
				int cid= res.getInt(1);
				String name = res.getString(2);
				String flat = res.getString(3);
				String email = res.getString(4);
				String mobile = res.getString(5);
				String ctype = res.getString(6);
				String urgency = res.getString(7);
				String desc = res.getString(8);
				String status = res.getString(9);
				
				Complaints c = new Complaints(cid,name,flat,email,mobile,ctype,urgency,desc,status);
				complaints.add(c);
			 }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return complaints;
	}
	
	public Complaints viewStatus(int id) {
		Connection connection;
		Complaints c = new Complaints();
		try {
			DBConnection db = new DBConnection();
			 connection = db.getConnection();
			 PreparedStatement statement = connection.prepareStatement(Constants.ADMINSTATUS);
			 statement.setInt(1, id);
			 ResultSet res = statement.executeQuery();
			 while(res.next()) {
				int cid= res.getInt(1);
				String name = res.getString(2);
				String flat = res.getString(3);
				String email = res.getString(4);
				String mobile = res.getString(5);
				String ctype = res.getString(6);
				String urgency = res.getString(7);
				String desc = res.getString(8);
				String status = res.getString(9);
				
				c.setCid(cid);c.setName(name);c.setFlatNo(flat);c.setMobile(mobile);
				c.setComplaintType(ctype);c.setUrgencyLevel(urgency);c.setComplaintDesp(desc);c.setStatusid(status);
			 }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	public void updateStatus(int id,String status) {
		Connection connection;
		try {
			DBConnection db = new DBConnection();
			 connection = db.getConnection();
			 PreparedStatement statement = connection.prepareStatement(Constants.UPDATESTATUS);
			 statement.setString(1, status);
			 statement.setInt(2, id);
			 statement.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
