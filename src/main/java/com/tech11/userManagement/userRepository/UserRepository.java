package com.tech11.userManagement.userRepository;

import java.util.ArrayList;
import java.util.List;

import com.tech11.userManagement.users.User;

public class UserRepository {
	
	
	private static List<User> users = new ArrayList<>();
	static {
		try {
			users.add(new User(101,"Bibek","Thapaliya","09/09/1990","bvek@gmail.com"));
			users.add(new User(102,"Rocky","Muller","02/06/2000","rockyk@gmail.com"));
			users.add(new User(103,"James","lewis","03/11/1996","james@hotmail.com"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//UserList
	public List<User> getUsers(){
		return users;
	}
	//Specific User by ID
	public User getUser(int id) {
		try {
			for(User u:users) {
				if(u.getId()==id)
					return u;
			}
		}catch(Exception e) {
			
			e.printStackTrace();
		}
			
			return null;
	}
	//AddUser
	public User createUser(User u1) {
		// TODO Auto-generated method stub
			users.add(u1);
			return u1;
	}
	//UserUpdate
	public User updateUser(User u1,int id) {
		try {
			int indexOfUser = users.indexOf(u1);
			
			if(indexOfUser>=0) {
				System.out.println("User is updated:"+u1.getId());
				users.set(indexOfUser,u1);
				return u1;
			}
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	//DeleteUser
	public void deleteUser(int id,User u1) {
		
		System.out.println("Deleted Value:" + id);
		if(u1.getId()==id) {
			users.remove(u1);
		}
		
	}
	
	
	

}
