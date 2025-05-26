package com.sbi.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.bank.entity.BankDetails;
import com.sbi.bank.repo.Bankrepo;

@Service
public class Bankservice {

	@Autowired
	Bankrepo bankrepo;

	public String createAc(BankDetails bankDetails) {

		if (bankrepo.existsById(bankDetails.getAccNo())) {
			bankrepo.save(bankDetails);

		} else
			return "bank account already exist in the database";

		return "bank account has been created successfully";

	}

}
