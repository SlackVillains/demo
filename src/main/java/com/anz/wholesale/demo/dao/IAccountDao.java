package com.anz.wholesale.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.anz.wholesale.demo.entity.Account;
import com.anz.wholesale.demo.exception.TechnicalException;

@Repository
public interface IAccountDao {

	/**
	 * Get All relevant accounts in the database
	 */
	List<Account> getAccountListWithoutTxns();

	List<Account> getAccountWithTransaction(String accountNum) throws TechnicalException;
}
