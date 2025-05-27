package com.sbi.bank.service;

import com.sbi.bank.entity.BankDetails;

public interface Bankservices {

	public String createAc(BankDetails bankDetails);

	public String Update(Integer accNo);

	public String getByAccno(Integer accNo);

	public String deleteAcc(Integer accNo);

}
