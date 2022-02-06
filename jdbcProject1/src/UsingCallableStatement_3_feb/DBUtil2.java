package UsingCallableStatement_3_feb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.Properties;
import java.io.IOException;
import java.io.FileNotFoundException;




public class DBUtil2{
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="Sahana@123#45";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/jdbcdb";
	
	private static Connection connection = null;
	private static Properties properties=null;
	static {
		try {
			properties=new Properties();
			properties.load(new FileInputStream("src/database.properties"));

			Class.forName (properties.getProperty(DB_DRIVER_CLASS));
			connection = DriverManager.getConnection(properties.getProperty(DB_URL),properties.getProperty(DB_USERNAME),properties.getProperty(DB_PASSWORD));
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
		}catch (IOException e) {
		}
		}
	public static Connection getConnection(){
		return connection;
	}
}

		
			
		
	
