package _12_DB_Conn;

import java.sql.*;
import java.util.ArrayList;

class MysqlCon {

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
			
			for(int i = 0;i<a.size(); i++)
			{
				stmt.executeQuery("insert into class1 values("+a.get(1)+",'"+z.get(i)+"'");
			}
			
			ResultSet rs = stmt.executeQuery("select * from class1");
			
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}