package com.anz.wholesale.demo.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Radha
 * 
 * Helps with transaction details 
 * of the account
 *
 */
@Entity
@Table(name = "TXN_DETAILS")
public class TransactionDetails implements Serializable{


	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCrDbt() {
		return crDbt;
	}

	public void setCrDbt(String crDbt) {
		this.crDbt = crDbt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8373982814055247227L;

	@Column(name = "ACCT_NUM")
	private String acctNum;

	@Column(name = "AMOUNT")
	private double amount;

	@Column(name = "CR_DBT")
	private String crDbt;

	@Column(name = "NARRATIVE")
	private String narrative;

	@Column(name = "VALUE_DATE")
	private Date valueDate;
	
	@Column(name="TXN_ID")
	@Id
	private String txnId;


	public String getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}


	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	@Override
	public String toString() {
		return "TransactionDetails [acctNum=" + acctNum + ", amount=" + amount + ", crDbt=" + crDbt + ", narrative="
				+ narrative + ", valueDate=" + valueDate + "]";
	}


}
