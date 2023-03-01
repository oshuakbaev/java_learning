public class Seven{

	public static void main(String[] args) {
	
		int n = 3;
		int m = 3; 

		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

		int sum_first_diogn = 0;
		int sum_second_diogn=0;
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++) {
				if(i == j){
					sum_first_diogn += arr[j][j];
				}

				if((i+j) == m-1){
					sum_second_diogn += arr[i][j] ; 
				}
			}
		} 

		System.out.println("Sum of first diagonal "+sum_first_diogn);
		System.out.println("Sum of second diagonal "+sum_second_diogn);


	}
}
