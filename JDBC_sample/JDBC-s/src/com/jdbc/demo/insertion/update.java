package com.jdbc.demo.insertion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_tab", "root", "Love1999@MySQL");
			PreparedStatement stmn = con.prepareStatement("update std_details set student_name = 'JKalappatt' where std_id =1;");
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
