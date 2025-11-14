package com.models;

public class Complaints {

	private int cid;
	
	private String name;
	
	private String flatNo;
	
	public Complaints(int cid, String name, String flatNo, String email, String mobile, String complaintType,
			String urgencyLevel, String statusid) {
		super();
		this.cid = cid;
		this.name = name;
		this.flatNo = flatNo;
		this.email = email;
		this.mobile = mobile;
		this.complaintType = complaintType;
		this.urgencyLevel = urgencyLevel;
		this.statusid = statusid;
	}
	
	public Complaints(int cid, String name, String flatNo, String email, String mobile, String complaintType,
			String urgencyLevel,String desp, String statusid) {
		super();
		this.cid = cid;
		this.name = name;
		this.flatNo = flatNo;
		this.email = email;
		this.mobile = mobile;
		this.complaintType = complaintType;
		this.urgencyLevel = urgencyLevel;
		this.complaintDesp=desp;
		this.statusid = statusid;
	}

	private String email;
	
	private String mobile;
	
	private String  complaintType;
	
	private String urgencyLevel;
	
	private String complaintDesp;
	
	private String statusid;
	
	public Complaints() {
		
	}

	public String getStatusid() {
		return statusid;
	}

	public void setStatusid(String statusid) {
		this.statusid = statusid;
	}

	public Complaints(String name, String flatNo, String email, String mobile, String complaintType,
			String urgencyLevel, String complaintDesp) {
		super();
		this.name = name;
		this.flatNo = flatNo;
		this.email = email;
		this.mobile = mobile;
		this.complaintType = complaintType;
		this.urgencyLevel = urgencyLevel;
		this.complaintDesp = complaintDesp;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public String getUrgencyLevel() {
		return urgencyLevel;
	}

	public void setUrgencyLevel(String urgencyLevel) {
		this.urgencyLevel = urgencyLevel;
	}

	public String getComplaintDesp() {
		return complaintDesp;
	}

	public void setComplaintDesp(String complaintDesp) {
		this.complaintDesp = complaintDesp;
	}

	@Override
	public String toString() {
		return "Complaints [cid=" + cid + ", name=" + name + ", flatNo=" + flatNo + ", email=" + email + ", mobile="
				+ mobile + ", complaintType=" + complaintType + ", urgencyLevel=" + urgencyLevel + ", complaintDesp="
				+ complaintDesp + "]";
	}	
	
}
