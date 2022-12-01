package module2.ajk.assignment;

import java.util.Scanner;
import java.util.Arrays;
//Write A Java Program How to Merge Two Arrays 
public class ArrayMerge {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("First array");
		// array size
		System.out.print("Enter the first array size = ");
		int size = sc.nextInt();
		// elements input
		System.out.println("Enter the first array elements = ");
		int[] num1 = new int[size];
		for ( i = 0; i < num1.length; i++) {
			 num1[i]=sc.nextInt();
		}
		for ( i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
	

		System.out.println("second array");
		// array size
		System.out.print("Enter the second array size = ");
		int size1 = sc.nextInt();
		// elements input
		System.out.println("Enter the second array elements = ");
		int[] num = new int[size1];
		for ( i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		for ( i = 0; i < num1.length; i++) {
			System.out.println(num[i]);
		}
		//merge
		int num3 = num1.length; 
		int num4 = num.length;
		int length = num3 + num4;
		int[] result = new int[length];
		System.arraycopy(num1, 0, result, 0, num3);
        System.arraycopy(num, 0, result, num3, num4);
        System.out.print("Merge array is = ");
        System.out.print(Arrays.toString(result));
        
		
	}
	
		

}
