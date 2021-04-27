package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcTesting {

	public static void main(String[] args) throws SQLException {
		String host="localhost";
		String port="3306";
		String Query="select * from test";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/mayank", "root", "admin$1");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery(Query);
		while(rs.next())
		System.out.println(rs.getString("uname"));
		System.out.println(rs.getString("password"));

	}

}
