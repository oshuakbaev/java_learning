import java.util.Scanner;

public class Task7{
	public static void main(String[] args) {
	
		Scanner myObj = new Scanner(System.in);		

		int a = myObj.nextInt();
		int b = myObj.nextInt();
		int c = myObj.nextInt();
		
		System.out.println("Maximum is:");
		if(a>b && a>c){
			System.out.println(a);
		}else if(b>a && b>c){
			System.out.println(b);
		}else{
			System.out.println(c);
		}

	}
}