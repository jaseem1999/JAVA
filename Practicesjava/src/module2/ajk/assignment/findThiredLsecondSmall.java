package module2.ajk.assignment;

import java.util.Scanner;

// How To Find Third Largest and Second Smallest Element in An Array 
public class findThiredLsecondSmall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// array size
		System.out.print("Enter the array size = ");
		int size = sc.nextInt();
		// elements input
		System.out.println("Enter the values or elements = ");
		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		// sorting the elements assenting order
		System.out.println("Sorted order");
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
			System.out.println(num[i]);
		}
		// Algorithm for element 3rd Largest = num.length - 3 and second smallest element =  num[i+1]
		int thirdLgst = num[num.length-3];
		int secondSmallest = num[1];
		System.out.print("Third Largest Number is = ");
		System.out.print(thirdLgst);
		System.out.println();
		System.out.print("second smallest Number is = ");
		System.out.print(secondSmallest);
	}

}
