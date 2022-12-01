//Write a java program that takes 5 numbers as input and calculate the average of the number
import java.util.Scanner;
class SumOfFive {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Manually handle
		System.out.println("Mannully Haandle");
		System.out.print("Enter a Five Number= ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int avg = num1 + num2 + num3 + num4 + num5/5;
		System.out.println("Average = "+ avg);
          //Loop handle
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Loop Haandle");
		System.out.print("Enter Inputs");
		int input = sc.nextInt();
           int numb =0;
		for (int i = 1 ; i <= input ; i++ ){
			System.out.println("Enter The Numbers : ");
                numb += sc.nextInt(); 
		}
		System.out.println(numb);
		System.out.println(input);
		int ans = numb/input;
		System.out.println("Average = "+ ans);
	}
}