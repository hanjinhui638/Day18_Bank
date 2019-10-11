package com.jh.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jh.accountlnfo.AccountInfoDTO;
import com.jh.util.DBConnetor;

public class AccountDAO {
	
	
	//updateBalance
	
	public int updateBalance(AccountInfoDTO accountInfoDTO) throws Exception{
		Connection con = null;
		PreparedStatement st = null;
		int result = 0;
		
		con = DBConnetor.getConnection();
				
		String sql = "update account set accountBalance=? where accountNumber=?";
		st = con.prepareStatement(sql);
		st.setLong(1, accountInfoDTO.getAccountBalance());
		st.setString(2, accountInfoDTO.getAccountNumber());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		
		return result;
		
		
	}
	//accountBalance
	
	public long getAccountBalance(String accountNumber) throws Exception {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		long balance = 0;
	
		con = DBConnetor.getConnection();
		
		String sql = "select accountBalance from account where accountNumber=?";
		st = con.prepareStatement(sql);
		
		st.setString(1, accountNumber);
		
		rs = st.executeQuery();
		
		if(rs.next()) {
			balance = rs.getLong("accountBalance");
			
		}
			rs.close();
			st.close();
			con.close();
		
			return balance;
	}
	
	public ArrayList<AccountDTO> accountSelect(String id) throws Exception {
		
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<AccountDTO> ar = new ArrayList<AccountDTO>();
		
		con = DBConnetor.getConnection();
		String sql = "select* from account where id = ?";
		st = con.prepareStatement(sql);
		
		st.setString(1, id);
		
		rs = st.executeQuery();
		
		while(rs.next()) {
			AccountDTO accountDTO = new AccountDTO();
			accountDTO.setAccountNumber(rs.getString("accountNumber"));
			accountDTO.setAccountName(rs.getString("accountName"));
			accountDTO.setAccountBalance(rs.getLong("accountBalance"));
			accountDTO.setId(rs.getString("id"));
			
			ar.add(accountDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		
		return ar;
	}
	
	
	
	public int accountCreate(AccountDTO accountDTO) throws Exception {
		int result = 0;
		Connection con = null;
		PreparedStatement st = null;
		
		
			con = DBConnetor.getConnection();
			
			String sql = "insert into account values(?,?,0,?)";
			
			st = con.prepareStatement(sql);
			
			st.setString(1, accountDTO.getAccountNumber());
			st.setString(2, accountDTO.getAccountName());
			st.setString(3, accountDTO.getId());
			
			result = st.executeUpdate();
			
			st.close();
			con.close();
	
		
		
		return result;
	}

}
