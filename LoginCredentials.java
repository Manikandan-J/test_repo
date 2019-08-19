package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_credentials")
public class LoginCredentials {
 
	@Column
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String role;
	public float getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "LoginCredentials [id=" + id + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}
	public LoginCredentials(String email, String password, String role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	
}
