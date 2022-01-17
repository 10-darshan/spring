package com.darshan.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
	private long userId;
	private String userName;
	private String userEmail;
	private long userContactNo;
	
	public User() {
		super();
	}

	public User(long userId, String userName, String userEmail, long userContactNo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userContactNo = userContactNo;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public long getUserContactNo() {
		return userContactNo;
	}

	public void setUserContactNo(long userContactNo) {
		this.userContactNo = userContactNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userContactNo="
				+ userContactNo + "]";
	}
	

}
