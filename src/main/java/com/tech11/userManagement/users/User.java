package com.tech11.userManagement.users;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	private Date birthday;
	private int Id;
	
	
	
	public User() {
		
		super();
	}
	
	//Parametrized User Constructor
	public User(int Id, String firstName,String lastName,String birthday,String email ) {
			
		this.Id = Id;
		this.firstName = firstName;
		this.lastName = lastName;
		try {
			SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
			Date D1=date.parse(birthday);
			this.birthday = D1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		this.email = email;
	}	
	
		
	//----->Getter and Setter Methods
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday( Date birthday) {
		this.birthday = birthday;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	
	
	
	
	 

}

