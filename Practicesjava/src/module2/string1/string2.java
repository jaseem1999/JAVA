package module2.string1;

import java.util.Scanner;

public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sce =new Scanner(System.in);
		System.out.println("Enter the string value : ");
		String s = sce.nextLine();
		String r =reverse(s);
		System.out.println(r);
	}
	public static String reverse(String s) {
		String rev="";
		if(s == null) {
			return null;
		}
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}
}
