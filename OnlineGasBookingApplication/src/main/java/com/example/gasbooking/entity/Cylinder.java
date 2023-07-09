package com.example.gasbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "cylinder_info")
public class Cylinder {
	@Id
	@Column(name = "cid")
	@Min(value = 10000, message = "CylinderID Can't less than 10000")
	private int cylinderId;
	@NotEmpty(message = "cylinderType cant be empty or null")
	private String cylinderType;
	private int cylinderPrice;
	private int cylinderWeight;

	public int getCylinderId() {
		return cylinderId;
	}

	public void setCylinderId(int cylinderId) {
		this.cylinderId = cylinderId;
	}

	public String getCylinderType() {
		return cylinderType;
	}

	public void setCylinderType(String cylinderType) {
		this.cylinderType = cylinderType;
	}

	public int getCylinderPrice() {
		return cylinderPrice;
	}

	public void setCylinderPrice(int cylinderPrice) {
		this.cylinderPrice = cylinderPrice;
	}

	public int getCylinderWeight() {
		return cylinderWeight;
	}

	public void setCylinderWeight(int cylinderWeight) {
		this.cylinderWeight = cylinderWeight;
	}

	public Cylinder(@Min(value = 10000, message = "CylinderID Can't less than 10000") int cylinderId,
			@NotEmpty(message = "cylinderType cant be empty or null") String cylinderType, int cylinderPrice,
			int cylinderWeight) {
		super();
		this.cylinderId = cylinderId;
		this.cylinderType = cylinderType;
		this.cylinderPrice = cylinderPrice;
		this.cylinderWeight = cylinderWeight;
	}

	@Override
	public String toString() {
		return "Cylinder [cylinderId=" + cylinderId + ", cylinderType=" + cylinderType + ", cylinderPrice="
				+ cylinderPrice + ", cylinderWeight=" + cylinderWeight + "]";
	}

	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
}
