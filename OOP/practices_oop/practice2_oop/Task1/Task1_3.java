import java.util.Scanner; 

public class Task1_3{
	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter x:"); 
		double x = myobj.nextDouble();

		if(x<=1){
			System.out.println("Enter a:");
			int a = myobj.nextInt();
			System.out.println((1)/(a*a+x*x));
		}else if(x>0){
			System.out.println("Enter b:"); 
			int b = myobj.nextInt();
			System.out.println(b*Math.log(x));
		}
	}
}