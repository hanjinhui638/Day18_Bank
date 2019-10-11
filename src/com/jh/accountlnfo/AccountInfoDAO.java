package com.jh.accountlnfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jh.util.DBConnetor;


public class AccountInfoDAO {

	//내역조회 incomeSelect

	public ArrayList<AccountInfoDTO> incomeSelect(String accountNumber) throws Exception{
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		ArrayList<AccountInfoDTO> ar = new ArrayList<AccountInfoDTO>();

		con = DBConnetor.getConnection();
		
		

		String sql = "select* from accoutInfo where accountNumber = ? "
				+ "order by tradenumber desc"; 

		st= con.prepareStatement(sql);

		st.setString(1, accountNumber);

		rs = st.executeQuery();

		while(rs.next()) {
			AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
			
			accountInfoDTO.setTradeNumber(rs.getLong("tradeNumber"));
			accountInfoDTO.setAccountNumber(rs.getString("accountNumber"));
			accountInfoDTO.setIncome(rs.getLong("income"));
			accountInfoDTO.setIncomeKind(rs.getInt("incomeKind"));
			accountInfoDTO.setAccountBalance(rs.getLong("AccountBalance"));
			accountInfoDTO.settradeDate(rs.getDate("tradedate"));

			ar.add(accountInfoDTO);
		}

		rs.close();
		st.close();
		con.close();

		return ar;
	}


	//입출금
	public int income(AccountInfoDTO accountInfoDTO) throws Exception {
		Connection con = null;
		PreparedStatement st = null;
		int result = 0;

		con = DBConnetor.getConnection();
		String sql = "insert into accountInfo values(trade_seq.nextval,?,?,?,?,sysdate)";
		st = con.prepareStatement(sql);

		st.setString(1, accountInfoDTO.getAccountNumber());
		st.setLong(2, accountInfoDTO.getIncome());
		st.setLong(3, accountInfoDTO.getAccountBalance());
		st.setInt(4, accountInfoDTO.getIncomeKind());

		result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}
}
