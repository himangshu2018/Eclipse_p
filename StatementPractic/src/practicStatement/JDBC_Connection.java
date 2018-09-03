package practicStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("sun.jdbc.odbc.JdbcOdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:odbc:Login_DSN");
		Statement st=con.createStatement();
	}
}
