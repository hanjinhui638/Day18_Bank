package com.jh.bankinput;

import java.util.Calendar;
import java.util.Scanner;

import com.jh.account.AccountDTO;

public class AccountInput {
	
	public AccountDTO createaccount(Scanner sc, String id) {
		AccountDTO accountDTO = new AccountDTO();
		
		Calendar calendar = Calendar.getInstance();
		
		accountDTO.setAccountNumber(String.valueOf(calendar.getTimeInMillis()));
		System.out.println("이름을 입력하세요");
		accountDTO.setAccountName(sc.next());
		accountDTO.setAccountBalance(0);
		accountDTO.setId(id);
		
		return accountDTO;
		
	}

}
