import java.util.Scanner;

public class Task1_1{

	public static void main(String[] args) {
	
		Scanner myobj = new Scanner(System.in);

		System.out.println("Enter x:"); 
		int x = myobj.nextInt();

		if(x<=3){
			System.out.println("Enter b:"); 
			int b = myobj.nextInt();
			System.out.println(b+2*(Math.log(x))); 
		}else if(x>3){
			System.out.println("Enter a:"); 
			int a = myobj.nextInt();
			double a_output = (Math.pow(x,2))/(Math.pow(x,2)+a);
			System.out.println(a_output); 
		}

	}
}