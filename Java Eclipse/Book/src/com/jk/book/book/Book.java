package com.jk.book.book;

public class Book {
	String title;
	String author;
	double price;
	Book(String t,String a, double p) {
		// TODO Auto-generated constructor stub
		title = t;
		author = a;
		price = p;
	}
	public void Desplay() {
		System.out.println("Title = "+ title);
		System.out.println("author = "+ author);
		System.out.println("price = "+ price);
	}
}
