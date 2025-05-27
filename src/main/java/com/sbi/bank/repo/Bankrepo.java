package com.sbi.bank.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.bank.entity.BankDetails;

@Repository
public interface Bankrepo extends JpaRepository<BankDetails, Integer> {

	Optional<BankDetails> findByaccNo(Integer accNo);

}
