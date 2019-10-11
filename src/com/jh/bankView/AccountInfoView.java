package com.jh.bankView;

import java.util.ArrayList;

import com.jh.accountlnfo.AccountInfoDTO;

public class AccountInfoView {
	
	public void view(ArrayList<AccountInfoDTO> ar) {
		System.out.println("TradeNumber\tIncome\tBalance\tKind\tTradeDate");
		for(AccountInfoDTO accountInfoDTO:ar) {
			System.out.print(accountInfoDTO.getTradeNumber()+"\t\t");
			System.out.print(accountInfoDTO.getIncome()+"\t");
			System.out.print(accountInfoDTO.getAccountBalance()+"\t");
			System.out.print(accountInfoDTO.getIncomeKind()+"\t");
			System.out.println(accountInfoDTO.gettradeDate()+"\t");
			
			
		}
		
	}

}
