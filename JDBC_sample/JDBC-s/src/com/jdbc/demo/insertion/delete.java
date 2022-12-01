package com.jdbc.demo.insertion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_tab", "root", "Love1999@MySQL");
			PreparedStatement stmn = con.prepareStatement("delete from std_details where std_id = 3;");
			int i = stmn.executeUpdate();
			if (i >0) {
				System.out.println("Successfully");
			} else {
				System.out.println("Failuer");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
