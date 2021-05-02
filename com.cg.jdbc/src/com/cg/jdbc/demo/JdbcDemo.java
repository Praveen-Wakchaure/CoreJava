package com.cg.jdbc.demo;



import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		System.out.println(con);
	}

}