package com.tech11.userManagement.userResources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tech11.userManagement.userRepository.UserRepository;
import com.tech11.userManagement.users.User;

@Path("users")
public class UserResources {
	UserRepository userRepo = new UserRepository();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers(){
		System.out.println("The userlist--->");
		return userRepo.getUsers();
	}

	@GET
	@Path("user/{id}")
	@Produces(MediaType.APPLICATION_JSON)	
	public User getUser(@PathParam("id") int id) {
		System.out.println("The user by specific Id--->");
		return userRepo.getUser(id);
	
	}
	
	@POST
	@Path("user")
	@Produces(MediaType.APPLICATION_JSON)
	public User createUser(User u1) {
		System.out.println("Created a new user--->");
		userRepo.createUser(u1);
		return u1;
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public User updateUser(@PathParam("id")int id, User u1)
	{
		u1.setId(id);
		System.out.println("The update id :"+ id);
		return userRepo.updateUser(u1,id);
	}
	@DELETE
	@Path("user/{id}")
	@Produces(MediaType.APPLICATION_JSON)	
	public User deleteUser(@PathParam("id") int id,User u1) {
		 	User user1 = userRepo.getUser(id);
		 		if(user1.getId()!=0)
		 			userRepo.deleteUser(id,u1);
		 		return user1;
	}
	


}
