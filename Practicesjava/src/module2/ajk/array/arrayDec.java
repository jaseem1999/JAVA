package module2.ajk.array;

import java.util.Scanner;

//Array deceleration 
public class arrayDec {
	public static void main(String[] args) {
		
		arrayDwithInSize();
		arrayDwithOutSize();
	}
	static void arrayDwithInSize(){
		//array deceleration without size
		int number[] = {10,20,10};
		//Array are printing For Each Tech
		for (int a: number) {
			System.out.println(a);
		}
		//For loop tech of printing
		for(int i = 0; i< number.length; i++) {
			System.out.println(number[i]);
		}
	}
	static void arrayDwithOutSize() {
		//array deceleration with in size
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arraya size = ");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the values = ");
		for( int i =0 ; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		for(int i = 0; i<num.length;i++ ) {
			System.out.println(num[i]);
		}
		
	}
			
}

