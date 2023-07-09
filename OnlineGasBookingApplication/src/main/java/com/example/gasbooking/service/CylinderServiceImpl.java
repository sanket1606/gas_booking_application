package com.example.gasbooking.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gasbooking.dao.CylinderDao;
import com.example.gasbooking.entity.Cylinder;

@Service
@Transactional
public class CylinderServiceImpl implements CylinderService {
	@Autowired
	CylinderDao dao;

	@Override
	public String addCylinder(Cylinder cylinder) {
		dao.save(cylinder);
		return "Cylinder Inserted Successfully";

	}

	@Override
	public String updateCylinder(Cylinder cylinder) {
		dao.save(cylinder);
		return "Cylinder Updated Successfully";
	}

	@Override
	public String deleteCylinder(int cylinderId) {
		dao.deleteById(cylinderId);
		return "Cylinder Deleted Successfully";
	}

	@Override
	public List<Cylinder> getCylinder(String cylinderType) {
		return dao.findByCylinderType(cylinderType);
	}

}
