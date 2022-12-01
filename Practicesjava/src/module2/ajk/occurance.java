package module2.ajk;

import java.util.Scanner;

public class occurance {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");//jaseem
		String s = sc.next();
		
		String pi = "";//tamp variable  
		for(int i= 0 ;i <s.length();i++) {//loop for the scanning the string 
			char c =s.charAt(i);	
			if (pi.indexOf(c)!= -1) 
				continue;
			int k = getCount(s,c);
			System.out.println(c+"  ="+k);
			pi+=c;
		}	
	}
	static int getCount(String s,char c) {
		String d=s.replace(c+"","");
		return s.length()-d.length();
	}
}
