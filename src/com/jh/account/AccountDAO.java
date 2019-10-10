package com.jh.account;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jh.util.DBConnetor;

public class AccountDAO {
	
	public int accountCreate(AccountDTO accountDTO) throws Exception {
		Connection con = null;
		PreparedStatement st = null;
		int result = 0;
		
		
			con = DBConnetor.getConnection();
			String sql = "insert into account values(?,?,?,?)";
			st = con.prepareStatement(sql);
			
			st.setString(1, accountDTO.getAccountNumber());
			st.setString(2, accountDTO.getAccountName());
			st.setInt(3, accountDTO.getAccountBalance());
			st.setString(4, accountDTO.getId());
			
			result = st.executeUpdate();
			
			st.close();
			con.close();
	
		
		
		return result;
	}

}
