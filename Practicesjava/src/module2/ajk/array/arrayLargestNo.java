package module2.ajk.array;

import java.util.Scanner;

public class arrayLargestNo {
//largest number of array
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
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(max<array[i]) {
					max=array[i];
			}
		}
		System.out.println("largest No = "+max);

	}

}
