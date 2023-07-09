package com.example.gasbooking.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "surrender_cylinder_info")
public class SurrenderCylinder {
	@Id
	@Column(name = "sid")
	private int surrenderId;
	private LocalDate surrenderDate;

	@Override
	public String toString() {
		return "SurrenderCylinder [surrenderId=" + surrenderId + ", surrenderDate=" + surrenderDate + "]";
	}

	public SurrenderCylinder(int surrenderId, LocalDate surrenderDate) {
		super();
		this.surrenderId = surrenderId;
		this.surrenderDate = surrenderDate;
	}

	public int getSurrenderId() {
		return surrenderId;
	}

	public void setSurrenderId(int surrenderId) {
		this.surrenderId = surrenderId;
	}

	public LocalDate getSurrenderDate() {
		return surrenderDate;
	}

	public void setSurrenderDate(LocalDate surrenderDate) {
		this.surrenderDate = surrenderDate;
	}

	public SurrenderCylinder() {
		// TODO Auto-generated constructor stub
	}
}