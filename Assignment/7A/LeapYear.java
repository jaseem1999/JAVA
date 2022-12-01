//Write a program to check whether the input year is Leap year or not
import java.util.Scanner;
class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year = sc.nextInt();
		System.out.println(year);
		System.out.println();
		System.out.println();
		if (year % 4 == 0) { // ever 4 each year is leap year
			System.out.println("is Leap Year = " + year);
            }else{
			System.out.println("is NOT Leap Year = " + year);
		} 
	}
}