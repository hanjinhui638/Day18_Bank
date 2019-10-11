package com.jh.bankView;

import java.util.ArrayList;

import com.jh.account.AccountDTO;

public class AccountView {
	
	public void view(ArrayList<AccountDTO> ar) {
		
		System.out.println("계좌번호\t\t계좌명\t잔액");
		for(AccountDTO accountDTO: ar) {
		System.out.print(accountDTO.getAccountNumber()+"\t");
		System.out.print(accountDTO.getAccountName()+"\t");
		System.out.println(accountDTO.getAccountBalance());
		}
		
	}

}
