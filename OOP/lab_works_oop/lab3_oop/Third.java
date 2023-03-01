import java.util.Scanner; 

public class Third{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			int number = scanner.nextInt();
			arr[i] = number;
		}

		int sum = 0; 
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}

		int arith_med = sum/arr.length;

		System.out.println("Arithmetical medium: "+arith_med);

	}
}