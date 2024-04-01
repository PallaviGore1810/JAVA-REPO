package com.jspider.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDelete2 {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
//	private static ResultSet resultSet;
	private static String query;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id of the user: ");
		int id = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("Enter user password: ");
//		String password=scanner.nextLine();
		try {
			openConnection();
			query = "DELETE FROM user WHERE id=?";
			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(4,password);
			preparedStatement.setInt(1, id);
			int res = preparedStatement.executeUpdate();
			if (res == 1) {
				System.out.println(res + " rows affected");
			} else {
				System.out.println("User not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

	private static void openConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4", "root", "root");
	}

	private static void closeConnection() throws SQLException {
//		if (resultSet!=null) {
//			Resultset.close;
//		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
	}
}
