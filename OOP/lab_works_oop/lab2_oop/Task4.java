import java.util.Scanner;

public class Task4{
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);

		System.out.println("enter hours:");
		int Hours = myObj.nextInt();
		System.out.println("enter salary:");
		int salary = myObj.nextInt();
		

		if(Hours>40){
			int work_money = 40*salary; 
			salary *= 1.5; 
			int last = Hours - 40; 
			System.out.println(work_money+last*salary);
		}else{
			System.out.println(Hours*salary); 
		}
	}
}