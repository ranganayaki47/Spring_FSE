package com.fms.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
@Table("User")
public class User {
	
	@Id
	 @JsonProperty("userId")
	private long id;
	
	@JsonIgnore
	private String email;
	
	@JsonIgnore
	private String password;
	 @JsonProperty("token")
	private String token;
	
	private String roleId;
	
	private String name;
	
	

	public User(String email, String password, String roleId) {
		super();
		this.email = email;
		this.password = password;
		this.roleId = roleId;
	}

	public User() {
		super();
	}

	public long getId() {
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", token=" + token + ", roleId="
				+ roleId + "]";
	}
	
	

}
