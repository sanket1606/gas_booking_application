package com.example.gasbooking.service;

import java.util.List;

import com.example.gasbooking.entity.Admin;

public interface AdminService {
	public String addAdmin(Admin admin);
	public String updateAdmin(Admin admin);
	public String deleteAdmin(int adminId);
	public Admin getAdmin(int adminId);
	public List<Admin>getAllAdmin();

}
