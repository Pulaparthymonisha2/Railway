package com.monisha.railway.onlinerailway;

import org.springframework.data.annotation.Id;

public class Passengers {

	@Id
	public String Username;
	public String Email;
	public String City;
	public String PhoneNumber;
	public String Password;
	
	public Passengers() {
	}

	

	public Passengers(String username, String email, String city, String phoneNumber, String password) {
		super();
		Username = username;
		Email = email;
		City = city;
		PhoneNumber = phoneNumber;
		Password = password;
	}



	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	

	public String getPhoneNumber() {
		return PhoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}



	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "Passengers [Username=" + Username + ", Email=" + Email + ", City=" + City + ", PhoneNumber="
				+ PhoneNumber + ", Password=" + Password + "]";
	}
	
}
	
	

