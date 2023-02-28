import java.util.Scanner;

public class Task2_4{

	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 

		System.out.println("Enter n:"); 
		int n = myObj.nextInt();		

		System.out.print("Enter x between -1<x<1: ");

		double x = myObj.nextDouble();

		if(x<1 && x>-1){
			double sum = 0;

			for (int i = 0; i < n; i++) {
				
				sum += (Math.pow(x,4*i+1))/(4*i+1);
			}
			System.out.println(sum);	
		}else{
			System.out.println("Error input correct number"); 
		}
		
	}
}