package com.jspiders.cardekhocasestudy_JDBC.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CarOperation {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;

	public void viewAll() {
		try {
			openConnection();
			query = "SELECT * FROM car";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.print(resultSet.getInt(1) + " | ");
				System.out.print(resultSet.getString(2) + " | ");
				System.out.print(resultSet.getString(3) + " | ");
				System.out.print(resultSet.getString(4) + " | ");
				System.out.print(resultSet.getString(5) + " | ");
				System.out.print(resultSet.getDouble(6) + " | ");
				System.out.println(resultSet.getString(7) + " | ");

			}

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

	public void searchCar(Scanner scanner) {
		boolean flag = true;
		while (flag) {
			System.out.println("=====Search Car Menu====\n" + "1. Search Car By Id  \n" + "2. Search Car By Name  \n"
					+ "3. Search Car By Brand \n" + "4. Search Car By Fuel Type \n" + "5. Search Car By Price \n"
					+ "6. Exit Search Menu \n");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Id :");
				int id = scanner.nextInt();
				try {
					openConnection();
					query = "SELECT * FROM car WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setInt(1, id);
					resultSet = preparedStatement.executeQuery();
					if (resultSet.next()) {
						System.out.print(resultSet.getInt(1) + " | ");
						System.out.print(resultSet.getString(2) + " | ");
						System.out.print(resultSet.getString(3) + " | ");
						System.out.print(resultSet.getString(4) + " | ");
						System.out.print(resultSet.getString(5) + " | ");
						System.out.print(resultSet.getDouble(6) + " | ");
						System.out.println(resultSet.getString(7) + " | ");
					} else {
						System.out.println("Car is not available!");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 2:
				System.out.println("Enter Name :");
				String name = scanner.next();
				try {
					openConnection();
					query = "SELECT * FROM car WHERE name = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, name);
					resultSet = preparedStatement.executeQuery();
					while (resultSet.next()) {
						System.out.print(resultSet.getInt(1) + " | ");
						System.out.print(resultSet.getString(2) + " | ");
						System.out.print(resultSet.getString(3) + " | ");
						System.out.print(resultSet.getString(4) + " | ");
						System.out.print(resultSet.getString(5) + " | ");
						System.out.print(resultSet.getDouble(6) + " | ");
						System.out.println(resultSet.getString(7) + " | ");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 3:
				System.out.println("Enter Brand :");
				String brand = scanner.next();
				try {
					openConnection();
					query = "SELECT * FROM car WHERE brand = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, brand);
					resultSet = preparedStatement.executeQuery();
					while (resultSet.next()) {
						System.out.print(resultSet.getInt(1) + " | ");
						System.out.print(resultSet.getString(2) + " | ");
						System.out.print(resultSet.getString(3) + " | ");
						System.out.print(resultSet.getString(4) + " | ");
						System.out.print(resultSet.getString(5) + " | ");
						System.out.print(resultSet.getDouble(6) + " | ");
						System.out.println(resultSet.getString(7) + " | ");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 4:
				System.out.println("Enter Fuel Type :");
				String fuelType = scanner.next();
				try {
					openConnection();
					query = "SELECT * FROM car WHERE fuelType = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, fuelType);
					resultSet = preparedStatement.executeQuery();
					while (resultSet.next()) {
						System.out.print(resultSet.getInt(1) + " | ");
						System.out.print(resultSet.getString(2) + " | ");
						System.out.print(resultSet.getString(3) + " | ");
						System.out.print(resultSet.getString(4) + " | ");
						System.out.print(resultSet.getString(5) + " | ");
						System.out.print(resultSet.getDouble(6) + " | ");
						System.out.println(resultSet.getString(7) + " | ");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 5:
				System.out.println("Enter Min Price :");
				double minPrice = scanner.nextDouble();
				System.out.println("Enter Max Price :");
				double maxPrice = scanner.nextDouble();
				try {
					openConnection();
					query = "SELECT * FROM car WHERE price BETWEEN ? AND ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setDouble(1, minPrice);
					preparedStatement.setDouble(2, maxPrice);
					resultSet = preparedStatement.executeQuery();
					while (resultSet.next()) {
						System.out.print(resultSet.getInt(1) + " | ");
						System.out.print(resultSet.getString(2) + " | ");
						System.out.print(resultSet.getString(3) + " | ");
						System.out.print(resultSet.getString(4) + " | ");
						System.out.print(resultSet.getString(5) + " | ");
						System.out.print(resultSet.getDouble(6) + " | ");
						System.out.println(resultSet.getString(7) + " | ");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 6:
				flag = false;
				System.out.println("Search Menu Closed");
				break;
			default:

				break;
			}
		}
	}

	public void addCar(Scanner scanner) {
		System.out.println("Enter The Id :");
		int id = scanner.nextInt();
		System.out.println("Enter The Name :");
		String name = scanner.next();
		System.out.println("Enter The Brand :");
		String brand = scanner.next();
		System.out.println("Enter The Model :");
		String model = scanner.next();
		System.out.println("Enter The Fuel Type :");
		String fuelType = scanner.next();
		System.out.println("Enter The Price :");
		double price = scanner.nextDouble();
		System.out.println("Enter The Color :");
		String color = scanner.next();
		try {
			openConnection();
			query = "INSERT INTO car VALUES(?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, brand);
			preparedStatement.setString(4, model);
			preparedStatement.setString(5, fuelType);
			preparedStatement.setDouble(6, price);
			preparedStatement.setString(7, color);
			int res = preparedStatement.executeUpdate();
			System.out.println(res + " row(s) affected");

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

	public void removeCar(Scanner scanner) {
		System.out.println("Enter The Id To Delete The Car :");
		int id = scanner.nextInt();
		try {
			openConnection();
			query = "DELETE FROM car WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			int res = preparedStatement.executeUpdate();
			if (res == 1) {
				System.out.println("Record Deleted");
			} else {
				System.out.println("Car Not Available");
			}

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

	public void editCar(Scanner scanner) {
		System.out.println("Enter The Id To Edit The Car :");
		int id = scanner.nextInt();
		boolean flag = true;
		while (flag) {
			System.out.println("=====Edit Menu====\n" + "1. Edit Name  \n" + "2. Edit Brand \n" + "3. Edit Model \n"
					+ "4. Edit Fuel Type \n" + "5. Edit Price \n" + "6. Edit Color \n" + "7. Exit Edit Menu \n");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter New Name :");
				String name = scanner.next();
				try {
					openConnection();
					query = "UPDATE car SET name = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, name);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("Record Updated");
					} else {
						System.out.println("Car Not Available");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 2:
				System.out.println("Enter New Brand :");
				String brand = scanner.next();
				try {
					openConnection();
					query = "UPDATE car SET brand = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, brand);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("Record Updated");
					} else {
						System.out.println("Car Not Available");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 3:
				System.out.println("Enter New Model :");
				String model = scanner.next();
				try {
					openConnection();
					query = "UPDATE car SET model = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, model);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("Record Updated");
					} else {
						System.out.println("Car Not Available");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 4:
				System.out.println("Enter New Fuel Type :");
				String fuelType = scanner.next();
				try {
					openConnection();
					query = "UPDATE car SET fuelType = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, fuelType);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("Record Updated");
					} else {
						System.out.println("Car Not Available");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 5:
				System.out.println("Enter New Price :");
				double price = scanner.nextDouble();
				try {
					openConnection();
					query = "UPDATE car SET price = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setDouble(1, price);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("Record Updated");
					} else {
						System.out.println("Car Not Available");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 6:
				System.out.println("Enter New Color :");
				String color = scanner.next();
				try {
					openConnection();
					query = "UPDATE car SET color = ? WHERE id = ?";
					preparedStatement = connection.prepareStatement(query);
					preparedStatement.setString(1, color);
					preparedStatement.setInt(2, id);
					int res = preparedStatement.executeUpdate();
					if (res == 1) {
						System.out.println("Record Updated");
					} else {
						System.out.println("Car Not Available");
					}

				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						closeConnection();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				break;
			case 7:
				flag = false;
				break;

			default:
				break;
			}
		}
	}

	private static void openConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4", "root", "root");
	}

	private static void closeConnection() throws SQLException {
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
	}
}
