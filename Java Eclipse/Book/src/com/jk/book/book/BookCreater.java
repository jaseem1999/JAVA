package com.jk.book.book;

import java.util.Scanner;

public class BookCreater {
	static Book BookNewCreator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title = ");
		String t =sc.next();
		System.out.println("Enter the authour name = ");
		String a=sc.next();
		System.out.println("Enter the price = ");
		double p= sc.nextDouble();
		return new Book(t,a,p);
		
	}
}
