package com.AccountService.service;


import org.springframework.stereotype.Service;

import com.AccountService.model.Account;
import com.AccountService.repo.AccountRepository;

@Service
public class AccountServiceImpl implements IAccountService {
	
	
	AccountRepository accRepo;

	public AccountServiceImpl(AccountRepository accRepo) {
		super();
		this.accRepo = accRepo;
	}



	@Override
	public Account addAccount(Account account) {
		
		return accRepo.save(account);
	}



}
