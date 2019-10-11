package com.jh.accountlnfo;

import java.sql.Date;

public class AccountInfoDTO {
	
	private long tradeNumber;
	private String accountNumber;
	private long income;
	private long accountBalance;
	private int incomeKind;//0 출금, 1 입금 
	private Date tradedate;
	
	
	public long getTradeNumber() {
		return tradeNumber;
	}
	public void setTradeNumber(long tradeNumber) {
		this.tradeNumber = tradeNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getIncome() {
		return income;
	}
	public void setIncome(long income) {
		this.income = income;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getIncomeKind() {
		return incomeKind;
	}
	public void setIncomeKind(int incomeKind) {
		this.incomeKind = incomeKind;
	}
	public Date gettradeDate() {
		return tradedate;
	}
	public void settradeDate(Date tradedate) {
		this.tradedate = tradedate;
	}
	
	

}
