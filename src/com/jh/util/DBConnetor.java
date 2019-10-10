package com.jh.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnetor {
	
	public static Connection getConnection() throws Exception {
		
		Connection con = null;
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@192.168.56.101:1521:xe";
		String drvier = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(drvier);
		
		con = DriverManager.getConnection(url, user, password);
				
		
		return con;
	}
	
}
