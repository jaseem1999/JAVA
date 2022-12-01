package module2.ajk.MultidimensionalArray;

import java.util.Scanner;

public class AdditionOftowMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the rows = ");//Deceleration of the row
		int row = sc.nextInt();
		System.out.print("Enter the column = ");//Deceleration of the column
		int clm = sc.nextInt();
		int[][] matrix1 = new int[row][clm];//Deceleration of matrix1
		System.out.println("Enter first matrix elemets");
		for (int i = 0; i < row; i++) {//Adding the elements 
			for (int j = 0; j < clm; j++) {
				matrix1[i][j]= sc.nextInt();
			}
			System.out.println();
		}
		int[][] matrix2 = new int[row][clm];//Deceleration of matrix2
		System.out.println("Enter second matrix elemets");
		for (int i = 0; i < row; i++) {//Adding the elements 
			for (int j = 0; j < clm; j++) {
				matrix2[i][j]= sc.nextInt();
			}
			System.out.println();
		}
		//Adding the tow matrix
		int[][] matrixRes = new int[row][clm];
	    for (int i = 0; i < row; i++) {
			for (int j = 0; j < clm; j++) {
				matrixRes[i][j] = matrix1[i][j] + matrix2[i][j];
			}
			System.out.println();
		}
	    //Showing the result 
	    for (int i = 0; i < row; i++) {
	    	for (int j = 0; j < clm; j++) {
				System.out.print(" "+matrixRes[i][j]+" |");
			}
			System.out.println();
		}
	    sc.close();
	}

}
