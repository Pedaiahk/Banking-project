package com.sbi.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.bank.entity.BankDetails;
import com.sbi.bank.repo.Bankrepo;

@Service
public class Bankservice {
	@Autowired
	BankDetails bankDetails;
	
	@Autowired
	Bankrepo bankrepo;
	
	public String createAc() {
		
		long number = bankDetails.getAccNo();
		
		if(number != bankrepo.) {
			
		}
		
		bankrepo.save(bankDetails);
		
		
		return null;
		
		
	}
	
}
