package module2.ajk.assignment;

import java.util.Scanner;

//Write a program to convert Given String onto uppercase and lowercase without using String Method

public class lowercase {

	public static void main(String[] args) {
		//Input string
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter the string");
		String word = sc.nextLine();
		char word2[] = word.toCharArray();
		System.out.println("Your entered String = "+word);
		//Check Uppercase or lowercase
		for (int i = 0; i < word.length(); i++) { 
			if (word2[i]>='A' && word2[i]<='Z'  ) {
				word2[i]= (char)( (int) word2[i]+32);
			}else {
				if (word2[i]>='a' && word2[i]<='z'  ) {
					word2[i]= (char)( (int) word2[i]-32);
				}
			}
			
		}
		//if any character is uppercase change to lowercase
		System.out.println(word2);
		sc.close();
	}

}
