//a program to check whether the input number is palindrome or not
import java.util.Scanner;
class Palindrome {
	public static void main(String[] args ){
		Scanner src = new Scanner(System.in);
           System.out.print("Enter a Number : ");
		int num = src.nextInt();
		System.out.println(num);
           int revNum = 0;
           while(num != 0){
    			revNum = (revNum * 10) + (num % 10);
			num = num/10;	
		}
		 int temp = revNum;
        
            
           int revNum2 =0;
		 while(revNum != 0){
			revNum2 = (revNum2 * 10) + (revNum % 10); 
      		revNum = revNum / 10;
		 }
          	 if (revNum2 == temp){
			System.out.println("Its Palindrom No = "+ revNum2 + " is Same Number " + temp );
		 }else{
			System.out.println("Its NOT Palindrom No = "+ revNum2);
		}
	}
}