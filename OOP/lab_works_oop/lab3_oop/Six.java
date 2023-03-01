public class Six{
	
	public static int[][] transposeMatrix(int[][] matrix) {
	    int m = matrix.length;
	    int n = matrix[0].length;
	    int[][] transposedMatrix = new int[n][m];
	    
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            transposedMatrix[j][i] = matrix[i][j];
	        }
	    }
	    
    	return transposedMatrix;
	}
	
	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] transposedMatrix = transposeMatrix(matrix);

		for (int i = 0;i<transposedMatrix.length;i++){
			
			for (int j = 0;j<transposedMatrix.length;j++){
				
				System.out.print(transposedMatrix[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}
}