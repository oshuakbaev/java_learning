import java.util.Scanner; 

class Second{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int arr[] = new int[4];

		for (int i = 0; i < 4; i++) {
			int input = scanner.nextInt();
			arr[i] = input;
		}

		int max = arr[0]; 

		for (int i = 0; i < arr.length; i++) {

			if(arr[i]>max){
				max = arr[i];
			}
		}

		System.out.println("the biggest number is " + max);


	}
} 