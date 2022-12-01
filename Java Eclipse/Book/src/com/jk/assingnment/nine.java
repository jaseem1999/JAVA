package com.jk.assingnment;

import java.util.Iterator;

public class nine {

	public static void main(String[] args) {
//		pyramid p10 = new pyramid();
//		p10.loop();
		hollowRectangle q11 =new hollowRectangle();
	    q11.loop();
	}
	

}
/*
  *****
  *   *
  *   *
  *****
 */
class hollowRectangle {
	void loop() {
		int num = 4;
		int clumns = 5;
		for (int i = 0	 ; i<= num-1; i++) {
			for(int j = 0 ; j < clumns; j++) {
				if (i == 0 || i == num - 1 || j == 0 || j == clumns -1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
		
	}
}
class pyramid{
/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
	public void loop() {
		int num = 5;
		for(int i = num; i >= 1 ; i--) {
			for(int no = 1; no <= i; no++) {
				System.out.print(no);
			}
    	   System.out.println();
		}
	}
}
