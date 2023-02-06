import java.util.Scanner;

public class Task3{

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter 2 numbers");	

		double first_number = myObj.nextDouble();
		double second_number = myObj.nextDouble();	

		

		if(first_number>0 && first_number<1 && second_number>0 && second_number<1){
			System.out.println("It's between 0 and 1");
		}else{
			System.out.println("It\'s not between 0 and 1");
		}

	}
}