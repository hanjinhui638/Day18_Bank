package com.jh.member;

import java.util.Scanner;

import com.jh.bankView.BankView;
import com.jh.bankinput.MemberInput;

public class MemberControll {
	
	private Scanner sc;
	private MemberDAO memberDAO;
	private MemberInput memberInput;
	private BankView bankView;
	
	
	public MemberControll() {
		sc = new Scanner(System.in);
		memberDAO = new MemberDAO();
		memberInput = new MemberInput();
		bankView = new BankView();
	}

	public void start() {
		
		boolean check = true;
		
		
		while(check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 로그아웃");
			int select = sc.nextInt();
			 MemberDTO memberDTO = null;//초기화필요한 변수 
			
			
			switch(select) {
			case 1: 
				memberDTO= memberInput.memberJoin(sc);
				
				try {
					select = memberDAO.memberJoin(memberDTO);
				} catch (Exception e) {
					//e.printStackTrace();
					select = 0;
				}
				
				String msg2 = "Member Join Fail";
				if(select > 0) {
					msg2 = "Member Join Success";
				}
				bankView.view(msg2);
				
				break;
				
			case 2 :
				memberDTO = memberInput.memberJoin(sc);
				try {
					memberDTO = memberDAO.memberLogin(memberDTO);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					memberDTO = null;
				}
				
				
				String msg = "Login Fail";
				if(memberDTO !=null) {
					msg = "Login Success";
					
				}
				bankView.view(msg);
				break;
				
			default : 
					check = false;
					//check = !check
				break;
			
				
				
			
			
			}
			
		}
		
	}
}
