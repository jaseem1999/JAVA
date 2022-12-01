package module2.ajk.assignment;

import java.util.Scanner;

public class repeatedCh {
	//Write a program to print repeated characters from a given String;
	public static void main(String[] args) {
		//input string
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string ");
		String word = sc.next();
		word = word.toLowerCase();
		char checkFirst,checkSecond;
		int flag=0;
		char rep = 0;
		for (int i = 0; i < word.length(); i++) {
			checkFirst = word.charAt(i);
			for (int j = i+1; j < word.length(); j++) {
				checkSecond = word.charAt(j);
				if (checkFirst == checkSecond) {
					flag =1;
					rep = checkFirst;
				}
			}
		}
		if (flag == 1) {
			System.out.println("There is repeated character "+ " '"+rep+"' " +" It's the repeated character ");
		} else {
			System.out.println("There is no repeated character "+ word);
		}
		sc.close();
	}

}
