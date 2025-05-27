package com.sbi.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.bank.entity.BankDetails;
import com.sbi.bank.repo.Bankrepo;

@Service
public class Bankserviceimpl implements Bankservices {

	@Autowired
	Bankrepo bankrepo;

	public String createAc(BankDetails bankDetails) {

		if (bankrepo.findByaccNo(bankDetails.getAccNo()).isPresent()) {
			return "bank account already exist in the database";

		} else
			bankrepo.save(bankDetails);

		return "bank account has been created successfully";

	}

	@Override
	public String Update(Integer accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getByAccno(Integer accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAcc(Integer accNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
