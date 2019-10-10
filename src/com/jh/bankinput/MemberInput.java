package com.jh.bankinput;

import java.util.Scanner;

import com.jh.member.MemberDTO;

public class MemberInput {
	//로그인입력
	public MemberDTO memberLogin(Scanner sc) {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("ID 입력");
		memberDTO.setId(sc.next());
		System.out.println("PW 입력");
		memberDTO.setPw(sc.next());
		
		return memberDTO;
		
	}
	
	//회원가입 
	
	public MemberDTO memberJoin(Scanner sc) {
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("ID를 입력하세요");
		memberDTO.setId(sc.next());
		System.out.println("pw를 입력하세요");
		memberDTO.setPw(sc.next());
		System.out.println("Name을 입력");
		memberDTO.setName(sc.next());
		System.out.println("Phone을 입력");
		memberDTO.setPhone(sc.next());
		System.out.println("Email 입력");
		memberDTO.setEmail(sc.next());
		
		return memberDTO;
		
	}

}
