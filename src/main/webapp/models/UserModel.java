package main.webapp.models;

public class UserModel {
	String userName,userEmail;

	public UserModel() {
		super();
	}

	public UserModel(String userName, String userEmail) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
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

	@Override
	public String toString() {
		
		return "User Name: "+userName+" User Email: "+userEmail;
	}
	
	
	
}
