package com.example.gasbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "customer_info")
public class Customer {

	@Id
	@Column(name = "CustomerId")
	@Min(value = 100, message = "customerId Can't less than 100")
	private int customerId;
	@Column(name = "BankId")
	@Min(value = 100, message = "bankId Can't less than 100")
	private int bankId;
	@Column(name = "AccountNo")
	@Min(value = 100, message = " accountNo Can't less than 100")
	private int accountNo;
	private String ifscNo;
	private String pan;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscNo() {
		return ifscNo;
	}

	public void setIfscNo(String ifscNo) {
		this.ifscNo = ifscNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", bankId=" + bankId + ", accountNo=" + accountNo + ", ifscNo="
				+ ifscNo + ", pan=" + pan + "]";
	}

	public Customer(@Min(value = 100, message = "customerId Can't less than 100") int customerId,
			@NotEmpty(message = "bankId cant be empty or null") @Min(value = 100, message = "bankId Can't less than 100") int bankId,
			@NotEmpty(message = "accountNo cant be empty or null") @Min(value = 100, message = " accountNo Can't less than 100") int accountNo,
			@NotEmpty(message = "ifscNo cant be empty or null") String ifscNo,
			@NotBlank(message = "pan cant be null or whitespace") String pan) {
		super();
		this.customerId = customerId;
		this.bankId = bankId;
		this.accountNo = accountNo;
		this.ifscNo = ifscNo;
		this.pan = pan;
	}

}
