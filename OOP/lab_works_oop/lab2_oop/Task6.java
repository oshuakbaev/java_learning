import java.util.Scanner; 
// import 

public class Task6{

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);

		int userInput = myObj.nextInt(); 

		int userInputPositive = Math.abs(userInput);
		int userInputNegative = -userInputPositive;
		System.out.println("Positives: " + userInputPositive);
		System.out.println("Negative: " + userInputNegative);
	}
}