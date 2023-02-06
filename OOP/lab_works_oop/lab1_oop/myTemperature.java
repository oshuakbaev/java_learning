import java.util.Scanner; 

public class myTemperature{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in); 

		System.out.println("Input your Celsi:");
		
		int input_read = input.nextInt(); 

		int Farenheit1 = (input_read - 32) * 5/9;

		System.out.println("Your Farenheit is: "+ Farenheit1);

	}
}