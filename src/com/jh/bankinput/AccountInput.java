package com.jh.bankinput;

import java.util.Calendar;
import java.util.Scanner;

import com.jh.account.AccountDTO;


public class AccountInput {
	
	public AccountDTO createaccount(Scanner sc) {
		
		
		AccountDTO accountDTO = new AccountDTO();
		
		
		System.out.println("계좌명을 입력하세요");
		accountDTO.setAccountName(sc.next());
		
		Calendar calendar = Calendar.getInstance(); //추상클래스
		long l = calendar.getTimeInMillis();
		
		accountDTO.setAccountNumber(String.valueOf(l));
		
		
		return accountDTO;
		
	}

}
