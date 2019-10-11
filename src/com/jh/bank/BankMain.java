package com.jh.bank;


import com.jh.accountlnfo.AccountInfoDAO;
import com.jh.accountlnfo.AccountInfoDTO;
import com.jh.member.MemberControll;


public class BankMain {

	public static void main(String[] args) throws Exception{
		
		
		
		
		
		/*	AccountInfoDAO accountInfoDAO = new AccountInfoDAO();
			AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
			accountInfoDTO.setIncome(50);
			accountInfoDTO.setAccountBalance(150);
			accountInfoDTO.setIncomeKind(0);
			accountInfoDTO.setAccountNumber("1570759476822");
			
			
			int result = accountInfoDAO.income(accountInfoDTO);
			System.out.println(result); */
		
		
			/*Connection con = DBConnetor.getConnection();
			System.out.println(con);*/    					//연결 확인
		
			/*	MemberDAO memberDAO = new MemberDAO();
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId("iu");
			memberDTO.setPw("iu");
			memberDTO.setName("iu");
			memberDTO.setPhone("010-555-5555");
			memberDTO.setEmail("ku@email.com");
			try {
				int result = memberDAO.memberJoin(memberDTO);
				System.out.println(result);
			} catch (Exception e) {
			
				e.printStackTrace();
			} 											// DAO Join 확인
			
			
			
		
	
	
	/*	MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("iu");
		memberDTO.setPw("iu");
		
		try {
			memberDTO = memberDAO.memberLogin(memberDTO);
			System.out.println(memberDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		MemberControll memberControll = new MemberControll();
		memberControll.start();
					
		
	}

}
