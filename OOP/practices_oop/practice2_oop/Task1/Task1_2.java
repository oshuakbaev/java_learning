import java.util.Scanner; 

public class Task1_2{
	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter x:"); 
		double x = myobj.nextDouble();

		if(x>0){
			System.out.println("Enter a:");
			int a = myobj.nextInt();
			System.out.println(a+(1/2)+Math.pow(2.718281828459045,(-x))); 
		}else if(x<=0){
			System.out.println("Enter b:"); 
			int b = myobj.nextInt();
			System.out.println(Math.cos(b*x+1));
		}
	}
}