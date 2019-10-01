package com.design.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.Runtime;

public class JDBCSingletonDemo {

	public static void main(String[] args) {
		
		JDBCSingleton obj = JDBCSingleton.getInstance();
		Connection connection = obj.con;
		System.out.println(connection);
		
		JDBCSingleton obj1 = JDBCSingleton.getInstance();
		Connection connection1 = obj1.con;
		System.out.println(connection1);
	}

}
class JDBCSingleton {

	// Step 1
	// create a JDBCSingleton class.
	// static member holds only one instance of the JDBCSingleton class.

	private static JDBCSingleton jdbc;
	Connection con = null;
	
	// JDBCSingleton prevents the instantiation from any other class.
	private JDBCSingleton() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwanirajput", "root", "ashwani");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Now we are providing global point of access.
	public static JDBCSingleton getInstance() {
		if (jdbc == null) {
			jdbc = new JDBCSingleton();
		}
		return jdbc;
	}

	
}
