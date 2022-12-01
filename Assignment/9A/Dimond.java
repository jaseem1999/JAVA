//Write A program To Print Full Diamond Pattern Using ‘*’ In Java 
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
class Dimond {
		public static void main(String[] args){
			int rows = 10;
   			int n , i , j, k;
			n =rows / 2;
			System.out.print(n);
            if(rows%2 == 1){
            for( i=0 ; i<= rows ; i++){
			
                for( j = rows ; j>= i; j--){
					System.out.print(" ");
				}
            	for( k =0 ; k<=i; k++){
					System.out.print(" *");
				}
			System.out.println();
            }
			}
            else if (rows%2 == 0 ){
        		for( i=0 ; i>= rows ; i--){
			
               		for( j = rows ; j<= i; j++){
						System.out.print(" ");
					}
            		for( k =0 ; k>=i; k--){
						System.out.print("* ");
					}
				System.out.println();
		
				}
			}
         	
				
		} 
	}