package com.jh.account;

import java.util.ArrayList;
import java.util.Scanner;

import com.jh.bankView.AccountView;
import com.jh.bankView.BankView;
import com.jh.bankinput.AccountInput;
import com.jh.member.MemberDTO;




public class AccountController {
	
	private Scanner sc;
	private AccountDAO accountDAO;
	private AccountInput accountInput;
	private AccountDTO accountDTO;
	private BankView bankView;
	private AccountView accountView;
	private AccountInfoController accountInfoController;
	
	public AccountController() {
		sc = new Scanner(System.in);
		accountDAO = new AccountDAO();
		bankView = new BankView();
		accountInput = new AccountInput();
		accountView = new AccountView();
		accountInfoController = new AccountInfoController();
	}
	
	
	public void start(MemberDTO memberDTO) {
		
		boolean check = true;
		int select =0;
		
		while(check) {
			System.out.println("1. 계좌 개설");
			System.out.println("2. 계좌 조회");
			System.out.println("3. 은행 업무");
			System.out.println("4.  종료");
			select  = sc.nextInt();
		
			switch(select) {
			case 1 :
				//AccountDTO accountDTO = new AccountDTO(); -> X null 값
				
				accountDTO = accountInput.createaccount(sc);
				accountDTO.setId(memberDTO.getId());
				try {
					select = accountDAO.accountCreate(accountDTO);
					
				} catch (Exception e) {
					e.printStackTrace();
					select = 0;
				}
				
				String msg = "Create Fail";
				if(select > 0) {
					msg = "Create Success";
					//accountController.start(memberDTO);
				}
				bankView.view(msg);
					break;
					
			case 2 :
				
				try {
					ArrayList<AccountDTO> ar = accountDAO.accountSelect(memberDTO.getId());
					accountView.view(ar);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				break;
			case 3:
				ArrayList<AccountDTO> ar =null;
				try {
					ar = accountDAO.accountSelect(memberDTO.getId());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				for(int i=0; i<ar.size();i++) {
					System.out.println(i+1+". "+ar.get(i).getAccountNumber());
					
				}
				select = sc.nextInt();
				
				
				accountInfoController.start(ar.get(select-1).getAccountNumber());
				
				
				
				break;
				
			default:
				check = false;
				//check = !check;
				break;
	
		
		
	
		
				
		
		
			}
		
		}//while끝
		
		
	}
}
