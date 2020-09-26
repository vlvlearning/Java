package _12_DB_Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class cl_db {

	public static void main(String[] args) {
		try {

			ArrayList<Integer> a = new ArrayList<Integer>();
			a.add(1);
			a.add(2);

			ArrayList<String> z = new ArrayList<String>();
			z.add("Geo");
			z.add("Space");

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/java", "root", "root");
			// heere sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			Statement stmt1 = con.createStatement();
			for (int i = 0; i < z.size(); i++) {
				stmt1.execute("insert into class1 values('" + z.get(i).toString()
						+ "'," + a.get(i) +")");
			}

			ResultSet rs = stmt.executeQuery("select * from class1");

			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getInt(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
