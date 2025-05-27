package com.sbi.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.bank.entity.BankDetails;
import com.sbi.bank.service.Bankservices;

@RestController
public class BankController {

	@Autowired
	Bankservices servic;

	@PostMapping("/User")
	public String createAc(@RequestBody BankDetails bankDetails) {

		return servic.createAc(bankDetails);
	}

	@PutMapping("/User/{id}")
	public String Update(@RequestParam Integer accNo) {

		return servic.Update(accNo);
	}

	@GetMapping("/User/{id}")
	public String getAccDetails(@RequestParam Integer accNo) {

		return servic.getByAccno(accNo);
	}
	
	@DeleteMapping("/User/{id}")
	public String deleteUser(@RequestParam Integer accNo) {

		return servic.deleteAcc(accNo);
	}

}
