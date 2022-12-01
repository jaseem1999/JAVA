package module2.ajk.comparable.book;

import java.util.Arrays;

public class BookTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] arr= {new Book("java", 540),
					new Book("php", 140),
					new Book("c", 260),
					new Book("android", 440)};
		Arrays.sort(arr);
		for (Book book : arr) {
			System.out.println(book);
		}
	}

}
