package com.jspiders.cardekhowithservlets.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspiders.cardekhowithservlets.object.Car;
import com.mysql.cj.jdbc.Driver;

public class CarJDBC {

	private static Driver driver;
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultset;
	private static String query;

	private static void openConnection() throws SQLException {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4", "root", "root");
	}

	private static void closeConnection() throws SQLException {
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
		if (resultset != null) {
			resultset.close();
		}
		DriverManager.deregisterDriver(driver);
	}

	public static int addCar(int id, String name, String model, String brand, String fuelType, double price,
			String colour) {
		int res = 0;
		try {
			openConnection();
			query = "INSERT INTO car VALUES(?,?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, model);
			preparedStatement.setString(4, brand);
			preparedStatement.setString(5, fuelType);
			preparedStatement.setDouble(6, price);
			preparedStatement.setString(7, colour);
			res = preparedStatement.executeUpdate();
			System.out.println(res + " row(s) affected");
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public static List<Car> searchAllCar() {
		List<Car> cars = new ArrayList<Car>();
		try {
			openConnection();
			query = "SELECT * FROM car";
			preparedStatement = connection.prepareStatement(query);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				Car car = new Car();
				car.setId(resultset.getInt(1));
				car.setName(resultset.getString(2));
				car.setModel(resultset.getString(3));
				car.setBrand(resultset.getString(4));
				car.setFuelType(resultset.getString(5));
				car.setPrice(resultset.getDouble(6));
				car.setColour(resultset.getString(7));
				cars.add(car);
			}
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

	public static int deleteCar(int id) {
		int res = 0;
		try {
			openConnection();
			query = "DELETE FROM car WHERE id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			res = preparedStatement.executeUpdate();
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	public static int updateCarName(int id, String name) {
		int res = 0;

		try {
			openConnection();
			query = "UPDATE car SET name = ? WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(2, id);
			preparedStatement.setString(1, name);
			res = preparedStatement.executeUpdate();
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public static int updateCarModel(int id, String model) {
		int res = 0;
		try {
			openConnection();
			query = "UPDATE car SET model = ? WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(2, id);
			preparedStatement.setString(1, model);
			res = preparedStatement.executeUpdate();
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	public static int updateCarPrice(int id, double price) {
		int res = 0;
		try {
			openConnection();
			query = "UPDATE car SET price = ? WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(2, id);
			preparedStatement.setDouble(1, price);
			res = preparedStatement.executeUpdate();
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	public static int updateCarBrand(int id, String brand) {
		int res = 0;
		try {
			openConnection();
			query = "UPDATE car SET brand = ? WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(2, id);
			preparedStatement.setString(1, brand);
			res = preparedStatement.executeUpdate();
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	public static int updateCarFuelType(int id, String fuelType) {
		int res = 0;
		try {
			openConnection();
			query = "UPDATE car SET fuelType = ? WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(2, id);
			preparedStatement.setString(1, fuelType);
			res = preparedStatement.executeUpdate();
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	public static int updateCarColour(int id, String colour) {
		int res = 0;
		try {
			openConnection();
			query = "UPDATE car SET colour = ? WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(2, id);
			preparedStatement.setString(1, colour);
			res = preparedStatement.executeUpdate();
			closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}

	public static List<Car> searchCarByName(String name) {
		List<Car> cars = new ArrayList<Car>();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE name=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				Car car = new Car();
				car.setId(resultset.getInt(1));
				car.setName(resultset.getString(2));
				car.setModel(resultset.getString(3));
				car.setBrand(resultset.getString(4));
				car.setFuelType(resultset.getString(5));
				car.setPrice(resultset.getDouble(6));
				car.setColour(resultset.getString(7));
				cars.add(car);
			}
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

	public static List<Car> searchCarByModel(String model) {
		List<Car> cars = new ArrayList<Car>();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE model=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, model);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				Car car = new Car();
				car.setId(resultset.getInt(1));
				car.setName(resultset.getString(2));
				car.setModel(resultset.getString(3));
				car.setBrand(resultset.getString(4));
				car.setFuelType(resultset.getString(5));
				car.setPrice(resultset.getDouble(6));
				car.setColour(resultset.getString(7));
				cars.add(car);
			}
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

	public static List<Car> searchCarByBrand(String brand) {
		List<Car> cars = new ArrayList<Car>();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE brand=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, brand);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				Car car = new Car();
				car.setId(resultset.getInt(1));
				car.setName(resultset.getString(2));
				car.setModel(resultset.getString(3));
				car.setBrand(resultset.getString(4));
				car.setFuelType(resultset.getString(5));
				car.setPrice(resultset.getDouble(6));
				car.setColour(resultset.getString(7));
				cars.add(car);
			}
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

	public static List<Car> searchCarByPrice(double price) {
		List<Car> cars = new ArrayList<Car>();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE price=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDouble(1, price);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				Car car = new Car();
				car.setId(resultset.getInt(1));
				car.setName(resultset.getString(2));
				car.setModel(resultset.getString(3));
				car.setBrand(resultset.getString(4));
				car.setFuelType(resultset.getString(5));
				car.setPrice(resultset.getDouble(6));
				car.setColour(resultset.getString(7));
				cars.add(car);
			}
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

	public static List<Car> searchCarByFuelType(String fuelType) {
		List<Car> cars = new ArrayList<Car>();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE fuelType=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, fuelType);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				Car car = new Car();
				car.setId(resultset.getInt(1));
				car.setName(resultset.getString(2));
				car.setModel(resultset.getString(3));
				car.setBrand(resultset.getString(4));
				car.setFuelType(resultset.getString(5));
				car.setPrice(resultset.getDouble(6));
				car.setColour(resultset.getString(7));
				cars.add(car);
			}
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

	public static List<Car> searchCarByColour(String colour) {
		List<Car> cars = new ArrayList<Car>();
		try {
			openConnection();
			query = "SELECT * FROM car WHERE colour=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, colour);
			resultset = preparedStatement.executeQuery();
			while (resultset.next()) {
				Car car = new Car();
				car.setId(resultset.getInt(1));
				car.setName(resultset.getString(2));
				car.setModel(resultset.getString(3));
				car.setBrand(resultset.getString(4));
				car.setFuelType(resultset.getString(5));
				car.setPrice(resultset.getDouble(6));
				car.setColour(resultset.getString(7));
				cars.add(car);
			}
			closeConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cars;
	}

}
