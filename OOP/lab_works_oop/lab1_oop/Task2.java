// Task2
import java.util.Scanner; 


public class Task2{
	
	public static void main(String[] args){

		Scanner first_number = new Scanner(System.in);
		Scanner second_number = new Scanner(System.in);
		Scanner third_number = new Scanner(System.in);

		System.out.println("Input your 3 numbers: "); 

		int first_number_input = first_number.nextInt();
		int second_number_input = second_number.nextInt();
		int third_number_input = third_number.nextInt();


		int medium = (first_number_input+second_number_input+third_number_input)/3;
		System.out.println("Your medium number:" + medium);

	}
}