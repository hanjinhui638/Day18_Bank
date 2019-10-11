package com.jh.bankinput;

import java.util.Scanner;

import com.jh.account.AccountDTO;
import com.jh.accountlnfo.AccountInfoDTO;

public class AccountInfoInput {
	
	public AccountInfoDTO createAccountInfo(Scanner sc, AccountDTO accountDTO) {
		
		
		
		AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
		accountInfoDTO.setAccountNumber(accountDTO.getAccountNumber());
		accountInfoDTO.setIncomeKind(1);
		System.out.println("금액을 입력하세요.");
		long income = sc.nextLong();
		accountInfoDTO.setAccountBalance(accountDTO.getAccountBalance());
		
		return accountInfoDTO;
		
	}
	

}
