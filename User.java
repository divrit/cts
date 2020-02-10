package com.cts.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@Min(value=100,message="hahahah limit is 100")
	@Max(value=999,message="lol limit is 999")
	int id;



@NotEmpty(message="dont be empty")
String name;
@NotEmpty(message="type email yr")
@Email(message="make it emial type")
String email;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
