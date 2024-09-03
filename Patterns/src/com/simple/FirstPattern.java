package com.simple;

public class FirstPattern {

	public static void main(String[] args) {
//		******
//		*****
//		****
//		***
//		**
//		*
		for (int i = 5; i >= 0; i--) {
			for(int k =0 ; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//		*
//		**
//		***
//		****
//		*****
		for(int i = 0; i<5; i++) {
			for(int k = 0; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
//			*
//		   **
//		  ***
//		 ****
//		*****
		
		 for (int i = 1; i <= 5; i++) {
	           
	            for (int j = 1; j <= 5 - i; j++) {
	                System.out.print(" ");
	            }
	            
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	           
	            System.out.println();
	     }
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		 System.out.println();
		 for (int i = 1; i <= 5; i++) {
			 for(int j = 5 ; j >= i; j--) {
				 System.out.print("*");
			 }
			 System.out.println();
			 for(int k=0; k<i;k++) {
				 System.out.print(" ");
			 } 
		 }
		 System.out.println();
		 
//		 * * * * * *
//		  * * * * *
//		   * * * *
//		    * * *
//		     * *
//		      *
		 for (int i = 1; i <= 5; i++) {
			 for(int j = 5 ; j >= i; j--) {
				 System.out.print("* ");
			 }
			 System.out.println();
			 for(int k=0; k<i;k++) {
				 System.out.print(" ");
			 }
			 
			 
		 }
//		****
//		 ****
//		  ****
//		   ****
		 System.out.println();
		 for(int i =0; i<5; i++) {
			 for(int j =0; j<5; j++) {
				 
				 System.out.print("*");
			 }
			 System.out.println();
			 for(int k = 0; k<=i ;k++) {
				 System.out.print(" ");
			 }
		 }
//		 *****
//		 *   *
//		 *   *
//		 *	 *
//		 *****
		 
		 System.out.println();
		 for(int i =0; i<5; i++) {
			 for(int k = 0; k<5; k++) {
				 if(i == 0 || i == 5-1) {
					 System.out.print("* ");
				 }
				 else if(k == 0 || k ==5-1) {
					 System.out.print("* ");
				 }
				 else{
					 System.out.print("  ");
				 }
				 
			 }
			 System.out.println();
		 }
//		   * 
//		  * * 
//		 *   * 
//		* * * *
		 
		 System.out.println();
		 
		 for (int i = 0; i<6;i++) {
				for(int k = 0; k < 6-i-1; k++) {
					System.out.print(" ");
				}
				
				for (int j = 0; j < i; j++) {
					if(j == 0 || j == i-1 || i == 6-1)
						System.out.print("* ");
					else {
						System.out.print("  ");
					}
				}
				
				System.out.println();
				
				
		}
		System.out.println();
//		 * * * * * *
//		  *       *
//		   *     *
//		    *   *
//		     * *
//		      *
		for (int i = 1; i <= 5; i++) {
			 for(int j = 5 ; j >= i; j--) {
				if(j == 5 || j == i || i == 5 || i == 1)
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			 }
			 System.out.println();
			 for(int k=0; k<i;k++) {
				 System.out.print(" ");
			 }
			 
			 
		 }
		
		System.out.println();
//		        * 
////		   * * 
////		  *   * 
////		 *     * 
////		*       * 
////		 *     *
////		  *   *
////		   * *
////		    *
		for (int i = 0; i<6;i++) {
			for(int k = 0; k < 6-i-1; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				if(j == 0 || j == i-1 )
					System.out.print("* ");
					
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
			
			
		}
		for (int i = 1; i <= 4; i++) {
			 for(int j = 4 ; j >= i; j--) {
				if(j == 4 || j == i)
					System.out.print(" *");
				
				else 
				{
					System.out.print("  ");
				}
			 }
			 System.out.println();
			 for(int k=0; k<i;k++) {
				 System.out.print(" ");
			 }
			 
			 
		 }
		System.out.println();
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
		int num = 1;
		for(int i = 0; i<4; i++) {
			for(int k = 0; k <=i; k++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		System.out.println();
	
//		    1
//	       1 1
//	      1 2 1
//	     1 3 3 1
//	    1 4 4 4 1
//	   1 5 5 5 5 1
//	  1 6 6 6 6 6 1
//	 1 7 7 7 7 7 7 1
	int num2= 0;
	 for(int i = 1; i <= 8; i++) {
		 for(int k =1; k <= 8-i; k++ ) {
			 System.out.print(" ");
		 }
		 for(int j = 1; j<=i ; j++) {
			 if(j == 1 || j == i) {
				 System.out.print(" 1");
			 }else {
				 System.out.print(" "+num2);
				 
			 }
			 
		 }
		 num2++;
		 System.out.println();
	 }
	
//	   *
//     **
//     ***
//     ****
//     ***
//     **
//     *
	 System.out.println();
	 for(int i = 1; i<=7; i++) {
		 
		if(i >= 4) {
			for(i = 4; i>=0; i--) {
				for(int j= 1; j<=i; j++) {
					System.out.print("*");	
				}
				System.out.println();
				if(i == 0) {
					return;
				}
				
			}
		}else {
			for(int j= 1; j<=i; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
	 }
	 
//	    *
//     * *
//    *   *
//   *******

			
			
		
	}

}
