package com.dev.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getOracleDBConnection(String uri, String user, String password) {
		Connection connection = null;
		org.apache.commons.dbutils.DbUtils.loadDriver("oracle.jdbc.driver.OracleDriver");
		try {
			connection = DriverManager.getConnection(uri, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("suceessFully Connected :"+connection.getMetaData().getURL()+" user :"+connection.getMetaData().getUserName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;

	}
}
