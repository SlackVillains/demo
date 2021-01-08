package com.anz.wholesale.demo.model;

import java.util.List;

import com.anz.wholesale.demo.entity.Account;

public class AccountResponse {
	
	private String id;
	private List<Account> accountDetails;
	private String status;
	private String statusDesc;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Account> getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(List<Account> accountDetails) {
		this.accountDetails = accountDetails;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
