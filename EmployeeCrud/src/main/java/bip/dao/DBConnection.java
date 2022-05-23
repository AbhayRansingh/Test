package bip.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() throws Exception {
		Connection connection=null;
		String dbUrl="jdbc:postgresql://localhost:5432/biprosdb";
		String dbUsername="postgres";
		String dbPassword="Yamraj@1234";
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
