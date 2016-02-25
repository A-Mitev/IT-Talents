
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {

		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root",
					"");

			Statement statement = connect.createStatement();

			String sqlInsert = "INSERT INTO `mydb`.`cart` (`ProductID`,`product`, `Broiki`,`PurchasePrice`, `CartID`)"
					+ " VALUES ('4','88', '40','3000', '4')";

//			statement.executeUpdate(sqlInsert);

			ResultSet result = statement.executeQuery("select * from mydb.Cart");
			// ResultSetMetaData testResult = (ResultSetMetaData)
			// result.getMetaData();
			// System.out.println(testResult);

			ResultSetMetaData md = result.getMetaData();

			for (int i = 1; i <= 5; i++) {
				System.out.print(md.getColumnLabel(i) + " ");
			}
			System.out.println();
			while (result.next()) {

				System.out.println(result.getInt("ProductID") + "         " + result.getInt("product") + "      "
						+ result.getInt("Broiki") + "     " + result.getInt("PurchasePrice") + "          "
						+ result.getInt("CartID"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}