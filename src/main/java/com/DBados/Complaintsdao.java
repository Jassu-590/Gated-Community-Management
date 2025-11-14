package com.DBados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.models.Complaints;
import com.models.User;
import com.utils.Constants;
import com.utils.DBConnection;

public class Complaintsdao {

	public void insertComplaint(Complaints c1) {
		Connection connection;
		try {
			
			DBConnection d = new DBConnection();
			connection =d.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.COMPLAINT_INSERT);
			statement.setString(1,c1.getName());
			statement.setString(2,c1.getFlatNo());
			statement.setString(3, c1.getEmail());
			statement.setString(4,c1.getMobile());
			statement.setString(5,c1.getComplaintType());
			statement.setString(6,c1.getUrgencyLevel());
			statement.setString(7,c1.getComplaintDesp());
			statement.executeUpdate();
			
		}
		catch( ClassNotFoundException| SQLException  e) {
			e.printStackTrace();
		}
	}
	
	public List<Complaints> fetchComplaints(String name) {
		Connection connection;
		List<Complaints> complaints = new ArrayList<>();
		name = name+"@gmail.com";
		try {
			
			DBConnection d = new DBConnection();
			connection =d.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.COMPLAINTS_LIST);
			statement.setString(1, name);
			ResultSet res = statement.executeQuery();
			while(res.next()) {
				int cid = res.getInt(1);
				String pname = res.getString(2);
				String floorno = res.getString(3);
				String email = res.getString(4);
				String mobile = res.getString(5);
				String ctype = res.getString(6);
				String ulevel = res.getString(7);
				String desp = res.getString(8);
				String status = res.getString(9);
				Complaints c = new Complaints(cid,pname,floorno,email,mobile,ctype,ulevel,status);
				complaints.add(c);
			}
				
		}
		catch( ClassNotFoundException| SQLException  e) {
			e.printStackTrace();
		}
		return complaints;
	}
	
	public Complaints viewComplaint(String id) {
		Connection connection;
		int id1 = Integer.parseInt(id);
		Complaints c = new Complaints();
		try {
			
			DBConnection d = new DBConnection();
			connection =d.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.VIEW_COMPLAINT);
			statement.setInt(1,id1);
			ResultSet res = statement.executeQuery();
			while(res.next()) {
				int cid = res.getInt(1);
				String pname = res.getString(2);
				String floorno = res.getString(3);
				String email = res.getString(4);
				String mobile = res.getString(5);
				String ctype = res.getString(6);
				String ulevel = res.getString(7);
				String desp = res.getString(8);
				String status = res.getString(9);
				c.setCid(cid);
				c.setName(pname);
				c.setFlatNo(floorno);c.setEmail(email);c.setMobile(mobile);c.setComplaintType(ctype);
				c.setUrgencyLevel(ulevel);c.setComplaintDesp(desp);c.setCid(cid);
			}
				
		}
		catch( ClassNotFoundException| SQLException  e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	public void updateComplaint(Complaints c1) {
		Connection connection;
		try {
			
			DBConnection d = new DBConnection();
			connection =d.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.UPDATE_RETRIEVE);
			statement.setString(1,c1.getName());
			statement.setString(2,c1.getFlatNo());
			statement.setString(3,c1.getMobile());
			statement.setString(4,c1.getComplaintType());
			statement.setString(5,c1.getUrgencyLevel());
			statement.setString(6,c1.getComplaintDesp());
			statement.setInt(7,c1.getCid());
			statement.executeUpdate();
			
		}
		catch( ClassNotFoundException| SQLException  e) {
			e.printStackTrace();
		}
	}
	
	public void deleteComplaint(int id) {
		Connection connection;
		try {
			
			DBConnection d = new DBConnection();
			connection =d.getConnection();
			PreparedStatement statement = connection.prepareStatement(Constants.DELETE_COMPLAINT);
			statement.setInt(1,id);
			statement.executeUpdate();
			
		}
		catch( ClassNotFoundException| SQLException  e) {
			e.printStackTrace();
		}
	}
	
}
