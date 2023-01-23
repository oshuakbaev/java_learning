import java.util.Scanner; 

public class Main{

	public static void main(String[] args){
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Input username: ");

		String Username = myObj.nextLine();
		
		System.out.println("Username is: "+ Username);

	}
}