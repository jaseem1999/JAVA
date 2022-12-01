package module2.ajk.MultidimensionalArray;
//matrix deceleration 
public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[3][3];//matrix deceleration
		matrix [0][0]=1;
		matrix [0][1]=2;
		matrix [0][2]=3;
		matrix [1][0]=10;
		matrix [1][1]=20;
		matrix [1][2]=30;
		matrix [2][0]=100;
		matrix [2][1]=200;
		matrix [2][2]=300;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(" |"+matrix[i][j]+"|  ");
			}
			System.out.println();
		}
	}

}
