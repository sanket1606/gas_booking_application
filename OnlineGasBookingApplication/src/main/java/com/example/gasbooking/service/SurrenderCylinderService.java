package com.example.gasbooking.service;

import com.example.gasbooking.entity.SurrenderCylinder;

public interface SurrenderCylinderService {

	public String addSurrenderCylinder(SurrenderCylinder surrendercylinder);

	public String updateSurrenderCylinder(SurrenderCylinder surrendercylinder);

	public String deleteSurrenderCylinder(int surrenderId);

	public int countSurrenderedCylinders();

}
