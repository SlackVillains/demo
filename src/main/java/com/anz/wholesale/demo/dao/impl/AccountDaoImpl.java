package com.anz.wholesale.demo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.anz.wholesale.demo.constants.WholesaleConstants;
import com.anz.wholesale.demo.dao.IAccountDao;
import com.anz.wholesale.demo.entity.Account;
import com.anz.wholesale.demo.exception.TechnicalException;

public class AccountDaoImpl implements IAccountDao {

	private final static Logger logger = LoggerFactory.getLogger(AccountDaoImpl.class);

	@PersistenceContext
	private EntityManager entityMgr;

	/**
	 * Get All relevant accounts in the database
	 */
	@Override
	public List<Account> getAccountListWithoutTxns() {
		return entityMgr.createQuery("SELECT a FROM Account a", Account.class).getResultList();
	}
	
	/**
	 * Retrieve all account details pertaining to an account
	 */
	@Override
	public List<Account> getAccountWithTransaction(String accountNum) throws TechnicalException {
		try {
			TypedQuery<Account> query = entityMgr.createNamedQuery(WholesaleConstants.GET_TXNS_ACCT,Account.class);
			query.setParameter(WholesaleConstants.ACCUT_NUM, accountNum);
			return query.getResultList();
		}catch (Exception e) {
			logger.error("Error executing query on Account table");
			throw new TechnicalException("Db issues on the query execution");
		}
	}

}
