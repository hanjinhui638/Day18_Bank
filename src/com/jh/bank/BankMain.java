package com.jh.bank;

import java.sql.Connection;

import com.jh.member.MemberControll;
import com.jh.member.MemberDAO;
import com.jh.member.MemberDTO;
import com.jh.util.DBConnetor;

public class BankMain {

	public static void main(String[] args) {
		
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
		
		
		
		/*MemberControll memberControll = new MemberControll();
		memberControll.start();*/
		
	
			
		
	}

}
