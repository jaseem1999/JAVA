package module2.ajk;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value ");
		String s = sc.next();
		int flag= 0;
		s = s.toLowerCase();
		int n = s.length();
		for (int i = 0 ; i <= n/2; i++ ) {
			if (s.charAt(i)==s.charAt(n-1)) {
				flag = 1;
			}else {
				flag =0;
			}
		}
		if (flag == 1) {
			System.out.println("Palindrome ");
		}
		if (flag == 0) {
			System.out.println("NOT");
		
		}
	}
	
	

}
