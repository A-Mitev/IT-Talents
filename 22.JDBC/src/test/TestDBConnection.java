package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDBConnection {

	public static void main(String[] args) {

		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root",
					"root");

			Statement statement = connect.createStatement();
			

			String sqlInsert = "INSERT INTO `mydb`.`cart` (`ProductID`, `Broiki`, `CartID`)"
					+ " VALUES ('2', '20', '2')";

			statement.executeUpdate(sqlInsert);
			
			ResultSet result = statement.executeQuery("select * from mydb.Cart");
//			ResultSetMetaData testResult = (ResultSetMetaData) result.getMetaData();
//			System.out.println(testResult);

			while (result.next()) {

				System.out.println(result.getInt("ProductID"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
