import java.util.Scanner;

public class Task2{

	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);

		System.out.println("Enter 4digit number: ");

		String userInput = myobj.nextLine();
		char[] arr = new char[userInput.length()];

		for (int i = 0; i < userInput.length(); i++) {
			arr[i] = userInput.charAt(i);
		}

		boolean isEqual = true; 
		for (int i = 0; i < userInput.length(); i++) {
			if(arr[i] == arr[0]){
				isEqual = true;
			}else{
				isEqual = false;
				break; 
			}
		}

		if (isEqual == true) {
			System.out.println("It's equal!");
		}else{
			System.out.println("It's not equal");
		}
	}
}