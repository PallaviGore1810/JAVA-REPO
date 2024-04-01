package com.jspider.jdbc.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUpdate {
	private static Connection connection;
	private static Statement statement;
	private static String query;

	public static void main(String[] args) {
		try {
			openConnection();
			statement = connection.createStatement();
			query = "UPDATE user SET password='suresh@1100' WHERE id=2";
			statement.execute(query);
			System.out.println("Password updated!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void openConnection() throws IOException, SQLException {
		// file object
		File file = new File("D:/J2EE/db_info.txt");
		FileReader fileReader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);
		connection = DriverManager.getConnection(properties.getProperty("url"), properties);
	}

	private static void closeConnection() throws SQLException {
		if (connection != null) {
			connection.close();
		}
		if (statement != null) {
			statement.close();
		}
	}
}
