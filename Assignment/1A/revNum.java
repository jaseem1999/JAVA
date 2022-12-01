//How to reverse a number in java

import java.util.Scanner;
class NumReverse {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Phone Number");
           int Num = sc.nextInt();
           System.out.println("Your Phone Number = " + Num);
		int revNum = 0;                                     // 0 decleared
           while(Num != 0){                                    // 12 not equal to zero = {true} entered in loop {round1 = true,round2 = true, round3 is equal to 0 = fals}
			revNum = (revNum * 10) + (Num % 10);           // Round1{0*10 = 0  12%10= 2 0+2 =2=revNum } --> Round2{2*10 = 20  1%10=1  20+2 =21=revNum }
			Num = Num / 10;                                // round1{12/2 =1= Num}--> round2{1/10=0}
		}
		System.out.print("Revised Number = ");
		System.out.println(revNum); 
	}
}