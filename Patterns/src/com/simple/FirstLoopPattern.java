package com.simple;


public class FirstLoopPattern {
	public static void main(String[] args) {
		for (int i = 0; i<5;i++) {
			for(int k = 0; k < 5-i-1; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
			
			
		}
//		   1 
//		  2 2 
//		 3 3 3 
//		4 4 4 4 
		
	}

}
