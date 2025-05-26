package com.sbi.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class BankDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	Integer accNo;
	
	String userName;
	
	String ifscCode;
	
	int age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccNo() {
		return accNo;
	}

	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "BankDetails [id=" + id + ", accNo=" + accNo + ", userName=" + userName + ", ifscCode=" + ifscCode
				+ ", age=" + age + "]";
	}

	public BankDetails(Integer id, Integer accNo, String userName, String ifscCode, int age) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.userName = userName;
		this.ifscCode = ifscCode;
		this.age = age;
	}

	public BankDetails() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	

}
