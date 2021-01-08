package com.anz.wholesale.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ACC_DETAILS")
@NamedQueries({
	@NamedQuery(name = "GET_TXNS_ACCT", query="Select a from Account a where a.acctNum=:acctNum")
})
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8853488608679510753L;

	@Column(name = "ACCT_NUM")
	@Id
	private String acctNum;

	@Column(name = "ACCT_NAME")
	private String acctName;

	@Column(name = "ACCT_TYPE")
	private String acctType;

	@Column(name = "BALANCE_DATE")
	private String balanceDate;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "OPENING_BALANCE")
	private double openingBalance;

	@OneToMany(targetEntity = TransactionDetails.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "ACCT_NUM")
	private Set<TransactionDetails> txnDetails;

	public String getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public Set<TransactionDetails> getTxnDetails() {
		return txnDetails;
	}

	public void setTxnDetails(Set<TransactionDetails> txnDetails) {
		this.txnDetails = txnDetails;
	}

	@Override
	public String toString() {
		return "Account [acctNum=" + acctNum + ", acctName=" + acctName + ", acctType=" + acctType + ", balanceDate="
				+ balanceDate + ", currency=" + currency + ", openingBalance=" + openingBalance + ", txnDetails="
				+ txnDetails + "]";
	}

}
