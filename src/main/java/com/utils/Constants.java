package com.utils;

public class Constants {
	
	public static final String URL ="jdbc:mysql://localhost:3306/gatedcommunity";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	public static final String USER_SIGNUP="insert into users values(?,?)";
    public static final String USER_LOGIN = "select * from users where email=?";
    public static final String COMPLAINT_INSERT="insert into complaints (name,flatno,email,mobile,complainttype,urgencylevel,complaintdesp) values (?,?,?,?,?,?,?)";
    public static final String COMPLAINTS_LIST = "select * from complaints where email=?";
    public static final String VIEW_COMPLAINT = "select * from complaints where cid=?";
    public static final String DELETE_COMPLAINT = "delete from complaints where cid=?";
    public static final String UPDATE_RETRIEVE="update complaints set name=?,flatno=?,mobile=?,complainttype=?,urgencylevel=?,complaintdesp=? where cid=?";
    public static final String ADMIN_LOGIN="select * from admin where username=?";
    public static final String ADMINDATA="select * from complaints";
    public static final String ADMINSTATUS = "select * from complaints where cid=?";
    public static final String UPDATESTATUS="update complaints set statusid=? where cid=?";
}
