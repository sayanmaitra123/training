package inventory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public final class JdbcFactory {
	private JdbcFactory() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/sayantraining";

		DriverManager.registerDriver(new Driver());
		Connection conn = DriverManager.getConnection(url, "root", "!9M@rch2oo!");
		return conn;
	}

}
