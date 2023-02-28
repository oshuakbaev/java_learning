import java.util.Scanner;

public class Task2_2{

	static int factorial(int number){
		if(number == 0){
			return 1; 
		}else{
			return (number*factorial(number-1));
		}
	}
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 

		System.out.println("Enter n:"); 
		int n = myObj.nextInt();		

		System.out.print("Enter x: ");
		int x = myObj.nextInt();
		double sum = 0;

		for (int i = 0; i < n; i++) {
			
			sum += Math.pow(-1,i)*(2*i*Math.pow(x,2*i+1))/(factorial(2*i+1));
		}

		System.out.println(sum);

	}
}