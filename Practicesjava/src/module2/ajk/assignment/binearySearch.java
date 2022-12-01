package module2.ajk.assignment;

import java.util.Scanner;

//Write A Java Program for Binary Search Using Array
public class binearySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array = ");
		int size = sc.nextInt();
		int[] num = new int [size];
		System.out.println("Enter the elements");
		for (int i = 0; i < num.length; i++) {
			num[i] += sc.nextInt();
		}
		//sorting
		int temp = 0;
		System.out.println("Sorted values");
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.println(num[i]);
		}
		System.out.println("enter search value = ");
		int search = sc.nextInt();
		//binary algorithm 
		int firstI =0;
		int lastI = num.length;
		int flag = 0;
		while(firstI <= lastI) {
			int midl = (firstI+lastI)/2;
			if (num[midl] == search) {
				System.out.println("element indx is = "+midl);
				System.out.println("value is = "+num[midl]);
				flag =1;
				break;
			}
			
			if(num[midl]<search) {
				firstI = midl+1;
			}
			if(num[midl]>search) {
				lastI = midl-1;
			}
		}
		if(flag == 0) {
			System.out.println("No element ");
		}
	}
}
