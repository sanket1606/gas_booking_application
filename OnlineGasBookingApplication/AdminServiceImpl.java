package com.ibm.gasbooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.gasbooking.dao.AdminDao;
import com.ibm.gasbooking.entity.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminDao dao;

	@Override
	public String addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		dao.save(admin);
		
		return "Admin inserted Successfully";
	}

	@Override
	public String updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		dao.save(admin);
		
		return "Admin updated Successfully";
	}

	@Override
	public String deleteAdmin(int adminId) {
		// TODO Auto-generated method stub
		dao.deleteById(adminId);
		return "Admin deleted Successfully";
	}

	@Override
	public Admin getAdmin(int adminId) {
		// TODO Auto-generated method stub
		Optional<Admin>admin=dao.findById(adminId);
		return admin.get();
	}

	@Override
	public List<Admin> getAllBookings() {
		// TODO Auto-generated method stub
		
		return dao.findAll();
	}

	@Override
	public List<Admin> getAllBookingsForDays() {
		// TODO Auto-generated method stub
		
		return dao.findAll();
	}

}
