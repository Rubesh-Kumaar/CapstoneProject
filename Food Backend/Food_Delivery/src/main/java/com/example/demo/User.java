package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "registeration")
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false, length = 20)
private String RFname;

@Column(nullable = false, length = 20)
private String RLname;

@Column(nullable = false, unique = true, length = 45)
private String REmail;

@Column(nullable = false, unique = true,length = 20)
private String RMobile;

@Column(name = "Location", nullable = false, length = 20)
private String Location;

@Column(nullable = false, length = 64)
private String Password;


public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getRFname() {
	return RFname;
}

public void setRFname(String rFname) {
	RFname = rFname;
}

public String getRLname() {
	return RLname;
}

public void setRLname(String rLname) {
	RLname = rLname;
}

public String getREmail() {
	return REmail;
}

public void setREmail(String rEmail) {
	REmail = rEmail;
}

public String getRMobile() {
	return RMobile;
}

public void setRMobile(String rMobile) {
	RMobile = rMobile;
}

public String getLocation() {
	return Location;
}

public void setLocation(String location) {
	Location = location;
}

public void setPassword(String password) {
	Password = password;
}

}