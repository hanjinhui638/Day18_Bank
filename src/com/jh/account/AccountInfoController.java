package com.jh.account;

import java.util.ArrayList;
import java.util.Scanner;

import com.jh.accountlnfo.AccountInfoDAO;
import com.jh.accountlnfo.AccountInfoDTO;
import com.jh.bankView.AccountInfoView;
import com.jh.bankView.BankView;
import com.jh.bankinput.AccountInfoInput;

public class AccountInfoController {
	
	private Scanner sc;
	private AccountInfoDAO accountInfoDAO;
	private AccountInfoDTO accountInfoDTO;
	private AccountInfoView accountInfoView;
	private AccountInfoInput accountInfoInput;
	private AccountDAO accountDAO;
	private BankView bankView;
	
	public AccountInfoController() {
		sc = new Scanner(System.in);
		accountInfoDAO = new AccountInfoDAO();
		accountInfoView = new AccountInfoView();
		accountInfoInput = new AccountInfoInput();
		accountInfoDAO = new AccountInfoDAO();
	}
	
	public void start(String accountNumber) {
		boolean check = true;
		int select = 0;
		
		while(check) {
		System.out.println("1. 입출금내역조회");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 종료");
		select = sc.nextInt();
		
		switch(select) {
	
		case 1 : 
			try {
				ArrayList<AccountInfoDTO> ar = accountInfoDAO.incomeSelect(accountNumber);
				accountInfoView.view(ar);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
			
		case 2 : 
			try {
			long income = accountInfoInput.incomeInput(sc);
			long balance = accountDAO.getAccountBalance(accountNumber);
			AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
			accountInfoDTO.setIncomeKind(1);
			accountInfoDTO.setAccountNumber(accountNumber);
			accountInfoDTO.setIncome(income);
			accountInfoDTO.setAccountBalance(balance+ income);
			select = accountInfoDAO.income(accountInfoDTO);
			accountInfoDTO = accountInfoInput.createAccountInfo(sc,);
			accountInfoDTO.setAccountNumber(accountNumber);
			if(select >0) {
				
				select = accountInfoDAO.updateBalance(accountInfoDTO);
				
			}
			try {
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				select = 0;
			}
			
			if(select>0) {
				bankView.view("입금 성공");
				
				
			}else {
				
				bankView.view("입금 실패 );
			}
			
			
			
			
			
			
			break;
			
		case 3 : 
			break;
		
		default:
			check = false;
			
			break;
		
		}
		
		}
	}

}
