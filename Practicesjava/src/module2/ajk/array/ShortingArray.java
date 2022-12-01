package module2.ajk.array;
// Assenting and dissenting orders in array
import java.util.Scanner;

public class ShortingArray {
	
	public static void main(String[] args) {
		ShortingArray obj  =new ShortingArray();
		obj.assenting();
		obj.dissenting();
	}
	
	
	//Assenting order 
	void assenting() {
		//Creating the array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array length");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the elements = ");
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i<array.length;i++) {
			for(int j = i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int tmp = array[i];
				    array[i] = array[j];
				    array[j] = tmp;
				}
			}
		}
		System.out.println("Assenting order ");
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	//dissenting order
	void dissenting() {
		//Creating the array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array length");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.print("Enter the elements = ");
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 0 ; i < array.length; i++) {
			for(int j = i + 1 ; j<array.length ; j++ ) {
				if (array[i] < array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp; 		
				}
			}
		}
		System.out.println("Dissenting order ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		sc.close();
	}

}
