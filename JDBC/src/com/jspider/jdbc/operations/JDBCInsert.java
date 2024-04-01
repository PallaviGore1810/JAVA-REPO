package com.jspider.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
	public static void main(String[] args) throws SQLException {
		// Load and register the Driver
		Driver driver = new com.mysql.cj.jdbc.Driver();//qualified name of driver imp 
		DriverManager.registerDriver(driver);

		// Open connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root && password=root");
															//qualified db url

		// Create the statement
		Statement statement = connection.createStatement();

		// Execute the statement
		statement.execute("INSERT INTO user VALUES(1,'Ramesh','ramesh@gmail.com','Ramesh@123')");

		// Process the result
		System.out.println("Data Inserted!");

		// Close the connection
		statement.close();
		connection.close();

		// DeRegister the driver
		DriverManager.deregisterDriver(driver);

	}
}
