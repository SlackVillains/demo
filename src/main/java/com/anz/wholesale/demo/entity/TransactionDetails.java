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


	/**
	 * 
	 */
	private static final long serialVersionUID = -8373982814055247227L;

	@Column(name = "ACCT_NUM")
	private String acctNum;

	@Column(name = "AMOUNT")
	private String txn_number;

	@Column(name = "CR_DBT")
	private double crDbt;

	@Column(name = "NARRATIVE")
	private String narrative;

	@Column(name = "VALUE_DATE")
	private Date valueDate;

	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(String acctNum) {
		this.acctNum = acctNum;
	}

	public String getTxn_number() {
		return txn_number;
	}

	public void setTxn_number(String txn_number) {
		this.txn_number = txn_number;
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

	public double getCrDbt() {
		return crDbt;
	}

	public void setCrDbt(double crDbt) {
		this.crDbt = crDbt;
	}

	@Override
	public String toString() {
		return "TransactionDetails [acctNum=" + acctNum + ", txn_number=" + txn_number + ", crDbt=" + crDbt
				+ ", narrative=" + narrative + ", valueDate=" + valueDate + ", id=" + id + "]";
	}

}
