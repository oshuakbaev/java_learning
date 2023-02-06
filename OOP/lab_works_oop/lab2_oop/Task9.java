import java.util.Scanner; 

public class Task9{
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);		

		int userInput = myObj.nextInt(); 

		switch(userInput){

			case 1: 
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
			case 7:
				System.out.println("SUN");
				break;
			default:
				System.out.println("It's Weekend"); 
		}
	}
}