package com.anz.wholesale.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anz.wholesale.demo.constants.WholesaleConstants;
import com.anz.wholesale.demo.dao.IAccountDao;
import com.anz.wholesale.demo.entity.Account;
import com.anz.wholesale.demo.model.AccountResponse;

@Controller
@RequestMapping(path = "/accounts")
public class AccountController {
	
	private static Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	IAccountDao impl;
	
	@GetMapping(path="/", produces = "application/json")
	public AccountResponse getAllAccounts() {
		AccountResponse response = new AccountResponse();
		
		try {
			List<Account> accounts = impl.getAccountListWithoutTxns();
			response.setAccountDetails(accounts);
			response.setStatus(WholesaleConstants.SUCCESS);
			response.setStatusDesc(WholesaleConstants.SUCCESS);
		}catch (Exception e) {
			logger.error("Exception ", e);
			response.setStatus(WholesaleConstants.FAIL);
			response.setStatusDesc(e.getMessage());
		}
		return response;
	}
	
	@GetMapping("/getAcctTxns")
	public AccountResponse getAcctTrans(@RequestParam(value = "accountNum") String acctNum) {
		AccountResponse response = new AccountResponse();
		
		return response;
	}

}
