package com.example.gasbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="admin_info")
public class Admin {
	
	@Id
	@Column(name="aid")
	@Min(value=100,message="value can't be less than 100")
	private int adminId;
	@NotEmpty(message=" cant be empty or null")
	private String username;
	@NotEmpty(message=" cant be empty or null")
	private String password;
	
	private long mobileno;
	private String address;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Admin(@Min(value = 100, message = "value can't be less than 100") int adminId, String username,
			String password, long mobileno, String address) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.password = password;
		this.mobileno = mobileno;
		this.address = address;
	}
	
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", username=" + username + ", password=" + password + ", mobileno="
				+ mobileno + ", address=" + address + "]";
	}
	

}
