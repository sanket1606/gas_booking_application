package com.example.gasbooking.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gasbooking.dao.SurrenderCylinderDao;
import com.example.gasbooking.entity.SurrenderCylinder;

@Service
@Transactional
public class SurrenderCylinderServiceImpl implements SurrenderCylinderService {
	@Autowired
	SurrenderCylinderDao dao;

	@Override
	public String addSurrenderCylinder(SurrenderCylinder surrendercylinder) {
		dao.save(surrendercylinder);
		return "Cylinder Inserted Successfully";
	}

	@Override
	public String updateSurrenderCylinder(SurrenderCylinder surrendercylinder) {
		dao.save(surrendercylinder);
		return "Cylinder Updated Successfully";
	}

	@Override
	public String deleteSurrenderCylinder(int surrenderId) {
		dao.deleteById(surrenderId);
		return "Cylinder Deleted Successfully";
	}

	@Override
	public int countSurrenderedCylinders() {
		return (int) dao.count();
	}

}
