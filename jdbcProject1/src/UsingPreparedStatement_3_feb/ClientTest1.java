package UsingPreparedStatement_3_feb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientTest1{
	static PreparedStatement ps=null;
	public static void main (String[]args)throws SQLException{
		Connection connection = DBUtil.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
	//String sql="delete from employee_table where employee_name='priya'";
		String sql="update employee_table set employee_name='sahana'where employee_id=2";
		try {
			ps=connection.prepareStatement(sql);
			int n=ps.executeUpdate();
			System.out.println(n);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
			ps.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
			
		}
	}
}
