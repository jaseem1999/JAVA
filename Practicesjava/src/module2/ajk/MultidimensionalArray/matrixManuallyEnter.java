package module2.ajk.MultidimensionalArray;

import java.util.Scanner;

public class matrixManuallyEnter {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the rows = ");//Deceleration of the row
		int row = sc.nextInt();
		System.out.print("Enter the column = ");//Deceleration of the column
		int clm = sc.nextInt();
		int[][] matrix = new int[row][clm];//Deceleration of matrix
		System.out.println("Enter the elemets");
		for (int i = 0; i < row; i++) {//Adding the elements 
			for (int j = 0; j < clm; j++) {
				matrix[i][j]= sc.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < row; i++) {//output the matrix 
			for (int j = 0; j < clm; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
