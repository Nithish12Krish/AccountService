package com.AccountService.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AccountService.model.Account;
import com.AccountService.service.IAccountService;

@RestController
@RequestMapping("accounts")
public class AccountController {
	
	@Autowired
	IAccountService accountService;
	
	Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	//Adding new Account to table
	@PostMapping("/add")
	public Account addAccount(@RequestBody Account account){
		logger.info("Adding new Account");
		Account newacc=accountService.addAccount(account);
		return newacc;
	}

}
