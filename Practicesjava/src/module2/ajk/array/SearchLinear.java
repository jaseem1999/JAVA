package module2.ajk.array;

import java.util.Scanner;
//Leaner Search
public class SearchLinear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values ");
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Show the value ");
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the search number");
		int sr = sc.nextInt();
		int flag = 0;
		int got = 0;
		int index =0;
		for(int i = 0; i < arr.length; i++) {
			if(sr == arr[i]) {
				flag = 1;
				got = arr[i];
				index = i+1;
			}
		}
		if (flag == 1) {
			System.out.println("search element is = "+ got + " index = "+ index);
		}else {
			System.out.println("No elements");
		}
		sc.close();
	}
}
