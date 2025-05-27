package com.sbi.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.bank.entity.BankDetails;
import com.sbi.bank.service.Bankservice;

@RestController
public class BankController {

	@Autowired
	Bankservice servic;

	@PostMapping("/User")
	public String createAc(@RequestBody BankDetails bankDetails) {

		return servic.createAc(bankDetails);
	}

}
