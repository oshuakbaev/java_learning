import java.util.Scanner;

public class Task2_1{
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 

		System.out.println("Enter n:"); 
		int n = myObj.nextInt();		

		System.out.print("Enter x between -1<=x<1: ");
		double x = myObj.nextDouble();
		double sum = 0;

		if(x<=1 && x>=-1){
			for (int i = 1; i <= n; i++) {
			
				sum += ((1/i)*Math.pow(x,i+1)/(i+1)); 	
			}

			sum*=2;

			System.out.println(sum);	
		}else{
			System.out.println("Error input correct number"); 
		}

		
	}
}