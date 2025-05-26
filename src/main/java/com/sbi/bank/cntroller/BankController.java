package com.sbi.bank.cntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.bank.entity.BankDetails;
import com.sbi.bank.repo.Bankrepo;

@RestController
public class BankController {
	
	
	
	@PostMapping("/User")
	public String createAc(@RequestBody BankDetails bankDetails) {
		
		
		
		return "account has been created";
	}
	
}
