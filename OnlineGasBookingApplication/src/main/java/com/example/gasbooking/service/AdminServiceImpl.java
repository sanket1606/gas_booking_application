package com.example.gasbooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gasbooking.dao.AdminDao;
import com.example.gasbooking.entity.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminDao dao;

	@Override
	public String addAdmin(Admin admin) {
		dao.save(admin);
		
		return "Admin inserted successfully";
	}

	@Override
	public String updateAdmin(Admin admin) {
		dao.save(admin);
		return "Admin updated successfully";
	}

	@Override
	public String deleteAdmin(int adminId) {
		dao.deleteById(adminId);
		return "Admin deleted successfully";
	}

	@Override
	public Admin getAdmin(int adminId) {
		Optional<Admin>admin=dao.findById(adminId);
		return admin.get();
	}

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
