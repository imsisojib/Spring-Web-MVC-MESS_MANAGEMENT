package main.webapp.services;

import java.util.ArrayList;

import main.webapp.models.UserModel;

public class UserService {
	private ArrayList<UserModel> users = new ArrayList<>();

	public void createNewUser(String userName,String userEmail) {
		users.add(new UserModel(userName,userEmail));
	}
	
	public void showAllUser() {
		users.forEach(System.out::println);
	}
}
