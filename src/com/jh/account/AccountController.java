package com.jh.account;

import java.util.Scanner;

import com.jh.bankView.BankView;
import com.jh.bankinput.AccountInput;




public class AccountController {
	
	private Scanner sc;
	private AccountInput accountInput;
	private AccountDAO accountDAO;
	private String id;
	private BankView bankView;
	
	public AccountController() {
		sc = new Scanner(System.in);
		accountInput = new AccountInput();
		accountDAO = new AccountDAO();
		bankView = new BankView();
	}
	
	
	public void start() {
		AccountDTO accountDTO = new AccountDTO();
		int select =0;
		
		accountDTO = accountInput.createaccount(sc,id);
		
		try {
			select = accountDAO.accountCreate(accountDTO);
		} catch (Exception e) {
			//e.printStackTrace();
			select = 0;
		}
		
		String msg2 = "Member Join Fail";
		if(select > 0) {
			msg2 = "Member Join Success";
		}
			bankView.view(msg2);
		
	
		
		
	
		
				
		
		
		
		
		
		
		
	}
}
