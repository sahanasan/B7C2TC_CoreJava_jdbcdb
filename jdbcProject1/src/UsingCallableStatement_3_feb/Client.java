package UsingCallableStatement_3_feb;

import java.sql.Connection;
import java.sql.SQLException;

public class Client {
	public static void main(String[] args) throws SQLException {

		Connection connection = DBUtil2.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
	}
}
