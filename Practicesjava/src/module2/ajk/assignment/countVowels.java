package module2.ajk.assignment;

import java.util.Scanner;

//Write a program to count number of vowels in a given String
public class countVowels {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		str = str.toLowerCase();
		int count =0;
		for(int i= 0 ;i <str.length();i++) {
		
			 if (str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) == 'o'
		         || str.charAt(i) == 'u') {
		                count++;
		            }
			
		}
		 System.out.println("Total no of vowels in string are: " + count);
		 sc.close();
	}
	
}
