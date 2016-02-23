package TestovaVruzka;

import java.sql.DriverManager;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection connect = DriverManager.getConnection("com.mysql.jdbc.Driver@localhost:")
	}
}
