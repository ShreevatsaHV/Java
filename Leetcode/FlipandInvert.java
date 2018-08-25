package array.probs;

public class FlipandInvert {

	public static void main(String[] args) {
		int A[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		int C[][] = {{1,2,3,5},{3,0,6,1},{2,6,9,10},{8,1,4,0}};
		//System.out.println(A.length);
		int B[][] = flipInvertBinary(A);
		int D[][] = flipInvertGeneral(C);
		for(int[]row1: B) {
			for(int val: row1)
		        System.out.print(val+",");
			System.out.println();
		}
		
		System.out.println();
		
		for(int[]row1: D) {
			for(int val: row1)
		        System.out.print(val+",");
			System.out.println();
		}
	}

	private static int[][] flipInvertBinary(int[][] A) {
		//System.out.println(A.length);
		int C = A[0].length;
        for (int[] row: A)
            for (int i = 0; i < (C + 1) / 2; i++) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
	}
	private static int[][] flipInvertGeneral(int[][] A) {
		//System.out.println(A.length);
		int C = A[0].length;
        for (int[] row: A)
            for (int i = 0; i < (C + 1) / 2; i++) {
                int tmp = row[i];
                row[i] = row[C - 1 - i];
                row[C - 1 - i] = tmp;
            }

        return A;
	}
}
