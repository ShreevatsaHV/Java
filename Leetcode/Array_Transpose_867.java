package array.probs;

public class Array_Transpose_867 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int B[][] = {{1,2},{4,6},{8,9}};
		
		int D[][] = transpose(A);
		for(int[]row1: D) {
			for(int val: row1)
		        System.out.print(val+",");
			System.out.println();
		}
	}

	private static int[][] transpose(int[][] A) {
		// TODO Auto-generated method stub
		int m = A.length;
		int n = A[0].length;
		int B[][] = new int[n][m];
		
		for(int i=0; i<m; i++) {
			for(int j=0;j<n;j++) {
				B[j][i] = A[i][j];
			}
		}
		return B;
	}

}
