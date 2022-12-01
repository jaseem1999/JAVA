package com.jdbc.demo.insertion;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Student {
	public static void main(String[] args) {
		String name;
		int age;
		String course;
		int flag = 0;
			try {
				while(flag == 0) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the name:");
					name = sc.nextLine();
					System.out.println("Enter the age:");
					age = sc.nextInt();
					System.out.println("Enter the course:");
					course = sc.next();
					Class.forName("com.mysql.jdbc.Driver");//first step is Loading JDBS Drive
					String url = "jdbc:mysql://localhost:3306/std_tab";
					Connection con=DriverManager.getConnection(url, "root","Love1999@MySQL");//Second step is Define the connection {URL PORT and database name ,user name ,password 
					PreparedStatement stmt=con.prepareStatement("insert into std_details(student_name,std_age,std_cource)values('"+name+"','"+age+"','"+course+"')");//Create the statement
					int i = stmt.executeUpdate();//Execute Query  
					if(i>0) {
						System.out.println("insertion successfull");
					}else {
						System.out.println("Insertion failure");
					}
					System.out.println("Do you want insert another detaiils");
					System.out.println("1 is No");
					System.out.println("0 is yes");
					flag = sc.nextInt();
	
					con.close();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
