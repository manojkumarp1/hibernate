package org.studyeasy.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="user")
@Table(name="user")

public class User {
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="username")
	String username;
	
	@Column(name="password")
	String password;
	
	@Column(name="firstname")
	String firstname;
	
	@Column(name="lastname")
	String lastname;

	
	
	public User(int id,String username, String password, String firstname, String lastname) {
		super();
		this.id=id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public User()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String toString()
	{
		return "User [id :"+ id +", username :"+username+", password :"+ password+", firstname :"+firstname+", lastname :"+lastname+"]";
	}
	
	
	
}
