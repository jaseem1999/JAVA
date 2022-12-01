package module2.ajk.array;

import java.util.Scanner;

//Array reversing
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array length");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the elements = ");
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Reverse =");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

}
