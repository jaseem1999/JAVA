package module2.ajk.assignment;

import java.util.Scanner;

public class RepeatedCh2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");//jaseem
		String s = sc.next();
		
		String pi = "";//tamp variable  
		int flag = 0;
		for(int i= 0 ;i <s.length();i++) {//loop for the scanning the string 
			char c =s.charAt(i);	
			if (pi.indexOf(c)!= -1) 
				continue;
			int k = getCount(s,c);
			if (k >= 2) {
				flag =1;
				System.out.println(c+"  ="+k + " Its only repeated");
				pi+=c;
			}
			
		}
		if (flag ==0) {
			System.out.println("No repeatation");
		}
	}
	static int getCount(String s,char c) {
		String d=s.replace(c+"","");
		return s.length()-d.length();
	}
}
