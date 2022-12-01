package com.jdbc.demo.insertion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class getQuery {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");//Loading JDBS Drive 
			String url = "jdbc:mysql://localhost:3306/std_tab";
			Connection con = DriverManager.getConnection(url, "root", "Love1999@MySQL");//Connecting the Sql
			Statement stmt= con.createStatement();//Statement
			ResultSet re = stmt.executeQuery("select * from std_details where std_id = 2");//Execute The Query / resultSet
			while(re.next()) {
				System.out.println(re.getInt(1));
				System.out.println(re.getString(2));
				System.out.println(re.getInt(3));
				System.out.println(re.getString(4));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
